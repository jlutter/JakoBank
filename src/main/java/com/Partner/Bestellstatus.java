
package com.Partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bestellstatus.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bestellstatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUFTRAG_ANGELEGT"/&gt;
 *     &lt;enumeration value="AUFTRAG_WIRD_BEARBEITET"/&gt;
 *     &lt;enumeration value="AUFTRAG_ABGESCHLOSSEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "bestellstatus")
@XmlEnum
public enum Bestellstatus {

    AUFTRAG_ANGELEGT,
    AUFTRAG_WIRD_BEARBEITET,
    AUFTRAG_ABGESCHLOSSEN;

    public String value() {
        return name();
    }

    public static Bestellstatus fromValue(String v) {
        return valueOf(v);
    }

}
