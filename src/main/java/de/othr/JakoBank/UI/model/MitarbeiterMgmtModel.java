package de.othr.JakoBank.UI.model;

import de.othr.JakoBank.Entity.Adresse;
import de.othr.JakoBank.Entity.Konto;
import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Entity.Name;
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
    private Name name = new Name();
    private Adresse adresse = new Adresse();
    private Konto konto = new Konto();
    private Kontoinhaber tempKontoinhaber;
    private boolean aendern = false;
    private long loginName;
    private String passwort;

    public String login() {

        tempKontoinhaber = kundenverwaltung.getKundebyId(loginName);

        if(tempKontoinhaber.getId() == loginName && tempKontoinhaber.getPasswort().equals(passwort))
            return "mitarbeiter";

        else
            return "mitarbeiter_login";
    }

    public String check() {
        return "details_mitarbeiter";
    }

    public String neuerKunde() {
        this.tempKontoinhaber = new Kontoinhaber(this.telnum, this.name, this.adresse, this.konto, this.passwort);

        this.kundenverwaltung.newKontoinhaber(tempKontoinhaber);

        this.name = new Name();
        this.adresse = new Adresse();
        this.konto = new Konto();
        this.telnum = 0;

        return "mitarbeiter";
    }

    public String aenderVorbereiten(Kontoinhaber kontoinhaber) {
        this.aendern = true;
        this.tempKontoinhaber = kontoinhaber;

        return "mitarbeiter";
    }

    public String aendern() {
        this.aendern = false;

        this.kundenverwaltung.changeKontoinhaber(tempKontoinhaber);

        return "mitarbeiter";
    }

    public String loeschen(Kontoinhaber kontoinhaber) {
        this.kundenverwaltung.deleteKontoinhaber(kontoinhaber);

        return "mitarbeiter";
    }

    public Kontoinhaber getTempKontoinhaber() {
        return this.tempKontoinhaber;
    }

    public void setTempKontoinhaber(Kontoinhaber tempKontoinhaber) {
        this.tempKontoinhaber = tempKontoinhaber;
    }

    public boolean isInAenderung() {
        return this.aendern;
    }

    public void setInAenderung(boolean inAenderung) {
        this.aendern = inAenderung;
    }

    public void setTelnum(long telnum) {
        this.telnum = telnum;
    }

    public long getTelnum() {
        return this.telnum;
    }

    public void setName(Name name){
        this.name = name;
    }

    public Name getName() {
        return this.name;
    }

    public void setAdresse(Adresse adresse){
        this.adresse = adresse;
    }

    public Adresse getAdresse() {
        return this.adresse;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public long getLoginName() {
        return loginName;
    }

    public void setLoginName(long loginName) {
        this.loginName = loginName;
    }

    public Collection<Kontoinhaber> getKunden() {
        return kundenverwaltung.getAllKontoinhaber();
    }
}
