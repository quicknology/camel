
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Participant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Participant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Person">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="externalPartID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Participant")
public class Participant
    extends Person
{

    @XmlAttribute(name = "externalPartID")
    protected String externalPartID;

    /**
     * Gets the value of the externalPartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPartID() {
        return externalPartID;
    }

    /**
     * Sets the value of the externalPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPartID(String value) {
        this.externalPartID = value;
    }

}
