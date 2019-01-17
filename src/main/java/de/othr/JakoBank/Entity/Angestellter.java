package de.othr.JakoBank.Entity;

import de.othr.JakoBank.Entity.util.GeneratedIdEntity;
import javax.persistence.Entity;

@Entity
public class Angestellter extends GeneratedIdEntity {
    private long telnum;
    private Name name;
    private Adresse adresse;
    private String passwort;

    public Angestellter() {
    }

    public Angestellter(long telnum, Name name, Adresse adresse, String passwort){
        this.telnum = telnum;
        this.name = name;
        this.adresse = adresse;
        this.passwort = passwort;
    }

    public long getAngestellteNr() {
        return super.id;
    }

    public long getTelnum() {
        return telnum;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Name getName() {
        return name;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setTelnum(long telnum) {
        this.telnum = telnum;
    }
}