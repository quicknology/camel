
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotation" type="{http://vbms.vba.va.gov/cdm}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="docContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="trackedItems" type="{http://vbms.vba.va.gov/cdm}TrackedItem"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="receivedDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="actionable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="externalID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Veteran_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createUser_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="docType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="metadata" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="newMail" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="mimeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subject" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="endProduct" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shippingNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="veteranFirstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="veteranMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="veteranLastName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="veteranSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "annotation",
    "docContent",
    "trackedItems",
    "createDt",
    "lastUpdateDt",
    "receivedDt"
})
@XmlSeeAlso({
    LetterDocument.class,
    FormDocument.class,
    Type526Document.class
})
public class Document {

    @XmlElement(nillable = true)
    protected List<Annotation> annotation;
    protected byte[] docContent;
    @XmlElement(required = true)
    protected TrackedItem trackedItems;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar receivedDt;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "actionable", required = true)
    protected boolean actionable;
    @XmlAttribute(name = "externalID", required = true)
    protected String externalID;
    @XmlAttribute(name = "Veteran_Person_ID", required = true)
    protected long veteranPersonID;
    @XmlAttribute(name = "path", required = true)
    protected String path;
    @XmlAttribute(name = "fileNumber", required = true)
    protected String fileNumber;
    @XmlAttribute(name = "filename", required = true)
    protected String filename;
    @XmlAttribute(name = "createUser_ID", required = true)
    protected String createUserID;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "docType", required = true)
    protected String docType;
    @XmlAttribute(name = "metadata")
    protected String metadata;
    @XmlAttribute(name = "newMail", required = true)
    protected boolean newMail;
    @XmlAttribute(name = "mimeType", required = true)
    protected String mimeType;
    @XmlAttribute(name = "subject")
    protected String subject;
    @XmlAttribute(name = "endProduct")
    protected String endProduct;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "shippingNum")
    protected String shippingNum;
    @XmlAttribute(name = "veteranFirstName")
    protected String veteranFirstName;
    @XmlAttribute(name = "veteranMiddleName")
    protected String veteranMiddleName;
    @XmlAttribute(name = "veteranLastName")
    protected String veteranLastName;
    @XmlAttribute(name = "veteranSuffix")
    protected String veteranSuffix;

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<Annotation>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the docContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocContent() {
        return docContent;
    }

    /**
     * Sets the value of the docContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocContent(byte[] value) {
        this.docContent = ((byte[]) value);
    }

    /**
     * Gets the value of the trackedItems property.
     * 
     * @return
     *     possible object is
     *     {@link TrackedItem }
     *     
     */
    public TrackedItem getTrackedItems() {
        return trackedItems;
    }

    /**
     * Sets the value of the trackedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackedItem }
     *     
     */
    public void setTrackedItems(TrackedItem value) {
        this.trackedItems = value;
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
     * Gets the value of the receivedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDt() {
        return receivedDt;
    }

    /**
     * Sets the value of the receivedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDt(XMLGregorianCalendar value) {
        this.receivedDt = value;
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
     * Gets the value of the actionable property.
     * 
     */
    public boolean isActionable() {
        return actionable;
    }

    /**
     * Sets the value of the actionable property.
     * 
     */
    public void setActionable(boolean value) {
        this.actionable = value;
    }

    /**
     * Gets the value of the externalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Sets the value of the externalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Gets the value of the veteranPersonID property.
     * 
     */
    public long getVeteranPersonID() {
        return veteranPersonID;
    }

    /**
     * Sets the value of the veteranPersonID property.
     * 
     */
    public void setVeteranPersonID(long value) {
        this.veteranPersonID = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the createUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUserID() {
        return createUserID;
    }

    /**
     * Sets the value of the createUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUserID(String value) {
        this.createUserID = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata(String value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the newMail property.
     * 
     */
    public boolean isNewMail() {
        return newMail;
    }

    /**
     * Sets the value of the newMail property.
     * 
     */
    public void setNewMail(boolean value) {
        this.newMail = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the endProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndProduct() {
        return endProduct;
    }

    /**
     * Sets the value of the endProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndProduct(String value) {
        this.endProduct = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the shippingNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingNum() {
        return shippingNum;
    }

    /**
     * Sets the value of the shippingNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingNum(String value) {
        this.shippingNum = value;
    }

    /**
     * Gets the value of the veteranFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeteranFirstName() {
        return veteranFirstName;
    }

    /**
     * Sets the value of the veteranFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeteranFirstName(String value) {
        this.veteranFirstName = value;
    }

    /**
     * Gets the value of the veteranMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeteranMiddleName() {
        return veteranMiddleName;
    }

    /**
     * Sets the value of the veteranMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeteranMiddleName(String value) {
        this.veteranMiddleName = value;
    }

    /**
     * Gets the value of the veteranLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeteranLastName() {
        return veteranLastName;
    }

    /**
     * Sets the value of the veteranLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeteranLastName(String value) {
        this.veteranLastName = value;
    }

    /**
     * Gets the value of the veteranSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeteranSuffix() {
        return veteranSuffix;
    }

    /**
     * Sets the value of the veteranSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeteranSuffix(String value) {
        this.veteranSuffix = value;
    }

}
