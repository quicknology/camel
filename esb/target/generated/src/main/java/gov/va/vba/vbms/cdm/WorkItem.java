
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
 * <p>Java class for WorkItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="department" type="{http://vbms.vba.va.gov/cdm}Department" minOccurs="0"/>
 *         &lt;element name="status" type="{http://vbms.vba.va.gov/cdm}WorkItemStatus"/>
 *         &lt;element name="priority" type="{http://vbms.vba.va.gov/cdm}WorkItemPriority"/>
 *         &lt;element name="regionalOffice" type="{http://vbms.vba.va.gov/cdm}RegionalOffice" minOccurs="0"/>
 *         &lt;element name="workFlow" type="{http://vbms.vba.va.gov/cdm}WorkFlow"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assignedTo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jpaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="brokered" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkItem", propOrder = {
    "department",
    "status",
    "priority",
    "regionalOffice",
    "workFlow",
    "createDate",
    "lastUpdateDate"
})
@XmlSeeAlso({
    ClaimWorkItem.class
})
public abstract class WorkItem {

    protected Department department;
    @XmlElement(required = true)
    protected WorkItemStatus status;
    @XmlElement(required = true)
    protected WorkItemPriority priority;
    protected RegionalOffice regionalOffice;
    @XmlElement(required = true)
    protected WorkFlow workFlow;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "assignedTo")
    protected String assignedTo;
    @XmlAttribute(name = "jpaVersion", required = true)
    protected long jpaVersion;
    @XmlAttribute(name = "brokered", required = true)
    protected boolean brokered;

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemStatus }
     *     
     */
    public WorkItemStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemStatus }
     *     
     */
    public void setStatus(WorkItemStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link WorkItemPriority }
     *     
     */
    public WorkItemPriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkItemPriority }
     *     
     */
    public void setPriority(WorkItemPriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the regionalOffice property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalOffice }
     *     
     */
    public RegionalOffice getRegionalOffice() {
        return regionalOffice;
    }

    /**
     * Sets the value of the regionalOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalOffice }
     *     
     */
    public void setRegionalOffice(RegionalOffice value) {
        this.regionalOffice = value;
    }

    /**
     * Gets the value of the workFlow property.
     * 
     * @return
     *     possible object is
     *     {@link WorkFlow }
     *     
     */
    public WorkFlow getWorkFlow() {
        return workFlow;
    }

    /**
     * Sets the value of the workFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkFlow }
     *     
     */
    public void setWorkFlow(WorkFlow value) {
        this.workFlow = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the assignedTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
     * Sets the value of the assignedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedTo(String value) {
        this.assignedTo = value;
    }

    /**
     * Gets the value of the jpaVersion property.
     * 
     */
    public long getJpaVersion() {
        return jpaVersion;
    }

    /**
     * Sets the value of the jpaVersion property.
     * 
     */
    public void setJpaVersion(long value) {
        this.jpaVersion = value;
    }

    /**
     * Gets the value of the brokered property.
     * 
     */
    public boolean isBrokered() {
        return brokered;
    }

    /**
     * Sets the value of the brokered property.
     * 
     */
    public void setBrokered(boolean value) {
        this.brokered = value;
    }

}
