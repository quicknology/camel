
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClaimWorkItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimWorkItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}WorkItem">
 *       &lt;sequence>
 *         &lt;element name="EndProductClaimType" type="{http://vbms.vba.va.gov/cdm}CodeValue"/>
 *         &lt;element name="suspenseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="claimDateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="claimStatus" type="{http://vbms.vba.va.gov/cdm}ClaimStatus"/>
 *       &lt;/sequence>
 *       &lt;attribute name="claimID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="modifiedEndProductCd" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="claimStatusName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="claimStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="participantPersonId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="stationOfJurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="veteranPersonID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="terminalDigit" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contentionsCount" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="claimantFirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="claimantLastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="veteranFirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="veteranLastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vsrId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="suspenseReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimWorkItem", propOrder = {
    "endProductClaimType",
    "suspenseDate",
    "claimDateDt",
    "claimStatus"
})
@XmlSeeAlso({
    BrokeredClaimWorkItem.class
})
public class ClaimWorkItem
    extends WorkItem
{

    @XmlElement(name = "EndProductClaimType", required = true)
    protected CodeValue endProductClaimType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspenseDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar claimDateDt;
    @XmlElement(required = true)
    protected ClaimStatus claimStatus;
    @XmlAttribute(name = "claimID", required = true)
    protected long claimID;
    @XmlAttribute(name = "modifiedEndProductCd")
    protected Long modifiedEndProductCd;
    @XmlAttribute(name = "claimStatusName")
    protected String claimStatusName;
    @XmlAttribute(name = "claimStatusCode")
    protected String claimStatusCode;
    @XmlAttribute(name = "participantPersonId")
    protected Long participantPersonId;
    @XmlAttribute(name = "stationOfJurisdiction")
    protected String stationOfJurisdiction;
    @XmlAttribute(name = "veteranPersonID")
    protected Long veteranPersonID;
    @XmlAttribute(name = "terminalDigit")
    protected Long terminalDigit;
    @XmlAttribute(name = "contentionsCount")
    protected Long contentionsCount;
    @XmlAttribute(name = "claimantFirstName")
    protected String claimantFirstName;
    @XmlAttribute(name = "claimantLastName")
    protected String claimantLastName;
    @XmlAttribute(name = "veteranFirstName")
    protected String veteranFirstName;
    @XmlAttribute(name = "veteranLastName")
    protected String veteranLastName;
    @XmlAttribute(name = "fileNumber")
    protected String fileNumber;
    @XmlAttribute(name = "vsrId")
    protected Long vsrId;
    @XmlAttribute(name = "suspenseReason")
    protected String suspenseReason;

    /**
     * Gets the value of the endProductClaimType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeValue }
     *     
     */
    public CodeValue getEndProductClaimType() {
        return endProductClaimType;
    }

    /**
     * Sets the value of the endProductClaimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValue }
     *     
     */
    public void setEndProductClaimType(CodeValue value) {
        this.endProductClaimType = value;
    }

    /**
     * Gets the value of the suspenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspenseDate() {
        return suspenseDate;
    }

    /**
     * Sets the value of the suspenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspenseDate(XMLGregorianCalendar value) {
        this.suspenseDate = value;
    }

    /**
     * Gets the value of the claimDateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClaimDateDt() {
        return claimDateDt;
    }

    /**
     * Sets the value of the claimDateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClaimDateDt(XMLGregorianCalendar value) {
        this.claimDateDt = value;
    }

    /**
     * Gets the value of the claimStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStatus }
     *     
     */
    public ClaimStatus getClaimStatus() {
        return claimStatus;
    }

    /**
     * Sets the value of the claimStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStatus }
     *     
     */
    public void setClaimStatus(ClaimStatus value) {
        this.claimStatus = value;
    }

    /**
     * Gets the value of the claimID property.
     * 
     */
    public long getClaimID() {
        return claimID;
    }

    /**
     * Sets the value of the claimID property.
     * 
     */
    public void setClaimID(long value) {
        this.claimID = value;
    }

    /**
     * Gets the value of the modifiedEndProductCd property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModifiedEndProductCd() {
        return modifiedEndProductCd;
    }

    /**
     * Sets the value of the modifiedEndProductCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModifiedEndProductCd(Long value) {
        this.modifiedEndProductCd = value;
    }

    /**
     * Gets the value of the claimStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimStatusName() {
        return claimStatusName;
    }

    /**
     * Sets the value of the claimStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatusName(String value) {
        this.claimStatusName = value;
    }

    /**
     * Gets the value of the claimStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimStatusCode() {
        return claimStatusCode;
    }

    /**
     * Sets the value of the claimStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatusCode(String value) {
        this.claimStatusCode = value;
    }

    /**
     * Gets the value of the participantPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParticipantPersonId() {
        return participantPersonId;
    }

    /**
     * Sets the value of the participantPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParticipantPersonId(Long value) {
        this.participantPersonId = value;
    }

    /**
     * Gets the value of the stationOfJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationOfJurisdiction() {
        return stationOfJurisdiction;
    }

    /**
     * Sets the value of the stationOfJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationOfJurisdiction(String value) {
        this.stationOfJurisdiction = value;
    }

    /**
     * Gets the value of the veteranPersonID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVeteranPersonID() {
        return veteranPersonID;
    }

    /**
     * Sets the value of the veteranPersonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVeteranPersonID(Long value) {
        this.veteranPersonID = value;
    }

    /**
     * Gets the value of the terminalDigit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerminalDigit() {
        return terminalDigit;
    }

    /**
     * Sets the value of the terminalDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerminalDigit(Long value) {
        this.terminalDigit = value;
    }

    /**
     * Gets the value of the contentionsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContentionsCount() {
        return contentionsCount;
    }

    /**
     * Sets the value of the contentionsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContentionsCount(Long value) {
        this.contentionsCount = value;
    }

    /**
     * Gets the value of the claimantFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimantFirstName() {
        return claimantFirstName;
    }

    /**
     * Sets the value of the claimantFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimantFirstName(String value) {
        this.claimantFirstName = value;
    }

    /**
     * Gets the value of the claimantLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimantLastName() {
        return claimantLastName;
    }

    /**
     * Sets the value of the claimantLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimantLastName(String value) {
        this.claimantLastName = value;
    }

    /**
     * Gets the value of the veteranFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeteranFirstName() {
        return veteranFirstName;
    }

    /**
     * Sets the value of the veteranFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeteranFirstName(String value) {
        this.veteranFirstName = value;
    }

    /**
     * Gets the value of the veteranLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeteranLastName() {
        return veteranLastName;
    }

    /**
     * Sets the value of the veteranLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeteranLastName(String value) {
        this.veteranLastName = value;
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
     * Gets the value of the vsrId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVsrId() {
        return vsrId;
    }

    /**
     * Sets the value of the vsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVsrId(Long value) {
        this.vsrId = value;
    }

    /**
     * Gets the value of the suspenseReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspenseReason() {
        return suspenseReason;
    }

    /**
     * Sets the value of the suspenseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspenseReason(String value) {
        this.suspenseReason = value;
    }

}
