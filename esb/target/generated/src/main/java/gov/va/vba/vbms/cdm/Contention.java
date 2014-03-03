
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
 * <p>Java class for Contention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contention">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="completionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="source" type="{http://vbms.vba.va.gov/cdm}Source" minOccurs="0"/>
 *         &lt;element name="submitDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="issue" type="{http://vbms.vba.va.gov/cdm}Issue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Claim_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="actionableItemInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="awaitingResponse" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classificationCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="decisionHistoryCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="decisionHistoryNotes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="decisionStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="levelStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="medicalInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="partcipantContention" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="secondaryToContentionID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="workingContention" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentionCategory" type="{http://vbms.vba.va.gov/cdm}ContentionCategory" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contention", propOrder = {
    "createDt",
    "completionDate",
    "source",
    "submitDate",
    "issue",
    "startDate"
})
public class Contention {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar completionDate;
    protected Source source;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar submitDate;
    @XmlElement(nillable = true)
    protected List<Issue> issue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "Claim_ID", required = true)
    protected long claimID;
    @XmlAttribute(name = "actionableItemInd", required = true)
    protected boolean actionableItemInd;
    @XmlAttribute(name = "awaitingResponse", required = true)
    protected String awaitingResponse;
    @XmlAttribute(name = "classificationCd")
    protected String classificationCd;
    @XmlAttribute(name = "decisionHistoryCd")
    protected String decisionHistoryCd;
    @XmlAttribute(name = "decisionHistoryNotes")
    protected String decisionHistoryNotes;
    @XmlAttribute(name = "decisionStatusCode")
    protected String decisionStatusCode;
    @XmlAttribute(name = "fileNumber")
    protected String fileNumber;
    @XmlAttribute(name = "levelStatusCode")
    protected String levelStatusCode;
    @XmlAttribute(name = "medicalInd", required = true)
    protected boolean medicalInd;
    @XmlAttribute(name = "partcipantContention", required = true)
    protected String partcipantContention;
    @XmlAttribute(name = "secondaryToContentionID", required = true)
    protected String secondaryToContentionID;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "typeCode")
    protected String typeCode;
    @XmlAttribute(name = "workingContention", required = true)
    protected String workingContention;
    @XmlAttribute(name = "contentionCategory")
    protected ContentionCategory contentionCategory;

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
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitDate(XMLGregorianCalendar value) {
        this.submitDate = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Issue }
     * 
     * 
     */
    public List<Issue> getIssue() {
        if (issue == null) {
            issue = new ArrayList<Issue>();
        }
        return this.issue;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the claimID property.
     * 
     */
    public long getClaimID() {
        return claimID;
    }

    /**
     * Sets the value of the claimID property.
     * 
     */
    public void setClaimID(long value) {
        this.claimID = value;
    }

    /**
     * Gets the value of the actionableItemInd property.
     * 
     */
    public boolean isActionableItemInd() {
        return actionableItemInd;
    }

    /**
     * Sets the value of the actionableItemInd property.
     * 
     */
    public void setActionableItemInd(boolean value) {
        this.actionableItemInd = value;
    }

    /**
     * Gets the value of the awaitingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwaitingResponse() {
        return awaitingResponse;
    }

    /**
     * Sets the value of the awaitingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwaitingResponse(String value) {
        this.awaitingResponse = value;
    }

    /**
     * Gets the value of the classificationCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationCd() {
        return classificationCd;
    }

    /**
     * Sets the value of the classificationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationCd(String value) {
        this.classificationCd = value;
    }

    /**
     * Gets the value of the decisionHistoryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionHistoryCd() {
        return decisionHistoryCd;
    }

    /**
     * Sets the value of the decisionHistoryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionHistoryCd(String value) {
        this.decisionHistoryCd = value;
    }

    /**
     * Gets the value of the decisionHistoryNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionHistoryNotes() {
        return decisionHistoryNotes;
    }

    /**
     * Sets the value of the decisionHistoryNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionHistoryNotes(String value) {
        this.decisionHistoryNotes = value;
    }

    /**
     * Gets the value of the decisionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionStatusCode() {
        return decisionStatusCode;
    }

    /**
     * Sets the value of the decisionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionStatusCode(String value) {
        this.decisionStatusCode = value;
    }

    /**
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the levelStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelStatusCode() {
        return levelStatusCode;
    }

    /**
     * Sets the value of the levelStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelStatusCode(String value) {
        this.levelStatusCode = value;
    }

    /**
     * Gets the value of the medicalInd property.
     * 
     */
    public boolean isMedicalInd() {
        return medicalInd;
    }

    /**
     * Sets the value of the medicalInd property.
     * 
     */
    public void setMedicalInd(boolean value) {
        this.medicalInd = value;
    }

    /**
     * Gets the value of the partcipantContention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartcipantContention() {
        return partcipantContention;
    }

    /**
     * Sets the value of the partcipantContention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartcipantContention(String value) {
        this.partcipantContention = value;
    }

    /**
     * Gets the value of the secondaryToContentionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryToContentionID() {
        return secondaryToContentionID;
    }

    /**
     * Sets the value of the secondaryToContentionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryToContentionID(String value) {
        this.secondaryToContentionID = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the workingContention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingContention() {
        return workingContention;
    }

    /**
     * Sets the value of the workingContention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingContention(String value) {
        this.workingContention = value;
    }

    /**
     * Gets the value of the contentionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ContentionCategory }
     *     
     */
    public ContentionCategory getContentionCategory() {
        return contentionCategory;
    }

    /**
     * Sets the value of the contentionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentionCategory }
     *     
     */
    public void setContentionCategory(ContentionCategory value) {
        this.contentionCategory = value;
    }

}
