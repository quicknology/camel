
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContentionDbq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentionDbq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="medicalOpinionInd" type="{http://vbms.vba.va.gov/cdm}MedicalInd"/>
 *         &lt;element name="dbq" type="{http://vbms.vba.va.gov/cdm}DBQ"/>
 *       &lt;/sequence>
 *       &lt;attribute name="eFolderReviewInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contentionID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentionDbq", propOrder = {
    "createDt",
    "lastUpdateDt",
    "medicalOpinionInd",
    "dbq"
})
public class ContentionDbq {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlElement(required = true)
    protected MedicalInd medicalOpinionInd;
    @XmlElement(required = true)
    protected DBQ dbq;
    @XmlAttribute(name = "eFolderReviewInd", required = true)
    protected boolean eFolderReviewInd;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "contentionID", required = true)
    protected String contentionID;

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
     * Gets the value of the medicalOpinionInd property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalInd }
     *     
     */
    public MedicalInd getMedicalOpinionInd() {
        return medicalOpinionInd;
    }

    /**
     * Sets the value of the medicalOpinionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalInd }
     *     
     */
    public void setMedicalOpinionInd(MedicalInd value) {
        this.medicalOpinionInd = value;
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
     * Gets the value of the eFolderReviewInd property.
     * 
     */
    public boolean isEFolderReviewInd() {
        return eFolderReviewInd;
    }

    /**
     * Sets the value of the eFolderReviewInd property.
     * 
     */
    public void setEFolderReviewInd(boolean value) {
        this.eFolderReviewInd = value;
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
     * Gets the value of the contentionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentionID() {
        return contentionID;
    }

    /**
     * Sets the value of the contentionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentionID(String value) {
        this.contentionID = value;
    }

}
