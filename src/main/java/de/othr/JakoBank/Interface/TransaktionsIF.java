package de.othr.JakoBank.Interface;

import de.othr.JakoBank.Entity.Transaktion;

public interface TransaktionsIF {

    public void lastschriftAufgeben(Transaktion transaktion);

    public void ueberweisungtaetigen(Transaktion transaktion);
}
