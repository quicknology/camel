
package gov.va.vba.vbms.cdm;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StdPrgrph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StdPrgrph">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stdOutputArgmts" type="{http://vbms.vba.va.gov/cdm}StdOutputArgmt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stdPrgrphId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StdPrgrph", propOrder = {
    "stdOutputArgmts"
})
public class StdPrgrph {

    @XmlElement(nillable = true)
    protected List<StdOutputArgmt> stdOutputArgmts;
    @XmlAttribute(name = "stdPrgrphId", required = true)
    protected BigInteger stdPrgrphId;

    /**
     * Gets the value of the stdOutputArgmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stdOutputArgmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdOutputArgmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StdOutputArgmt }
     * 
     * 
     */
    public List<StdOutputArgmt> getStdOutputArgmts() {
        if (stdOutputArgmts == null) {
            stdOutputArgmts = new ArrayList<StdOutputArgmt>();
        }
        return this.stdOutputArgmts;
    }

    /**
     * Gets the value of the stdPrgrphId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStdPrgrphId() {
        return stdPrgrphId;
    }

    /**
     * Sets the value of the stdPrgrphId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStdPrgrphId(BigInteger value) {
        this.stdPrgrphId = value;
    }

}
