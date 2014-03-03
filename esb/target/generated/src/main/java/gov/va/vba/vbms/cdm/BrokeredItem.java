
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BrokeredItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrokeredItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="originRO" type="{http://vbms.vba.va.gov/cdm}RegionalOffice"/>
 *         &lt;element name="destinationRO" type="{http://vbms.vba.va.gov/cdm}RegionalOffice"/>
 *         &lt;element name="dateReceived" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dateSent" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="brokerOfficial" type="{http://vbms.vba.va.gov/cdm}VBMSUser"/>
 *         &lt;element name="brokerNote" type="{http://vbms.vba.va.gov/cdm}Notes"/>
 *       &lt;/sequence>
 *       &lt;attribute name="workItemId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokeredItem", propOrder = {
    "id",
    "createDate",
    "lastUpdateDate",
    "originRO",
    "destinationRO",
    "dateReceived",
    "dateSent",
    "expirationDt",
    "brokerOfficial",
    "brokerNote"
})
public class BrokeredItem {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(required = true)
    protected RegionalOffice originRO;
    @XmlElement(required = true)
    protected RegionalOffice destinationRO;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateReceived;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSent;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDt;
    @XmlElement(required = true)
    protected VBMSUser brokerOfficial;
    @XmlElement(required = true)
    protected Notes brokerNote;
    @XmlAttribute(name = "workItemId")
    protected Long workItemId;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the originRO property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalOffice }
     *     
     */
    public RegionalOffice getOriginRO() {
        return originRO;
    }

    /**
     * Sets the value of the originRO property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalOffice }
     *     
     */
    public void setOriginRO(RegionalOffice value) {
        this.originRO = value;
    }

    /**
     * Gets the value of the destinationRO property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalOffice }
     *     
     */
    public RegionalOffice getDestinationRO() {
        return destinationRO;
    }

    /**
     * Sets the value of the destinationRO property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalOffice }
     *     
     */
    public void setDestinationRO(RegionalOffice value) {
        this.destinationRO = value;
    }

    /**
     * Gets the value of the dateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReceived() {
        return dateReceived;
    }

    /**
     * Sets the value of the dateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReceived(XMLGregorianCalendar value) {
        this.dateReceived = value;
    }

    /**
     * Gets the value of the dateSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSent() {
        return dateSent;
    }

    /**
     * Sets the value of the dateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSent(XMLGregorianCalendar value) {
        this.dateSent = value;
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
     * Gets the value of the brokerOfficial property.
     * 
     * @return
     *     possible object is
     *     {@link VBMSUser }
     *     
     */
    public VBMSUser getBrokerOfficial() {
        return brokerOfficial;
    }

    /**
     * Sets the value of the brokerOfficial property.
     * 
     * @param value
     *     allowed object is
     *     {@link VBMSUser }
     *     
     */
    public void setBrokerOfficial(VBMSUser value) {
        this.brokerOfficial = value;
    }

    /**
     * Gets the value of the brokerNote property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getBrokerNote() {
        return brokerNote;
    }

    /**
     * Sets the value of the brokerNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setBrokerNote(Notes value) {
        this.brokerNote = value;
    }

    /**
     * Gets the value of the workItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkItemId() {
        return workItemId;
    }

    /**
     * Sets the value of the workItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkItemId(Long value) {
        this.workItemId = value;
    }

}
