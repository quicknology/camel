
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}LookUpValue">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="filenetDocumentClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cdmDocumentClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType")
public class DocumentType
    extends LookUpValue
{

    @XmlAttribute(name = "filenetDocumentClass")
    protected String filenetDocumentClass;
    @XmlAttribute(name = "cdmDocumentClass")
    protected String cdmDocumentClass;

    /**
     * Gets the value of the filenetDocumentClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilenetDocumentClass() {
        return filenetDocumentClass;
    }

    /**
     * Sets the value of the filenetDocumentClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilenetDocumentClass(String value) {
        this.filenetDocumentClass = value;
    }

    /**
     * Gets the value of the cdmDocumentClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdmDocumentClass() {
        return cdmDocumentClass;
    }

    /**
     * Sets the value of the cdmDocumentClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdmDocumentClass(String value) {
        this.cdmDocumentClass = value;
    }

}
