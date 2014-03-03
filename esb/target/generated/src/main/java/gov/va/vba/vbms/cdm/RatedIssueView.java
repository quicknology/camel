
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatedIssueView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatedIssueView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ratedIssue" type="{http://vbms.vba.va.gov/cdm}RatedIssue" minOccurs="0"/>
 *         &lt;element name="linkStatus" type="{http://vbms.vba.va.gov/cdm}LinkStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatedIssueView", propOrder = {
    "ratedIssue",
    "linkStatus"
})
public class RatedIssueView {

    protected RatedIssue ratedIssue;
    protected LinkStatus linkStatus;

    /**
     * Gets the value of the ratedIssue property.
     * 
     * @return
     *     possible object is
     *     {@link RatedIssue }
     *     
     */
    public RatedIssue getRatedIssue() {
        return ratedIssue;
    }

    /**
     * Sets the value of the ratedIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatedIssue }
     *     
     */
    public void setRatedIssue(RatedIssue value) {
        this.ratedIssue = value;
    }

    /**
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LinkStatus }
     *     
     */
    public LinkStatus getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkStatus }
     *     
     */
    public void setLinkStatus(LinkStatus value) {
        this.linkStatus = value;
    }

}
