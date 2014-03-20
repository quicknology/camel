
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StandardFillInValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardFillInValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="vbmsUser" type="{http://vbms.vba.va.gov/cdm}VBMSUser"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="developmentPlanTaskActivityAction" type="{http://vbms.vba.va.gov/cdm}DevelopmentPlanTaskActivityAction"/>
 *         &lt;element name="standardFillIn" type="{http://vbms.vba.va.gov/cdm}StandardFillIn"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="fillInValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardFillInValue", propOrder = {
    "createDt",
    "lastUpdateDt",
    "vbmsUser",
    "expirationDt",
    "developmentPlanTaskActivityAction",
    "standardFillIn"
})
public class StandardFillInValue {

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
    protected DevelopmentPlanTaskActivityAction developmentPlanTaskActivityAction;
    @XmlElement(required = true)
    protected StandardFillIn standardFillIn;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "fillInValue")
    protected String fillInValue;

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
     * Gets the value of the developmentPlanTaskActivityAction property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentPlanTaskActivityAction }
     *     
     */
    public DevelopmentPlanTaskActivityAction getDevelopmentPlanTaskActivityAction() {
        return developmentPlanTaskActivityAction;
    }

    /**
     * Sets the value of the developmentPlanTaskActivityAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentPlanTaskActivityAction }
     *     
     */
    public void setDevelopmentPlanTaskActivityAction(DevelopmentPlanTaskActivityAction value) {
        this.developmentPlanTaskActivityAction = value;
    }

    /**
     * Gets the value of the standardFillIn property.
     * 
     * @return
     *     possible object is
     *     {@link StandardFillIn }
     *     
     */
    public StandardFillIn getStandardFillIn() {
        return standardFillIn;
    }

    /**
     * Sets the value of the standardFillIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardFillIn }
     *     
     */
    public void setStandardFillIn(StandardFillIn value) {
        this.standardFillIn = value;
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
     * Gets the value of the fillInValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillInValue() {
        return fillInValue;
    }

    /**
     * Sets the value of the fillInValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillInValue(String value) {
        this.fillInValue = value;
    }

}
