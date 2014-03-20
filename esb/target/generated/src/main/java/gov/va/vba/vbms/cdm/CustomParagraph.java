
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomParagraph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomParagraph">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}LetterContent">
 *       &lt;sequence>
 *         &lt;element name="letter" type="{http://vbms.vba.va.gov/cdm}Letter" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="customParagraphText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomParagraph", propOrder = {
    "letter"
})
public class CustomParagraph
    extends LetterContent
{

    protected Letter letter;
    @XmlAttribute(name = "customParagraphText")
    protected String customParagraphText;

    /**
     * Gets the value of the letter property.
     * 
     * @return
     *     possible object is
     *     {@link Letter }
     *     
     */
    public Letter getLetter() {
        return letter;
    }

    /**
     * Sets the value of the letter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Letter }
     *     
     */
    public void setLetter(Letter value) {
        this.letter = value;
    }

    /**
     * Gets the value of the customParagraphText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomParagraphText() {
        return customParagraphText;
    }

    /**
     * Sets the value of the customParagraphText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomParagraphText(String value) {
        this.customParagraphText = value;
    }

}
