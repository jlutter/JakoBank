
package com.Partner;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adresse complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresszusatz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plz" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="stadt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresse", propOrder = {
    "adresszusatz",
    "plz",
    "stadt",
    "strasse"
})
public class Adresse {

    protected String adresszusatz;
    protected int plz;
    protected String stadt;
    protected String strasse;

    /**
     * Gets the value of the adresszusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresszusatz() {
        return adresszusatz;
    }

    /**
     * Sets the value of the adresszusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresszusatz(String value) {
        this.adresszusatz = value;
    }

    /**
     * Gets the value of the plz property.
     * 
     */
    public int getPlz() {
        return plz;
    }

    /**
     * Sets the value of the plz property.
     * 
     */
    public void setPlz(int value) {
        this.plz = value;
    }

    /**
     * Gets the value of the stadt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStadt() {
        return stadt;
    }

    /**
     * Sets the value of the stadt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStadt(String value) {
        this.stadt = value;
    }

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Sets the value of the strasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrasse(String value) {
        this.strasse = value;
    }

}
