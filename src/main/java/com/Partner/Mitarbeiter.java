
package com.Partner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mitarbeiter complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mitarbeiter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.sw.othr.de/}person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bestellungen" type="{http://service.sw.othr.de/}bestellung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gehalt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="mitarbeiterNr" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mitarbeiter", propOrder = {
    "bestellungen",
    "gehalt",
    "mitarbeiterNr",
    "password"
})
public class Mitarbeiter
    extends Person
{

    @XmlElement(nillable = true)
    protected List<Bestellung> bestellungen;
    protected BigDecimal gehalt;
    protected long mitarbeiterNr;
    protected String password;

    /**
     * Gets the value of the bestellungen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestellungen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestellungen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bestellung }
     * 
     * 
     */
    public List<Bestellung> getBestellungen() {
        if (bestellungen == null) {
            bestellungen = new ArrayList<Bestellung>();
        }
        return this.bestellungen;
    }

    /**
     * Gets the value of the gehalt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGehalt() {
        return gehalt;
    }

    /**
     * Sets the value of the gehalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGehalt(BigDecimal value) {
        this.gehalt = value;
    }

    /**
     * Gets the value of the mitarbeiterNr property.
     * 
     */
    public long getMitarbeiterNr() {
        return mitarbeiterNr;
    }

    /**
     * Sets the value of the mitarbeiterNr property.
     * 
     */
    public void setMitarbeiterNr(long value) {
        this.mitarbeiterNr = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
