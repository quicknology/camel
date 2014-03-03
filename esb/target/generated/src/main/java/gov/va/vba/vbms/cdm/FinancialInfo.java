
package gov.va.vba.vbms.cdm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FinancialInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastUpdateDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="PersonalInfo_Person_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="disabilitySeverancePay" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="lumpReadjPay" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="netWorthAmnt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="substananceAmnt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="taxAbatement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taxID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInfo", propOrder = {
    "createDt",
    "lastUpdateDt"
})
public class FinancialInfo {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDt;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdateDt;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "PersonalInfo_Person_ID", required = true)
    protected long personalInfoPersonID;
    @XmlAttribute(name = "disabilitySeverancePay", required = true)
    protected BigDecimal disabilitySeverancePay;
    @XmlAttribute(name = "lumpReadjPay", required = true)
    protected BigDecimal lumpReadjPay;
    @XmlAttribute(name = "netWorthAmnt", required = true)
    protected BigDecimal netWorthAmnt;
    @XmlAttribute(name = "substananceAmnt", required = true)
    protected BigDecimal substananceAmnt;
    @XmlAttribute(name = "taxAbatement")
    protected String taxAbatement;
    @XmlAttribute(name = "taxID", required = true)
    protected String taxID;

    /**
     * Gets the value of the createDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDt() {
        return createDt;
    }

    /**
     * Sets the value of the createDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDt(XMLGregorianCalendar value) {
        this.createDt = value;
    }

    /**
     * Gets the value of the lastUpdateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDt() {
        return lastUpdateDt;
    }

    /**
     * Sets the value of the lastUpdateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDt(XMLGregorianCalendar value) {
        this.lastUpdateDt = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the personalInfoPersonID property.
     * 
     */
    public long getPersonalInfoPersonID() {
        return personalInfoPersonID;
    }

    /**
     * Sets the value of the personalInfoPersonID property.
     * 
     */
    public void setPersonalInfoPersonID(long value) {
        this.personalInfoPersonID = value;
    }

    /**
     * Gets the value of the disabilitySeverancePay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisabilitySeverancePay() {
        return disabilitySeverancePay;
    }

    /**
     * Sets the value of the disabilitySeverancePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisabilitySeverancePay(BigDecimal value) {
        this.disabilitySeverancePay = value;
    }

    /**
     * Gets the value of the lumpReadjPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLumpReadjPay() {
        return lumpReadjPay;
    }

    /**
     * Sets the value of the lumpReadjPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLumpReadjPay(BigDecimal value) {
        this.lumpReadjPay = value;
    }

    /**
     * Gets the value of the netWorthAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWorthAmnt() {
        return netWorthAmnt;
    }

    /**
     * Sets the value of the netWorthAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWorthAmnt(BigDecimal value) {
        this.netWorthAmnt = value;
    }

    /**
     * Gets the value of the substananceAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubstananceAmnt() {
        return substananceAmnt;
    }

    /**
     * Sets the value of the substananceAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubstananceAmnt(BigDecimal value) {
        this.substananceAmnt = value;
    }

    /**
     * Gets the value of the taxAbatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAbatement() {
        return taxAbatement;
    }

    /**
     * Sets the value of the taxAbatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAbatement(String value) {
        this.taxAbatement = value;
    }

    /**
     * Gets the value of the taxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

}
