
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="dataVerification_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="validationStatusDesc" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationSource")
public class ValidationSource {

    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "dataVerification_ID", required = true)
    protected long dataVerificationID;
    @XmlAttribute(name = "validationStatusDesc", required = true)
    protected String validationStatusDesc;

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
     * Gets the value of the dataVerificationID property.
     * 
     */
    public long getDataVerificationID() {
        return dataVerificationID;
    }

    /**
     * Sets the value of the dataVerificationID property.
     * 
     */
    public void setDataVerificationID(long value) {
        this.dataVerificationID = value;
    }

    /**
     * Gets the value of the validationStatusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationStatusDesc() {
        return validationStatusDesc;
    }

    /**
     * Sets the value of the validationStatusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationStatusDesc(String value) {
        this.validationStatusDesc = value;
    }

}
