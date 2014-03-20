
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderLetter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderLetter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}ClaimLetter">
 *       &lt;sequence>
 *         &lt;element name="providerAddress" type="{http://vbms.vba.va.gov/cdm}Address"/>
 *       &lt;/sequence>
 *       &lt;attribute name="providerName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderLetter", propOrder = {
    "providerAddress"
})
@XmlSeeAlso({
    ThirdPartyFollowUpLetter.class
})
public class ProviderLetter
    extends ClaimLetter
{

    @XmlElement(required = true)
    protected Address providerAddress;
    @XmlAttribute(name = "providerName", required = true)
    protected String providerName;

    /**
     * Gets the value of the providerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getProviderAddress() {
        return providerAddress;
    }

    /**
     * Sets the value of the providerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setProviderAddress(Address value) {
        this.providerAddress = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

}
