package de.othr.JakoBank.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
    private String strasse;
    private String ort;
    private long plz;
    private int hausnummer;

    public Adresse() {
    }

    public Adresse (String strasse, String ort, long plz, int hausnummer) {
        this.strasse = strasse;
        this.ort = ort;
        this.plz = plz;
        this.hausnummer = hausnummer;
    }

    @Override
    public String toString() {
        return  "Strasse: " + strasse + " " + "Hausnummer: " + hausnummer + "\n" + "Postleitzahl: " + plz + " " + "Ort: " + ort + " ";
    }
}
