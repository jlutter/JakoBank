package de.othr.JakoBank.Service;

import de.othr.JakoBank.Entity.Adresse;
import de.othr.JakoBank.Entity.Konto;
import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Entity.Name;
import de.othr.JakoBank.Interface.KundenverwaltungIF;

import javax.enterprise.context.RequestScoped;
import javax.jws.WebMethod;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@RequestScoped
public class Kundenverwaltung implements KundenverwaltungIF {

    @PersistenceContext(unitName = "JakoBank")
    private EntityManager entityManager;

    @Override
    @Transactional
    public Kontoinhaber newKontoinhaber(long telnum, Name name, Adresse adresse, Konto konto) {
        Kontoinhaber kontoinhaber;

        if(konto == null)
            kontoinhaber = new Kontoinhaber(telnum, name, adresse);

        else
            kontoinhaber = new Kontoinhaber(telnum, name, adresse, konto);

        entityManager.persist(kontoinhaber);

        return null;
    }

    @Override
    @Transactional
    public Konto createKonto() {
        var konto = new Konto();

        entityManager.persist(konto);

        return konto;
    }

    @Override
    @Transactional
    public Konto createKonto(BigDecimal startbetrag) {
        var konto = new Konto(startbetrag);

        entityManager.persist(konto);

        return konto;
    }

    @Override
    @Transactional
    @WebMethod(exclude = true)
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber){
        return kontoinhaber;
    }

    @Override
    @Transactional
    @WebMethod(exclude = true)
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum) {
        kontoinhaber.setTelnum(telnum);
        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name) {
        kontoinhaber.setName(name);
        return kontoinhaber;
    }

    @Override
    @Transactional
    @WebMethod(exclude = true)
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Adresse adresse) {
        kontoinhaber.setAdresse(adresse);
        return kontoinhaber;
    }

    @Override
    @Transactional
    @WebMethod(exclude = true)
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name, Adresse adresse) {
        kontoinhaber.setName(name);
        kontoinhaber.setAdresse(adresse);
        return kontoinhaber;
    }

    @Override
    @Transactional
    @WebMethod(exclude = true)
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Adresse adresse) {
        kontoinhaber.setTelnum(telnum);
        kontoinhaber.setAdresse(adresse);
        return kontoinhaber;
    }

    @Override
    @Transactional
    @WebMethod(exclude = true)
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name) {
        kontoinhaber.setTelnum(telnum);
        kontoinhaber.setName(name);
        return kontoinhaber;
    }

    @Override
    @Transactional
    @WebMethod(exclude = true)
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name, Adresse adresse) {
        kontoinhaber.setTelnum(telnum);
        kontoinhaber.setName(name);
        kontoinhaber.setAdresse(adresse);
        return kontoinhaber;
    }

    @Override
    @Transactional
    public void deleteKonto(Kontoinhaber kontoinhaber, Konto konto) {
        konto = entityManager.find(Konto.class, konto.getKontoNr());

        entityManager.remove(konto);
    }

    @Override
    @Transactional
    public void deleteKontoinhaber(Kontoinhaber kontoinhaber) {
        kontoinhaber = entityManager.find(Kontoinhaber.class, kontoinhaber.getId());

        entityManager.remove(kontoinhaber);
    }

    @Override
    @Transactional
    public void ordnerBestellen() {

    }

    @Override
    public Kontoinhaber getKundebyId(long KundenId) {
        Kontoinhaber kontoinhaber;
        
        kontoinhaber = entityManager.find(Kontoinhaber.class, KundenId);
        
        return kontoinhaber;
    }

    @Override
    public List<Kontoinhaber> getAllKontoinhaber() {
        TypedQuery<Kontoinhaber> query = entityManager.createQuery(
                "SELECT k FROM Kontoinhaber AS k",
                Kontoinhaber.class
        );
        return query.getResultList();    }
}
