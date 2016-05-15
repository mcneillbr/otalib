//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.04 at 12:23:05 PM IST 
//


package ota.hotel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the row details in a seat map.
 * 
 * <p>Java class for SeatDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Summary" type="{http://www.opentravel.org/OTA/2003/05}SeatSummaryType" minOccurs="0"/>
 *         &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *                   &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListAirGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Availability" type="{http://www.opentravel.org/OTA/2003/05}AirSeatAvailabilityType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}SeatFeaturesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *                   &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListAirGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status" type="{http://www.opentravel.org/OTA/2003/05}StatusType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GridNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="ColumnNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="BlockedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BufferInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PremiumInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PremiumCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BulkheadInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ExitRowInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GalleyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PlaneSection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ColumnSpan" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="RowSpan" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDetailsType", propOrder = {
    "summary",
    "amenity",
    "availability",
    "description",
    "features",
    "remarks",
    "service",
    "status",
    "tpaExtensions"
})
public class SeatDetailsType {

    @XmlElement(name = "Summary")
    protected SeatSummaryType summary;
    @XmlElement(name = "Amenity")
    protected List<SeatDetailsType.Amenity> amenity;
    @XmlElement(name = "Availability")
    protected AirSeatAvailabilityType availability;
    @XmlElement(name = "Description")
    protected List<FormattedTextTextType> description;
    @XmlElement(name = "Features")
    protected List<SeatFeaturesType> features;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "Service")
    protected List<SeatDetailsType.Service> service;
    @XmlElement(name = "Status")
    protected List<StatusType> status;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "GridNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gridNumber;
    @XmlAttribute(name = "ColumnNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger columnNumber;
    @XmlAttribute(name = "BlockedInd")
    protected Boolean blockedInd;
    @XmlAttribute(name = "BufferInd")
    protected Boolean bufferInd;
    @XmlAttribute(name = "PremiumInd")
    protected Boolean premiumInd;
    @XmlAttribute(name = "PremiumCode")
    protected String premiumCode;
    @XmlAttribute(name = "BulkheadInd")
    protected Boolean bulkheadInd;
    @XmlAttribute(name = "ExitRowInd")
    protected Boolean exitRowInd;
    @XmlAttribute(name = "GalleyInd")
    protected Boolean galleyInd;
    @XmlAttribute(name = "PlaneSection")
    protected String planeSection;
    @XmlAttribute(name = "ColumnSpan")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger columnSpan;
    @XmlAttribute(name = "RowSpan")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger rowSpan;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link SeatSummaryType }
     *     
     */
    public SeatSummaryType getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatSummaryType }
     *     
     */
    public void setSummary(SeatSummaryType value) {
        this.summary = value;
    }

    /**
     * Gets the value of the amenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatDetailsType.Amenity }
     * 
     * 
     */
    public List<SeatDetailsType.Amenity> getAmenity() {
        if (amenity == null) {
            amenity = new ArrayList<SeatDetailsType.Amenity>();
        }
        return this.amenity;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link AirSeatAvailabilityType }
     *     
     */
    public AirSeatAvailabilityType getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSeatAvailabilityType }
     *     
     */
    public void setAvailability(AirSeatAvailabilityType value) {
        this.availability = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextTextType }
     * 
     * 
     */
    public List<FormattedTextTextType> getDescription() {
        if (description == null) {
            description = new ArrayList<FormattedTextTextType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the features property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the features property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatFeaturesType }
     * 
     * 
     */
    public List<SeatFeaturesType> getFeatures() {
        if (features == null) {
            features = new ArrayList<SeatFeaturesType>();
        }
        return this.features;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatDetailsType.Service }
     * 
     * 
     */
    public List<SeatDetailsType.Service> getService() {
        if (service == null) {
            service = new ArrayList<SeatDetailsType.Service>();
        }
        return this.service;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getStatus() {
        if (status == null) {
            status = new ArrayList<StatusType>();
        }
        return this.status;
    }

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
     * Gets the value of the gridNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGridNumber() {
        return gridNumber;
    }

    /**
     * Sets the value of the gridNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGridNumber(BigInteger value) {
        this.gridNumber = value;
    }

    /**
     * Gets the value of the columnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnNumber() {
        return columnNumber;
    }

    /**
     * Sets the value of the columnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnNumber(BigInteger value) {
        this.columnNumber = value;
    }

    /**
     * Gets the value of the blockedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockedInd() {
        return blockedInd;
    }

    /**
     * Sets the value of the blockedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockedInd(Boolean value) {
        this.blockedInd = value;
    }

    /**
     * Gets the value of the bufferInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBufferInd() {
        return bufferInd;
    }

    /**
     * Sets the value of the bufferInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBufferInd(Boolean value) {
        this.bufferInd = value;
    }

    /**
     * Gets the value of the premiumInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPremiumInd() {
        return premiumInd;
    }

    /**
     * Sets the value of the premiumInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPremiumInd(Boolean value) {
        this.premiumInd = value;
    }

    /**
     * Gets the value of the premiumCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumCode() {
        return premiumCode;
    }

    /**
     * Sets the value of the premiumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumCode(String value) {
        this.premiumCode = value;
    }

    /**
     * Gets the value of the bulkheadInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkheadInd() {
        return bulkheadInd;
    }

    /**
     * Sets the value of the bulkheadInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkheadInd(Boolean value) {
        this.bulkheadInd = value;
    }

    /**
     * Gets the value of the exitRowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExitRowInd() {
        return exitRowInd;
    }

    /**
     * Sets the value of the exitRowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExitRowInd(Boolean value) {
        this.exitRowInd = value;
    }

    /**
     * Gets the value of the galleyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGalleyInd() {
        return galleyInd;
    }

    /**
     * Sets the value of the galleyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGalleyInd(Boolean value) {
        this.galleyInd = value;
    }

    /**
     * Gets the value of the planeSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaneSection() {
        return planeSection;
    }

    /**
     * Sets the value of the planeSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaneSection(String value) {
        this.planeSection = value;
    }

    /**
     * Gets the value of the columnSpan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnSpan() {
        return columnSpan;
    }

    /**
     * Sets the value of the columnSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnSpan(BigInteger value) {
        this.columnSpan = value;
    }

    /**
     * Gets the value of the rowSpan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowSpan() {
        return rowSpan;
    }

    /**
     * Sets the value of the rowSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowSpan(BigInteger value) {
        this.rowSpan = value;
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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
     *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListAirGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "fee"
    })
    public static class Amenity {

        @XmlElement(name = "Description")
        protected FormattedTextTextType description;
        @XmlElement(name = "Fee")
        protected FeeType fee;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "SecondaryCode")
        protected String secondaryCode;
        @XmlAttribute(name = "SupplierCode")
        protected String supplierCode;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link FormattedTextTextType }
         *     
         */
        public FormattedTextTextType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedTextTextType }
         *     
         */
        public void setDescription(FormattedTextTextType value) {
            this.description = value;
        }

        /**
         * Gets the value of the fee property.
         * 
         * @return
         *     possible object is
         *     {@link FeeType }
         *     
         */
        public FeeType getFee() {
            return fee;
        }

        /**
         * Sets the value of the fee property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeType }
         *     
         */
        public void setFee(FeeType value) {
            this.fee = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the secondaryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondaryCode() {
            return secondaryCode;
        }

        /**
         * Sets the value of the secondaryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondaryCode(String value) {
            this.secondaryCode = value;
        }

        /**
         * Gets the value of the supplierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierCode() {
            return supplierCode;
        }

        /**
         * Sets the value of the supplierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierCode(String value) {
            this.supplierCode = value;
        }

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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
     *         &lt;element name="Fee" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListAirGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "fee"
    })
    public static class Service {

        @XmlElement(name = "Description")
        protected FormattedTextTextType description;
        @XmlElement(name = "Fee")
        protected FeeType fee;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "SecondaryCode")
        protected String secondaryCode;
        @XmlAttribute(name = "SupplierCode")
        protected String supplierCode;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link FormattedTextTextType }
         *     
         */
        public FormattedTextTextType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormattedTextTextType }
         *     
         */
        public void setDescription(FormattedTextTextType value) {
            this.description = value;
        }

        /**
         * Gets the value of the fee property.
         * 
         * @return
         *     possible object is
         *     {@link FeeType }
         *     
         */
        public FeeType getFee() {
            return fee;
        }

        /**
         * Sets the value of the fee property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeType }
         *     
         */
        public void setFee(FeeType value) {
            this.fee = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the secondaryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecondaryCode() {
            return secondaryCode;
        }

        /**
         * Sets the value of the secondaryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecondaryCode(String value) {
            this.secondaryCode = value;
        }

        /**
         * Gets the value of the supplierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierCode() {
            return supplierCode;
        }

        /**
         * Sets the value of the supplierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierCode(String value) {
            this.supplierCode = value;
        }

    }

}
