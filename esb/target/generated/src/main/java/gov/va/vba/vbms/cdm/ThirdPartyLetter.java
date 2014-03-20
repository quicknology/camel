
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyLetter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyLetter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}ClaimLetter">
 *       &lt;sequence>
 *         &lt;element name="contentions" type="{http://vbms.vba.va.gov/cdm}LetterContention" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="developmentActionParagraphs" type="{http://vbms.vba.va.gov/cdm}DevelopmentActionParagraph" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customParagraphs" type="{http://vbms.vba.va.gov/cdm}CustomParagraph" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="providerAddress" type="{http://vbms.vba.va.gov/cdm}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="providerName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyLetter", propOrder = {
    "contentions",
    "developmentActionParagraphs",
    "customParagraphs",
    "providerAddress"
})
public class ThirdPartyLetter
    extends ClaimLetter
{

    @XmlElement(nillable = true)
    protected List<LetterContention> contentions;
    @XmlElement(nillable = true)
    protected List<DevelopmentActionParagraph> developmentActionParagraphs;
    @XmlElement(nillable = true)
    protected List<CustomParagraph> customParagraphs;
    protected Address providerAddress;
    @XmlAttribute(name = "providerName")
    protected String providerName;

    /**
     * Gets the value of the contentions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LetterContention }
     * 
     * 
     */
    public List<LetterContention> getContentions() {
        if (contentions == null) {
            contentions = new ArrayList<LetterContention>();
        }
        return this.contentions;
    }

    /**
     * Gets the value of the developmentActionParagraphs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the developmentActionParagraphs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevelopmentActionParagraphs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevelopmentActionParagraph }
     * 
     * 
     */
    public List<DevelopmentActionParagraph> getDevelopmentActionParagraphs() {
        if (developmentActionParagraphs == null) {
            developmentActionParagraphs = new ArrayList<DevelopmentActionParagraph>();
        }
        return this.developmentActionParagraphs;
    }

    /**
     * Gets the value of the customParagraphs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customParagraphs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomParagraphs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomParagraph }
     * 
     * 
     */
    public List<CustomParagraph> getCustomParagraphs() {
        if (customParagraphs == null) {
            customParagraphs = new ArrayList<CustomParagraph>();
        }
        return this.customParagraphs;
    }

    /**
     * Gets the value of the providerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getProviderAddress() {
        return providerAddress;
    }

    /**
     * Sets the value of the providerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setProviderAddress(Address value) {
        this.providerAddress = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

}
