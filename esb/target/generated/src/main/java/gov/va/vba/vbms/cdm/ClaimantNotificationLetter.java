
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimantNotificationLetter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimantNotificationLetter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}ClaimLetter">
 *       &lt;sequence>
 *         &lt;element name="relatedLetters" type="{http://vbms.vba.va.gov/cdm}ThirdPartyFollowUpLetter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="vsoInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="vsoName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimantNotificationLetter", propOrder = {
    "relatedLetters"
})
public class ClaimantNotificationLetter
    extends ClaimLetter
{

    @XmlElement(nillable = true)
    protected List<ThirdPartyFollowUpLetter> relatedLetters;
    @XmlAttribute(name = "vsoInd")
    protected Boolean vsoInd;
    @XmlAttribute(name = "vsoName")
    protected String vsoName;

    /**
     * Gets the value of the relatedLetters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedLetters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedLetters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyFollowUpLetter }
     * 
     * 
     */
    public List<ThirdPartyFollowUpLetter> getRelatedLetters() {
        if (relatedLetters == null) {
            relatedLetters = new ArrayList<ThirdPartyFollowUpLetter>();
        }
        return this.relatedLetters;
    }

    /**
     * Gets the value of the vsoInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVsoInd() {
        return vsoInd;
    }

    /**
     * Sets the value of the vsoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVsoInd(Boolean value) {
        this.vsoInd = value;
    }

    /**
     * Gets the value of the vsoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsoName() {
        return vsoName;
    }

    /**
     * Sets the value of the vsoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVsoName(String value) {
        this.vsoName = value;
    }

}
