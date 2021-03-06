//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.11 at 07:19:31 PM IST 
//


package org.opentravel.ota;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The ProfileCertification element identifies the travel agency to be paid by providing the IATA number or ARC certifying number. (Implementation note: This attribute is optional, but if it is not set, the Profile attribute must be set.)
 * 
 * <p>Java class for ProfileCertificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileCertificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CertificationType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="CertificationID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileCertificationType")
public class ProfileCertificationType {

    @XmlAttribute(name = "CertificationType")
    protected String certificationType;
    @XmlAttribute(name = "CertificationID")
    protected String certificationID;

    /**
     * Gets the value of the certificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationType() {
        return certificationType;
    }

    /**
     * Sets the value of the certificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationType(String value) {
        this.certificationType = value;
    }

    /**
     * Gets the value of the certificationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationID() {
        return certificationID;
    }

    /**
     * Sets the value of the certificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationID(String value) {
        this.certificationID = value;
    }

}
