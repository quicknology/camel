
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
 * <p>Java class for VBMSUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VBMSUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vbmsUserRoles" type="{http://vbms.vba.va.gov/cdm}VBMSUserRole" maxOccurs="unbounded"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="stationNumber" type="{http://vbms.vba.va.gov/cdm}RegionalOffice"/>
 *         &lt;element name="lastLogInDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="vbmsID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalUserID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="securityLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="jpaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VBMSUser", propOrder = {
    "vbmsUserRoles",
    "createDt",
    "lastUpdateDt",
    "stationNumber",
    "lastLogInDt"
})
public class VBMSUser {

    @XmlElement(required = true)
    protected List<VBMSUserRole> vbmsUserRoles;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlElement(required = true)
    protected RegionalOffice stationNumber;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastLogInDt;
    @XmlAttribute(name = "vbmsID")
    protected Long vbmsID;
    @XmlAttribute(name = "ID")
    protected Long id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "userID", required = true)
    protected String userID;
    @XmlAttribute(name = "externalUserID")
    protected String externalUserID;
    @XmlAttribute(name = "externalKey")
    protected String externalKey;
    @XmlAttribute(name = "securityLevel", required = true)
    protected long securityLevel;
    @XmlAttribute(name = "jpaVersion", required = true)
    protected long jpaVersion;

    /**
     * Gets the value of the vbmsUserRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vbmsUserRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVbmsUserRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VBMSUserRole }
     * 
     * 
     */
    public List<VBMSUserRole> getVbmsUserRoles() {
        if (vbmsUserRoles == null) {
            vbmsUserRoles = new ArrayList<VBMSUserRole>();
        }
        return this.vbmsUserRoles;
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
     * Gets the value of the lastLogInDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLogInDt() {
        return lastLogInDt;
    }

    /**
     * Sets the value of the lastLogInDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLogInDt(XMLGregorianCalendar value) {
        this.lastLogInDt = value;
    }

    /**
     * Gets the value of the vbmsID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVbmsID() {
        return vbmsID;
    }

    /**
     * Sets the value of the vbmsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVbmsID(Long value) {
        this.vbmsID = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
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
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the externalUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUserID() {
        return externalUserID;
    }

    /**
     * Sets the value of the externalUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUserID(String value) {
        this.externalUserID = value;
    }

    /**
     * Gets the value of the externalKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalKey() {
        return externalKey;
    }

    /**
     * Sets the value of the externalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalKey(String value) {
        this.externalKey = value;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     */
    public long getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     */
    public void setSecurityLevel(long value) {
        this.securityLevel = value;
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

}
