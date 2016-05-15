//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 12:17:37 PM IST 
//


package ota.hotel;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventDayType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventDayType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PreEvent"/>
 *     &lt;enumeration value="PostEvent"/>
 *     &lt;enumeration value="Published"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventDayType")
@XmlEnum
public enum EventDayType {


    /**
     * Indicates this day is prior to the published event dates.
     * 
     */
    @XmlEnumValue("PreEvent")
    PRE_EVENT("PreEvent"),

    /**
     * Indicates this day is after the published event dates.
     * 
     */
    @XmlEnumValue("PostEvent")
    POST_EVENT("PostEvent"),

    /**
     * Indicates this day is part of the published event dates.
     * 
     */
    @XmlEnumValue("Published")
    PUBLISHED("Published");
    private final String value;

    EventDayType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventDayType fromValue(String v) {
        for (EventDayType c: EventDayType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
