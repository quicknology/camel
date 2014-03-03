
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BodySystem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodySystem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expirationDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="suggestionSource" type="{http://vbms.vba.va.gov/cdm}SuggestionSource"/>
 *       &lt;/sequence>
 *       &lt;attribute name="suggestedInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="mainSystem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subSystem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "BodySystem", propOrder = {
    "createDt",
    "lastUpdateDt",
    "expirationDt",
    "suggestionSource"
})
public class BodySystem {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDt;
    @XmlElement(required = true)
    protected SuggestionSource suggestionSource;
    @XmlAttribute(name = "suggestedInd", required = true)
    protected boolean suggestedInd;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "mainSystem", required = true)
    protected String mainSystem;
    @XmlAttribute(name = "subSystem", required = true)
    protected String subSystem;
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
     * Gets the value of the mainSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainSystem() {
        return mainSystem;
    }

    /**
     * Sets the value of the mainSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainSystem(String value) {
        this.mainSystem = value;
    }

    /**
     * Gets the value of the subSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSystem() {
        return subSystem;
    }

    /**
     * Sets the value of the subSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSystem(String value) {
        this.subSystem = value;
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
