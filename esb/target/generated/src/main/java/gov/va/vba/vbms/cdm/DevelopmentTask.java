
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DevelopmentTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="developmentActivities" type="{http://vbms.vba.va.gov/cdm}DevelopmentActivity" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sortOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="requiredInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="taskCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uniqueInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="correspondenceInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentTask", propOrder = {
    "createDt",
    "lastUpdateDt",
    "expirationDt",
    "developmentActivities"
})
public class DevelopmentTask {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDt;
    @XmlElement(required = true)
    protected List<DevelopmentActivity> developmentActivities;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "sortOrder", required = true)
    protected int sortOrder;
    @XmlAttribute(name = "requiredInd", required = true)
    protected boolean requiredInd;
    @XmlAttribute(name = "taskCode", required = true)
    protected String taskCode;
    @XmlAttribute(name = "uniqueInd", required = true)
    protected boolean uniqueInd;
    @XmlAttribute(name = "correspondenceInd", required = true)
    protected boolean correspondenceInd;

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
     * Gets the value of the developmentActivities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the developmentActivities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevelopmentActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevelopmentActivity }
     * 
     * 
     */
    public List<DevelopmentActivity> getDevelopmentActivities() {
        if (developmentActivities == null) {
            developmentActivities = new ArrayList<DevelopmentActivity>();
        }
        return this.developmentActivities;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     */
    public void setSortOrder(int value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the requiredInd property.
     * 
     */
    public boolean isRequiredInd() {
        return requiredInd;
    }

    /**
     * Sets the value of the requiredInd property.
     * 
     */
    public void setRequiredInd(boolean value) {
        this.requiredInd = value;
    }

    /**
     * Gets the value of the taskCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * Sets the value of the taskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskCode(String value) {
        this.taskCode = value;
    }

    /**
     * Gets the value of the uniqueInd property.
     * 
     */
    public boolean isUniqueInd() {
        return uniqueInd;
    }

    /**
     * Sets the value of the uniqueInd property.
     * 
     */
    public void setUniqueInd(boolean value) {
        this.uniqueInd = value;
    }

    /**
     * Gets the value of the correspondenceInd property.
     * 
     */
    public boolean isCorrespondenceInd() {
        return correspondenceInd;
    }

    /**
     * Sets the value of the correspondenceInd property.
     * 
     */
    public void setCorrespondenceInd(boolean value) {
        this.correspondenceInd = value;
    }

}
