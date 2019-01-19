package de.othr.JakoBank.Service;

import de.othr.JakoBank.Entity.*;
import de.othr.JakoBank.Interface.KontoverwaltungIF;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@RequestScoped
public class Kontoverwaltung implements KontoverwaltungIF {

    @PersistenceContext(unitName = "JakoBank")
    private EntityManager entityManager;

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum) {
        kontoinhaber.setTelnum(telnum);

        kontoinhaber = entityManager.merge(kontoinhaber);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name) {
        kontoinhaber.setName(name);

        kontoinhaber = entityManager.merge(kontoinhaber);

        return kontoinhaber;
    }

    @Override
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Adresse adresse) {
        kontoinhaber.setAdresse(adresse);

        kontoinhaber = entityManager.merge(kontoinhaber);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name, Adresse adresse) {
        kontoinhaber.setName(name);
        kontoinhaber.setAdresse(adresse);

        kontoinhaber = entityManager.merge(kontoinhaber);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Adresse adresse) {
        kontoinhaber.setTelnum(telnum);
        kontoinhaber.setAdresse(adresse);

        kontoinhaber = entityManager.merge(kontoinhaber);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name) {
        kontoinhaber.setTelnum(telnum);
        kontoinhaber.setName(name);

        kontoinhaber = entityManager.merge(kontoinhaber);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name, Adresse adresse) {
        kontoinhaber.setTelnum(telnum);
        kontoinhaber.setName(name);
        kontoinhaber.setAdresse(adresse);

        kontoinhaber = entityManager.merge(kontoinhaber);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public void chargeKonto(Konto konto, BigDecimal betrag) {
        var kontostand = konto.getKontostand();

        konto.setKontostand(kontostand.add(betrag));

        entityManager.merge(konto);
    }

    @Override
    public List<Transaktion> getVerlauf(Kontoinhaber kontoinhaber) {
        TypedQuery<Transaktion> query = entityManager.createQuery(
                "SELECT t FROM Transaktion t, Kontoinhaber k WHERE (t.auftraggeber=k.id or t.ziel=k.id) and k.id =: kontoid and t.betrag is not null",
                Transaktion.class
        );

        query.setParameter("kontoid", kontoinhaber.getId());

        return query.getResultList();
    }
}
