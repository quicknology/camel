
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContentionAppendix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentionAppendix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="contentionCategory" type="{http://vbms.vba.va.gov/cdm}ContentionCategory" minOccurs="0"/>
 *         &lt;element name="contentionType" type="{http://vbms.vba.va.gov/cdm}ContentionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="contentionID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentionAppendix", propOrder = {
    "createDt",
    "lastUpdateDt",
    "contentionCategory",
    "contentionType"
})
public class ContentionAppendix {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    protected ContentionCategory contentionCategory;
    protected ContentionType contentionType;
    @XmlAttribute(name = "contentionID", required = true)
    protected String contentionID;

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

    /**
     * Gets the value of the contentionType property.
     * 
     * @return
     *     possible object is
     *     {@link ContentionType }
     *     
     */
    public ContentionType getContentionType() {
        return contentionType;
    }

    /**
     * Sets the value of the contentionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentionType }
     *     
     */
    public void setContentionType(ContentionType value) {
        this.contentionType = value;
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
