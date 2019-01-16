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

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setPlz(long plz) {
        this.plz = plz;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getOrt() {
        return ort;
    }

    public long getPlz() {
        return plz;
    }

    public int getHausnummer() {
        return hausnummer;
    }
}
