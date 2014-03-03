
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Document">
 *       &lt;sequence>
 *         &lt;element name="formFields" type="{http://vbms.vba.va.gov/cdm}FormField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormDocument", propOrder = {
    "formFields"
})
public class FormDocument
    extends Document
{

    @XmlElement(nillable = true)
    protected List<FormField> formFields;

    /**
     * Gets the value of the formFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormField }
     * 
     * 
     */
    public List<FormField> getFormFields() {
        if (formFields == null) {
            formFields = new ArrayList<FormField>();
        }
        return this.formFields;
    }

}
