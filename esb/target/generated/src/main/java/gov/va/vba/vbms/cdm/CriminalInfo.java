
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CriminalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriminalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateSentToJail" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dateReleasedFromJail" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="paroleEndDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="PersonalInfo_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="crimeCommitted" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="verdict" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sentence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stateOfCrime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="countryOfCrime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="onParoleInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="prisonName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cityOfCrime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriminalInfo", propOrder = {
    "dateSentToJail",
    "dateReleasedFromJail",
    "paroleEndDt",
    "createDt",
    "lastUpdateDt"
})
public class CriminalInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateSentToJail;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateReleasedFromJail;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paroleEndDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "PersonalInfo_Person_ID", required = true)
    protected long personalInfoPersonID;
    @XmlAttribute(name = "crimeCommitted", required = true)
    protected String crimeCommitted;
    @XmlAttribute(name = "verdict", required = true)
    protected String verdict;
    @XmlAttribute(name = "sentence", required = true)
    protected String sentence;
    @XmlAttribute(name = "stateOfCrime")
    protected String stateOfCrime;
    @XmlAttribute(name = "countryOfCrime")
    protected String countryOfCrime;
    @XmlAttribute(name = "onParoleInd", required = true)
    protected boolean onParoleInd;
    @XmlAttribute(name = "prisonName")
    protected String prisonName;
    @XmlAttribute(name = "cityOfCrime", required = true)
    protected String cityOfCrime;

    /**
     * Gets the value of the dateSentToJail property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSentToJail() {
        return dateSentToJail;
    }

    /**
     * Sets the value of the dateSentToJail property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSentToJail(XMLGregorianCalendar value) {
        this.dateSentToJail = value;
    }

    /**
     * Gets the value of the dateReleasedFromJail property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReleasedFromJail() {
        return dateReleasedFromJail;
    }

    /**
     * Sets the value of the dateReleasedFromJail property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReleasedFromJail(XMLGregorianCalendar value) {
        this.dateReleasedFromJail = value;
    }

    /**
     * Gets the value of the paroleEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParoleEndDt() {
        return paroleEndDt;
    }

    /**
     * Sets the value of the paroleEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParoleEndDt(XMLGregorianCalendar value) {
        this.paroleEndDt = value;
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
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the personalInfoPersonID property.
     * 
     */
    public long getPersonalInfoPersonID() {
        return personalInfoPersonID;
    }

    /**
     * Sets the value of the personalInfoPersonID property.
     * 
     */
    public void setPersonalInfoPersonID(long value) {
        this.personalInfoPersonID = value;
    }

    /**
     * Gets the value of the crimeCommitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrimeCommitted() {
        return crimeCommitted;
    }

    /**
     * Sets the value of the crimeCommitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrimeCommitted(String value) {
        this.crimeCommitted = value;
    }

    /**
     * Gets the value of the verdict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerdict() {
        return verdict;
    }

    /**
     * Sets the value of the verdict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerdict(String value) {
        this.verdict = value;
    }

    /**
     * Gets the value of the sentence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentence() {
        return sentence;
    }

    /**
     * Sets the value of the sentence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentence(String value) {
        this.sentence = value;
    }

    /**
     * Gets the value of the stateOfCrime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOfCrime() {
        return stateOfCrime;
    }

    /**
     * Sets the value of the stateOfCrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOfCrime(String value) {
        this.stateOfCrime = value;
    }

    /**
     * Gets the value of the countryOfCrime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfCrime() {
        return countryOfCrime;
    }

    /**
     * Sets the value of the countryOfCrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfCrime(String value) {
        this.countryOfCrime = value;
    }

    /**
     * Gets the value of the onParoleInd property.
     * 
     */
    public boolean isOnParoleInd() {
        return onParoleInd;
    }

    /**
     * Sets the value of the onParoleInd property.
     * 
     */
    public void setOnParoleInd(boolean value) {
        this.onParoleInd = value;
    }

    /**
     * Gets the value of the prisonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrisonName() {
        return prisonName;
    }

    /**
     * Sets the value of the prisonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrisonName(String value) {
        this.prisonName = value;
    }

    /**
     * Gets the value of the cityOfCrime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOfCrime() {
        return cityOfCrime;
    }

    /**
     * Sets the value of the cityOfCrime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOfCrime(String value) {
        this.cityOfCrime = value;
    }

}
