
package gov.va.vba.vbms.cdm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardDevelopmentAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardDevelopmentAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardParagraph" type="{http://vbms.vba.va.gov/cdm}StandardParagraph" minOccurs="0"/>
 *         &lt;element name="stdActionDescpTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dvlpmtActionCategyTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pgmTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stdDvlpmtActionCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspnsDuratnQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="piesReqstCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ptcpntId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="lctnId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="fedAgencyInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stdDvlpmtActionId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="vbmscSupportedInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardDevelopmentAction", propOrder = {
    "standardParagraph",
    "stdActionDescpTxt",
    "dvlpmtActionCategyTypeCd",
    "pgmTypeCd",
    "stdDvlpmtActionCd",
    "suspnsDuratnQty",
    "piesReqstCd",
    "ptcpntId",
    "lctnId",
    "fedAgencyInd"
})
public class StandardDevelopmentAction {

    protected StandardParagraph standardParagraph;
    protected String stdActionDescpTxt;
    protected String dvlpmtActionCategyTypeCd;
    protected String pgmTypeCd;
    protected String stdDvlpmtActionCd;
    @XmlElement(required = true)
    protected BigInteger suspnsDuratnQty;
    @XmlElement(required = true)
    protected String piesReqstCd;
    @XmlElement(required = true)
    protected BigInteger ptcpntId;
    @XmlElement(required = true)
    protected BigInteger lctnId;
    @XmlElement(required = true)
    protected String fedAgencyInd;
    @XmlAttribute(name = "stdDvlpmtActionId", required = true)
    protected long stdDvlpmtActionId;
    @XmlAttribute(name = "vbmscSupportedInd", required = true)
    protected boolean vbmscSupportedInd;

    /**
     * Gets the value of the standardParagraph property.
     * 
     * @return
     *     possible object is
     *     {@link StandardParagraph }
     *     
     */
    public StandardParagraph getStandardParagraph() {
        return standardParagraph;
    }

    /**
     * Sets the value of the standardParagraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardParagraph }
     *     
     */
    public void setStandardParagraph(StandardParagraph value) {
        this.standardParagraph = value;
    }

    /**
     * Gets the value of the stdActionDescpTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdActionDescpTxt() {
        return stdActionDescpTxt;
    }

    /**
     * Sets the value of the stdActionDescpTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdActionDescpTxt(String value) {
        this.stdActionDescpTxt = value;
    }

    /**
     * Gets the value of the dvlpmtActionCategyTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvlpmtActionCategyTypeCd() {
        return dvlpmtActionCategyTypeCd;
    }

    /**
     * Sets the value of the dvlpmtActionCategyTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvlpmtActionCategyTypeCd(String value) {
        this.dvlpmtActionCategyTypeCd = value;
    }

    /**
     * Gets the value of the pgmTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgmTypeCd() {
        return pgmTypeCd;
    }

    /**
     * Sets the value of the pgmTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgmTypeCd(String value) {
        this.pgmTypeCd = value;
    }

    /**
     * Gets the value of the stdDvlpmtActionCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdDvlpmtActionCd() {
        return stdDvlpmtActionCd;
    }

    /**
     * Sets the value of the stdDvlpmtActionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdDvlpmtActionCd(String value) {
        this.stdDvlpmtActionCd = value;
    }

    /**
     * Gets the value of the suspnsDuratnQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSuspnsDuratnQty() {
        return suspnsDuratnQty;
    }

    /**
     * Sets the value of the suspnsDuratnQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSuspnsDuratnQty(BigInteger value) {
        this.suspnsDuratnQty = value;
    }

    /**
     * Gets the value of the piesReqstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiesReqstCd() {
        return piesReqstCd;
    }

    /**
     * Sets the value of the piesReqstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiesReqstCd(String value) {
        this.piesReqstCd = value;
    }

    /**
     * Gets the value of the ptcpntId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPtcpntId() {
        return ptcpntId;
    }

    /**
     * Sets the value of the ptcpntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPtcpntId(BigInteger value) {
        this.ptcpntId = value;
    }

    /**
     * Gets the value of the lctnId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLctnId() {
        return lctnId;
    }

    /**
     * Sets the value of the lctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLctnId(BigInteger value) {
        this.lctnId = value;
    }

    /**
     * Gets the value of the fedAgencyInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFedAgencyInd() {
        return fedAgencyInd;
    }

    /**
     * Sets the value of the fedAgencyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFedAgencyInd(String value) {
        this.fedAgencyInd = value;
    }

    /**
     * Gets the value of the stdDvlpmtActionId property.
     * 
     */
    public long getStdDvlpmtActionId() {
        return stdDvlpmtActionId;
    }

    /**
     * Sets the value of the stdDvlpmtActionId property.
     * 
     */
    public void setStdDvlpmtActionId(long value) {
        this.stdDvlpmtActionId = value;
    }

    /**
     * Gets the value of the vbmscSupportedInd property.
     * 
     */
    public boolean isVbmscSupportedInd() {
        return vbmscSupportedInd;
    }

    /**
     * Sets the value of the vbmscSupportedInd property.
     * 
     */
    public void setVbmscSupportedInd(boolean value) {
        this.vbmscSupportedInd = value;
    }

}
