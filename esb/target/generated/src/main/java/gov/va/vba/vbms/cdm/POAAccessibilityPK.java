
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for POAAccessibilityPK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POAAccessibilityPK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="veteranID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="poaID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POAAccessibilityPK")
public class POAAccessibilityPK {

    @XmlAttribute(name = "veteranID", required = true)
    protected long veteranID;
    @XmlAttribute(name = "poaID", required = true)
    protected long poaID;

    /**
     * Gets the value of the veteranID property.
     * 
     */
    public long getVeteranID() {
        return veteranID;
    }

    /**
     * Sets the value of the veteranID property.
     * 
     */
    public void setVeteranID(long value) {
        this.veteranID = value;
    }

    /**
     * Gets the value of the poaID property.
     * 
     */
    public long getPoaID() {
        return poaID;
    }

    /**
     * Sets the value of the poaID property.
     * 
     */
    public void setPoaID(long value) {
        this.poaID = value;
    }

}
