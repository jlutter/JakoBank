package de.othr.JakoBank.UI.model;

import de.othr.JakoBank.Entity.*;
import de.othr.JakoBank.Service.Kontoverwaltung;
import de.othr.JakoBank.Service.TransaktionsService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class KontoMgmtModel implements Serializable {

    @Inject
    private Kontoverwaltung kontoverwaltung;

    @Inject
    private TransaktionsService transaktionsService;

    private long telnum;
    private String vorname;
    private String nachname;
    private String strasse;
    private String ort;
    private long plz;
    private int hausnummer;
    private Konto konto;
    private Kontoinhaber tempKontoinhaber = new Kontoinhaber();
    private Transaktion tempTransaktion = new Transaktion();
    private boolean aendern = false;
    private String loginName;
    private String passwort;

    public String login() {
        return "kunden_konto";
    }

    //toDo
    public String aenderVorbereiten() {
        this.aendern = true;

        return "konto_bearbeiten";
    }

    public String aendern() {
        this.aendern = false;

        Name name = new Name(vorname, nachname);
        Adresse adresse = new Adresse(strasse, ort, plz, hausnummer);

        kontoverwaltung.changeKontoinhaber(tempKontoinhaber,telnum, name, adresse);

        return "kunde_konto";
    }

    //toDo
    public String verlauf() {
        return "verlauf";
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

    public void setPasswort (String pw){
        this.passwort = pw;
    }

    public void setLoginName(String login) {
        this.loginName = login;
    }
}
