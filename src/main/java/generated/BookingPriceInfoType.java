//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 07:19:31 PM IST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 *  Pricing information for an itinerary.
 * 
 * <p>Java class for BookingPriceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingPriceInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{}AirItineraryPricingInfoType">
 *       &lt;attribute name="RepriceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingPriceInfoType")
public class BookingPriceInfoType
    extends AirItineraryPricingInfoType
{

    @XmlAttribute(name = "RepriceRequired")
    protected Boolean repriceRequired;

    /**
     * Gets the value of the repriceRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepriceRequired() {
        return repriceRequired;
    }

    /**
     * Sets the value of the repriceRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepriceRequired(Boolean value) {
        this.repriceRequired = value;
    }

}