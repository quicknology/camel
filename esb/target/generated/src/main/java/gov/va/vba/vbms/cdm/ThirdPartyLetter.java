
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyLetter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyLetter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Letter">
 *       &lt;sequence>
 *         &lt;element name="providerAddress" type="{http://vbms.vba.va.gov/cdm}Address" minOccurs="0"/>
 *         &lt;element name="contentions" type="{http://vbms.vba.va.gov/cdm}ThirdPartyContention" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="claimant" type="{http://vbms.vba.va.gov/cdm}Participant"/>
 *         &lt;element name="claim" type="{http://vbms.vba.va.gov/cdm}Claim" minOccurs="0"/>
 *         &lt;element name="veteran" type="{http://vbms.vba.va.gov/cdm}Veteran" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="providerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyLetter", propOrder = {
    "providerAddress",
    "contentions",
    "claimant",
    "claim",
    "veteran"
})
public class ThirdPartyLetter
    extends Letter
{

    protected Address providerAddress;
    @XmlElement(nillable = true)
    protected List<ThirdPartyContention> contentions;
    @XmlElement(required = true)
    protected Participant claimant;
    protected Claim claim;
    protected Veteran veteran;
    @XmlAttribute(name = "providerName")
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
     * Gets the value of the contentions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyContention }
     * 
     * 
     */
    public List<ThirdPartyContention> getContentions() {
        if (contentions == null) {
            contentions = new ArrayList<ThirdPartyContention>();
        }
        return this.contentions;
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
