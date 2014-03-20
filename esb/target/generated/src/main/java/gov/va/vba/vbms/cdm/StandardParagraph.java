
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardParagraph complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardParagraph">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardFillIns" type="{http://vbms.vba.va.gov/cdm}StandardFillIn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stdPrgrphId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardParagraph", propOrder = {
    "standardFillIns"
})
public class StandardParagraph {

    @XmlElement(nillable = true)
    protected List<StandardFillIn> standardFillIns;
    @XmlAttribute(name = "stdPrgrphId", required = true)
    protected long stdPrgrphId;

    /**
     * Gets the value of the standardFillIns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardFillIns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardFillIns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardFillIn }
     * 
     * 
     */
    public List<StandardFillIn> getStandardFillIns() {
        if (standardFillIns == null) {
            standardFillIns = new ArrayList<StandardFillIn>();
        }
        return this.standardFillIns;
    }

    /**
     * Gets the value of the stdPrgrphId property.
     * 
     */
    public long getStdPrgrphId() {
        return stdPrgrphId;
    }

    /**
     * Sets the value of the stdPrgrphId property.
     * 
     */
    public void setStdPrgrphId(long value) {
        this.stdPrgrphId = value;
    }

}
