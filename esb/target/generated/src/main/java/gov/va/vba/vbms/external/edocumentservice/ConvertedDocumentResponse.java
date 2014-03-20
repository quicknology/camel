
package gov.va.vba.vbms.external.edocumentservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.va.vba.vbms.cdm.Document;


/**
 * <p>Java class for ConvertedDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConvertedDocumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalDocument" type="{http://vbms.vba.va.gov/cdm}Document"/>
 *         &lt;element name="convertedDocuments" type="{http://vbms.vba.va.gov/cdm}Document" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertedDocumentResponse", propOrder = {
    "originalDocument",
    "convertedDocuments"
})
public class ConvertedDocumentResponse {

    @XmlElement(required = true)
    protected Document originalDocument;
    @XmlElement(nillable = true)
    protected List<Document> convertedDocuments;

    /**
     * Gets the value of the originalDocument property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getOriginalDocument() {
        return originalDocument;
    }

    /**
     * Sets the value of the originalDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setOriginalDocument(Document value) {
        this.originalDocument = value;
    }

    /**
     * Gets the value of the convertedDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convertedDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvertedDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getConvertedDocuments() {
        if (convertedDocuments == null) {
            convertedDocuments = new ArrayList<Document>();
        }
        return this.convertedDocuments;
    }

}
