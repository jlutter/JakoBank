
package com.Partner;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for artikelPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="artikelPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="artikelPosNr" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://service.sw.othr.de/}papierformat" minOccurs="0"/&gt;
 *         &lt;element name="hoehe" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="breite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="seitenzahl" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="kategorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "artikelPosition", propOrder = {
    "artikelPosNr",
    "beschreibung",
    "preis",
    "format",
    "hoehe",
    "breite",
    "seitenzahl",
    "kategorie"
})
public class ArtikelPosition {

    protected int artikelPosNr;
    protected String beschreibung;
    protected BigDecimal preis;
    @XmlSchemaType(name = "string")
    protected Papierformat format;
    protected int hoehe;
    protected int breite;
    protected int seitenzahl;
    protected String kategorie;

    /**
     * Gets the value of the artikelPosNr property.
     * 
     */
    public int getArtikelPosNr() {
        return artikelPosNr;
    }

    /**
     * Sets the value of the artikelPosNr property.
     * 
     */
    public void setArtikelPosNr(int value) {
        this.artikelPosNr = value;
    }

    /**
     * Gets the value of the beschreibung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the value of the beschreibung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Gets the value of the preis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreis() {
        return preis;
    }

    /**
     * Sets the value of the preis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreis(BigDecimal value) {
        this.preis = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link Papierformat }
     *     
     */
    public Papierformat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link Papierformat }
     *     
     */
    public void setFormat(Papierformat value) {
        this.format = value;
    }

    /**
     * Gets the value of the hoehe property.
     * 
     */
    public int getHoehe() {
        return hoehe;
    }

    /**
     * Sets the value of the hoehe property.
     * 
     */
    public void setHoehe(int value) {
        this.hoehe = value;
    }

    /**
     * Gets the value of the breite property.
     * 
     */
    public int getBreite() {
        return breite;
    }

    /**
     * Sets the value of the breite property.
     * 
     */
    public void setBreite(int value) {
        this.breite = value;
    }

    /**
     * Gets the value of the seitenzahl property.
     * 
     */
    public int getSeitenzahl() {
        return seitenzahl;
    }

    /**
     * Sets the value of the seitenzahl property.
     * 
     */
    public void setSeitenzahl(int value) {
        this.seitenzahl = value;
    }

    /**
     * Gets the value of the kategorie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategorie() {
        return kategorie;
    }

    /**
     * Sets the value of the kategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategorie(String value) {
        this.kategorie = value;
    }

}
