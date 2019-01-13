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
}
