
package com.Partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bild complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bild"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bildQuelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bildunterschrift" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="breite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="hoehe" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bild", propOrder = {
    "bild",
    "bildQuelle",
    "bildunterschrift",
    "breite",
    "hoehe"
})
public class Bild {

    protected String bild;
    protected String bildQuelle;
    protected String bildunterschrift;
    protected int breite;
    protected int hoehe;

    /**
     * Gets the value of the bild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBild() {
        return bild;
    }

    /**
     * Sets the value of the bild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBild(String value) {
        this.bild = value;
    }

    /**
     * Gets the value of the bildQuelle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBildQuelle() {
        return bildQuelle;
    }

    /**
     * Sets the value of the bildQuelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBildQuelle(String value) {
        this.bildQuelle = value;
    }

    /**
     * Gets the value of the bildunterschrift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBildunterschrift() {
        return bildunterschrift;
    }

    /**
     * Sets the value of the bildunterschrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBildunterschrift(String value) {
        this.bildunterschrift = value;
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

}
