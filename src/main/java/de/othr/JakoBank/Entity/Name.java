package de.othr.JakoBank.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
    private String vorname;
    private String nachname;

    public Name(){

    }

    public Name(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
}
