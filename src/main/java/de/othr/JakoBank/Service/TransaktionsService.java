package de.othr.JakoBank.Service;

import de.othr.JakoBank.Entity.Konto;
import de.othr.JakoBank.Entity.Transaktion;
import de.othr.JakoBank.Interface.TransaktionsIF;

import javax.enterprise.context.SessionScoped;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.math.BigDecimal;

@WebService
@SessionScoped
public class TransaktionsService implements TransaktionsIF, Serializable {

    @PersistenceContext(unitName = "JakoBank")
    private EntityManager entityManager;

    @Override
    @Transactional
    public void lastschriftAufgeben(Transaktion transaktion) {
        var auftraggeber = entityManager.find(Konto.class, transaktion.getAuftraggeber());
        var ziel = entityManager.find(Konto.class, transaktion.getZiel());

        if(auftraggeber.getKontostand().compareTo(transaktion.getBetrag()) >= 0) {
            auftraggeber.setKontostand(auftraggeber.getKontostand().subtract(transaktion.getBetrag()));
            ziel.setKontostand(ziel.getKontostand().add(transaktion.getBetrag()));
        }
        //toDo richtige alternative implementieren
        else System.out.println("Auftrag kann nicht ausgeführt weden: \nZu wenig Geld am Konto!");
    }

    @Override
    @Transactional
    public void ueberweisungtaetigen(Transaktion transaktion) {
        var auftraggeber = entityManager.find(Konto.class, transaktion.getAuftraggeber());
        var ziel = entityManager.find(Konto.class, transaktion.getZiel());

        auftraggeber.setKontostand(auftraggeber.getKontostand().subtract(transaktion.getBetrag()));
        ziel.setKontostand(ziel.getKontostand().add(transaktion.getBetrag()));

    }

    @Override
    @Transactional
    public Transaktion neueTransaktion(long auftraggeber, long ziel, BigDecimal betrag, String verwendungszweck) {

        var transaktion = new Transaktion(auftraggeber, ziel, betrag, verwendungszweck);

        entityManager.persist(transaktion);

        return transaktion;
    }
}