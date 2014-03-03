
package gov.va.vba.vbms.cdm;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputArgument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputArgument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyWordText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="developmentActionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rowNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="columnNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valueText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contentionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outgoingDocumentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="participantOutgoingDocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputArgument", propOrder = {
    "keyWordText",
    "developmentActionId",
    "rowNumber",
    "columnNumber",
    "valueText",
    "contentionId",
    "outgoingDocumentId",
    "participantOutgoingDocumentTypeName"
})
public class OutputArgument {

    @XmlElement(required = true)
    protected String keyWordText;
    @XmlElement(required = true)
    protected String developmentActionId;
    @XmlElement(required = true)
    protected BigInteger rowNumber;
    protected int columnNumber;
    @XmlElement(required = true)
    protected String valueText;
    protected Integer contentionId;
    protected Integer outgoingDocumentId;
    @XmlElement(required = true)
    protected String participantOutgoingDocumentTypeName;

    /**
     * Gets the value of the keyWordText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyWordText() {
        return keyWordText;
    }

    /**
     * Sets the value of the keyWordText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyWordText(String value) {
        this.keyWordText = value;
    }

    /**
     * Gets the value of the developmentActionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentActionId() {
        return developmentActionId;
    }

    /**
     * Sets the value of the developmentActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentActionId(String value) {
        this.developmentActionId = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the columnNumber property.
     * 
     */
    public int getColumnNumber() {
        return columnNumber;
    }

    /**
     * Sets the value of the columnNumber property.
     * 
     */
    public void setColumnNumber(int value) {
        this.columnNumber = value;
    }

    /**
     * Gets the value of the valueText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueText() {
        return valueText;
    }

    /**
     * Sets the value of the valueText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueText(String value) {
        this.valueText = value;
    }

    /**
     * Gets the value of the contentionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContentionId() {
        return contentionId;
    }

    /**
     * Sets the value of the contentionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContentionId(Integer value) {
        this.contentionId = value;
    }

    /**
     * Gets the value of the outgoingDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutgoingDocumentId() {
        return outgoingDocumentId;
    }

    /**
     * Sets the value of the outgoingDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutgoingDocumentId(Integer value) {
        this.outgoingDocumentId = value;
    }

    /**
     * Gets the value of the participantOutgoingDocumentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantOutgoingDocumentTypeName() {
        return participantOutgoingDocumentTypeName;
    }

    /**
     * Sets the value of the participantOutgoingDocumentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantOutgoingDocumentTypeName(String value) {
        this.participantOutgoingDocumentTypeName = value;
    }

}
