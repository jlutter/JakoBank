package de.othr.JakoBank.Interface;

import de.othr.JakoBank.Entity.Adresse;
import de.othr.JakoBank.Entity.Konto;
import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Entity.Name;

import java.math.BigDecimal;
import java.util.List;

public interface KundenverwaltungIF {

    public Kontoinhaber newKontoinhaber(Kontoinhaber kontoinhaber);

    public Konto createKonto(Konto konto);

    public Konto createKonto(BigDecimal startbetrag);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Adresse adresse);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, Name name, Adresse adresse);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Adresse adresse);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name);

    public Kontoinhaber changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name, Adresse adresse);

    public void deleteKonto(Kontoinhaber kontoinhaber, Konto konto);

    public void deleteKontoinhaber(Kontoinhaber kontoinhaber);

    public void ordnerBestellen();

    public Kontoinhaber getKundebyId(long KundenId);

    public List<Kontoinhaber> getAllKontoinhaber();
}
