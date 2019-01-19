package de.othr.JakoBank.Entity;

import de.othr.JakoBank.Entity.util.GeneratedIdEntity;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
@Entity
public class Transaktion extends GeneratedIdEntity {
    private long auftraggeber;
    private long ziel;
    private BigDecimal betrag;
    private String verwendungszweck;

    public Transaktion() {
    }

    public Transaktion(long auftraggeber, long ziel, BigDecimal betrag, String verwendungszweck) {
        this.auftraggeber = auftraggeber;
        this.ziel = ziel;
        this.betrag = betrag;
        this.verwendungszweck = verwendungszweck;
    }

    public long getTransaktionsId() {
        return super.id;
    }

    @Override
    public String toString() {
        return "Auftraggeber: " + auftraggeber + "    Ziel: " + ziel
                + "\nBetrag: " + betrag.toString()
                + "\nVerwendungszweck: \n" + verwendungszweck;
    }

    public long getAuftraggeber() {
        return auftraggeber;
    }

    public long getZiel() {
        return ziel;
    }

    public BigDecimal getBetrag() {
        return betrag;
    }

    public String getVerwendungszweck() {
        return verwendungszweck;
    }

    public void setAuftraggeber(long auftraggeber) {
        this.auftraggeber = auftraggeber;
    }

    public void setZiel(long ziel) {
        this.ziel = ziel;
    }

    public void setBetrag(BigDecimal betrag) {
        this.betrag = betrag;
    }

    public void setVerwendungszweck(String verwendungszweck) {
        this.verwendungszweck = verwendungszweck;
    }
}
