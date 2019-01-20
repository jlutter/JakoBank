
package com.Partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for artikel complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="artikel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bearbeitungsNr" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="artikelPos" type="{http://service.sw.othr.de/}artikelPos" minOccurs="0"/&gt;
 *         &lt;element name="bild" type="{http://service.sw.othr.de/}bild" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "artikel", propOrder = {
    "bearbeitungsNr",
    "artikelPos",
    "bild"
})
public class Artikel {

    protected long bearbeitungsNr;
    protected ArtikelPos artikelPos;
    protected Bild bild;

    /**
     * Gets the value of the bearbeitungsNr property.
     * 
     */
    public long getBearbeitungsNr() {
        return bearbeitungsNr;
    }

    /**
     * Sets the value of the bearbeitungsNr property.
     * 
     */
    public void setBearbeitungsNr(long value) {
        this.bearbeitungsNr = value;
    }

    /**
     * Gets the value of the artikelPos property.
     * 
     * @return
     *     possible object is
     *     {@link ArtikelPos }
     *     
     */
    public ArtikelPos getArtikelPos() {
        return artikelPos;
    }

    /**
     * Sets the value of the artikelPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtikelPos }
     *     
     */
    public void setArtikelPos(ArtikelPos value) {
        this.artikelPos = value;
    }

    /**
     * Gets the value of the bild property.
     * 
     * @return
     *     possible object is
     *     {@link Bild }
     *     
     */
    public Bild getBild() {
        return bild;
    }

    /**
     * Sets the value of the bild property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bild }
     *     
     */
    public void setBild(Bild value) {
        this.bild = value;
    }

}
