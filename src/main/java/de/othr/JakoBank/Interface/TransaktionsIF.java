package de.othr.JakoBank.Interface;

import de.othr.JakoBank.Entity.Transaktion;

import java.math.BigDecimal;

public interface TransaktionsIF {

    public void lastschriftAufgeben(Transaktion transaktion);

    public void ueberweisungtaetigen(Transaktion transaktion);

    public Transaktion neueTransaktion(long auftraggeber, long ziel, BigDecimal betrag, String verwendungszweck);
}
