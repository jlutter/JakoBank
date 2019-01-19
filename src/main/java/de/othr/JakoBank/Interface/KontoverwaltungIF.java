package de.othr.JakoBank.Interface;

import de.othr.JakoBank.Entity.Adresse;
import de.othr.JakoBank.Entity.Konto;
import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Entity.Name;

import java.math.BigDecimal;

public interface KontoverwaltungIF {
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Adresse adresse);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name, Adresse adresse);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Adresse adresse);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name, Adresse adresse);

    public void chargeKonto(Konto konto, BigDecimal betrag);
}
