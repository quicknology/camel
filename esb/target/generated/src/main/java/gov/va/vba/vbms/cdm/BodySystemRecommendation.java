
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BodySystemRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodySystemRecommendation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contentionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bodySystemID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bodySystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bodyPart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suggestionSource" type="{http://vbms.vba.va.gov/cdm}SuggestionSource"/>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodySystemRecommendation", propOrder = {
    "id",
    "contentionID",
    "contentionText",
    "bodySystemID",
    "bodySystem",
    "bodyPart",
    "suggestionSource",
    "createDt"
})
public class BodySystemRecommendation {

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(required = true)
    protected String contentionID;
    @XmlElement(required = true)
    protected String contentionText;
    protected long bodySystemID;
    @XmlElement(required = true)
    protected String bodySystem;
    @XmlElement(required = true)
    protected String bodyPart;
    @XmlElement(required = true)
    protected SuggestionSource suggestionSource;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;

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
     * Gets the value of the bodySystemID property.
     * 
     */
    public long getBodySystemID() {
        return bodySystemID;
    }

    /**
     * Sets the value of the bodySystemID property.
     * 
     */
    public void setBodySystemID(long value) {
        this.bodySystemID = value;
    }

    /**
     * Gets the value of the bodySystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodySystem() {
        return bodySystem;
    }

    /**
     * Sets the value of the bodySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodySystem(String value) {
        this.bodySystem = value;
    }

    /**
     * Gets the value of the bodyPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyPart() {
        return bodyPart;
    }

    /**
     * Sets the value of the bodyPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyPart(String value) {
        this.bodyPart = value;
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

}
