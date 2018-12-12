package de.othr.JakoBank.Interface;

import de.othr.JakoBank.Entity.Adresse;
import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Entity.Name;

public interface KontoverwaltungIF {
    public void changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum);

    public void changeKontoinhaber(Kontoinhaber kontoinhaber, Name name);

    public void changeKontoinhaber(Kontoinhaber kontoinhaber, Adresse adresse);

    public void changeKontoinhaber(Kontoinhaber kontoinhaber, Name name, Adresse adresse);

    public void changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Adresse adresse);

    public void changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name);

    public void changeKontoinhaber(Kontoinhaber kontoinhaber, long telnum, Name name, Adresse adresse);
}
