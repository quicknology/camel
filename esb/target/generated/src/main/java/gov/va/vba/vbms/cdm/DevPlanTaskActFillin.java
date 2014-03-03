
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DevPlanTaskActFillin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevPlanTaskActFillin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="vbmsUser" type="{http://vbms.vba.va.gov/cdm}VBMSUser"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="devPlanTaskActivityAction" type="{http://vbms.vba.va.gov/cdm}DevelopmentPlanTaskActivityAction"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Paragraph_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="fillinType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fillinName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fillinValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentFillinId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevPlanTaskActFillin", propOrder = {
    "createDt",
    "lastUpdateDt",
    "vbmsUser",
    "expirationDt",
    "devPlanTaskActivityAction"
})
public class DevPlanTaskActFillin {

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
    protected DevelopmentPlanTaskActivityAction devPlanTaskActivityAction;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "Paragraph_ID", required = true)
    protected long paragraphID;
    @XmlAttribute(name = "fillinType", required = true)
    protected String fillinType;
    @XmlAttribute(name = "fillinName", required = true)
    protected String fillinName;
    @XmlAttribute(name = "fillinValue")
    protected String fillinValue;
    @XmlAttribute(name = "parentFillinId")
    protected Long parentFillinId;

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
     * Gets the value of the devPlanTaskActivityAction property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentPlanTaskActivityAction }
     *     
     */
    public DevelopmentPlanTaskActivityAction getDevPlanTaskActivityAction() {
        return devPlanTaskActivityAction;
    }

    /**
     * Sets the value of the devPlanTaskActivityAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentPlanTaskActivityAction }
     *     
     */
    public void setDevPlanTaskActivityAction(DevelopmentPlanTaskActivityAction value) {
        this.devPlanTaskActivityAction = value;
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
     * Gets the value of the paragraphID property.
     * 
     */
    public long getParagraphID() {
        return paragraphID;
    }

    /**
     * Sets the value of the paragraphID property.
     * 
     */
    public void setParagraphID(long value) {
        this.paragraphID = value;
    }

    /**
     * Gets the value of the fillinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillinType() {
        return fillinType;
    }

    /**
     * Sets the value of the fillinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillinType(String value) {
        this.fillinType = value;
    }

    /**
     * Gets the value of the fillinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillinName() {
        return fillinName;
    }

    /**
     * Sets the value of the fillinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillinName(String value) {
        this.fillinName = value;
    }

    /**
     * Gets the value of the fillinValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillinValue() {
        return fillinValue;
    }

    /**
     * Sets the value of the fillinValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillinValue(String value) {
        this.fillinValue = value;
    }

    /**
     * Gets the value of the parentFillinId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentFillinId() {
        return parentFillinId;
    }

    /**
     * Sets the value of the parentFillinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentFillinId(Long value) {
        this.parentFillinId = value;
    }

}
