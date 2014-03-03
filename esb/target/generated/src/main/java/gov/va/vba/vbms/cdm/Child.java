
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Child complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Child">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Dependent">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="marriageStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="marriageDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="activeDutyMilitaryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="schoolGoingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="seriouslyDiabledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="biologicalInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="adoptedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="stepChildInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="previouslyMarriedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="nameOfPersonLivingWith" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="notLivingWithInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Child")
public class Child
    extends Dependent
{

    @XmlAttribute(name = "marriageStatus")
    protected String marriageStatus;
    @XmlAttribute(name = "marriageDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar marriageDate;
    @XmlAttribute(name = "activeDutyMilitaryInd")
    protected Boolean activeDutyMilitaryInd;
    @XmlAttribute(name = "schoolGoingInd")
    protected Boolean schoolGoingInd;
    @XmlAttribute(name = "seriouslyDiabledInd")
    protected Boolean seriouslyDiabledInd;
    @XmlAttribute(name = "biologicalInd")
    protected Boolean biologicalInd;
    @XmlAttribute(name = "adoptedInd")
    protected Boolean adoptedInd;
    @XmlAttribute(name = "stepChildInd")
    protected Boolean stepChildInd;
    @XmlAttribute(name = "previouslyMarriedInd")
    protected Boolean previouslyMarriedInd;
    @XmlAttribute(name = "nameOfPersonLivingWith")
    protected String nameOfPersonLivingWith;
    @XmlAttribute(name = "notLivingWithInd")
    protected Boolean notLivingWithInd;

    /**
     * Gets the value of the marriageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageStatus() {
        return marriageStatus;
    }

    /**
     * Sets the value of the marriageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageStatus(String value) {
        this.marriageStatus = value;
    }

    /**
     * Gets the value of the marriageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarriageDate() {
        return marriageDate;
    }

    /**
     * Sets the value of the marriageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarriageDate(XMLGregorianCalendar value) {
        this.marriageDate = value;
    }

    /**
     * Gets the value of the activeDutyMilitaryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveDutyMilitaryInd() {
        return activeDutyMilitaryInd;
    }

    /**
     * Sets the value of the activeDutyMilitaryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveDutyMilitaryInd(Boolean value) {
        this.activeDutyMilitaryInd = value;
    }

    /**
     * Gets the value of the schoolGoingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSchoolGoingInd() {
        return schoolGoingInd;
    }

    /**
     * Sets the value of the schoolGoingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSchoolGoingInd(Boolean value) {
        this.schoolGoingInd = value;
    }

    /**
     * Gets the value of the seriouslyDiabledInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeriouslyDiabledInd() {
        return seriouslyDiabledInd;
    }

    /**
     * Sets the value of the seriouslyDiabledInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeriouslyDiabledInd(Boolean value) {
        this.seriouslyDiabledInd = value;
    }

    /**
     * Gets the value of the biologicalInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBiologicalInd() {
        return biologicalInd;
    }

    /**
     * Sets the value of the biologicalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBiologicalInd(Boolean value) {
        this.biologicalInd = value;
    }

    /**
     * Gets the value of the adoptedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdoptedInd() {
        return adoptedInd;
    }

    /**
     * Sets the value of the adoptedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdoptedInd(Boolean value) {
        this.adoptedInd = value;
    }

    /**
     * Gets the value of the stepChildInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStepChildInd() {
        return stepChildInd;
    }

    /**
     * Sets the value of the stepChildInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStepChildInd(Boolean value) {
        this.stepChildInd = value;
    }

    /**
     * Gets the value of the previouslyMarriedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreviouslyMarriedInd() {
        return previouslyMarriedInd;
    }

    /**
     * Sets the value of the previouslyMarriedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreviouslyMarriedInd(Boolean value) {
        this.previouslyMarriedInd = value;
    }

    /**
     * Gets the value of the nameOfPersonLivingWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfPersonLivingWith() {
        return nameOfPersonLivingWith;
    }

    /**
     * Sets the value of the nameOfPersonLivingWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfPersonLivingWith(String value) {
        this.nameOfPersonLivingWith = value;
    }

    /**
     * Gets the value of the notLivingWithInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotLivingWithInd() {
        return notLivingWithInd;
    }

    /**
     * Sets the value of the notLivingWithInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotLivingWithInd(Boolean value) {
        this.notLivingWithInd = value;
    }

}
