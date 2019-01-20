
package com.Partner;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.Partner package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BestellungAufgeben_QNAME = new QName("http://service.sw.othr.de/", "bestellungAufgeben");
    private final static QName _BestellungAufgebenResponse_QNAME = new QName("http://service.sw.othr.de/", "bestellungAufgebenResponse");
    private final static QName _Kunde_QNAME = new QName("http://service.sw.othr.de/", "kunde");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.Partner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BestellungAufgeben }
     * 
     */
    public BestellungAufgeben createBestellungAufgeben() {
        return new BestellungAufgeben();
    }

    /**
     * Create an instance of {@link BestellungAufgebenResponse }
     * 
     */
    public BestellungAufgebenResponse createBestellungAufgebenResponse() {
        return new BestellungAufgebenResponse();
    }

    /**
     * Create an instance of {@link Kunde }
     * 
     */
    public Kunde createKunde() {
        return new Kunde();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Bestellung }
     * 
     */
    public Bestellung createBestellung() {
        return new Bestellung();
    }

    /**
     * Create an instance of {@link Mitarbeiter }
     * 
     */
    public Mitarbeiter createMitarbeiter() {
        return new Mitarbeiter();
    }

    /**
     * Create an instance of {@link Adresse }
     * 
     */
    public Adresse createAdresse() {
        return new Adresse();
    }

    /**
     * Create an instance of {@link Artikel }
     * 
     */
    public Artikel createArtikel() {
        return new Artikel();
    }

    /**
     * Create an instance of {@link ArtikelPos }
     * 
     */
    public ArtikelPos createArtikelPos() {
        return new ArtikelPos();
    }

    /**
     * Create an instance of {@link Bild }
     * 
     */
    public Bild createBild() {
        return new Bild();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestellungAufgeben }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BestellungAufgeben }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sw.othr.de/", name = "bestellungAufgeben")
    public JAXBElement<BestellungAufgeben> createBestellungAufgeben(BestellungAufgeben value) {
        return new JAXBElement<BestellungAufgeben>(_BestellungAufgeben_QNAME, BestellungAufgeben.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestellungAufgebenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BestellungAufgebenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sw.othr.de/", name = "bestellungAufgebenResponse")
    public JAXBElement<BestellungAufgebenResponse> createBestellungAufgebenResponse(BestellungAufgebenResponse value) {
        return new JAXBElement<BestellungAufgebenResponse>(_BestellungAufgebenResponse_QNAME, BestellungAufgebenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kunde }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Kunde }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sw.othr.de/", name = "kunde")
    public JAXBElement<Kunde> createKunde(Kunde value) {
        return new JAXBElement<Kunde>(_Kunde_QNAME, Kunde.class, null, value);
    }

}
