package de.othr.JakoBank.UI.model;

import de.othr.JakoBank.Entity.*;
import de.othr.JakoBank.Service.Kontoverwaltung;
import de.othr.JakoBank.Service.Kundenverwaltung;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.math.BigDecimal;

@Named
@SessionScoped
public class KontoMgmtModel implements Serializable {

    @Inject
    private Kontoverwaltung kontoverwaltung;

    @Inject
    private Kundenverwaltung kundenverwaltung;

    private long telnum;
    private Name name = new Name();
    private Adresse adresse = new Adresse();
    private BigDecimal betrag;
    private Kontoinhaber tempKontoinhaber;
    private boolean aendern = false;
    private long loginName;
    private String passwort;

    public String login() {

        tempKontoinhaber = kundenverwaltung.getKundebyId(loginName);

        if(tempKontoinhaber.getId() == loginName && tempKontoinhaber.getPasswort().equals(passwort))
            return "kunde";

        else
            return "kunde_login";
    }

    //toDo
    public String aendernVorbereiten() {
        this.aendern = true;

        name = tempKontoinhaber.getName();
        adresse = tempKontoinhaber.getAdresse();
        telnum = tempKontoinhaber.getTelnum();
        passwort = tempKontoinhaber.getPasswort();

        return "konto_bearbeiten";
    }

    public String aendern() {
        this.aendern = false;

        this.tempKontoinhaber = this.kontoverwaltung.changeKontoinhaber(tempKontoinhaber,telnum, name, adresse);

        return "kunde";
    }

    public String chargeIO() {
        return "charge";
    }

    public String charge() {
        kontoverwaltung.chargeKonto(tempKontoinhaber.getKonto(), betrag);

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

    public void setLoginName(long login) {
        this.loginName = login;
    }

    public long getLoginName() {
        return loginName;
    }

    public BigDecimal getBetrag() {
        return betrag;
    }

    public void setBetrag(BigDecimal betrag) {
        this.betrag = betrag;
    }
}
