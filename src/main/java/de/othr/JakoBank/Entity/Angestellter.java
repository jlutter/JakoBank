package de.othr.JakoBank.Entity;

import de.othr.JakoBank.Entity.util.GeneratedIdEntity;
import javax.persistence.Entity;

@Entity
public class Angestellter extends GeneratedIdEntity {
    private long telnum;
    private Name name;
    private Adresse adresse;

    public Angestellter() {
    }

    public Angestellter(long telnum, Name name, Adresse adresse){
        this.telnum = telnum;
        this.name = name;
        this.adresse = adresse;
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
}