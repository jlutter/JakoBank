package de.othr.JakoBank.Entity;

import de.othr.JakoBank.Entity.util.GeneratedIdEntity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Kontoinhaber extends GeneratedIdEntity {
    private long telnum;
    private Name name;
    private Adresse adresse;
    @OneToOne
    private Konto konto;

    public Kontoinhaber(){

    }

    public Kontoinhaber(long telnum, Name name, Adresse adresse, Konto konto){
        this.telnum = telnum;
        this.name = name;
        this.adresse = adresse;
        this.konto = konto;
    }

    public long getTelnum() {
        return telnum;
    }

    public Name getName() {
        return name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Konto getKonto() {
        return konto;
    }
}
