
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimLetter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimLetter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Letter">
 *       &lt;sequence>
 *         &lt;element name="claim" type="{http://vbms.vba.va.gov/cdm}Claim"/>
 *         &lt;element name="veteran" type="{http://vbms.vba.va.gov/cdm}Veteran"/>
 *         &lt;element name="claimant" type="{http://vbms.vba.va.gov/cdm}Participant"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimLetter", propOrder = {
    "claim",
    "veteran",
    "claimant"
})
@XmlSeeAlso({
    ThirdPartyLetter.class,
    ProviderLetter.class,
    ClaimantNotificationLetter.class
})
public class ClaimLetter
    extends Letter
{

    @XmlElement(required = true)
    protected Claim claim;
    @XmlElement(required = true)
    protected Veteran veteran;
    @XmlElement(required = true)
    protected Participant claimant;

    /**
     * Gets the value of the claim property.
     * 
     * @return
     *     possible object is
     *     {@link Claim }
     *     
     */
    public Claim getClaim() {
        return claim;
    }

    /**
     * Sets the value of the claim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Claim }
     *     
     */
    public void setClaim(Claim value) {
        this.claim = value;
    }

    /**
     * Gets the value of the veteran property.
     * 
     * @return
     *     possible object is
     *     {@link Veteran }
     *     
     */
    public Veteran getVeteran() {
        return veteran;
    }

    /**
     * Sets the value of the veteran property.
     * 
     * @param value
     *     allowed object is
     *     {@link Veteran }
     *     
     */
    public void setVeteran(Veteran value) {
        this.veteran = value;
    }

    /**
     * Gets the value of the claimant property.
     * 
     * @return
     *     possible object is
     *     {@link Participant }
     *     
     */
    public Participant getClaimant() {
        return claimant;
    }

    /**
     * Sets the value of the claimant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participant }
     *     
     */
    public void setClaimant(Participant value) {
        this.claimant = value;
    }

}
