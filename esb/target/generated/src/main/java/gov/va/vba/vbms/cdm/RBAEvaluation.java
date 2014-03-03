
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RBAEvaluation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RBAEvaluation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="percentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descriptionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paragraphText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RBAEvaluation", propOrder = {
    "percentNumber",
    "descriptionText",
    "paragraphText"
})
public class RBAEvaluation {

    @XmlElement(required = true)
    protected String percentNumber;
    @XmlElement(required = true)
    protected String descriptionText;
    @XmlElement(required = true)
    protected String paragraphText;

    /**
     * Gets the value of the percentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentNumber() {
        return percentNumber;
    }

    /**
     * Sets the value of the percentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentNumber(String value) {
        this.percentNumber = value;
    }

    /**
     * Gets the value of the descriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

    /**
     * Gets the value of the paragraphText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParagraphText() {
        return paragraphText;
    }

    /**
     * Sets the value of the paragraphText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParagraphText(String value) {
        this.paragraphText = value;
    }

}
