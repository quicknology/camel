
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
 * <p>Java class for DevelopmentAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="standardDevelopmentActionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardDevelopmentActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rulesBasedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspenseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="suspenseUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspenseDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paragraphId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="piesRequestCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customHeadingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="federalAgencyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputArguments" type="{http://vbms.vba.va.gov/cdm}OutputArgument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="devPlanTaskActivityActionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="standardDevelopmentAction_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suspenseDays" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="benefitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contention_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentAction", propOrder = {
    "customTitle",
    "customText",
    "documentId",
    "externalId",
    "createDate",
    "standardDevelopmentActionDesc",
    "standardDevelopmentActionCode",
    "rulesBasedInd",
    "suspenseDate",
    "suspenseUnit",
    "suspenseDuration",
    "paragraphId",
    "piesRequestCode",
    "locationId",
    "participantId",
    "headingId",
    "customHeadingId",
    "federalAgencyIndicator",
    "outputArguments",
    "devPlanTaskActivityActionId"
})
public class DevelopmentAction {

    protected String customTitle;
    protected String customText;
    protected String documentId;
    protected String externalId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    protected String standardDevelopmentActionDesc;
    protected String standardDevelopmentActionCode;
    protected String rulesBasedInd;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspenseDate;
    protected String suspenseUnit;
    protected Integer suspenseDuration;
    protected String paragraphId;
    protected String piesRequestCode;
    protected String locationId;
    protected String participantId;
    protected String headingId;
    protected String customHeadingId;
    protected String federalAgencyIndicator;
    @XmlElement(nillable = true)
    protected List<OutputArgument> outputArguments;
    protected String devPlanTaskActivityActionId;
    @XmlAttribute(name = "ID")
    protected Long id;
    @XmlAttribute(name = "standardDevelopmentAction_ID")
    protected String standardDevelopmentActionID;
    @XmlAttribute(name = "suspenseDays")
    protected Integer suspenseDays;
    @XmlAttribute(name = "benefitTypeCode")
    protected String benefitTypeCode;
    @XmlAttribute(name = "contention_ID")
    protected String contentionID;

    /**
     * Gets the value of the customTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTitle() {
        return customTitle;
    }

    /**
     * Sets the value of the customTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTitle(String value) {
        this.customTitle = value;
    }

    /**
     * Gets the value of the customText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomText() {
        return customText;
    }

    /**
     * Sets the value of the customText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomText(String value) {
        this.customText = value;
    }

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the standardDevelopmentActionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardDevelopmentActionDesc() {
        return standardDevelopmentActionDesc;
    }

    /**
     * Sets the value of the standardDevelopmentActionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardDevelopmentActionDesc(String value) {
        this.standardDevelopmentActionDesc = value;
    }

    /**
     * Gets the value of the standardDevelopmentActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardDevelopmentActionCode() {
        return standardDevelopmentActionCode;
    }

    /**
     * Sets the value of the standardDevelopmentActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardDevelopmentActionCode(String value) {
        this.standardDevelopmentActionCode = value;
    }

    /**
     * Gets the value of the rulesBasedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRulesBasedInd() {
        return rulesBasedInd;
    }

    /**
     * Sets the value of the rulesBasedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRulesBasedInd(String value) {
        this.rulesBasedInd = value;
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
     * Gets the value of the suspenseUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspenseUnit() {
        return suspenseUnit;
    }

    /**
     * Sets the value of the suspenseUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspenseUnit(String value) {
        this.suspenseUnit = value;
    }

    /**
     * Gets the value of the suspenseDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspenseDuration() {
        return suspenseDuration;
    }

    /**
     * Sets the value of the suspenseDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspenseDuration(Integer value) {
        this.suspenseDuration = value;
    }

    /**
     * Gets the value of the paragraphId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParagraphId() {
        return paragraphId;
    }

    /**
     * Sets the value of the paragraphId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParagraphId(String value) {
        this.paragraphId = value;
    }

    /**
     * Gets the value of the piesRequestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiesRequestCode() {
        return piesRequestCode;
    }

    /**
     * Sets the value of the piesRequestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiesRequestCode(String value) {
        this.piesRequestCode = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
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

    /**
     * Gets the value of the headingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadingId() {
        return headingId;
    }

    /**
     * Sets the value of the headingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadingId(String value) {
        this.headingId = value;
    }

    /**
     * Gets the value of the customHeadingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomHeadingId() {
        return customHeadingId;
    }

    /**
     * Sets the value of the customHeadingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomHeadingId(String value) {
        this.customHeadingId = value;
    }

    /**
     * Gets the value of the federalAgencyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalAgencyIndicator() {
        return federalAgencyIndicator;
    }

    /**
     * Sets the value of the federalAgencyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalAgencyIndicator(String value) {
        this.federalAgencyIndicator = value;
    }

    /**
     * Gets the value of the outputArguments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputArguments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputArguments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputArgument }
     * 
     * 
     */
    public List<OutputArgument> getOutputArguments() {
        if (outputArguments == null) {
            outputArguments = new ArrayList<OutputArgument>();
        }
        return this.outputArguments;
    }

    /**
     * Gets the value of the devPlanTaskActivityActionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevPlanTaskActivityActionId() {
        return devPlanTaskActivityActionId;
    }

    /**
     * Sets the value of the devPlanTaskActivityActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevPlanTaskActivityActionId(String value) {
        this.devPlanTaskActivityActionId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the standardDevelopmentActionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardDevelopmentActionID() {
        return standardDevelopmentActionID;
    }

    /**
     * Sets the value of the standardDevelopmentActionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardDevelopmentActionID(String value) {
        this.standardDevelopmentActionID = value;
    }

    /**
     * Gets the value of the suspenseDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspenseDays() {
        return suspenseDays;
    }

    /**
     * Sets the value of the suspenseDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspenseDays(Integer value) {
        this.suspenseDays = value;
    }

    /**
     * Gets the value of the benefitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitTypeCode() {
        return benefitTypeCode;
    }

    /**
     * Sets the value of the benefitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitTypeCode(String value) {
        this.benefitTypeCode = value;
    }

    /**
     * Gets the value of the contentionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentionID() {
        return contentionID;
    }

    /**
     * Sets the value of the contentionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentionID(String value) {
        this.contentionID = value;
    }

}
