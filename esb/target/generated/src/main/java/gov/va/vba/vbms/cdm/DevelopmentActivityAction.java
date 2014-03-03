
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DevelopmentActivityAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentActivityAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="stdDvlpmtAction" type="{http://vbms.vba.va.gov/cdm}StdDvlpmtAction"/>
 *         &lt;element name="developmentActivity" type="{http://vbms.vba.va.gov/cdm}DevelopmentActivity"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentActivityAction", propOrder = {
    "createDt",
    "lastUpdateDt",
    "stdDvlpmtAction",
    "developmentActivity",
    "expirationDt"
})
public class DevelopmentActivityAction {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlElement(required = true)
    protected StdDvlpmtAction stdDvlpmtAction;
    @XmlElement(required = true)
    protected DevelopmentActivity developmentActivity;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDt;
    @XmlAttribute(name = "ID", required = true)
    protected long id;

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

}
