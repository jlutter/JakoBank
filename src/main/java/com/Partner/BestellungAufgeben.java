
package com.Partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bestellungAufgeben complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bestellungAufgeben"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kunde" type="{http://service.sw.othr.de/}kunde" minOccurs="0"/&gt;
 *         &lt;element name="bestellung" type="{http://service.sw.othr.de/}bestellung" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bestellungAufgeben", propOrder = {
    "kunde",
    "bestellung"
})
public class BestellungAufgeben {

    protected Kunde kunde;
    protected Bestellung bestellung;

    /**
     * Gets the value of the kunde property.
     * 
     * @return
     *     possible object is
     *     {@link Kunde }
     *     
     */
    public Kunde getKunde() {
        return kunde;
    }

    /**
     * Sets the value of the kunde property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kunde }
     *     
     */
    public void setKunde(Kunde value) {
        this.kunde = value;
    }

    /**
     * Gets the value of the bestellung property.
     * 
     * @return
     *     possible object is
     *     {@link Bestellung }
     *     
     */
    public Bestellung getBestellung() {
        return bestellung;
    }

    /**
     * Sets the value of the bestellung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bestellung }
     *     
     */
    public void setBestellung(Bestellung value) {
        this.bestellung = value;
    }

}
