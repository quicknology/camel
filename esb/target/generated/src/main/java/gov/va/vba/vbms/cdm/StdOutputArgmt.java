
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StdOutputArgmt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StdOutputArgmt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keywrdTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="outputArgmtTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fillinType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPrompt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultTxt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stdOutputArgmtList" type="{http://vbms.vba.va.gov/cdm}StdOutputArgmtList" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stdOutputArgmtId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StdOutputArgmt", propOrder = {
    "keywrdTxt",
    "outputArgmtTypeCd",
    "fillinType",
    "userPrompt",
    "defaultTxt",
    "stdOutputArgmtList"
})
public class StdOutputArgmt {

    @XmlElement(required = true)
    protected String keywrdTxt;
    @XmlElement(required = true)
    protected String outputArgmtTypeCd;
    @XmlElement(required = true)
    protected String fillinType;
    @XmlElement(required = true)
    protected String userPrompt;
    @XmlElement(required = true)
    protected String defaultTxt;
    @XmlElement(required = true)
    protected List<StdOutputArgmtList> stdOutputArgmtList;
    @XmlAttribute(name = "stdOutputArgmtId")
    protected Long stdOutputArgmtId;

    /**
     * Gets the value of the keywrdTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywrdTxt() {
        return keywrdTxt;
    }

    /**
     * Sets the value of the keywrdTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywrdTxt(String value) {
        this.keywrdTxt = value;
    }

    /**
     * Gets the value of the outputArgmtTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputArgmtTypeCd() {
        return outputArgmtTypeCd;
    }

    /**
     * Sets the value of the outputArgmtTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputArgmtTypeCd(String value) {
        this.outputArgmtTypeCd = value;
    }

    /**
     * Gets the value of the fillinType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillinType() {
        return fillinType;
    }

    /**
     * Sets the value of the fillinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillinType(String value) {
        this.fillinType = value;
    }

    /**
     * Gets the value of the userPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPrompt() {
        return userPrompt;
    }

    /**
     * Sets the value of the userPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPrompt(String value) {
        this.userPrompt = value;
    }

    /**
     * Gets the value of the defaultTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTxt() {
        return defaultTxt;
    }

    /**
     * Sets the value of the defaultTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTxt(String value) {
        this.defaultTxt = value;
    }

    /**
     * Gets the value of the stdOutputArgmtList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stdOutputArgmtList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdOutputArgmtList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StdOutputArgmtList }
     * 
     * 
     */
    public List<StdOutputArgmtList> getStdOutputArgmtList() {
        if (stdOutputArgmtList == null) {
            stdOutputArgmtList = new ArrayList<StdOutputArgmtList>();
        }
        return this.stdOutputArgmtList;
    }

    /**
     * Gets the value of the stdOutputArgmtId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStdOutputArgmtId() {
        return stdOutputArgmtId;
    }

    /**
     * Sets the value of the stdOutputArgmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStdOutputArgmtId(Long value) {
        this.stdOutputArgmtId = value;
    }

}
