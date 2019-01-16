package de.othr.JakoBank.UI.model;

import de.othr.JakoBank.Entity.*;
import de.othr.JakoBank.Service.Kontoverwaltung;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class KontoMgmtModel implements Serializable {

    @Inject
    private Kontoverwaltung kontoverwaltung;

    private long telnum;
    private Name name = new Name();
    private Adresse adresse = new Adresse();
    private Konto konto;
    private Kontoinhaber tempKontoinhaber;
    private boolean aendern = false;
    private String loginName;
    private String passwort;

    public String login() {
        return "kunde";
    }

    //toDo
    public String aendernVorbereiten(Kontoinhaber kontoinhaber) {
        this.aendern = true;

        this.tempKontoinhaber = kontoinhaber;

        return "konto_bearbeiten";
    }

    public String aendern() {
        this.aendern = false;

        this.tempKontoinhaber = this.kontoverwaltung.changeKontoinhaber(tempKontoinhaber,telnum, name, adresse);

        return "kunde";
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

    public long getTelnum() {
        return telnum;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setPasswort (String pw){
        this.passwort = pw;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setLoginName(String login) {
        this.loginName = login;
    }

    public String getLoginName() {
        return loginName;
    }
}
