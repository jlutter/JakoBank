package de.othr.JakoBank.Service;

import de.othr.JakoBank.Entity.Transaktion;
import de.othr.JakoBank.Interface.TransaktionsIF;

import javax.enterprise.context.SessionScoped;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;

@WebService
@SessionScoped
public class TransaktionsService implements TransaktionsIF, Serializable {

    @PersistenceContext(unitName = "JakoBank")
    private EntityManager entityManager;

    @Override
    @Transactional
    public void lastschriftAufgeben(Transaktion transaktion) {

    }

    @Override
    @Transactional
    public void ueberweisungtaetigen(Transaktion transaktion) {

    }
}