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
 * <p>Java class for AvailabilityStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailabilityStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Close"/>
 *     &lt;enumeration value="ClosedOnArrival"/>
 *     &lt;enumeration value="ClosedOnArrivalOnRequest"/>
 *     &lt;enumeration value="OnRequest"/>
 *     &lt;enumeration value="RemoveCloseOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityStatusType")
@XmlEnum
public enum AvailabilityStatusType {


    /**
     * Inventory is available for sale.
     * 
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * Inventory is not available for sale.
     * 
     */
    @XmlEnumValue("Close")
    CLOSE("Close"),

    /**
     * Inventory is not available for sale to arriving guests.
     * 
     */
    @XmlEnumValue("ClosedOnArrival")
    CLOSED_ON_ARRIVAL("ClosedOnArrival"),

    /**
     * Inventory may not be available for sale to arriving guests.
     * 
     */
    @XmlEnumValue("ClosedOnArrivalOnRequest")
    CLOSED_ON_ARRIVAL_ON_REQUEST("ClosedOnArrivalOnRequest"),

    /**
     * Inventory may be available.
     * 
     */
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),

    /**
     * Remove Close restriction while keeping other restrictions in place.
     * 
     */
    @XmlEnumValue("RemoveCloseOnly")
    REMOVE_CLOSE_ONLY("RemoveCloseOnly");
    private final String value;

    AvailabilityStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityStatusType fromValue(String v) {
        for (AvailabilityStatusType c: AvailabilityStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
