package de.othr.JakoBank.Service;

import de.othr.JakoBank.Entity.Adresse;
import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Entity.Name;
import de.othr.JakoBank.Interface.KontoverwaltungIF;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RequestScoped
public class Kontoverwaltung implements KontoverwaltungIF {

    @PersistenceContext(unitName = "JakoBank")
    private EntityManager entityManager;

    @Override
    @Transactional
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
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Adresse adresse) {
        kontoinhaber.setAdresse(adresse);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name, Adresse adresse) {
        kontoinhaber.setName(name);
        kontoinhaber.setAdresse(adresse);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Adresse adresse) {
        kontoinhaber.setTelnum(telnum);
        kontoinhaber.setAdresse(adresse);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name) {
        kontoinhaber.setTelnum(telnum);
        kontoinhaber.setName(name);

        return kontoinhaber;
    }

    @Override
    @Transactional
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name, Adresse adresse) {
        kontoinhaber.setTelnum(telnum);
        kontoinhaber.setName(name);
        kontoinhaber.setAdresse(adresse);

        return kontoinhaber;
    }
}
