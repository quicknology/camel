
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DevelopmentPlanTaskActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentPlanTaskActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="vbmsUser" type="{http://vbms.vba.va.gov/cdm}VBMSUser"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="developmentPlanTask" type="{http://vbms.vba.va.gov/cdm}DevelopmentPlanTask"/>
 *         &lt;element name="developmentActivity" type="{http://vbms.vba.va.gov/cdm}DevelopmentActivity"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="letterStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentPlanTaskActivity", propOrder = {
    "createDt",
    "lastUpdateDt",
    "vbmsUser",
    "expirationDt",
    "developmentPlanTask",
    "developmentActivity"
})
public class DevelopmentPlanTaskActivity {

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
    protected DevelopmentPlanTask developmentPlanTask;
    @XmlElement(required = true)
    protected DevelopmentActivity developmentActivity;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "letterStatus")
    protected String letterStatus;

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
     * Gets the value of the developmentPlanTask property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentPlanTask }
     *     
     */
    public DevelopmentPlanTask getDevelopmentPlanTask() {
        return developmentPlanTask;
    }

    /**
     * Sets the value of the developmentPlanTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentPlanTask }
     *     
     */
    public void setDevelopmentPlanTask(DevelopmentPlanTask value) {
        this.developmentPlanTask = value;
    }

    /**
     * Gets the value of the developmentActivity property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentActivity }
     *     
     */
    public DevelopmentActivity getDevelopmentActivity() {
        return developmentActivity;
    }

    /**
     * Sets the value of the developmentActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentActivity }
     *     
     */
    public void setDevelopmentActivity(DevelopmentActivity value) {
        this.developmentActivity = value;
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
     * Gets the value of the letterStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterStatus() {
        return letterStatus;
    }

    /**
     * Sets the value of the letterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterStatus(String value) {
        this.letterStatus = value;
    }

}
