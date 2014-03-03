
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
 * <p>Java class for DevelopmentActionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentActionGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outgoingDocumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="letterTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="establishedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="printDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="enclosures" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileStatusTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileStatusDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="developmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="letterText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="barCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="participantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="participantDocumentTn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="letterText2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="claimContact" type="{http://vbms.vba.va.gov/cdm}ClaimContact"/>
 *         &lt;element name="developmentEnclosures" type="{http://vbms.vba.va.gov/cdm}DevelopmentEnclosure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="developmentActions" type="{http://vbms.vba.va.gov/cdm}DevelopmentAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentActionGroup", propOrder = {
    "outgoingDocumentTypeCode",
    "claimId",
    "letterTemplate",
    "documentDate",
    "name",
    "establishedDate",
    "printDate",
    "enclosures",
    "fileStatusTypeCode",
    "fileStatusDate",
    "developmentTypeCode",
    "letterText",
    "barCode",
    "participantId",
    "participantDocumentTn",
    "letterText2",
    "templateTypeCode",
    "claimContact",
    "developmentEnclosures",
    "developmentActions"
})
public class DevelopmentActionGroup {

    @XmlElement(required = true)
    protected String outgoingDocumentTypeCode;
    protected long claimId;
    @XmlElement(required = true)
    protected String letterTemplate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar establishedDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar printDate;
    @XmlElement(required = true)
    protected String enclosures;
    @XmlElement(required = true)
    protected String fileStatusTypeCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fileStatusDate;
    @XmlElement(required = true)
    protected String developmentTypeCode;
    @XmlElement(required = true)
    protected String letterText;
    @XmlElement(required = true)
    protected String barCode;
    @XmlElement(required = true)
    protected String participantId;
    @XmlElement(required = true)
    protected String participantDocumentTn;
    @XmlElement(required = true)
    protected String letterText2;
    @XmlElement(required = true)
    protected String templateTypeCode;
    @XmlElement(required = true)
    protected ClaimContact claimContact;
    @XmlElement(nillable = true)
    protected List<DevelopmentEnclosure> developmentEnclosures;
    @XmlElement(nillable = true)
    protected List<DevelopmentAction> developmentActions;
    @XmlAttribute(name = "documentId")
    protected String documentId;

    /**
     * Gets the value of the outgoingDocumentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingDocumentTypeCode() {
        return outgoingDocumentTypeCode;
    }

    /**
     * Sets the value of the outgoingDocumentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingDocumentTypeCode(String value) {
        this.outgoingDocumentTypeCode = value;
    }

    /**
     * Gets the value of the claimId property.
     * 
     */
    public long getClaimId() {
        return claimId;
    }

    /**
     * Sets the value of the claimId property.
     * 
     */
    public void setClaimId(long value) {
        this.claimId = value;
    }

    /**
     * Gets the value of the letterTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterTemplate() {
        return letterTemplate;
    }

    /**
     * Sets the value of the letterTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterTemplate(String value) {
        this.letterTemplate = value;
    }

    /**
     * Gets the value of the documentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
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
     * Gets the value of the establishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstablishedDate() {
        return establishedDate;
    }

    /**
     * Sets the value of the establishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstablishedDate(XMLGregorianCalendar value) {
        this.establishedDate = value;
    }

    /**
     * Gets the value of the printDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintDate() {
        return printDate;
    }

    /**
     * Sets the value of the printDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintDate(XMLGregorianCalendar value) {
        this.printDate = value;
    }

    /**
     * Gets the value of the enclosures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnclosures() {
        return enclosures;
    }

    /**
     * Sets the value of the enclosures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnclosures(String value) {
        this.enclosures = value;
    }

    /**
     * Gets the value of the fileStatusTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileStatusTypeCode() {
        return fileStatusTypeCode;
    }

    /**
     * Sets the value of the fileStatusTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileStatusTypeCode(String value) {
        this.fileStatusTypeCode = value;
    }

    /**
     * Gets the value of the fileStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileStatusDate() {
        return fileStatusDate;
    }

    /**
     * Sets the value of the fileStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileStatusDate(XMLGregorianCalendar value) {
        this.fileStatusDate = value;
    }

    /**
     * Gets the value of the developmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentTypeCode() {
        return developmentTypeCode;
    }

    /**
     * Sets the value of the developmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentTypeCode(String value) {
        this.developmentTypeCode = value;
    }

    /**
     * Gets the value of the letterText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterText() {
        return letterText;
    }

    /**
     * Sets the value of the letterText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterText(String value) {
        this.letterText = value;
    }

    /**
     * Gets the value of the barCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * Sets the value of the barCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarCode(String value) {
        this.barCode = value;
    }

    /**
     * Gets the value of the participantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * Sets the value of the participantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantId(String value) {
        this.participantId = value;
    }

    /**
     * Gets the value of the participantDocumentTn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantDocumentTn() {
        return participantDocumentTn;
    }

    /**
     * Sets the value of the participantDocumentTn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantDocumentTn(String value) {
        this.participantDocumentTn = value;
    }

    /**
     * Gets the value of the letterText2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterText2() {
        return letterText2;
    }

    /**
     * Sets the value of the letterText2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterText2(String value) {
        this.letterText2 = value;
    }

    /**
     * Gets the value of the templateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateTypeCode() {
        return templateTypeCode;
    }

    /**
     * Sets the value of the templateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateTypeCode(String value) {
        this.templateTypeCode = value;
    }

    /**
     * Gets the value of the claimContact property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimContact }
     *     
     */
    public ClaimContact getClaimContact() {
        return claimContact;
    }

    /**
     * Sets the value of the claimContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimContact }
     *     
     */
    public void setClaimContact(ClaimContact value) {
        this.claimContact = value;
    }

    /**
     * Gets the value of the developmentEnclosures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the developmentEnclosures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevelopmentEnclosures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevelopmentEnclosure }
     * 
     * 
     */
    public List<DevelopmentEnclosure> getDevelopmentEnclosures() {
        if (developmentEnclosures == null) {
            developmentEnclosures = new ArrayList<DevelopmentEnclosure>();
        }
        return this.developmentEnclosures;
    }

    /**
     * Gets the value of the developmentActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the developmentActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevelopmentActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevelopmentAction }
     * 
     * 
     */
    public List<DevelopmentAction> getDevelopmentActions() {
        if (developmentActions == null) {
            developmentActions = new ArrayList<DevelopmentAction>();
        }
        return this.developmentActions;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

}
