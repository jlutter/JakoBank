package de.othr.JakoBank.UI.model;

import de.othr.JakoBank.Entity.Konto;
import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Service.Kundenverwaltung;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collection;

@Named
@SessionScoped
public class MitarbeiterMgmtModel implements Serializable {

    @Inject
    private Kundenverwaltung kundenverwaltung;

    private long telnum;
    private String vorname;
    private String nachname;
    private String strasse;
    private String ort;
    private long plz;
    private int hausnummer;
    private Konto konto;
    private Kontoinhaber tempKontoinhaber = new Kontoinhaber();
    private boolean aendern = false;

    public String neuerKunde() {

        kundenverwaltung.newKontoinhaber(telnum, vorname, nachname, strasse, ort, plz, hausnummer, konto);

        return "mitarbeier";
    }

    public String check() {
        //Detailscheck
        return "details_mitarbeiter";
    }

    //toDo
    public String aenderVorbereiten(Kontoinhaber kontoinhaber) {
        this.aendern = true;
        this.tempKontoinhaber = kontoinhaber;

        return "mitarbeiter";
    }

    public String aendern() {
        this.aendern = false;

        kundenverwaltung.changeKontoinhaber(tempKontoinhaber);

        return "mitarbeiter";
    }

    public String loeschen(Kontoinhaber kontoinhaber) {
        kundenverwaltung.deleteKontoinhaber(kontoinhaber);

        return "mitarbeiter";
    }

    public Kontoinhaber getTempKontoinhaber() {
        return tempKontoinhaber;
    }

    public void setTempKontoinhaber(Kontoinhaber tempKontoinhaber) {
        this.tempKontoinhaber = tempKontoinhaber;
    }

    public boolean isInAenderung() {
        return aendern;
    }

    public void setInAenderung(boolean inAenderung) {
        this.aendern = inAenderung;
    }

    public void setTelnum(long telnum) {
        this.telnum = telnum;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setStrasse (String strasse) {
        this.strasse = strasse;
    }

    public void setOrt (String ort) {
        this.ort = ort;
    }

    public void setPlz (long plz) {
        this.plz = plz;
    }

    public  void setHausnummer (int nr) {
        this.hausnummer = nr;
    }

    public Collection<Kontoinhaber> getKunden() {
        return kundenverwaltung.getAllKontoinhaber();
    }
}
