
package gov.va.vba.vbms.cdm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StdEnclsr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StdEnclsr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jetFormName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="copiesQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stdEnclsrId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StdEnclsr", propOrder = {
    "nm",
    "jetFormName",
    "copiesQty"
})
public class StdEnclsr {

    @XmlElement(required = true)
    protected String nm;
    @XmlElement(required = true)
    protected String jetFormName;
    @XmlElement(required = true)
    protected BigInteger copiesQty;
    @XmlAttribute(name = "stdEnclsrId")
    protected BigInteger stdEnclsrId;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the jetFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJetFormName() {
        return jetFormName;
    }

    /**
     * Sets the value of the jetFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJetFormName(String value) {
        this.jetFormName = value;
    }

    /**
     * Gets the value of the copiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCopiesQty() {
        return copiesQty;
    }

    /**
     * Sets the value of the copiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCopiesQty(BigInteger value) {
        this.copiesQty = value;
    }

    /**
     * Gets the value of the stdEnclsrId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStdEnclsrId() {
        return stdEnclsrId;
    }

    /**
     * Sets the value of the stdEnclsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStdEnclsrId(BigInteger value) {
        this.stdEnclsrId = value;
    }

}
