
package com.Partner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bestellung complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bestellung"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bestellNummer" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="mitarbeiter" type="{http://service.sw.othr.de/}mitarbeiter" minOccurs="0"/&gt;
 *         &lt;element name="gesPreis" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://service.sw.othr.de/}bestellstatus" minOccurs="0"/&gt;
 *         &lt;element name="bestelltAm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="artikel" type="{http://service.sw.othr.de/}artikel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bestellung", propOrder = {
    "bestellNummer",
    "mitarbeiter",
    "gesPreis",
    "beschreibung",
    "status",
    "bestelltAm",
    "artikel"
})
public class Bestellung {

    protected long bestellNummer;
    protected Mitarbeiter mitarbeiter;
    protected BigDecimal gesPreis;
    protected String beschreibung;
    @XmlSchemaType(name = "string")
    protected Bestellstatus status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bestelltAm;
    @XmlElement(nillable = true)
    protected List<Artikel> artikel;

    /**
     * Gets the value of the bestellNummer property.
     * 
     */
    public long getBestellNummer() {
        return bestellNummer;
    }

    /**
     * Sets the value of the bestellNummer property.
     * 
     */
    public void setBestellNummer(long value) {
        this.bestellNummer = value;
    }

    /**
     * Gets the value of the mitarbeiter property.
     * 
     * @return
     *     possible object is
     *     {@link Mitarbeiter }
     *     
     */
    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    /**
     * Sets the value of the mitarbeiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mitarbeiter }
     *     
     */
    public void setMitarbeiter(Mitarbeiter value) {
        this.mitarbeiter = value;
    }

    /**
     * Gets the value of the gesPreis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGesPreis() {
        return gesPreis;
    }

    /**
     * Sets the value of the gesPreis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGesPreis(BigDecimal value) {
        this.gesPreis = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Bestellstatus }
     *     
     */
    public Bestellstatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bestellstatus }
     *     
     */
    public void setStatus(Bestellstatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the bestelltAm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBestelltAm() {
        return bestelltAm;
    }

    /**
     * Sets the value of the bestelltAm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBestelltAm(XMLGregorianCalendar value) {
        this.bestelltAm = value;
    }

    /**
     * Gets the value of the artikel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artikel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtikel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Artikel }
     * 
     * 
     */
    public List<Artikel> getArtikel() {
        if (artikel == null) {
            artikel = new ArrayList<Artikel>();
        }
        return this.artikel;
    }

}
