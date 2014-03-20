
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Veteran complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Veteran">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}Person">
 *       &lt;sequence>
 *         &lt;element name="ServiceInfo" type="{http://vbms.vba.va.gov/cdm}ServiceInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="marriageInfo" type="{http://vbms.vba.va.gov/cdm}MarriageInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="combinedDegree" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="competencyRating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="competency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fileNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="survivingSpouseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="marriageStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Veteran", propOrder = {
    "serviceInfo",
    "marriageInfo"
})
public class Veteran
    extends Person
{

    @XmlElement(name = "ServiceInfo")
    protected List<ServiceInfo> serviceInfo;
    @XmlElement(nillable = true)
    protected List<MarriageInfo> marriageInfo;
    @XmlAttribute(name = "combinedDegree")
    protected String combinedDegree;
    @XmlAttribute(name = "competencyRating")
    protected String competencyRating;
    @XmlAttribute(name = "competency")
    protected String competency;
    @XmlAttribute(name = "fileNumber")
    protected String fileNumber;
    @XmlAttribute(name = "survivingSpouseInd")
    protected Boolean survivingSpouseInd;
    @XmlAttribute(name = "marriageStatus", required = true)
    protected String marriageStatus;

    /**
     * Gets the value of the serviceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceInfo }
     * 
     * 
     */
    public List<ServiceInfo> getServiceInfo() {
        if (serviceInfo == null) {
            serviceInfo = new ArrayList<ServiceInfo>();
        }
        return this.serviceInfo;
    }

    /**
     * Gets the value of the marriageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marriageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarriageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarriageInfo }
     * 
     * 
     */
    public List<MarriageInfo> getMarriageInfo() {
        if (marriageInfo == null) {
            marriageInfo = new ArrayList<MarriageInfo>();
        }
        return this.marriageInfo;
    }

    /**
     * Gets the value of the combinedDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinedDegree() {
        return combinedDegree;
    }

    /**
     * Sets the value of the combinedDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinedDegree(String value) {
        this.combinedDegree = value;
    }

    /**
     * Gets the value of the competencyRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetencyRating() {
        return competencyRating;
    }

    /**
     * Sets the value of the competencyRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetencyRating(String value) {
        this.competencyRating = value;
    }

    /**
     * Gets the value of the competency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetency() {
        return competency;
    }

    /**
     * Sets the value of the competency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetency(String value) {
        this.competency = value;
    }

    /**
     * Gets the value of the fileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * Sets the value of the fileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * Gets the value of the survivingSpouseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSurvivingSpouseInd() {
        return survivingSpouseInd;
    }

    /**
     * Sets the value of the survivingSpouseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSurvivingSpouseInd(Boolean value) {
        this.survivingSpouseInd = value;
    }

    /**
     * Gets the value of the marriageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageStatus() {
        return marriageStatus;
    }

    /**
     * Sets the value of the marriageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageStatus(String value) {
        this.marriageStatus = value;
    }

}
