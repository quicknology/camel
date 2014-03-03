
package gov.va.vba.vbms.cdm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PowInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="captureDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="releaseDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ServiceInfo_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="powValidation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="powDays" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="countryOfCaptivityCd" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="captivityLocation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="captors" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="militaryTheater" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowInfo", propOrder = {
    "captureDt",
    "releaseDt",
    "createDt",
    "lastUpdateDt"
})
public class PowInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar captureDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar releaseDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "ServiceInfo_ID", required = true)
    protected long serviceInfoID;
    @XmlAttribute(name = "powValidation", required = true)
    protected String powValidation;
    @XmlAttribute(name = "powDays", required = true)
    protected BigInteger powDays;
    @XmlAttribute(name = "countryOfCaptivityCd", required = true)
    protected String countryOfCaptivityCd;
    @XmlAttribute(name = "captivityLocation", required = true)
    protected String captivityLocation;
    @XmlAttribute(name = "captors", required = true)
    protected String captors;
    @XmlAttribute(name = "militaryTheater", required = true)
    protected String militaryTheater;

    /**
     * Gets the value of the captureDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaptureDt() {
        return captureDt;
    }

    /**
     * Sets the value of the captureDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaptureDt(XMLGregorianCalendar value) {
        this.captureDt = value;
    }

    /**
     * Gets the value of the releaseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDt() {
        return releaseDt;
    }

    /**
     * Sets the value of the releaseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDt(XMLGregorianCalendar value) {
        this.releaseDt = value;
    }

    /**
     * Gets the value of the createDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDt() {
        return createDt;
    }

    /**
     * Sets the value of the createDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDt(XMLGregorianCalendar value) {
        this.createDt = value;
    }

    /**
     * Gets the value of the lastUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * Sets the value of the lastUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDt(XMLGregorianCalendar value) {
        this.lastUpdateDt = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the serviceInfoID property.
     * 
     */
    public long getServiceInfoID() {
        return serviceInfoID;
    }

    /**
     * Sets the value of the serviceInfoID property.
     * 
     */
    public void setServiceInfoID(long value) {
        this.serviceInfoID = value;
    }

    /**
     * Gets the value of the powValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowValidation() {
        return powValidation;
    }

    /**
     * Sets the value of the powValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowValidation(String value) {
        this.powValidation = value;
    }

    /**
     * Gets the value of the powDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPowDays() {
        return powDays;
    }

    /**
     * Sets the value of the powDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPowDays(BigInteger value) {
        this.powDays = value;
    }

    /**
     * Gets the value of the countryOfCaptivityCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfCaptivityCd() {
        return countryOfCaptivityCd;
    }

    /**
     * Sets the value of the countryOfCaptivityCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfCaptivityCd(String value) {
        this.countryOfCaptivityCd = value;
    }

    /**
     * Gets the value of the captivityLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptivityLocation() {
        return captivityLocation;
    }

    /**
     * Sets the value of the captivityLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptivityLocation(String value) {
        this.captivityLocation = value;
    }

    /**
     * Gets the value of the captors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptors() {
        return captors;
    }

    /**
     * Sets the value of the captors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptors(String value) {
        this.captors = value;
    }

    /**
     * Gets the value of the militaryTheater property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryTheater() {
        return militaryTheater;
    }

    /**
     * Sets the value of the militaryTheater property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryTheater(String value) {
        this.militaryTheater = value;
    }

}
