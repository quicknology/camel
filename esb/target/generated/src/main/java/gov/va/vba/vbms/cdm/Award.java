
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
 * <p>Java class for Award complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Award">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="awardStatusDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastPaidDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="retroactiveDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Issue_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Veteran_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="beneficiaryPerson_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="benefitParticipant_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="receiptParticipant_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="AwardBenefit_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AwardPayStatus_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AwardStatus_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accountBalanceAmt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="beneficiaryType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deductionsAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="fiduciaryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Frequency_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="igReferenceNbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requestedFrequency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Document_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Award", propOrder = {
    "awardStatusDt",
    "lastPaidDt",
    "retroactiveDt",
    "createDt",
    "lastUpdateDt"
})
public class Award {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar awardStatusDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPaidDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar retroactiveDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "Issue_ID", required = true)
    protected long issueID;
    @XmlAttribute(name = "Veteran_Person_ID", required = true)
    protected long veteranPersonID;
    @XmlAttribute(name = "beneficiaryPerson_ID", required = true)
    protected long beneficiaryPersonID;
    @XmlAttribute(name = "benefitParticipant_Person_ID", required = true)
    protected long benefitParticipantPersonID;
    @XmlAttribute(name = "receiptParticipant_Person_ID", required = true)
    protected long receiptParticipantPersonID;
    @XmlAttribute(name = "AwardBenefit_ID")
    protected String awardBenefitID;
    @XmlAttribute(name = "AwardPayStatus_ID")
    protected String awardPayStatusID;
    @XmlAttribute(name = "AwardStatus_ID")
    protected String awardStatusID;
    @XmlAttribute(name = "accountBalanceAmt", required = true)
    protected BigDecimal accountBalanceAmt;
    @XmlAttribute(name = "beneficiaryType", required = true)
    protected String beneficiaryType;
    @XmlAttribute(name = "deductionsAmt")
    protected BigDecimal deductionsAmt;
    @XmlAttribute(name = "fiduciaryType")
    protected String fiduciaryType;
    @XmlAttribute(name = "Frequency_ID")
    protected String frequencyID;
    @XmlAttribute(name = "igReferenceNbr")
    protected String igReferenceNbr;
    @XmlAttribute(name = "requestedFrequency")
    protected String requestedFrequency;
    @XmlAttribute(name = "Document_ID", required = true)
    protected long documentID;

    /**
     * Gets the value of the awardStatusDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAwardStatusDt() {
        return awardStatusDt;
    }

    /**
     * Sets the value of the awardStatusDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAwardStatusDt(XMLGregorianCalendar value) {
        this.awardStatusDt = value;
    }

    /**
     * Gets the value of the lastPaidDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaidDt() {
        return lastPaidDt;
    }

    /**
     * Sets the value of the lastPaidDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaidDt(XMLGregorianCalendar value) {
        this.lastPaidDt = value;
    }

    /**
     * Gets the value of the retroactiveDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRetroactiveDt() {
        return retroactiveDt;
    }

    /**
     * Sets the value of the retroactiveDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRetroactiveDt(XMLGregorianCalendar value) {
        this.retroactiveDt = value;
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
     * Gets the value of the issueID property.
     * 
     */
    public long getIssueID() {
        return issueID;
    }

    /**
     * Sets the value of the issueID property.
     * 
     */
    public void setIssueID(long value) {
        this.issueID = value;
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
     * Gets the value of the beneficiaryPersonID property.
     * 
     */
    public long getBeneficiaryPersonID() {
        return beneficiaryPersonID;
    }

    /**
     * Sets the value of the beneficiaryPersonID property.
     * 
     */
    public void setBeneficiaryPersonID(long value) {
        this.beneficiaryPersonID = value;
    }

    /**
     * Gets the value of the benefitParticipantPersonID property.
     * 
     */
    public long getBenefitParticipantPersonID() {
        return benefitParticipantPersonID;
    }

    /**
     * Sets the value of the benefitParticipantPersonID property.
     * 
     */
    public void setBenefitParticipantPersonID(long value) {
        this.benefitParticipantPersonID = value;
    }

    /**
     * Gets the value of the receiptParticipantPersonID property.
     * 
     */
    public long getReceiptParticipantPersonID() {
        return receiptParticipantPersonID;
    }

    /**
     * Sets the value of the receiptParticipantPersonID property.
     * 
     */
    public void setReceiptParticipantPersonID(long value) {
        this.receiptParticipantPersonID = value;
    }

    /**
     * Gets the value of the awardBenefitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardBenefitID() {
        return awardBenefitID;
    }

    /**
     * Sets the value of the awardBenefitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardBenefitID(String value) {
        this.awardBenefitID = value;
    }

    /**
     * Gets the value of the awardPayStatusID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardPayStatusID() {
        return awardPayStatusID;
    }

    /**
     * Sets the value of the awardPayStatusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardPayStatusID(String value) {
        this.awardPayStatusID = value;
    }

    /**
     * Gets the value of the awardStatusID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardStatusID() {
        return awardStatusID;
    }

    /**
     * Sets the value of the awardStatusID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardStatusID(String value) {
        this.awardStatusID = value;
    }

    /**
     * Gets the value of the accountBalanceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountBalanceAmt() {
        return accountBalanceAmt;
    }

    /**
     * Sets the value of the accountBalanceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountBalanceAmt(BigDecimal value) {
        this.accountBalanceAmt = value;
    }

    /**
     * Gets the value of the beneficiaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    /**
     * Sets the value of the beneficiaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryType(String value) {
        this.beneficiaryType = value;
    }

    /**
     * Gets the value of the deductionsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeductionsAmt() {
        return deductionsAmt;
    }

    /**
     * Sets the value of the deductionsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeductionsAmt(BigDecimal value) {
        this.deductionsAmt = value;
    }

    /**
     * Gets the value of the fiduciaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiduciaryType() {
        return fiduciaryType;
    }

    /**
     * Sets the value of the fiduciaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiduciaryType(String value) {
        this.fiduciaryType = value;
    }

    /**
     * Gets the value of the frequencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyID() {
        return frequencyID;
    }

    /**
     * Sets the value of the frequencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyID(String value) {
        this.frequencyID = value;
    }

    /**
     * Gets the value of the igReferenceNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgReferenceNbr() {
        return igReferenceNbr;
    }

    /**
     * Sets the value of the igReferenceNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgReferenceNbr(String value) {
        this.igReferenceNbr = value;
    }

    /**
     * Gets the value of the requestedFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedFrequency() {
        return requestedFrequency;
    }

    /**
     * Sets the value of the requestedFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedFrequency(String value) {
        this.requestedFrequency = value;
    }

    /**
     * Gets the value of the documentID property.
     * 
     */
    public long getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     */
    public void setDocumentID(long value) {
        this.documentID = value;
    }

}
