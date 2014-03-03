
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DevelopmentPlanTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentPlanTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="vbmsUser" type="{http://vbms.vba.va.gov/cdm}VBMSUser"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="developmentTask" type="{http://vbms.vba.va.gov/cdm}DevelopmentTask"/>
 *         &lt;element name="developmentStatus" type="{http://vbms.vba.va.gov/cdm}DevelopmentStatus"/>
 *         &lt;element name="letter" type="{http://vbms.vba.va.gov/cdm}Letter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="claim_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="taskTitle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="obsoleteInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentPlanTask", propOrder = {
    "createDt",
    "lastUpdateDt",
    "vbmsUser",
    "expirationDt",
    "developmentTask",
    "developmentStatus",
    "letter"
})
public class DevelopmentPlanTask {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlElement(required = true)
    protected VBMSUser vbmsUser;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDt;
    @XmlElement(required = true)
    protected DevelopmentTask developmentTask;
    @XmlElement(required = true)
    protected DevelopmentStatus developmentStatus;
    protected Letter letter;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "claim_ID", required = true)
    protected long claimID;
    @XmlAttribute(name = "taskTitle", required = true)
    protected String taskTitle;
    @XmlAttribute(name = "obsoleteInd", required = true)
    protected boolean obsoleteInd;

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
     * Gets the value of the developmentTask property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentTask }
     *     
     */
    public DevelopmentTask getDevelopmentTask() {
        return developmentTask;
    }

    /**
     * Sets the value of the developmentTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentTask }
     *     
     */
    public void setDevelopmentTask(DevelopmentTask value) {
        this.developmentTask = value;
    }

    /**
     * Gets the value of the developmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentStatus }
     *     
     */
    public DevelopmentStatus getDevelopmentStatus() {
        return developmentStatus;
    }

    /**
     * Sets the value of the developmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentStatus }
     *     
     */
    public void setDevelopmentStatus(DevelopmentStatus value) {
        this.developmentStatus = value;
    }

    /**
     * Gets the value of the letter property.
     * 
     * @return
     *     possible object is
     *     {@link Letter }
     *     
     */
    public Letter getLetter() {
        return letter;
    }

    /**
     * Sets the value of the letter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Letter }
     *     
     */
    public void setLetter(Letter value) {
        this.letter = value;
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
     * Gets the value of the taskTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskTitle() {
        return taskTitle;
    }

    /**
     * Sets the value of the taskTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskTitle(String value) {
        this.taskTitle = value;
    }

    /**
     * Gets the value of the obsoleteInd property.
     * 
     */
    public boolean isObsoleteInd() {
        return obsoleteInd;
    }

    /**
     * Sets the value of the obsoleteInd property.
     * 
     */
    public void setObsoleteInd(boolean value) {
        this.obsoleteInd = value;
    }

}
