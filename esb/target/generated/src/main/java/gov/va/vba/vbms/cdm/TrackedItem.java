
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrackedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="document" type="{http://vbms.vba.va.gov/cdm}Document"/>
 *         &lt;element name="requestDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="suspenseDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="closeDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="inErrorDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="followUpDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="secondFollowUpDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receivedDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Claim_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="itemRequested" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sentTo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackedItem", propOrder = {
    "document",
    "requestDt",
    "suspenseDt",
    "closeDt",
    "inErrorDt",
    "followUpDt",
    "secondFollowUpDt",
    "createDt",
    "lastUpdateDt",
    "receivedDt"
})
public class TrackedItem {

    @XmlElement(required = true)
    protected Document document;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspenseDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closeDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inErrorDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar followUpDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar secondFollowUpDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receivedDt;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "Claim_ID", required = true)
    protected long claimID;
    @XmlAttribute(name = "itemRequested", required = true)
    protected String itemRequested;
    @XmlAttribute(name = "sentTo", required = true)
    protected String sentTo;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setDocument(Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the requestDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDt() {
        return requestDt;
    }

    /**
     * Sets the value of the requestDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDt(XMLGregorianCalendar value) {
        this.requestDt = value;
    }

    /**
     * Gets the value of the suspenseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspenseDt() {
        return suspenseDt;
    }

    /**
     * Sets the value of the suspenseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspenseDt(XMLGregorianCalendar value) {
        this.suspenseDt = value;
    }

    /**
     * Gets the value of the closeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDt() {
        return closeDt;
    }

    /**
     * Sets the value of the closeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseDt(XMLGregorianCalendar value) {
        this.closeDt = value;
    }

    /**
     * Gets the value of the inErrorDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInErrorDt() {
        return inErrorDt;
    }

    /**
     * Sets the value of the inErrorDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInErrorDt(XMLGregorianCalendar value) {
        this.inErrorDt = value;
    }

    /**
     * Gets the value of the followUpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFollowUpDt() {
        return followUpDt;
    }

    /**
     * Sets the value of the followUpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFollowUpDt(XMLGregorianCalendar value) {
        this.followUpDt = value;
    }

    /**
     * Gets the value of the secondFollowUpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSecondFollowUpDt() {
        return secondFollowUpDt;
    }

    /**
     * Sets the value of the secondFollowUpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSecondFollowUpDt(XMLGregorianCalendar value) {
        this.secondFollowUpDt = value;
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
     * Gets the value of the receivedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDt() {
        return receivedDt;
    }

    /**
     * Sets the value of the receivedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDt(XMLGregorianCalendar value) {
        this.receivedDt = value;
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
     * Gets the value of the itemRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemRequested() {
        return itemRequested;
    }

    /**
     * Sets the value of the itemRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemRequested(String value) {
        this.itemRequested = value;
    }

    /**
     * Gets the value of the sentTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentTo() {
        return sentTo;
    }

    /**
     * Sets the value of the sentTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentTo(String value) {
        this.sentTo = value;
    }

}
