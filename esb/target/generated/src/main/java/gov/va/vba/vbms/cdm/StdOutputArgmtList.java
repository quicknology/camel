
package gov.va.vba.vbms.cdm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StdOutputArgmtList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StdOutputArgmtList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stdOutputArgmtId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="seqNbr" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="qlfyrTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StdOutputArgmtList", propOrder = {
    "stdOutputArgmtId",
    "seqNbr",
    "qlfyrTypeCd",
    "txt"
})
public class StdOutputArgmtList {

    @XmlElement(required = true)
    protected BigInteger stdOutputArgmtId;
    @XmlElement(required = true)
    protected BigInteger seqNbr;
    @XmlElement(required = true)
    protected String qlfyrTypeCd;
    @XmlElement(required = true)
    protected String txt;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the stdOutputArgmtId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStdOutputArgmtId() {
        return stdOutputArgmtId;
    }

    /**
     * Sets the value of the stdOutputArgmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStdOutputArgmtId(BigInteger value) {
        this.stdOutputArgmtId = value;
    }

    /**
     * Gets the value of the seqNbr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeqNbr() {
        return seqNbr;
    }

    /**
     * Sets the value of the seqNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeqNbr(BigInteger value) {
        this.seqNbr = value;
    }

    /**
     * Gets the value of the qlfyrTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQlfyrTypeCd() {
        return qlfyrTypeCd;
    }

    /**
     * Sets the value of the qlfyrTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQlfyrTypeCd(String value) {
        this.qlfyrTypeCd = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
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
