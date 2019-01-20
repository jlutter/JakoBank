
package com.Partner;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for papierformat.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="papierformat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A0"/&gt;
 *     &lt;enumeration value="A1"/&gt;
 *     &lt;enumeration value="A2"/&gt;
 *     &lt;enumeration value="A3"/&gt;
 *     &lt;enumeration value="A4"/&gt;
 *     &lt;enumeration value="A5"/&gt;
 *     &lt;enumeration value="A6"/&gt;
 *     &lt;enumeration value="A7"/&gt;
 *     &lt;enumeration value="A8"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "papierformat")
@XmlEnum
public enum Papierformat {

    @XmlEnumValue("A0")
    A_0("A0"),
    @XmlEnumValue("A1")
    A_1("A1"),
    @XmlEnumValue("A2")
    A_2("A2"),
    @XmlEnumValue("A3")
    A_3("A3"),
    @XmlEnumValue("A4")
    A_4("A4"),
    @XmlEnumValue("A5")
    A_5("A5"),
    @XmlEnumValue("A6")
    A_6("A6"),
    @XmlEnumValue("A7")
    A_7("A7"),
    @XmlEnumValue("A8")
    A_8("A8");
    private final String value;

    Papierformat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Papierformat fromValue(String v) {
        for (Papierformat c: Papierformat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
