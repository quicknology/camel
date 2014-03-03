
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RatedIssue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatedIssue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="diagnosticCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="diagnosticDescription" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ratingReason" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ratingDecision" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="notificationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="appealsIndicator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="diagnosticPercent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatedIssue", propOrder = {
    "createDt",
    "lastUpdateDt",
    "beginDate"
})
public class RatedIssue {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "diagnosticCode", required = true)
    protected String diagnosticCode;
    @XmlAttribute(name = "diagnosticDescription", required = true)
    protected String diagnosticDescription;
    @XmlAttribute(name = "ratingReason", required = true)
    protected String ratingReason;
    @XmlAttribute(name = "ratingDecision", required = true)
    protected String ratingDecision;
    @XmlAttribute(name = "notificationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar notificationDate;
    @XmlAttribute(name = "appealsIndicator", required = true)
    protected String appealsIndicator;
    @XmlAttribute(name = "fileNumber", required = true)
    protected String fileNumber;
    @XmlAttribute(name = "diagnosticPercent")
    protected String diagnosticPercent;

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
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
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
     * Gets the value of the diagnosticCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticCode() {
        return diagnosticCode;
    }

    /**
     * Sets the value of the diagnosticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticCode(String value) {
        this.diagnosticCode = value;
    }

    /**
     * Gets the value of the diagnosticDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticDescription() {
        return diagnosticDescription;
    }

    /**
     * Sets the value of the diagnosticDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticDescription(String value) {
        this.diagnosticDescription = value;
    }

    /**
     * Gets the value of the ratingReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingReason() {
        return ratingReason;
    }

    /**
     * Sets the value of the ratingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingReason(String value) {
        this.ratingReason = value;
    }

    /**
     * Gets the value of the ratingDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingDecision() {
        return ratingDecision;
    }

    /**
     * Sets the value of the ratingDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingDecision(String value) {
        this.ratingDecision = value;
    }

    /**
     * Gets the value of the notificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotificationDate() {
        return notificationDate;
    }

    /**
     * Sets the value of the notificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotificationDate(XMLGregorianCalendar value) {
        this.notificationDate = value;
    }

    /**
     * Gets the value of the appealsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppealsIndicator() {
        return appealsIndicator;
    }

    /**
     * Sets the value of the appealsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppealsIndicator(String value) {
        this.appealsIndicator = value;
    }

    /**
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the diagnosticPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticPercent() {
        return diagnosticPercent;
    }

    /**
     * Sets the value of the diagnosticPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticPercent(String value) {
        this.diagnosticPercent = value;
    }

}
