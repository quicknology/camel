
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevelopmentActionParagraph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentActionParagraph">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}LetterContent">
 *       &lt;sequence>
 *         &lt;element name="letter" type="{http://vbms.vba.va.gov/cdm}Letter" minOccurs="0"/>
 *         &lt;element name="developmentPlanTaskActivityAction" type="{http://vbms.vba.va.gov/cdm}DevelopmentPlanTaskActivityAction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentActionParagraph", propOrder = {
    "letter",
    "developmentPlanTaskActivityAction"
})
public class DevelopmentActionParagraph
    extends LetterContent
{

    protected Letter letter;
    @XmlElement(required = true)
    protected DevelopmentPlanTaskActivityAction developmentPlanTaskActivityAction;

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
     * Gets the value of the developmentPlanTaskActivityAction property.
     * 
     * @return
     *     possible object is
     *     {@link DevelopmentPlanTaskActivityAction }
     *     
     */
    public DevelopmentPlanTaskActivityAction getDevelopmentPlanTaskActivityAction() {
        return developmentPlanTaskActivityAction;
    }

    /**
     * Sets the value of the developmentPlanTaskActivityAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevelopmentPlanTaskActivityAction }
     *     
     */
    public void setDevelopmentPlanTaskActivityAction(DevelopmentPlanTaskActivityAction value) {
        this.developmentPlanTaskActivityAction = value;
    }

}
