
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimTypeEndProductInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimTypeEndProductInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="benefitTypeId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="payeeCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="benefitTypeCd" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shareCommandTypeCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serviceTypeCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimTypeEndProductInput")
public class ClaimTypeEndProductInput {

    @XmlAttribute(name = "benefitTypeId")
    protected String benefitTypeId;
    @XmlAttribute(name = "payeeCode", required = true)
    protected String payeeCode;
    @XmlAttribute(name = "benefitTypeCd", required = true)
    protected String benefitTypeCd;
    @XmlAttribute(name = "shareCommandTypeCode", required = true)
    protected String shareCommandTypeCode;
    @XmlAttribute(name = "serviceTypeCode", required = true)
    protected String serviceTypeCode;

    /**
     * Gets the value of the benefitTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitTypeId() {
        return benefitTypeId;
    }

    /**
     * Sets the value of the benefitTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitTypeId(String value) {
        this.benefitTypeId = value;
    }

    /**
     * Gets the value of the payeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeCode() {
        return payeeCode;
    }

    /**
     * Sets the value of the payeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeCode(String value) {
        this.payeeCode = value;
    }

    /**
     * Gets the value of the benefitTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitTypeCd() {
        return benefitTypeCd;
    }

    /**
     * Sets the value of the benefitTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitTypeCd(String value) {
        this.benefitTypeCd = value;
    }

    /**
     * Gets the value of the shareCommandTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareCommandTypeCode() {
        return shareCommandTypeCode;
    }

    /**
     * Sets the value of the shareCommandTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareCommandTypeCode(String value) {
        this.shareCommandTypeCode = value;
    }

    /**
     * Gets the value of the serviceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    /**
     * Sets the value of the serviceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeCode(String value) {
        this.serviceTypeCode = value;
    }

}
