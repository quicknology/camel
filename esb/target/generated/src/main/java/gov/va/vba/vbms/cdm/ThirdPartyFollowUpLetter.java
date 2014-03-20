
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyFollowUpLetter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyFollowUpLetter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}ProviderLetter">
 *       &lt;sequence>
 *         &lt;element name="parentLetter" type="{http://vbms.vba.va.gov/cdm}ThirdPartyLetter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyFollowUpLetter", propOrder = {
    "parentLetter"
})
public class ThirdPartyFollowUpLetter
    extends ProviderLetter
{

    @XmlElement(required = true)
    protected ThirdPartyLetter parentLetter;

    /**
     * Gets the value of the parentLetter property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyLetter }
     *     
     */
    public ThirdPartyLetter getParentLetter() {
        return parentLetter;
    }

    /**
     * Sets the value of the parentLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyLetter }
     *     
     */
    public void setParentLetter(ThirdPartyLetter value) {
        this.parentLetter = value;
    }

}
