
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dependent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dependent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Person">
 *       &lt;sequence>
 *         &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Veteran_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="relativeStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="veteranInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="relatedToVetInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="proofOfDependancy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Relationship_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="awardInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dependent", propOrder = {
    "relationship"
})
@XmlSeeAlso({
    Child.class,
    Parent.class,
    Spouse.class
})
public class Dependent
    extends Person
{

    @XmlElement(required = true)
    protected String relationship;
    @XmlAttribute(name = "Veteran_Person_ID", required = true)
    protected long veteranPersonID;
    @XmlAttribute(name = "relativeStatus", required = true)
    protected String relativeStatus;
    @XmlAttribute(name = "veteranInd", required = true)
    protected boolean veteranInd;
    @XmlAttribute(name = "relatedToVetInd", required = true)
    protected boolean relatedToVetInd;
    @XmlAttribute(name = "proofOfDependancy", required = true)
    protected boolean proofOfDependancy;
    @XmlAttribute(name = "Relationship_ID")
    protected String relationshipID;
    @XmlAttribute(name = "awardInd", required = true)
    protected boolean awardInd;

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the veteranPersonID property.
     * 
     */
    public long getVeteranPersonID() {
        return veteranPersonID;
    }

    /**
     * Sets the value of the veteranPersonID property.
     * 
     */
    public void setVeteranPersonID(long value) {
        this.veteranPersonID = value;
    }

    /**
     * Gets the value of the relativeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeStatus() {
        return relativeStatus;
    }

    /**
     * Sets the value of the relativeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeStatus(String value) {
        this.relativeStatus = value;
    }

    /**
     * Gets the value of the veteranInd property.
     * 
     */
    public boolean isVeteranInd() {
        return veteranInd;
    }

    /**
     * Sets the value of the veteranInd property.
     * 
     */
    public void setVeteranInd(boolean value) {
        this.veteranInd = value;
    }

    /**
     * Gets the value of the relatedToVetInd property.
     * 
     */
    public boolean isRelatedToVetInd() {
        return relatedToVetInd;
    }

    /**
     * Sets the value of the relatedToVetInd property.
     * 
     */
    public void setRelatedToVetInd(boolean value) {
        this.relatedToVetInd = value;
    }

    /**
     * Gets the value of the proofOfDependancy property.
     * 
     */
    public boolean isProofOfDependancy() {
        return proofOfDependancy;
    }

    /**
     * Sets the value of the proofOfDependancy property.
     * 
     */
    public void setProofOfDependancy(boolean value) {
        this.proofOfDependancy = value;
    }

    /**
     * Gets the value of the relationshipID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipID() {
        return relationshipID;
    }

    /**
     * Sets the value of the relationshipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipID(String value) {
        this.relationshipID = value;
    }

    /**
     * Gets the value of the awardInd property.
     * 
     */
    public boolean isAwardInd() {
        return awardInd;
    }

    /**
     * Sets the value of the awardInd property.
     * 
     */
    public void setAwardInd(boolean value) {
        this.awardInd = value;
    }

}
