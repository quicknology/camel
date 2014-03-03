
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PowerOfAttorney complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerOfAttorney">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Organization">
 *       &lt;sequence>
 *         &lt;element name="paperworkReceivedDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="establishedDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="revokedDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="poaFlag" type="{http://vbms.vba.va.gov/cdm}POAAccessibilityFlag"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Veteran_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOfAttorney", propOrder = {
    "paperworkReceivedDt",
    "establishedDt",
    "revokedDt",
    "poaFlag"
})
public class PowerOfAttorney
    extends Organization
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paperworkReceivedDt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar establishedDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar revokedDt;
    @XmlElement(required = true)
    protected POAAccessibilityFlag poaFlag;
    @XmlAttribute(name = "Veteran_Person_ID", required = true)
    protected long veteranPersonID;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the paperworkReceivedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaperworkReceivedDt() {
        return paperworkReceivedDt;
    }

    /**
     * Sets the value of the paperworkReceivedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaperworkReceivedDt(XMLGregorianCalendar value) {
        this.paperworkReceivedDt = value;
    }

    /**
     * Gets the value of the establishedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstablishedDt() {
        return establishedDt;
    }

    /**
     * Sets the value of the establishedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstablishedDt(XMLGregorianCalendar value) {
        this.establishedDt = value;
    }

    /**
     * Gets the value of the revokedDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevokedDt() {
        return revokedDt;
    }

    /**
     * Sets the value of the revokedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevokedDt(XMLGregorianCalendar value) {
        this.revokedDt = value;
    }

    /**
     * Gets the value of the poaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link POAAccessibilityFlag }
     *     
     */
    public POAAccessibilityFlag getPoaFlag() {
        return poaFlag;
    }

    /**
     * Sets the value of the poaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link POAAccessibilityFlag }
     *     
     */
    public void setPoaFlag(POAAccessibilityFlag value) {
        this.poaFlag = value;
    }

    /**
     * Gets the value of the veteranPersonID property.
     * 
     */
    public long getVeteranPersonID() {
        return veteranPersonID;
    }

    /**
     * Sets the value of the veteranPersonID property.
     * 
     */
    public void setVeteranPersonID(long value) {
        this.veteranPersonID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
