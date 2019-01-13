package de.othr.JakoBank.UI.model;

import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Entity.Name;
import de.othr.JakoBank.Service.Kundenverwaltung;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class TestModel implements Serializable {

    @Inject private Kundenverwaltung kundenverwaltung;

    private String vorname;
    private String nachname;
    private Kontoinhaber tempKontoinhaber = new Kontoinhaber();

    // Action-Methoden

    public String neurKunde() {
        // injizierten StudentService aufrufen

        kundenverwaltung.changeKontoinhaber(tempKontoinhaber,new Name(vorname, nachname));

        System.out.println(this.tempKontoinhaber.getFullName() + "als neuen Kunden anlegen!");
        this.tempKontoinhaber = new Kontoinhaber();

        return "index.xhtml";
    }

    // Getter/Setter


    public Kontoinhaber getTempKontoinhaber() {
        return tempKontoinhaber;
    }

    public void setTempStudent(Kontoinhaber tmpKontoinhaber) {
        this.tempKontoinhaber = tmpKontoinhaber;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
