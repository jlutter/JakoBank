package de.othr.JakoBank.UI.model;

import de.othr.JakoBank.Entity.Kontoinhaber;
import de.othr.JakoBank.Entity.Transaktion;
import de.othr.JakoBank.Service.TransaktionsService;
//import de.othr.JakoBank.UI.converter.TransaktionsConverter;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.math.BigDecimal;

@Named
@SessionScoped
public class TranssaktionsMgmtModel implements Serializable {

    @Inject
    private TransaktionsService transaktionsService;

    //@Inject
    //private TransaktionsConverter transaktionsConverter;

    private Transaktion tempTransaktion = new Transaktion();
    private Kontoinhaber tempKontoinhaber;
    private boolean ueberweisung = false;

    public String transaktion(Kontoinhaber kontoinhaber){
        tempKontoinhaber = kontoinhaber;
        tempTransaktion.setAuftraggeber(tempKontoinhaber.getId());

        return "transaktion";
    }

    public String check() {
        return "transaktion_check";
    }

    public String transaktionStarten() {

        tempTransaktion = transaktionsService.neueTransaktion(tempTransaktion.getAuftraggeber(), tempTransaktion.getZiel(), tempTransaktion.getBetrag(), tempTransaktion.getVerwendungszweck());

        if(ueberweisung)
            transaktionsService.ueberweisungtaetigen(tempTransaktion);

        else transaktionsService.lastschriftAufgeben(tempTransaktion);

        return "transaktion_bestaetigt";
    }

    public void setTempTransaktion(Transaktion tempTransaktion) {
        this.tempTransaktion = tempTransaktion;
    }

    public Transaktion getTempTransaktion() {
        return tempTransaktion;
    }

    public void setUeberweisung(boolean ueberweisung) {
        this.ueberweisung = ueberweisung;
    }

    public boolean isUeberweisung() {
        return ueberweisung;
    }
}
