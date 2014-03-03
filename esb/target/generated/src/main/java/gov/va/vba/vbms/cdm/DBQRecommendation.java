
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DBQRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBQRecommendation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contentionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DBQID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DBQ" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DBQRecommendation", propOrder = {
    "id",
    "contentionID",
    "contentionText",
    "dbqid",
    "dbq",
    "suggestionSource",
    "createDt"
})
public class DBQRecommendation {

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(required = true)
    protected String contentionID;
    @XmlElement(required = true)
    protected String contentionText;
    @XmlElement(name = "DBQID")
    protected long dbqid;
    @XmlElement(name = "DBQ", required = true)
    protected String dbq;
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
     * Gets the value of the dbqid property.
     * 
     */
    public long getDBQID() {
        return dbqid;
    }

    /**
     * Sets the value of the dbqid property.
     * 
     */
    public void setDBQID(long value) {
        this.dbqid = value;
    }

    /**
     * Gets the value of the dbq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBQ() {
        return dbq;
    }

    /**
     * Sets the value of the dbq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBQ(String value) {
        this.dbq = value;
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
