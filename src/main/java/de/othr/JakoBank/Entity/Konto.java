package de.othr.JakoBank.Entity;

import de.othr.JakoBank.Entity.util.RandomIdEntity;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
@Entity
public class Konto extends RandomIdEntity {
    private BigDecimal kontostand;

    public Konto() {
        this.kontostand = BigDecimal.ZERO;
    }

    public Konto(BigDecimal startbetrag) {
        this.kontostand = startbetrag;
    }

    public String getKontoNr() {
        return super.id;
    }

    public BigDecimal getKontostand() {
        return kontostand;
    }

    public void setKontostand(BigDecimal kontostand) {
        this.kontostand = kontostand;
    }
}
