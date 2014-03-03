
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
 * <p>Java class for DBQView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBQView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="medicalOpinionInd" type="{http://vbms.vba.va.gov/cdm}MedicalInd"/>
 *         &lt;element name="dbq" type="{http://vbms.vba.va.gov/cdm}DBQ"/>
 *         &lt;element name="exams" type="{http://vbms.vba.va.gov/cdm}Exam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="suggestionSource" type="{http://vbms.vba.va.gov/cdm}SuggestionSource"/>
 *       &lt;/sequence>
 *       &lt;attribute name="suggestedInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="eFolderReviewInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="contentionID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="positionInList" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBQView", propOrder = {
    "createDt",
    "lastUpdateDt",
    "medicalOpinionInd",
    "dbq",
    "exams",
    "suggestionSource"
})
public class DBQView {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlElement(required = true)
    protected MedicalInd medicalOpinionInd;
    @XmlElement(required = true)
    protected DBQ dbq;
    @XmlElement(nillable = true)
    protected List<Exam> exams;
    @XmlElement(required = true)
    protected SuggestionSource suggestionSource;
    @XmlAttribute(name = "suggestedInd", required = true)
    protected boolean suggestedInd;
    @XmlAttribute(name = "eFolderReviewInd", required = true)
    protected boolean eFolderReviewInd;
    @XmlAttribute(name = "contentionID", required = true)
    protected String contentionID;
    @XmlAttribute(name = "positionInList")
    protected Integer positionInList;
    @XmlAttribute(name = "score")
    protected Float score;

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
     * Gets the value of the medicalOpinionInd property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalInd }
     *     
     */
    public MedicalInd getMedicalOpinionInd() {
        return medicalOpinionInd;
    }

    /**
     * Sets the value of the medicalOpinionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalInd }
     *     
     */
    public void setMedicalOpinionInd(MedicalInd value) {
        this.medicalOpinionInd = value;
    }

    /**
     * Gets the value of the dbq property.
     * 
     * @return
     *     possible object is
     *     {@link DBQ }
     *     
     */
    public DBQ getDbq() {
        return dbq;
    }

    /**
     * Sets the value of the dbq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DBQ }
     *     
     */
    public void setDbq(DBQ value) {
        this.dbq = value;
    }

    /**
     * Gets the value of the exams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exam }
     * 
     * 
     */
    public List<Exam> getExams() {
        if (exams == null) {
            exams = new ArrayList<Exam>();
        }
        return this.exams;
    }

    /**
     * Gets the value of the suggestionSource property.
     * 
     * @return
     *     possible object is
     *     {@link SuggestionSource }
     *     
     */
    public SuggestionSource getSuggestionSource() {
        return suggestionSource;
    }

    /**
     * Sets the value of the suggestionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestionSource }
     *     
     */
    public void setSuggestionSource(SuggestionSource value) {
        this.suggestionSource = value;
    }

    /**
     * Gets the value of the suggestedInd property.
     * 
     */
    public boolean isSuggestedInd() {
        return suggestedInd;
    }

    /**
     * Sets the value of the suggestedInd property.
     * 
     */
    public void setSuggestedInd(boolean value) {
        this.suggestedInd = value;
    }

    /**
     * Gets the value of the eFolderReviewInd property.
     * 
     */
    public boolean isEFolderReviewInd() {
        return eFolderReviewInd;
    }

    /**
     * Sets the value of the eFolderReviewInd property.
     * 
     */
    public void setEFolderReviewInd(boolean value) {
        this.eFolderReviewInd = value;
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

    /**
     * Gets the value of the positionInList property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositionInList() {
        return positionInList;
    }

    /**
     * Sets the value of the positionInList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositionInList(Integer value) {
        this.positionInList = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setScore(Float value) {
        this.score = value;
    }

}
