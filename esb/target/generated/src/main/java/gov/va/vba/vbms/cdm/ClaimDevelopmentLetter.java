
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimDevelopmentLetter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimDevelopmentLetter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Letter">
 *       &lt;sequence>
 *         &lt;element name="isDevelopmentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isEvidenceFound" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contentions" type="{http://vbms.vba.va.gov/cdm}Contention" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unsolicitedEvidence" type="{http://vbms.vba.va.gov/cdm}UnsolicitedEvidence" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trackedItems" type="{http://vbms.vba.va.gov/cdm}TrackedItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="developmentItems" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rbaEvalutations" type="{http://vbms.vba.va.gov/cdm}RBAEvaluation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="claimant" type="{http://vbms.vba.va.gov/cdm}Participant"/>
 *         &lt;element name="claim" type="{http://vbms.vba.va.gov/cdm}Claim" minOccurs="0"/>
 *         &lt;element name="veteran" type="{http://vbms.vba.va.gov/cdm}Veteran" minOccurs="0"/>
 *         &lt;element name="isAdditionalEvidenceNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimDevelopmentLetter", propOrder = {
    "isDevelopmentRequired",
    "isEvidenceFound",
    "contentions",
    "unsolicitedEvidence",
    "trackedItems",
    "developmentItems",
    "rbaEvalutations",
    "claimant",
    "claim",
    "veteran",
    "isAdditionalEvidenceNeeded"
})
public class ClaimDevelopmentLetter
    extends Letter
{

    protected boolean isDevelopmentRequired;
    protected boolean isEvidenceFound;
    @XmlElement(nillable = true)
    protected List<Contention> contentions;
    @XmlElement(nillable = true)
    protected List<UnsolicitedEvidence> unsolicitedEvidence;
    @XmlElement(nillable = true)
    protected List<TrackedItem> trackedItems;
    @XmlElement(nillable = true)
    protected List<String> developmentItems;
    @XmlElement(nillable = true)
    protected List<RBAEvaluation> rbaEvalutations;
    @XmlElement(required = true)
    protected Participant claimant;
    protected Claim claim;
    protected Veteran veteran;
    protected boolean isAdditionalEvidenceNeeded;

    /**
     * Gets the value of the isDevelopmentRequired property.
     * 
     */
    public boolean isIsDevelopmentRequired() {
        return isDevelopmentRequired;
    }

    /**
     * Sets the value of the isDevelopmentRequired property.
     * 
     */
    public void setIsDevelopmentRequired(boolean value) {
        this.isDevelopmentRequired = value;
    }

    /**
     * Gets the value of the isEvidenceFound property.
     * 
     */
    public boolean isIsEvidenceFound() {
        return isEvidenceFound;
    }

    /**
     * Sets the value of the isEvidenceFound property.
     * 
     */
    public void setIsEvidenceFound(boolean value) {
        this.isEvidenceFound = value;
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
     * {@link Contention }
     * 
     * 
     */
    public List<Contention> getContentions() {
        if (contentions == null) {
            contentions = new ArrayList<Contention>();
        }
        return this.contentions;
    }

    /**
     * Gets the value of the unsolicitedEvidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsolicitedEvidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsolicitedEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnsolicitedEvidence }
     * 
     * 
     */
    public List<UnsolicitedEvidence> getUnsolicitedEvidence() {
        if (unsolicitedEvidence == null) {
            unsolicitedEvidence = new ArrayList<UnsolicitedEvidence>();
        }
        return this.unsolicitedEvidence;
    }

    /**
     * Gets the value of the trackedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackedItem }
     * 
     * 
     */
    public List<TrackedItem> getTrackedItems() {
        if (trackedItems == null) {
            trackedItems = new ArrayList<TrackedItem>();
        }
        return this.trackedItems;
    }

    /**
     * Gets the value of the developmentItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the developmentItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevelopmentItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDevelopmentItems() {
        if (developmentItems == null) {
            developmentItems = new ArrayList<String>();
        }
        return this.developmentItems;
    }

    /**
     * Gets the value of the rbaEvalutations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rbaEvalutations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRbaEvalutations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RBAEvaluation }
     * 
     * 
     */
    public List<RBAEvaluation> getRbaEvalutations() {
        if (rbaEvalutations == null) {
            rbaEvalutations = new ArrayList<RBAEvaluation>();
        }
        return this.rbaEvalutations;
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
     * Gets the value of the isAdditionalEvidenceNeeded property.
     * 
     */
    public boolean isIsAdditionalEvidenceNeeded() {
        return isAdditionalEvidenceNeeded;
    }

    /**
     * Sets the value of the isAdditionalEvidenceNeeded property.
     * 
     */
    public void setIsAdditionalEvidenceNeeded(boolean value) {
        this.isAdditionalEvidenceNeeded = value;
    }

}
