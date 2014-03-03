
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://vbms.vba.va.gov/cdm}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eMail" type="{http://vbms.vba.va.gov/cdm}Email" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="criminalInfo" type="{http://vbms.vba.va.gov/cdm}CriminalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="financialInfo" type="{http://vbms.vba.va.gov/cdm}FinancialInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="insuranceInfo" type="{http://vbms.vba.va.gov/cdm}InsuranceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://vbms.vba.va.gov/cdm}Phone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="currentOccupationStartDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="birthCity" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthState_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthCountry_Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="causeOfDeath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ssnValidation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="noSsnReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="employmentInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="currentOccupation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="potentialDangersInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="employmenHdcpInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="birthplaceValidation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dobValidation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalInfo", propOrder = {
    "address",
    "eMail",
    "criminalInfo",
    "financialInfo",
    "insuranceInfo",
    "phone",
    "dateOfBirth",
    "dateOfDeath",
    "currentOccupationStartDt",
    "createDt",
    "lastUpdateDt"
})
public class PersonalInfo {

    @XmlElement(nillable = true)
    protected List<Address> address;
    @XmlElement(nillable = true)
    protected List<Email> eMail;
    @XmlElement(nillable = true)
    protected List<CriminalInfo> criminalInfo;
    @XmlElement(nillable = true)
    protected List<FinancialInfo> financialInfo;
    @XmlElement(nillable = true)
    protected List<InsuranceInfo> insuranceInfo;
    @XmlElement(nillable = true)
    protected List<Phone> phone;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfDeath;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar currentOccupationStartDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlAttribute(name = "Person_ID", required = true)
    protected long personID;
    @XmlAttribute(name = "birthCity", required = true)
    protected String birthCity;
    @XmlAttribute(name = "birthState_Code")
    protected String birthStateCode;
    @XmlAttribute(name = "birthCountry_Code")
    protected String birthCountryCode;
    @XmlAttribute(name = "causeOfDeath")
    protected String causeOfDeath;
    @XmlAttribute(name = "ssn")
    protected String ssn;
    @XmlAttribute(name = "ssnValidation")
    protected String ssnValidation;
    @XmlAttribute(name = "noSsnReason")
    protected String noSsnReason;
    @XmlAttribute(name = "employmentInd", required = true)
    protected boolean employmentInd;
    @XmlAttribute(name = "currentOccupation")
    protected String currentOccupation;
    @XmlAttribute(name = "potentialDangersInd", required = true)
    protected boolean potentialDangersInd;
    @XmlAttribute(name = "employmenHdcpInd", required = true)
    protected boolean employmenHdcpInd;
    @XmlAttribute(name = "birthplaceValidation")
    protected String birthplaceValidation;
    @XmlAttribute(name = "dobValidation")
    protected String dobValidation;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eMail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEMail() {
        if (eMail == null) {
            eMail = new ArrayList<Email>();
        }
        return this.eMail;
    }

    /**
     * Gets the value of the criminalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criminalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriminalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriminalInfo }
     * 
     * 
     */
    public List<CriminalInfo> getCriminalInfo() {
        if (criminalInfo == null) {
            criminalInfo = new ArrayList<CriminalInfo>();
        }
        return this.criminalInfo;
    }

    /**
     * Gets the value of the financialInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInfo }
     * 
     * 
     */
    public List<FinancialInfo> getFinancialInfo() {
        if (financialInfo == null) {
            financialInfo = new ArrayList<FinancialInfo>();
        }
        return this.financialInfo;
    }

    /**
     * Gets the value of the insuranceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceInfo }
     * 
     * 
     */
    public List<InsuranceInfo> getInsuranceInfo() {
        if (insuranceInfo == null) {
            insuranceInfo = new ArrayList<InsuranceInfo>();
        }
        return this.insuranceInfo;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Phone }
     * 
     * 
     */
    public List<Phone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<Phone>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeath(XMLGregorianCalendar value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the currentOccupationStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentOccupationStartDt() {
        return currentOccupationStartDt;
    }

    /**
     * Sets the value of the currentOccupationStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentOccupationStartDt(XMLGregorianCalendar value) {
        this.currentOccupationStartDt = value;
    }

    /**
     * Gets the value of the createDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDt() {
        return createDt;
    }

    /**
     * Sets the value of the createDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDt(XMLGregorianCalendar value) {
        this.createDt = value;
    }

    /**
     * Gets the value of the lastUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * Sets the value of the lastUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDt(XMLGregorianCalendar value) {
        this.lastUpdateDt = value;
    }

    /**
     * Gets the value of the personID property.
     * 
     */
    public long getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     */
    public void setPersonID(long value) {
        this.personID = value;
    }

    /**
     * Gets the value of the birthCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCity() {
        return birthCity;
    }

    /**
     * Sets the value of the birthCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCity(String value) {
        this.birthCity = value;
    }

    /**
     * Gets the value of the birthStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthStateCode() {
        return birthStateCode;
    }

    /**
     * Sets the value of the birthStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthStateCode(String value) {
        this.birthStateCode = value;
    }

    /**
     * Gets the value of the birthCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountryCode() {
        return birthCountryCode;
    }

    /**
     * Sets the value of the birthCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountryCode(String value) {
        this.birthCountryCode = value;
    }

    /**
     * Gets the value of the causeOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    /**
     * Sets the value of the causeOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseOfDeath(String value) {
        this.causeOfDeath = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the ssnValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnValidation() {
        return ssnValidation;
    }

    /**
     * Sets the value of the ssnValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsnValidation(String value) {
        this.ssnValidation = value;
    }

    /**
     * Gets the value of the noSsnReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSsnReason() {
        return noSsnReason;
    }

    /**
     * Sets the value of the noSsnReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSsnReason(String value) {
        this.noSsnReason = value;
    }

    /**
     * Gets the value of the employmentInd property.
     * 
     */
    public boolean isEmploymentInd() {
        return employmentInd;
    }

    /**
     * Sets the value of the employmentInd property.
     * 
     */
    public void setEmploymentInd(boolean value) {
        this.employmentInd = value;
    }

    /**
     * Gets the value of the currentOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOccupation() {
        return currentOccupation;
    }

    /**
     * Sets the value of the currentOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOccupation(String value) {
        this.currentOccupation = value;
    }

    /**
     * Gets the value of the potentialDangersInd property.
     * 
     */
    public boolean isPotentialDangersInd() {
        return potentialDangersInd;
    }

    /**
     * Sets the value of the potentialDangersInd property.
     * 
     */
    public void setPotentialDangersInd(boolean value) {
        this.potentialDangersInd = value;
    }

    /**
     * Gets the value of the employmenHdcpInd property.
     * 
     */
    public boolean isEmploymenHdcpInd() {
        return employmenHdcpInd;
    }

    /**
     * Sets the value of the employmenHdcpInd property.
     * 
     */
    public void setEmploymenHdcpInd(boolean value) {
        this.employmenHdcpInd = value;
    }

    /**
     * Gets the value of the birthplaceValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthplaceValidation() {
        return birthplaceValidation;
    }

    /**
     * Sets the value of the birthplaceValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthplaceValidation(String value) {
        this.birthplaceValidation = value;
    }

    /**
     * Gets the value of the dobValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDobValidation() {
        return dobValidation;
    }

    /**
     * Sets the value of the dobValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDobValidation(String value) {
        this.dobValidation = value;
    }

}
