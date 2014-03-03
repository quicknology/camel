
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DevelopmentPlanTaskActivityAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentPlanTaskActivityAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="vbmsUser" type="{http://vbms.vba.va.gov/cdm}VBMSUser"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="developmentPlanTaskActivity" type="{http://vbms.vba.va.gov/cdm}DevelopmentPlanTaskActivity"/>
 *         &lt;element name="stdDvlpmtAction" type="{http://vbms.vba.va.gov/cdm}StdDvlpmtAction"/>
 *         &lt;element name="letter" type="{http://vbms.vba.va.gov/cdm}Letter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="omitInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TrackedItem_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="suspenseDuration" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentPlanTaskActivityAction", propOrder = {
    "createDt",
    "lastUpdateDt",
    "vbmsUser",
    "expirationDt",
    "developmentPlanTaskActivity",
    "stdDvlpmtAction",
    "letter"
})
public class DevelopmentPlanTaskActivityAction {

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
    protected DevelopmentPlanTaskActivity developmentPlanTaskActivity;
    @XmlElement(required = true)
    protected StdDvlpmtAction stdDvlpmtAction;
    protected Letter letter;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "omitInd", required = true)
    protected boolean omitInd;
    @XmlAttribute(name = "TrackedItem_ID", required = true)
    protected long trackedItemID;
    @XmlAttribute(name = "suspenseDuration")
    protected Integer suspenseDuration;

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
     * Gets the value of the developmentPlanTaskActivity property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentPlanTaskActivity }
     *     
     */
    public DevelopmentPlanTaskActivity getDevelopmentPlanTaskActivity() {
        return developmentPlanTaskActivity;
    }

    /**
     * Sets the value of the developmentPlanTaskActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentPlanTaskActivity }
     *     
     */
    public void setDevelopmentPlanTaskActivity(DevelopmentPlanTaskActivity value) {
        this.developmentPlanTaskActivity = value;
    }

    /**
     * Gets the value of the stdDvlpmtAction property.
     * 
     * @return
     *     possible object is
     *     {@link StdDvlpmtAction }
     *     
     */
    public StdDvlpmtAction getStdDvlpmtAction() {
        return stdDvlpmtAction;
    }

    /**
     * Sets the value of the stdDvlpmtAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdDvlpmtAction }
     *     
     */
    public void setStdDvlpmtAction(StdDvlpmtAction value) {
        this.stdDvlpmtAction = value;
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
     * Gets the value of the omitInd property.
     * 
     */
    public boolean isOmitInd() {
        return omitInd;
    }

    /**
     * Sets the value of the omitInd property.
     * 
     */
    public void setOmitInd(boolean value) {
        this.omitInd = value;
    }

    /**
     * Gets the value of the trackedItemID property.
     * 
     */
    public long getTrackedItemID() {
        return trackedItemID;
    }

    /**
     * Sets the value of the trackedItemID property.
     * 
     */
    public void setTrackedItemID(long value) {
        this.trackedItemID = value;
    }

    /**
     * Gets the value of the suspenseDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspenseDuration() {
        return suspenseDuration;
    }

    /**
     * Sets the value of the suspenseDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspenseDuration(Integer value) {
        this.suspenseDuration = value;
    }

}
