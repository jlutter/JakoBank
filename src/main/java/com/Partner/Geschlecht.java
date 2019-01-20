
package com.Partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geschlecht.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="geschlecht"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MAENNLICH"/&gt;
 *     &lt;enumeration value="WEIBLICH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "geschlecht")
@XmlEnum
public enum Geschlecht {

    MAENNLICH,
    WEIBLICH;

    public String value() {
        return name();
    }

    public static Geschlecht fromValue(String v) {
        return valueOf(v);
    }

}
