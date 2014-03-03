
package gov.va.vba.vbms.cdm;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Dependent">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="relationshipType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="netWorthAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="incomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="expenseAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="financialDependencyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="expenseIncomeGapCoverageSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="coLivingParentDependentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="coLivingVeteranDependentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parent")
public class Parent
    extends Dependent
{

    @XmlAttribute(name = "relationshipType")
    protected String relationshipType;
    @XmlAttribute(name = "netWorthAmt")
    protected BigDecimal netWorthAmt;
    @XmlAttribute(name = "incomeAmt")
    protected BigDecimal incomeAmt;
    @XmlAttribute(name = "expenseAmt")
    protected BigDecimal expenseAmt;
    @XmlAttribute(name = "financialDependencyInd")
    protected Boolean financialDependencyInd;
    @XmlAttribute(name = "expenseIncomeGapCoverageSource")
    protected String expenseIncomeGapCoverageSource;
    @XmlAttribute(name = "coLivingParentDependentFlag")
    protected Boolean coLivingParentDependentFlag;
    @XmlAttribute(name = "coLivingVeteranDependentFlag")
    protected Boolean coLivingVeteranDependentFlag;

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the netWorthAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWorthAmt() {
        return netWorthAmt;
    }

    /**
     * Sets the value of the netWorthAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWorthAmt(BigDecimal value) {
        this.netWorthAmt = value;
    }

    /**
     * Gets the value of the incomeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncomeAmt() {
        return incomeAmt;
    }

    /**
     * Sets the value of the incomeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncomeAmt(BigDecimal value) {
        this.incomeAmt = value;
    }

    /**
     * Gets the value of the expenseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpenseAmt() {
        return expenseAmt;
    }

    /**
     * Sets the value of the expenseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpenseAmt(BigDecimal value) {
        this.expenseAmt = value;
    }

    /**
     * Gets the value of the financialDependencyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialDependencyInd() {
        return financialDependencyInd;
    }

    /**
     * Sets the value of the financialDependencyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialDependencyInd(Boolean value) {
        this.financialDependencyInd = value;
    }

    /**
     * Gets the value of the expenseIncomeGapCoverageSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpenseIncomeGapCoverageSource() {
        return expenseIncomeGapCoverageSource;
    }

    /**
     * Sets the value of the expenseIncomeGapCoverageSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpenseIncomeGapCoverageSource(String value) {
        this.expenseIncomeGapCoverageSource = value;
    }

    /**
     * Gets the value of the coLivingParentDependentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoLivingParentDependentFlag() {
        return coLivingParentDependentFlag;
    }

    /**
     * Sets the value of the coLivingParentDependentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoLivingParentDependentFlag(Boolean value) {
        this.coLivingParentDependentFlag = value;
    }

    /**
     * Gets the value of the coLivingVeteranDependentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoLivingVeteranDependentFlag() {
        return coLivingVeteranDependentFlag;
    }

    /**
     * Sets the value of the coLivingVeteranDependentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoLivingVeteranDependentFlag(Boolean value) {
        this.coLivingVeteranDependentFlag = value;
    }

}
