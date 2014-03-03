
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Manifest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Manifest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipAddr" type="{http://vbms.vba.va.gov/cdm}Address"/>
 *         &lt;element name="returnAddr" type="{http://vbms.vba.va.gov/cdm}Address"/>
 *         &lt;element name="intakeSite" type="{http://vbms.vba.va.gov/cdm}IntakeSite"/>
 *         &lt;element name="regionalOffice" type="{http://vbms.vba.va.gov/cdm}RegionalOffice"/>
 *         &lt;element name="shipDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DCSList">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="boxNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trackingNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vendorName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="jpaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Manifest", propOrder = {
    "shipAddr",
    "returnAddr",
    "intakeSite",
    "regionalOffice",
    "shipDt",
    "createDt",
    "lastUpdateDt",
    "dcsList"
})
public class Manifest {

    @XmlElement(required = true)
    protected Address shipAddr;
    @XmlElement(required = true)
    protected Address returnAddr;
    @XmlElement(required = true)
    protected IntakeSite intakeSite;
    @XmlElement(required = true)
    protected RegionalOffice regionalOffice;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlList
    @XmlElement(name = "DCSList", required = true)
    protected List<String> dcsList;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "boxNumber", required = true)
    protected String boxNumber;
    @XmlAttribute(name = "trackingNumber", required = true)
    protected String trackingNumber;
    @XmlAttribute(name = "vendorName", required = true)
    protected String vendorName;
    @XmlAttribute(name = "jpaVersion", required = true)
    protected long jpaVersion;

    /**
     * Gets the value of the shipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShipAddr() {
        return shipAddr;
    }

    /**
     * Sets the value of the shipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShipAddr(Address value) {
        this.shipAddr = value;
    }

    /**
     * Gets the value of the returnAddr property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getReturnAddr() {
        return returnAddr;
    }

    /**
     * Sets the value of the returnAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setReturnAddr(Address value) {
        this.returnAddr = value;
    }

    /**
     * Gets the value of the intakeSite property.
     * 
     * @return
     *     possible object is
     *     {@link IntakeSite }
     *     
     */
    public IntakeSite getIntakeSite() {
        return intakeSite;
    }

    /**
     * Sets the value of the intakeSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntakeSite }
     *     
     */
    public void setIntakeSite(IntakeSite value) {
        this.intakeSite = value;
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
     * Gets the value of the shipDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDt() {
        return shipDt;
    }

    /**
     * Sets the value of the shipDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDt(XMLGregorianCalendar value) {
        this.shipDt = value;
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
     * Gets the value of the dcsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDCSList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDCSList() {
        if (dcsList == null) {
            dcsList = new ArrayList<String>();
        }
        return this.dcsList;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the boxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxNumber() {
        return boxNumber;
    }

    /**
     * Sets the value of the boxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxNumber(String value) {
        this.boxNumber = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
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
