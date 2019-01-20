
package com.Partner;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kunde complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kunde"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.sw.othr.de/}person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bestellungen" type="{http://service.sw.othr.de/}bestellung" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="kundenNr" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nutzerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kunde", propOrder = {
    "bestellungen",
    "kundenNr",
    "nutzerName",
    "pwd"
})
public class Kunde
    extends Person
{

    @XmlElement(nillable = true)
    protected List<Bestellung> bestellungen;
    protected long kundenNr;
    protected String nutzerName;
    protected String pwd;

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
     * Gets the value of the kundenNr property.
     * 
     */
    public long getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the value of the kundenNr property.
     * 
     */
    public void setKundenNr(long value) {
        this.kundenNr = value;
    }

    /**
     * Gets the value of the nutzerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutzerName() {
        return nutzerName;
    }

    /**
     * Sets the value of the nutzerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutzerName(String value) {
        this.nutzerName = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

}
