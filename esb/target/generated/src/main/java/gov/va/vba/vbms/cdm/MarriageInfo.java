
package gov.va.vba.vbms.cdm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MarriageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarriageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marriageDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="marriageCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marriageState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="marriageType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="terminateType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="terminateDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="terminateCity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="terminateState" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseVeteranInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="spouseFileNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spouseCoLivingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="monthlySupportAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarriageInfo", propOrder = {
    "marriageDate",
    "marriageCity",
    "marriageState",
    "firstName",
    "lastName"
})
public class MarriageInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar marriageDate;
    @XmlElement(required = true)
    protected String marriageCity;
    @XmlElement(required = true)
    protected String marriageState;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String lastName;
    @XmlAttribute(name = "marriageType")
    protected String marriageType;
    @XmlAttribute(name = "terminateType")
    protected String terminateType;
    @XmlAttribute(name = "terminateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminateDate;
    @XmlAttribute(name = "terminateCity")
    protected String terminateCity;
    @XmlAttribute(name = "terminateState")
    protected String terminateState;
    @XmlAttribute(name = "spouseVeteranInd")
    protected Boolean spouseVeteranInd;
    @XmlAttribute(name = "spouseFileNumber")
    protected String spouseFileNumber;
    @XmlAttribute(name = "spouseCoLivingInd")
    protected Boolean spouseCoLivingInd;
    @XmlAttribute(name = "monthlySupportAmt")
    protected BigDecimal monthlySupportAmt;

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
     * Gets the value of the marriageCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageCity() {
        return marriageCity;
    }

    /**
     * Sets the value of the marriageCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageCity(String value) {
        this.marriageCity = value;
    }

    /**
     * Gets the value of the marriageState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageState() {
        return marriageState;
    }

    /**
     * Sets the value of the marriageState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageState(String value) {
        this.marriageState = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the marriageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageType() {
        return marriageType;
    }

    /**
     * Sets the value of the marriageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageType(String value) {
        this.marriageType = value;
    }

    /**
     * Gets the value of the terminateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminateType() {
        return terminateType;
    }

    /**
     * Sets the value of the terminateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminateType(String value) {
        this.terminateType = value;
    }

    /**
     * Gets the value of the terminateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminateDate() {
        return terminateDate;
    }

    /**
     * Sets the value of the terminateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminateDate(XMLGregorianCalendar value) {
        this.terminateDate = value;
    }

    /**
     * Gets the value of the terminateCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminateCity() {
        return terminateCity;
    }

    /**
     * Sets the value of the terminateCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminateCity(String value) {
        this.terminateCity = value;
    }

    /**
     * Gets the value of the terminateState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminateState() {
        return terminateState;
    }

    /**
     * Sets the value of the terminateState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminateState(String value) {
        this.terminateState = value;
    }

    /**
     * Gets the value of the spouseVeteranInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpouseVeteranInd() {
        return spouseVeteranInd;
    }

    /**
     * Sets the value of the spouseVeteranInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpouseVeteranInd(Boolean value) {
        this.spouseVeteranInd = value;
    }

    /**
     * Gets the value of the spouseFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseFileNumber() {
        return spouseFileNumber;
    }

    /**
     * Sets the value of the spouseFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseFileNumber(String value) {
        this.spouseFileNumber = value;
    }

    /**
     * Gets the value of the spouseCoLivingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpouseCoLivingInd() {
        return spouseCoLivingInd;
    }

    /**
     * Sets the value of the spouseCoLivingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpouseCoLivingInd(Boolean value) {
        this.spouseCoLivingInd = value;
    }

    /**
     * Gets the value of the monthlySupportAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonthlySupportAmt() {
        return monthlySupportAmt;
    }

    /**
     * Sets the value of the monthlySupportAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonthlySupportAmt(BigDecimal value) {
        this.monthlySupportAmt = value;
    }

}
