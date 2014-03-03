
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BodySystemHistorical complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodySystemHistorical">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="bodySystem" type="{http://vbms.vba.va.gov/cdm}BodySystem"/>
 *       &lt;/sequence>
 *       &lt;attribute name="contentionID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="contentionText" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="suggestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="positionInList" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="suggestionSource" type="{http://vbms.vba.va.gov/cdm}SuggestionSource" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodySystemHistorical", propOrder = {
    "expirationDt",
    "createDt",
    "lastUpdateDt",
    "bodySystem"
})
public class BodySystemHistorical {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlElement(required = true)
    protected BodySystem bodySystem;
    @XmlAttribute(name = "contentionID", required = true)
    protected String contentionID;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "contentionText", required = true)
    protected String contentionText;
    @XmlAttribute(name = "suggestedInd")
    protected Boolean suggestedInd;
    @XmlAttribute(name = "positionInList")
    protected Long positionInList;
    @XmlAttribute(name = "score")
    protected Float score;
    @XmlAttribute(name = "suggestionSource")
    protected SuggestionSource suggestionSource;

    /**
     * Gets the value of the expirationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDt() {
        return expirationDt;
    }

    /**
     * Sets the value of the expirationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDt(XMLGregorianCalendar value) {
        this.expirationDt = value;
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
     * Gets the value of the bodySystem property.
     * 
     * @return
     *     possible object is
     *     {@link BodySystem }
     *     
     */
    public BodySystem getBodySystem() {
        return bodySystem;
    }

    /**
     * Sets the value of the bodySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodySystem }
     *     
     */
    public void setBodySystem(BodySystem value) {
        this.bodySystem = value;
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
     * Gets the value of the contentionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentionText() {
        return contentionText;
    }

    /**
     * Sets the value of the contentionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentionText(String value) {
        this.contentionText = value;
    }

    /**
     * Gets the value of the suggestedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuggestedInd() {
        return suggestedInd;
    }

    /**
     * Sets the value of the suggestedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuggestedInd(Boolean value) {
        this.suggestedInd = value;
    }

    /**
     * Gets the value of the positionInList property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPositionInList() {
        return positionInList;
    }

    /**
     * Sets the value of the positionInList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPositionInList(Long value) {
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

}
