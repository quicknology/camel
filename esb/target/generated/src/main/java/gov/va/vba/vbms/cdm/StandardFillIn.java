
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardFillIn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardFillIn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="keywordText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="outputArgumentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fillInType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userPrompt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardFillIn")
public class StandardFillIn {

    @XmlAttribute(name = "keywordText")
    protected String keywordText;
    @XmlAttribute(name = "outputArgumentTypeCode")
    protected String outputArgumentTypeCode;
    @XmlAttribute(name = "fillInType")
    protected String fillInType;
    @XmlAttribute(name = "userPrompt")
    protected String userPrompt;
    @XmlAttribute(name = "defaultText")
    protected String defaultText;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the keywordText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordText() {
        return keywordText;
    }

    /**
     * Sets the value of the keywordText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordText(String value) {
        this.keywordText = value;
    }

    /**
     * Gets the value of the outputArgumentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputArgumentTypeCode() {
        return outputArgumentTypeCode;
    }

    /**
     * Sets the value of the outputArgumentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputArgumentTypeCode(String value) {
        this.outputArgumentTypeCode = value;
    }

    /**
     * Gets the value of the fillInType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillInType() {
        return fillInType;
    }

    /**
     * Sets the value of the fillInType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillInType(String value) {
        this.fillInType = value;
    }

    /**
     * Gets the value of the userPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPrompt() {
        return userPrompt;
    }

    /**
     * Sets the value of the userPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPrompt(String value) {
        this.userPrompt = value;
    }

    /**
     * Gets the value of the defaultText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultText() {
        return defaultText;
    }

    /**
     * Sets the value of the defaultText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultText(String value) {
        this.defaultText = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
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
    public void setId(Long value) {
        this.id = value;
    }

}
