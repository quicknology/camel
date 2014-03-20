
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentAssociationInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentAssociationInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="associationValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="associationType" use="required" type="{http://vbms.vba.va.gov/cdm}DocumentAssociationType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAssociationInput", propOrder = {
    "associationValue"
})
@XmlSeeAlso({
    DocumentAssociation.class
})
public class DocumentAssociationInput {

    @XmlElement(required = true)
    protected String associationValue;
    @XmlAttribute(name = "associationType", required = true)
    protected DocumentAssociationType associationType;

    /**
     * Gets the value of the associationValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationValue() {
        return associationValue;
    }

    /**
     * Sets the value of the associationValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationValue(String value) {
        this.associationValue = value;
    }

    /**
     * Gets the value of the associationType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAssociationType }
     *     
     */
    public DocumentAssociationType getAssociationType() {
        return associationType;
    }

    /**
     * Sets the value of the associationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAssociationType }
     *     
     */
    public void setAssociationType(DocumentAssociationType value) {
        this.associationType = value;
    }

}
