
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClaimContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addressLine3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="badAddressInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countryTn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="developmentContactTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foreignPostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provinceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="participantAddressTn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="participantContactId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="participantRelationshipTn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="providerReleaseInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slttnTn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="territoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zip1StSfxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zip2NdSfxNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipPrefixNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postalTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="postOfficeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="participantId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimContact", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "badAddressInd",
    "city",
    "countryTn",
    "country",
    "developmentContactTypeCode",
    "effectiveDate",
    "firstName",
    "foreignPostalCode",
    "lastName",
    "middleName",
    "orgName",
    "postalCode",
    "provinceName",
    "participantAddressTn",
    "participantContactId",
    "participantRelationshipTn",
    "providerReleaseInd",
    "suffix",
    "slttnTn",
    "territoryName",
    "zip1StSfxNo",
    "zip2NdSfxNo",
    "zipPrefixNo",
    "postalTypeCode",
    "postOfficeTypeCode"
})
public class ClaimContact {

    @XmlElement(required = true)
    protected String addressLine1;
    @XmlElement(required = true)
    protected String addressLine2;
    @XmlElement(required = true)
    protected String addressLine3;
    protected boolean badAddressInd;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String countryTn;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String developmentContactTypeCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(required = true)
    protected String firstName;
    @XmlElement(required = true)
    protected String foreignPostalCode;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String middleName;
    @XmlElement(required = true)
    protected String orgName;
    @XmlElement(required = true)
    protected String postalCode;
    @XmlElement(required = true)
    protected String provinceName;
    @XmlElement(required = true)
    protected String participantAddressTn;
    @XmlElement(required = true)
    protected String participantContactId;
    @XmlElement(required = true)
    protected String participantRelationshipTn;
    protected boolean providerReleaseInd;
    @XmlElement(required = true)
    protected String suffix;
    @XmlElement(required = true)
    protected String slttnTn;
    @XmlElement(required = true)
    protected String territoryName;
    @XmlElement(required = true)
    protected String zip1StSfxNo;
    @XmlElement(required = true)
    protected String zip2NdSfxNo;
    @XmlElement(required = true)
    protected String zipPrefixNo;
    @XmlElement(required = true)
    protected String postalTypeCode;
    @XmlElement(required = true)
    protected String postOfficeTypeCode;
    @XmlAttribute(name = "participantId")
    protected String participantId;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the badAddressInd property.
     * 
     */
    public boolean isBadAddressInd() {
        return badAddressInd;
    }

    /**
     * Sets the value of the badAddressInd property.
     * 
     */
    public void setBadAddressInd(boolean value) {
        this.badAddressInd = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryTn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryTn() {
        return countryTn;
    }

    /**
     * Sets the value of the countryTn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryTn(String value) {
        this.countryTn = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the developmentContactTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentContactTypeCode() {
        return developmentContactTypeCode;
    }

    /**
     * Sets the value of the developmentContactTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentContactTypeCode(String value) {
        this.developmentContactTypeCode = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
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
     * Gets the value of the foreignPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignPostalCode() {
        return foreignPostalCode;
    }

    /**
     * Sets the value of the foreignPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignPostalCode(String value) {
        this.foreignPostalCode = value;
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
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the provinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the value of the provinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceName(String value) {
        this.provinceName = value;
    }

    /**
     * Gets the value of the participantAddressTn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantAddressTn() {
        return participantAddressTn;
    }

    /**
     * Sets the value of the participantAddressTn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantAddressTn(String value) {
        this.participantAddressTn = value;
    }

    /**
     * Gets the value of the participantContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantContactId() {
        return participantContactId;
    }

    /**
     * Sets the value of the participantContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantContactId(String value) {
        this.participantContactId = value;
    }

    /**
     * Gets the value of the participantRelationshipTn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantRelationshipTn() {
        return participantRelationshipTn;
    }

    /**
     * Sets the value of the participantRelationshipTn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantRelationshipTn(String value) {
        this.participantRelationshipTn = value;
    }

    /**
     * Gets the value of the providerReleaseInd property.
     * 
     */
    public boolean isProviderReleaseInd() {
        return providerReleaseInd;
    }

    /**
     * Sets the value of the providerReleaseInd property.
     * 
     */
    public void setProviderReleaseInd(boolean value) {
        this.providerReleaseInd = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the slttnTn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlttnTn() {
        return slttnTn;
    }

    /**
     * Sets the value of the slttnTn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlttnTn(String value) {
        this.slttnTn = value;
    }

    /**
     * Gets the value of the territoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryName() {
        return territoryName;
    }

    /**
     * Sets the value of the territoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryName(String value) {
        this.territoryName = value;
    }

    /**
     * Gets the value of the zip1StSfxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip1StSfxNo() {
        return zip1StSfxNo;
    }

    /**
     * Sets the value of the zip1StSfxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip1StSfxNo(String value) {
        this.zip1StSfxNo = value;
    }

    /**
     * Gets the value of the zip2NdSfxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip2NdSfxNo() {
        return zip2NdSfxNo;
    }

    /**
     * Sets the value of the zip2NdSfxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip2NdSfxNo(String value) {
        this.zip2NdSfxNo = value;
    }

    /**
     * Gets the value of the zipPrefixNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipPrefixNo() {
        return zipPrefixNo;
    }

    /**
     * Sets the value of the zipPrefixNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipPrefixNo(String value) {
        this.zipPrefixNo = value;
    }

    /**
     * Gets the value of the postalTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalTypeCode() {
        return postalTypeCode;
    }

    /**
     * Sets the value of the postalTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalTypeCode(String value) {
        this.postalTypeCode = value;
    }

    /**
     * Gets the value of the postOfficeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeTypeCode() {
        return postOfficeTypeCode;
    }

    /**
     * Sets the value of the postOfficeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeTypeCode(String value) {
        this.postOfficeTypeCode = value;
    }

    /**
     * Gets the value of the participantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantId() {
        return participantId;
    }

    /**
     * Sets the value of the participantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantId(String value) {
        this.participantId = value;
    }

}
