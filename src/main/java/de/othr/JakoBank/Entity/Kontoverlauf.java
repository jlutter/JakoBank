package de.othr.JakoBank.Entity;

import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
public class Kontoverlauf {
    private String verlauf;

    public Kontoverlauf() {
    }

    public String getVerlauf () {return verlauf;}
}
