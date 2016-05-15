//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 12:23:05 PM IST 
//


package ota.hotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the origin and destination of the traveler.
 * 
 * <p>Java class for AirItineraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationOptions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginDestinationOption" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType">
 *                           &lt;attribute name="RefNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="DirectionInd" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *       &lt;attribute name="AirItineraryRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryType", propOrder = {
    "originDestinationOptions"
})
public class AirItineraryType {

    @XmlElement(name = "OriginDestinationOptions", required = true)
    protected AirItineraryType.OriginDestinationOptions originDestinationOptions;
    @XmlAttribute(name = "DirectionInd")
    protected AirTripType directionInd;
    @XmlAttribute(name = "AirItineraryRPH")
    protected String airItineraryRPH;

    /**
     * Gets the value of the originDestinationOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType.OriginDestinationOptions }
     *     
     */
    public AirItineraryType.OriginDestinationOptions getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    /**
     * Sets the value of the originDestinationOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType.OriginDestinationOptions }
     *     
     */
    public void setOriginDestinationOptions(AirItineraryType.OriginDestinationOptions value) {
        this.originDestinationOptions = value;
    }

    /**
     * Gets the value of the directionInd property.
     * 
     * @return
     *     possible object is
     *     {@link AirTripType }
     *     
     */
    public AirTripType getDirectionInd() {
        return directionInd;
    }

    /**
     * Sets the value of the directionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTripType }
     *     
     */
    public void setDirectionInd(AirTripType value) {
        this.directionInd = value;
    }

    /**
     * Gets the value of the airItineraryRPH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirItineraryRPH() {
        return airItineraryRPH;
    }

    /**
     * Sets the value of the airItineraryRPH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirItineraryRPH(String value) {
        this.airItineraryRPH = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OriginDestinationOption" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType">
     *                 &lt;attribute name="RefNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originDestinationOption"
    })
    public static class OriginDestinationOptions {

        @XmlElement(name = "OriginDestinationOption", required = true)
        protected List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> originDestinationOption;

        /**
         * Gets the value of the originDestinationOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryType.OriginDestinationOptions.OriginDestinationOption }
         * 
         * 
         */
        public List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> getOriginDestinationOption() {
            if (originDestinationOption == null) {
                originDestinationOption = new ArrayList<AirItineraryType.OriginDestinationOptions.OriginDestinationOption>();
            }
            return this.originDestinationOption;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType">
         *       &lt;attribute name="RefNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OriginDestinationOption
            extends OriginDestinationOptionType
        {

            @XmlAttribute(name = "RefNumber")
            protected Integer refNumber;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "TravelPurpose")
            protected String travelPurpose;

            /**
             * Gets the value of the refNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRefNumber() {
                return refNumber;
            }

            /**
             * Sets the value of the refNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRefNumber(Integer value) {
                this.refNumber = value;
            }

            /**
             * Gets the value of the rph property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * Sets the value of the rph property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * Gets the value of the travelPurpose property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTravelPurpose() {
                return travelPurpose;
            }

            /**
             * Sets the value of the travelPurpose property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTravelPurpose(String value) {
                this.travelPurpose = value;
            }

        }

    }

}
