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

    public Kontoinhaber(long telnum, String vorname, String nachname, String strasse, String ort, long plz, int hausnummer, Konto konto){
        this.telnum = telnum;
        this.name = new Name(vorname, nachname);
        this.adresse = new Adresse(strasse, ort, plz, hausnummer);
        this.konto = konto;
    }

    public Kontoinhaber(long telnum, String vorname, String nachname, String strasse, String ort, long plz, int hausnummer) {
        this.telnum = telnum;
        this.name = new Name(vorname, nachname);
        this.adresse = new Adresse(strasse, ort, plz, hausnummer);
    }

    public void setId(long id) {
        super.id = id;
    }

    public void setTelnum(long telnum){
        if(telnum != 0)
            this.telnum = telnum;
    }

    public void setName(Name name) {
        if(name != null)
            this.name = name;
    }

    public void setAdresse(Adresse adresse) {
        if(adresse != null)
            this.adresse = adresse;
    }

    public void setKonto(Konto konto) {
        if(konto != null)
            this.konto = konto;
    }

    public long getTelnum() {
        return telnum;
    }

    public Name getName() {
        return name;
    }

    public String getFullName() {
        return name.toString();
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Konto getKonto() {
        return konto;
    }
}
