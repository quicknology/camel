
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentionAnalysisResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentionAnalysisResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bodySystems" type="{http://vbms.vba.va.gov/cdm}BodySystem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dbqs" type="{http://vbms.vba.va.gov/cdm}DBQView" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentionAnalysisResult", propOrder = {
    "bodySystems",
    "dbqs"
})
public class ContentionAnalysisResult {

    @XmlElement(nillable = true)
    protected List<BodySystem> bodySystems;
    @XmlElement(nillable = true)
    protected List<DBQView> dbqs;

    /**
     * Gets the value of the bodySystems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodySystems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodySystems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BodySystem }
     * 
     * 
     */
    public List<BodySystem> getBodySystems() {
        if (bodySystems == null) {
            bodySystems = new ArrayList<BodySystem>();
        }
        return this.bodySystems;
    }

    /**
     * Gets the value of the dbqs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbqs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDbqs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DBQView }
     * 
     * 
     */
    public List<DBQView> getDbqs() {
        if (dbqs == null) {
            dbqs = new ArrayList<DBQView>();
        }
        return this.dbqs;
    }

}
