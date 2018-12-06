package de.othr.JakoBank.Entity;

import de.othr.JakoBank.Entity.util.RandomIdEntity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Konto extends RandomIdEntity {
    private BigDecimal kontostand;
    private Kontoverlauf kontoverlauf;

    public Konto() {

    }

    public String getKontoNr() {
        return super.id;
    }

    public BigDecimal getKontostand() {
        return kontostand;
    }
}
