package de.othr.JakoBank.Interface;

import de.othr.JakoBank.Entity.*;

import java.math.BigDecimal;
import java.util.List;

public interface KontoverwaltungIF {
    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Adresse adresse);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name, Adresse adresse);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Adresse adresse);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name, Adresse adresse);

    public void chargeKonto(Konto konto, BigDecimal betrag);

    public List<Transaktion> getVerlauf(Kontoinhaber kontoinhaber);
}
