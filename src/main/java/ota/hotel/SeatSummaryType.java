//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 12:23:05 PM IST 
//


package ota.hotel;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes summary seat information, including number and characteristics.
 * 
 * <p>Java class for SeatSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="SeatSection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AirBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *       &lt;attribute name="SeatSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AdvancePurchaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AvailableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="InoperativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OccupiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatSummaryType", propOrder = {
    "tpaExtensions"
})
public class SeatSummaryType {

    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "SeatSection")
    protected String seatSection;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "RowNumber")
    protected BigInteger rowNumber;
    @XmlAttribute(name = "AirBookDesigCode")
    protected String airBookDesigCode;
    @XmlAttribute(name = "SeatSequenceNumber")
    protected BigInteger seatSequenceNumber;
    @XmlAttribute(name = "AdvancePurchaseInd")
    protected Boolean advancePurchaseInd;
    @XmlAttribute(name = "AvailableInd")
    protected Boolean availableInd;
    @XmlAttribute(name = "InoperativeInd")
    protected Boolean inoperativeInd;
    @XmlAttribute(name = "OccupiedInd")
    protected Boolean occupiedInd;

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     * Gets the value of the seatSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatSection() {
        return seatSection;
    }

    /**
     * Sets the value of the seatSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatSection(String value) {
        this.seatSection = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the airBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirBookDesigCode() {
        return airBookDesigCode;
    }

    /**
     * Sets the value of the airBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirBookDesigCode(String value) {
        this.airBookDesigCode = value;
    }

    /**
     * Gets the value of the seatSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatSequenceNumber() {
        return seatSequenceNumber;
    }

    /**
     * Sets the value of the seatSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatSequenceNumber(BigInteger value) {
        this.seatSequenceNumber = value;
    }

    /**
     * Gets the value of the advancePurchaseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvancePurchaseInd() {
        return advancePurchaseInd;
    }

    /**
     * Sets the value of the advancePurchaseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvancePurchaseInd(Boolean value) {
        this.advancePurchaseInd = value;
    }

    /**
     * Gets the value of the availableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableInd() {
        return availableInd;
    }

    /**
     * Sets the value of the availableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableInd(Boolean value) {
        this.availableInd = value;
    }

    /**
     * Gets the value of the inoperativeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInoperativeInd() {
        return inoperativeInd;
    }

    /**
     * Sets the value of the inoperativeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInoperativeInd(Boolean value) {
        this.inoperativeInd = value;
    }

    /**
     * Gets the value of the occupiedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOccupiedInd() {
        return occupiedInd;
    }

    /**
     * Sets the value of the occupiedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOccupiedInd(Boolean value) {
        this.occupiedInd = value;
    }

}
