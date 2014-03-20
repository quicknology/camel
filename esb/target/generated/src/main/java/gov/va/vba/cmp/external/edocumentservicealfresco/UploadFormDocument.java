
package gov.va.vba.cmp.external.edocumentservicealfresco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.va.vba.cmp.cmp.FormDocument;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formDocument" type="{http://cmp.vba.va.gov/cmp}FormDocument"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formDocument"
})
@XmlRootElement(name = "uploadFormDocument")
public class UploadFormDocument {

    @XmlElement(required = true)
    protected FormDocument formDocument;

    /**
     * Gets the value of the formDocument property.
     * 
     * @return
     *     possible object is
     *     {@link FormDocument }
     *     
     */
    public FormDocument getFormDocument() {
        return formDocument;
    }

    /**
     * Sets the value of the formDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormDocument }
     *     
     */
    public void setFormDocument(FormDocument value) {
        this.formDocument = value;
    }

}
