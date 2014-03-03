
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevelopmentEnclosure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentEnclosure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outgoingDocumentStencId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="copiesQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="oneOcrncInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="enclosureId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentEnclosure", propOrder = {
    "documentId",
    "outgoingDocumentStencId",
    "copiesQuantity",
    "oneOcrncInd"
})
public class DevelopmentEnclosure {

    @XmlElement(required = true)
    protected String documentId;
    @XmlElement(required = true)
    protected String outgoingDocumentStencId;
    protected int copiesQuantity;
    @XmlElement(required = true)
    protected String oneOcrncInd;
    @XmlAttribute(name = "enclosureId")
    protected Long enclosureId;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the outgoingDocumentStencId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingDocumentStencId() {
        return outgoingDocumentStencId;
    }

    /**
     * Sets the value of the outgoingDocumentStencId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingDocumentStencId(String value) {
        this.outgoingDocumentStencId = value;
    }

    /**
     * Gets the value of the copiesQuantity property.
     * 
     */
    public int getCopiesQuantity() {
        return copiesQuantity;
    }

    /**
     * Sets the value of the copiesQuantity property.
     * 
     */
    public void setCopiesQuantity(int value) {
        this.copiesQuantity = value;
    }

    /**
     * Gets the value of the oneOcrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneOcrncInd() {
        return oneOcrncInd;
    }

    /**
     * Sets the value of the oneOcrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneOcrncInd(String value) {
        this.oneOcrncInd = value;
    }

    /**
     * Gets the value of the enclosureId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEnclosureId() {
        return enclosureId;
    }

    /**
     * Sets the value of the enclosureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEnclosureId(Long value) {
        this.enclosureId = value;
    }

}
