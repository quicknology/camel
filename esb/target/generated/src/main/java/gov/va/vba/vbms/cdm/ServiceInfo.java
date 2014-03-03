
package gov.va.vba.vbms.cdm;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * <p>Java class for ServiceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Decorations" type="{http://vbms.vba.va.gov/cdm}Decoration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deploymentInfo" type="{http://vbms.vba.va.gov/cdm}DeploymentInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="powInfo" type="{http://vbms.vba.va.gov/cdm}PowInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="enteredOnDutyDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="releasedActiveDutyDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Veteran_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="fileNbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="activeDutyTrainingInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="serviceBranch" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="burialFlagIssueInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="charOfService" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dischargeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dischargeReason" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="frgnSvcNbr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gulfSvcInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="medalOfHonorInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="mltyPersonInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="nonPayDays" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="payGrade" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="purpleHeartInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="reenlistedInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="separationReason" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subBranch" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="seperationPayAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="serviceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalActiveSvcDays" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="transferReservesInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="typeOfDuty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vetInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="vadsInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="vaEmployeeInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="verifiedServiceInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="vietnamSvcInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="anotherNameServedUnder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reserveStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfo", propOrder = {
    "decorations",
    "deploymentInfo",
    "powInfo",
    "enteredOnDutyDt",
    "releasedActiveDutyDt",
    "createDt",
    "lastUpdateDt"
})
public class ServiceInfo {

    @XmlElement(name = "Decorations")
    protected List<Decoration> decorations;
    @XmlElement(nillable = true)
    protected List<DeploymentInfo> deploymentInfo;
    @XmlElement(nillable = true)
    protected List<PowInfo> powInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enteredOnDutyDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar releasedActiveDutyDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "Veteran_Person_ID", required = true)
    protected long veteranPersonID;
    @XmlAttribute(name = "fileNbr", required = true)
    protected String fileNbr;
    @XmlAttribute(name = "activeDutyTrainingInd", required = true)
    protected boolean activeDutyTrainingInd;
    @XmlAttribute(name = "serviceBranch", required = true)
    protected String serviceBranch;
    @XmlAttribute(name = "burialFlagIssueInd", required = true)
    protected boolean burialFlagIssueInd;
    @XmlAttribute(name = "charOfService", required = true)
    protected String charOfService;
    @XmlAttribute(name = "dischargeType", required = true)
    protected String dischargeType;
    @XmlAttribute(name = "dischargeReason", required = true)
    protected String dischargeReason;
    @XmlAttribute(name = "externalKey", required = true)
    protected String externalKey;
    @XmlAttribute(name = "frgnSvcNbr")
    protected String frgnSvcNbr;
    @XmlAttribute(name = "gulfSvcInd", required = true)
    protected boolean gulfSvcInd;
    @XmlAttribute(name = "medalOfHonorInd", required = true)
    protected boolean medalOfHonorInd;
    @XmlAttribute(name = "mltyPersonInd", required = true)
    protected boolean mltyPersonInd;
    @XmlAttribute(name = "nonPayDays", required = true)
    protected BigInteger nonPayDays;
    @XmlAttribute(name = "payGrade", required = true)
    protected String payGrade;
    @XmlAttribute(name = "purpleHeartInd", required = true)
    protected boolean purpleHeartInd;
    @XmlAttribute(name = "reenlistedInd", required = true)
    protected boolean reenlistedInd;
    @XmlAttribute(name = "separationReason", required = true)
    protected String separationReason;
    @XmlAttribute(name = "subBranch", required = true)
    protected String subBranch;
    @XmlAttribute(name = "seperationPayAmt")
    protected BigDecimal seperationPayAmt;
    @XmlAttribute(name = "serviceNumber", required = true)
    protected String serviceNumber;
    @XmlAttribute(name = "totalActiveSvcDays", required = true)
    protected BigInteger totalActiveSvcDays;
    @XmlAttribute(name = "transferReservesInd", required = true)
    protected boolean transferReservesInd;
    @XmlAttribute(name = "typeOfDuty")
    protected String typeOfDuty;
    @XmlAttribute(name = "vetInd", required = true)
    protected boolean vetInd;
    @XmlAttribute(name = "vadsInd", required = true)
    protected boolean vadsInd;
    @XmlAttribute(name = "vaEmployeeInd", required = true)
    protected boolean vaEmployeeInd;
    @XmlAttribute(name = "verifiedServiceInd", required = true)
    protected boolean verifiedServiceInd;
    @XmlAttribute(name = "vietnamSvcInd", required = true)
    protected boolean vietnamSvcInd;
    @XmlAttribute(name = "anotherNameServedUnder")
    protected String anotherNameServedUnder;
    @XmlAttribute(name = "reserveStatus")
    protected String reserveStatus;

    /**
     * Gets the value of the decorations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decorations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecorations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Decoration }
     * 
     * 
     */
    public List<Decoration> getDecorations() {
        if (decorations == null) {
            decorations = new ArrayList<Decoration>();
        }
        return this.decorations;
    }

    /**
     * Gets the value of the deploymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deploymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeploymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeploymentInfo }
     * 
     * 
     */
    public List<DeploymentInfo> getDeploymentInfo() {
        if (deploymentInfo == null) {
            deploymentInfo = new ArrayList<DeploymentInfo>();
        }
        return this.deploymentInfo;
    }

    /**
     * Gets the value of the powInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowInfo }
     * 
     * 
     */
    public List<PowInfo> getPowInfo() {
        if (powInfo == null) {
            powInfo = new ArrayList<PowInfo>();
        }
        return this.powInfo;
    }

    /**
     * Gets the value of the enteredOnDutyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnteredOnDutyDt() {
        return enteredOnDutyDt;
    }

    /**
     * Sets the value of the enteredOnDutyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnteredOnDutyDt(XMLGregorianCalendar value) {
        this.enteredOnDutyDt = value;
    }

    /**
     * Gets the value of the releasedActiveDutyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleasedActiveDutyDt() {
        return releasedActiveDutyDt;
    }

    /**
     * Sets the value of the releasedActiveDutyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleasedActiveDutyDt(XMLGregorianCalendar value) {
        this.releasedActiveDutyDt = value;
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
     * Gets the value of the fileNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNbr() {
        return fileNbr;
    }

    /**
     * Sets the value of the fileNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNbr(String value) {
        this.fileNbr = value;
    }

    /**
     * Gets the value of the activeDutyTrainingInd property.
     * 
     */
    public boolean isActiveDutyTrainingInd() {
        return activeDutyTrainingInd;
    }

    /**
     * Sets the value of the activeDutyTrainingInd property.
     * 
     */
    public void setActiveDutyTrainingInd(boolean value) {
        this.activeDutyTrainingInd = value;
    }

    /**
     * Gets the value of the serviceBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceBranch() {
        return serviceBranch;
    }

    /**
     * Sets the value of the serviceBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceBranch(String value) {
        this.serviceBranch = value;
    }

    /**
     * Gets the value of the burialFlagIssueInd property.
     * 
     */
    public boolean isBurialFlagIssueInd() {
        return burialFlagIssueInd;
    }

    /**
     * Sets the value of the burialFlagIssueInd property.
     * 
     */
    public void setBurialFlagIssueInd(boolean value) {
        this.burialFlagIssueInd = value;
    }

    /**
     * Gets the value of the charOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharOfService() {
        return charOfService;
    }

    /**
     * Sets the value of the charOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharOfService(String value) {
        this.charOfService = value;
    }

    /**
     * Gets the value of the dischargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeType() {
        return dischargeType;
    }

    /**
     * Sets the value of the dischargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeType(String value) {
        this.dischargeType = value;
    }

    /**
     * Gets the value of the dischargeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDischargeReason() {
        return dischargeReason;
    }

    /**
     * Sets the value of the dischargeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDischargeReason(String value) {
        this.dischargeReason = value;
    }

    /**
     * Gets the value of the externalKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalKey() {
        return externalKey;
    }

    /**
     * Sets the value of the externalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalKey(String value) {
        this.externalKey = value;
    }

    /**
     * Gets the value of the frgnSvcNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrgnSvcNbr() {
        return frgnSvcNbr;
    }

    /**
     * Sets the value of the frgnSvcNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrgnSvcNbr(String value) {
        this.frgnSvcNbr = value;
    }

    /**
     * Gets the value of the gulfSvcInd property.
     * 
     */
    public boolean isGulfSvcInd() {
        return gulfSvcInd;
    }

    /**
     * Sets the value of the gulfSvcInd property.
     * 
     */
    public void setGulfSvcInd(boolean value) {
        this.gulfSvcInd = value;
    }

    /**
     * Gets the value of the medalOfHonorInd property.
     * 
     */
    public boolean isMedalOfHonorInd() {
        return medalOfHonorInd;
    }

    /**
     * Sets the value of the medalOfHonorInd property.
     * 
     */
    public void setMedalOfHonorInd(boolean value) {
        this.medalOfHonorInd = value;
    }

    /**
     * Gets the value of the mltyPersonInd property.
     * 
     */
    public boolean isMltyPersonInd() {
        return mltyPersonInd;
    }

    /**
     * Sets the value of the mltyPersonInd property.
     * 
     */
    public void setMltyPersonInd(boolean value) {
        this.mltyPersonInd = value;
    }

    /**
     * Gets the value of the nonPayDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonPayDays() {
        return nonPayDays;
    }

    /**
     * Sets the value of the nonPayDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonPayDays(BigInteger value) {
        this.nonPayDays = value;
    }

    /**
     * Gets the value of the payGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayGrade() {
        return payGrade;
    }

    /**
     * Sets the value of the payGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayGrade(String value) {
        this.payGrade = value;
    }

    /**
     * Gets the value of the purpleHeartInd property.
     * 
     */
    public boolean isPurpleHeartInd() {
        return purpleHeartInd;
    }

    /**
     * Sets the value of the purpleHeartInd property.
     * 
     */
    public void setPurpleHeartInd(boolean value) {
        this.purpleHeartInd = value;
    }

    /**
     * Gets the value of the reenlistedInd property.
     * 
     */
    public boolean isReenlistedInd() {
        return reenlistedInd;
    }

    /**
     * Sets the value of the reenlistedInd property.
     * 
     */
    public void setReenlistedInd(boolean value) {
        this.reenlistedInd = value;
    }

    /**
     * Gets the value of the separationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparationReason() {
        return separationReason;
    }

    /**
     * Sets the value of the separationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparationReason(String value) {
        this.separationReason = value;
    }

    /**
     * Gets the value of the subBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBranch() {
        return subBranch;
    }

    /**
     * Sets the value of the subBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBranch(String value) {
        this.subBranch = value;
    }

    /**
     * Gets the value of the seperationPayAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeperationPayAmt() {
        return seperationPayAmt;
    }

    /**
     * Sets the value of the seperationPayAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeperationPayAmt(BigDecimal value) {
        this.seperationPayAmt = value;
    }

    /**
     * Gets the value of the serviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Sets the value of the serviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Gets the value of the totalActiveSvcDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalActiveSvcDays() {
        return totalActiveSvcDays;
    }

    /**
     * Sets the value of the totalActiveSvcDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalActiveSvcDays(BigInteger value) {
        this.totalActiveSvcDays = value;
    }

    /**
     * Gets the value of the transferReservesInd property.
     * 
     */
    public boolean isTransferReservesInd() {
        return transferReservesInd;
    }

    /**
     * Sets the value of the transferReservesInd property.
     * 
     */
    public void setTransferReservesInd(boolean value) {
        this.transferReservesInd = value;
    }

    /**
     * Gets the value of the typeOfDuty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfDuty() {
        return typeOfDuty;
    }

    /**
     * Sets the value of the typeOfDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfDuty(String value) {
        this.typeOfDuty = value;
    }

    /**
     * Gets the value of the vetInd property.
     * 
     */
    public boolean isVetInd() {
        return vetInd;
    }

    /**
     * Sets the value of the vetInd property.
     * 
     */
    public void setVetInd(boolean value) {
        this.vetInd = value;
    }

    /**
     * Gets the value of the vadsInd property.
     * 
     */
    public boolean isVadsInd() {
        return vadsInd;
    }

    /**
     * Sets the value of the vadsInd property.
     * 
     */
    public void setVadsInd(boolean value) {
        this.vadsInd = value;
    }

    /**
     * Gets the value of the vaEmployeeInd property.
     * 
     */
    public boolean isVaEmployeeInd() {
        return vaEmployeeInd;
    }

    /**
     * Sets the value of the vaEmployeeInd property.
     * 
     */
    public void setVaEmployeeInd(boolean value) {
        this.vaEmployeeInd = value;
    }

    /**
     * Gets the value of the verifiedServiceInd property.
     * 
     */
    public boolean isVerifiedServiceInd() {
        return verifiedServiceInd;
    }

    /**
     * Sets the value of the verifiedServiceInd property.
     * 
     */
    public void setVerifiedServiceInd(boolean value) {
        this.verifiedServiceInd = value;
    }

    /**
     * Gets the value of the vietnamSvcInd property.
     * 
     */
    public boolean isVietnamSvcInd() {
        return vietnamSvcInd;
    }

    /**
     * Sets the value of the vietnamSvcInd property.
     * 
     */
    public void setVietnamSvcInd(boolean value) {
        this.vietnamSvcInd = value;
    }

    /**
     * Gets the value of the anotherNameServedUnder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotherNameServedUnder() {
        return anotherNameServedUnder;
    }

    /**
     * Sets the value of the anotherNameServedUnder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotherNameServedUnder(String value) {
        this.anotherNameServedUnder = value;
    }

    /**
     * Gets the value of the reserveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveStatus() {
        return reserveStatus;
    }

    /**
     * Sets the value of the reserveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveStatus(String value) {
        this.reserveStatus = value;
    }

}
