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
 * <p>Java class for List_GroundLocationType_Base.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List_GroundLocationType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Airport"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="PointOfInterest"/>
 *     &lt;enumeration value="Port"/>
 *     &lt;enumeration value="Region"/>
 *     &lt;enumeration value="HomeResidence"/>
 *     &lt;enumeration value="TrainStation"/>
 *     &lt;enumeration value="Vicinity"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_GroundLocationType_Base")
@XmlEnum
public enum ListGroundLocationTypeBase {

    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("PointOfInterest")
    POINT_OF_INTEREST("PointOfInterest"),
    @XmlEnumValue("Port")
    PORT("Port"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("HomeResidence")
    HOME_RESIDENCE("HomeResidence"),
    @XmlEnumValue("TrainStation")
    TRAIN_STATION("TrainStation"),
    @XmlEnumValue("Vicinity")
    VICINITY("Vicinity"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListGroundLocationTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListGroundLocationTypeBase fromValue(String v) {
        for (ListGroundLocationTypeBase c: ListGroundLocationTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
