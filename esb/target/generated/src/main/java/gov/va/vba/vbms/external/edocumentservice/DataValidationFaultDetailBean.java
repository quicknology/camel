
package gov.va.vba.vbms.external.edocumentservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataValidationFaultDetailBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataValidationFaultDetailBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formFieldErrors" type="{http://vbms.vba.va.gov/external/eDocumentService/}FormFieldError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataValidationFaultDetailBean", propOrder = {
    "formFieldErrors"
})
public class DataValidationFaultDetailBean {

    @XmlElement(nillable = true)
    protected List<FormFieldError> formFieldErrors;

    /**
     * Gets the value of the formFieldErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formFieldErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormFieldErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormFieldError }
     * 
     * 
     */
    public List<FormFieldError> getFormFieldErrors() {
        if (formFieldErrors == null) {
            formFieldErrors = new ArrayList<FormFieldError>();
        }
        return this.formFieldErrors;
    }

}
