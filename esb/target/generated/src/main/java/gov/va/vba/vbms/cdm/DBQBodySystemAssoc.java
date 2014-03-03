
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DBQBodySystemAssoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBQBodySystemAssoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dbq" type="{http://vbms.vba.va.gov/cdm}DBQ"/>
 *         &lt;element name="bodySystem" type="{http://vbms.vba.va.gov/cdm}BodySystem"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="dbqCandidateId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBQBodySystemAssoc", propOrder = {
    "createDt",
    "lastUpdateDt",
    "expirationDt",
    "dbq",
    "bodySystem"
})
public class DBQBodySystemAssoc {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDt;
    @XmlElement(required = true)
    protected DBQ dbq;
    @XmlElement(required = true)
    protected BodySystem bodySystem;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "dbqCandidateId", required = true)
    protected long dbqCandidateId;

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
     * Gets the value of the dbq property.
     * 
     * @return
     *     possible object is
     *     {@link DBQ }
     *     
     */
    public DBQ getDbq() {
        return dbq;
    }

    /**
     * Sets the value of the dbq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DBQ }
     *     
     */
    public void setDbq(DBQ value) {
        this.dbq = value;
    }

    /**
     * Gets the value of the bodySystem property.
     * 
     * @return
     *     possible object is
     *     {@link BodySystem }
     *     
     */
    public BodySystem getBodySystem() {
        return bodySystem;
    }

    /**
     * Sets the value of the bodySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodySystem }
     *     
     */
    public void setBodySystem(BodySystem value) {
        this.bodySystem = value;
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
     * Gets the value of the dbqCandidateId property.
     * 
     */
    public long getDbqCandidateId() {
        return dbqCandidateId;
    }

    /**
     * Sets the value of the dbqCandidateId property.
     * 
     */
    public void setDbqCandidateId(long value) {
        this.dbqCandidateId = value;
    }

}
