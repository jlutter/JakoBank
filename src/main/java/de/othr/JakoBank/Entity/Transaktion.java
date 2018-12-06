package de.othr.JakoBank.Entity;

import de.othr.JakoBank.Entity.util.GeneratedIdEntity;
import java.math.BigDecimal;

import javax.persistence.Entity;

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
}
