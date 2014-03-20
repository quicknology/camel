
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
 * <p>Java class for Claim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Claim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndProductClaimType" type="{http://vbms.vba.va.gov/cdm}CodeValue"/>
 *         &lt;element name="claimDateDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="flashList" type="{http://vbms.vba.va.gov/cdm}Flash" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suspenseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="contentions" type="{http://vbms.vba.va.gov/cdm}Contention" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inTakeSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suppressAckLetterInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="futureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Participant_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="PowerOfAttorney_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Veteran_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="InsuranceInfo_ID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="benefitTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="claimLevelStatusCd" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modifiedEndProductCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gulfWarRegistryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payeeCd" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sectionUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serviceTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="specialIssueCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stationOfJurisdiction" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="currentStationOfJurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suspenseReasonCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priority" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="td" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="disposition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="folderWithClaim" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="preDischargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim", propOrder = {
    "endProductClaimType",
    "claimDateDt",
    "flashList",
    "suspenseDate",
    "contentions",
    "inTakeSite",
    "suppressAckLetterInd",
    "futureReason"
})
public class Claim {

    @XmlElement(name = "EndProductClaimType", required = true)
    protected CodeValue endProductClaimType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar claimDateDt;
    @XmlElement(nillable = true)
    protected List<Flash> flashList;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspenseDate;
    @XmlElement(nillable = true)
    protected List<Contention> contentions;
    protected String inTakeSite;
    @XmlElement(defaultValue = "false")
    protected Boolean suppressAckLetterInd;
    protected String futureReason;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "Participant_Person_ID", required = true)
    protected long participantPersonID;
    @XmlAttribute(name = "PowerOfAttorney_ID")
    protected String powerOfAttorneyID;
    @XmlAttribute(name = "Veteran_Person_ID", required = true)
    protected long veteranPersonID;
    @XmlAttribute(name = "InsuranceInfo_ID")
    protected Long insuranceInfoID;
    @XmlAttribute(name = "benefitTypeCd")
    protected String benefitTypeCd;
    @XmlAttribute(name = "claimLevelStatusCd", required = true)
    protected String claimLevelStatusCd;
    @XmlAttribute(name = "modifiedEndProductCd")
    protected String modifiedEndProductCd;
    @XmlAttribute(name = "gulfWarRegistryInd")
    protected Boolean gulfWarRegistryInd;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "payeeCd", required = true)
    protected String payeeCd;
    @XmlAttribute(name = "sectionUnit")
    protected String sectionUnit;
    @XmlAttribute(name = "serviceTypeCd")
    protected String serviceTypeCd;
    @XmlAttribute(name = "specialIssueCd")
    protected String specialIssueCd;
    @XmlAttribute(name = "stationOfJurisdiction", required = true)
    protected String stationOfJurisdiction;
    @XmlAttribute(name = "currentStationOfJurisdiction")
    protected String currentStationOfJurisdiction;
    @XmlAttribute(name = "suspenseReasonCd")
    protected String suspenseReasonCd;
    @XmlAttribute(name = "priority", required = true)
    protected String priority;
    @XmlAttribute(name = "td")
    protected String td;
    @XmlAttribute(name = "disposition")
    protected String disposition;
    @XmlAttribute(name = "folderWithClaim")
    protected String folderWithClaim;
    @XmlAttribute(name = "preDischargeInd")
    protected Boolean preDischargeInd;

    /**
     * Gets the value of the endProductClaimType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeValue }
     *     
     */
    public CodeValue getEndProductClaimType() {
        return endProductClaimType;
    }

    /**
     * Sets the value of the endProductClaimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeValue }
     *     
     */
    public void setEndProductClaimType(CodeValue value) {
        this.endProductClaimType = value;
    }

    /**
     * Gets the value of the claimDateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClaimDateDt() {
        return claimDateDt;
    }

    /**
     * Sets the value of the claimDateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClaimDateDt(XMLGregorianCalendar value) {
        this.claimDateDt = value;
    }

    /**
     * Gets the value of the flashList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flashList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlashList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flash }
     * 
     * 
     */
    public List<Flash> getFlashList() {
        if (flashList == null) {
            flashList = new ArrayList<Flash>();
        }
        return this.flashList;
    }

    /**
     * Gets the value of the suspenseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspenseDate() {
        return suspenseDate;
    }

    /**
     * Sets the value of the suspenseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspenseDate(XMLGregorianCalendar value) {
        this.suspenseDate = value;
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
     * Gets the value of the inTakeSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTakeSite() {
        return inTakeSite;
    }

    /**
     * Sets the value of the inTakeSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTakeSite(String value) {
        this.inTakeSite = value;
    }

    /**
     * Gets the value of the suppressAckLetterInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressAckLetterInd() {
        return suppressAckLetterInd;
    }

    /**
     * Sets the value of the suppressAckLetterInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressAckLetterInd(Boolean value) {
        this.suppressAckLetterInd = value;
    }

    /**
     * Gets the value of the futureReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFutureReason() {
        return futureReason;
    }

    /**
     * Sets the value of the futureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFutureReason(String value) {
        this.futureReason = value;
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
     * Gets the value of the participantPersonID property.
     * 
     */
    public long getParticipantPersonID() {
        return participantPersonID;
    }

    /**
     * Sets the value of the participantPersonID property.
     * 
     */
    public void setParticipantPersonID(long value) {
        this.participantPersonID = value;
    }

    /**
     * Gets the value of the powerOfAttorneyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerOfAttorneyID() {
        return powerOfAttorneyID;
    }

    /**
     * Sets the value of the powerOfAttorneyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerOfAttorneyID(String value) {
        this.powerOfAttorneyID = value;
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
     * Gets the value of the insuranceInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsuranceInfoID() {
        return insuranceInfoID;
    }

    /**
     * Sets the value of the insuranceInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsuranceInfoID(Long value) {
        this.insuranceInfoID = value;
    }

    /**
     * Gets the value of the benefitTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitTypeCd() {
        return benefitTypeCd;
    }

    /**
     * Sets the value of the benefitTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitTypeCd(String value) {
        this.benefitTypeCd = value;
    }

    /**
     * Gets the value of the claimLevelStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimLevelStatusCd() {
        return claimLevelStatusCd;
    }

    /**
     * Sets the value of the claimLevelStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimLevelStatusCd(String value) {
        this.claimLevelStatusCd = value;
    }

    /**
     * Gets the value of the modifiedEndProductCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedEndProductCd() {
        return modifiedEndProductCd;
    }

    /**
     * Sets the value of the modifiedEndProductCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedEndProductCd(String value) {
        this.modifiedEndProductCd = value;
    }

    /**
     * Gets the value of the gulfWarRegistryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGulfWarRegistryInd() {
        return gulfWarRegistryInd;
    }

    /**
     * Sets the value of the gulfWarRegistryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGulfWarRegistryInd(Boolean value) {
        this.gulfWarRegistryInd = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the payeeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeCd() {
        return payeeCd;
    }

    /**
     * Sets the value of the payeeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeCd(String value) {
        this.payeeCd = value;
    }

    /**
     * Gets the value of the sectionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionUnit() {
        return sectionUnit;
    }

    /**
     * Sets the value of the sectionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionUnit(String value) {
        this.sectionUnit = value;
    }

    /**
     * Gets the value of the serviceTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeCd() {
        return serviceTypeCd;
    }

    /**
     * Sets the value of the serviceTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeCd(String value) {
        this.serviceTypeCd = value;
    }

    /**
     * Gets the value of the specialIssueCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialIssueCd() {
        return specialIssueCd;
    }

    /**
     * Sets the value of the specialIssueCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialIssueCd(String value) {
        this.specialIssueCd = value;
    }

    /**
     * Gets the value of the stationOfJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationOfJurisdiction() {
        return stationOfJurisdiction;
    }

    /**
     * Sets the value of the stationOfJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationOfJurisdiction(String value) {
        this.stationOfJurisdiction = value;
    }

    /**
     * Gets the value of the currentStationOfJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStationOfJurisdiction() {
        return currentStationOfJurisdiction;
    }

    /**
     * Sets the value of the currentStationOfJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStationOfJurisdiction(String value) {
        this.currentStationOfJurisdiction = value;
    }

    /**
     * Gets the value of the suspenseReasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspenseReasonCd() {
        return suspenseReasonCd;
    }

    /**
     * Sets the value of the suspenseReasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspenseReasonCd(String value) {
        this.suspenseReasonCd = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the td property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTd() {
        return td;
    }

    /**
     * Sets the value of the td property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTd(String value) {
        this.td = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposition(String value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the folderWithClaim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderWithClaim() {
        return folderWithClaim;
    }

    /**
     * Sets the value of the folderWithClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderWithClaim(String value) {
        this.folderWithClaim = value;
    }

    /**
     * Gets the value of the preDischargeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreDischargeInd() {
        return preDischargeInd;
    }

    /**
     * Sets the value of the preDischargeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreDischargeInd(Boolean value) {
        this.preDischargeInd = value;
    }

}
