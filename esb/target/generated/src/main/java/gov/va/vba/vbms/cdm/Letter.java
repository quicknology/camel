
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Letter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Letter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="senderAddress" type="{http://vbms.vba.va.gov/cdm}Address"/>
 *         &lt;element name="recipientAddress" type="{http://vbms.vba.va.gov/cdm}Address"/>
 *         &lt;element name="generationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="body" type="{http://vbms.vba.va.gov/cdm}LetterBody"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enclosure" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="blameLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carbonCopy" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="stationNumber" type="{http://vbms.vba.va.gov/cdm}RegionalOffice" minOccurs="0"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="vbmsUser" type="{http://vbms.vba.va.gov/cdm}VBMSUser"/>
 *       &lt;/sequence>
 *       &lt;attribute name="letterType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="documentType" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="claim_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="unique_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Letter", propOrder = {
    "senderAddress",
    "recipientAddress",
    "generationDate",
    "salutation",
    "body",
    "signature",
    "enclosure",
    "blameLine",
    "carbonCopy",
    "sentDate",
    "stationNumber",
    "createDt",
    "lastUpdateDt",
    "vbmsUser"
})
@XmlSeeAlso({
    ThirdPartyLetter.class,
    ClaimDevelopmentLetter.class
})
public class Letter {

    @XmlElement(required = true)
    protected Address senderAddress;
    @XmlElement(required = true)
    protected Address recipientAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar generationDate;
    @XmlElement(required = true, defaultValue = "Dear")
    protected String salutation;
    @XmlElement(required = true)
    protected LetterBody body;
    @XmlElement(required = true)
    protected String signature;
    @XmlElement(nillable = true)
    protected List<String> enclosure;
    protected String blameLine;
    @XmlElement(nillable = true)
    protected List<String> carbonCopy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sentDate;
    protected RegionalOffice stationNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlElement(required = true)
    protected VBMSUser vbmsUser;
    @XmlAttribute(name = "letterType")
    protected String letterType;
    @XmlAttribute(name = "documentType", required = true)
    protected long documentType;
    @XmlAttribute(name = "claim_ID", required = true)
    protected long claimID;
    @XmlAttribute(name = "unique_ID")
    protected String uniqueID;
    @XmlAttribute(name = "expirationDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDt;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "status", required = true)
    protected String status;

    /**
     * Gets the value of the senderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getSenderAddress() {
        return senderAddress;
    }

    /**
     * Sets the value of the senderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setSenderAddress(Address value) {
        this.senderAddress = value;
    }

    /**
     * Gets the value of the recipientAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getRecipientAddress() {
        return recipientAddress;
    }

    /**
     * Sets the value of the recipientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setRecipientAddress(Address value) {
        this.recipientAddress = value;
    }

    /**
     * Gets the value of the generationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGenerationDate() {
        return generationDate;
    }

    /**
     * Sets the value of the generationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGenerationDate(XMLGregorianCalendar value) {
        this.generationDate = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link LetterBody }
     *     
     */
    public LetterBody getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterBody }
     *     
     */
    public void setBody(LetterBody value) {
        this.body = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the enclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnclosure() {
        if (enclosure == null) {
            enclosure = new ArrayList<String>();
        }
        return this.enclosure;
    }

    /**
     * Gets the value of the blameLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlameLine() {
        return blameLine;
    }

    /**
     * Sets the value of the blameLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlameLine(String value) {
        this.blameLine = value;
    }

    /**
     * Gets the value of the carbonCopy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carbonCopy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarbonCopy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarbonCopy() {
        if (carbonCopy == null) {
            carbonCopy = new ArrayList<String>();
        }
        return this.carbonCopy;
    }

    /**
     * Gets the value of the sentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentDate() {
        return sentDate;
    }

    /**
     * Sets the value of the sentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSentDate(XMLGregorianCalendar value) {
        this.sentDate = value;
    }

    /**
     * Gets the value of the stationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalOffice }
     *     
     */
    public RegionalOffice getStationNumber() {
        return stationNumber;
    }

    /**
     * Sets the value of the stationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalOffice }
     *     
     */
    public void setStationNumber(RegionalOffice value) {
        this.stationNumber = value;
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
     * Gets the value of the vbmsUser property.
     * 
     * @return
     *     possible object is
     *     {@link VBMSUser }
     *     
     */
    public VBMSUser getVbmsUser() {
        return vbmsUser;
    }

    /**
     * Sets the value of the vbmsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link VBMSUser }
     *     
     */
    public void setVbmsUser(VBMSUser value) {
        this.vbmsUser = value;
    }

    /**
     * Gets the value of the letterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterType() {
        return letterType;
    }

    /**
     * Sets the value of the letterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterType(String value) {
        this.letterType = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     */
    public long getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     */
    public void setDocumentType(long value) {
        this.documentType = value;
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
     * Gets the value of the uniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * Sets the value of the uniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueID(String value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the expirationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDt() {
        return expirationDt;
    }

    /**
     * Sets the value of the expirationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDt(XMLGregorianCalendar value) {
        this.expirationDt = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
