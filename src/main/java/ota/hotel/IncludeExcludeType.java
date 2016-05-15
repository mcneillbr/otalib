//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 12:23:05 PM IST 
//


package ota.hotel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncludeExcludeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IncludeExcludeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Include"/>
 *     &lt;enumeration value="Exclude"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="Allowed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IncludeExcludeType")
@XmlEnum
public enum IncludeExcludeType {

    @XmlEnumValue("Include")
    INCLUDE("Include"),
    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude"),

    /**
     * The associated item is required.
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * The associated item is allowed.
     * 
     */
    @XmlEnumValue("Allowed")
    ALLOWED("Allowed");
    private final String value;

    IncludeExcludeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IncludeExcludeType fromValue(String v) {
        for (IncludeExcludeType c: IncludeExcludeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
