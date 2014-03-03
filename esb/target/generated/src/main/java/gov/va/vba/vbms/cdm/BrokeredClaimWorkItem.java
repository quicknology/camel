
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrokeredClaimWorkItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrokeredClaimWorkItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}ClaimWorkItem">
 *       &lt;sequence>
 *         &lt;element name="brokeredItem" type="{http://vbms.vba.va.gov/cdm}BrokeredItem"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokeredClaimWorkItem", propOrder = {
    "brokeredItem"
})
public class BrokeredClaimWorkItem
    extends ClaimWorkItem
{

    @XmlElement(required = true)
    protected BrokeredItem brokeredItem;

    /**
     * Gets the value of the brokeredItem property.
     * 
     * @return
     *     possible object is
     *     {@link BrokeredItem }
     *     
     */
    public BrokeredItem getBrokeredItem() {
        return brokeredItem;
    }

    /**
     * Sets the value of the brokeredItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokeredItem }
     *     
     */
    public void setBrokeredItem(BrokeredItem value) {
        this.brokeredItem = value;
    }

}
