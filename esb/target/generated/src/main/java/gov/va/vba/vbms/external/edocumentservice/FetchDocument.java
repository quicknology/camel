
package gov.va.vba.vbms.external.edocumentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.va.vba.vbms.cdm.Document;
import gov.va.vba.vbms.cdm.Veteran;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="veteran" type="{http://vbms.vba.va.gov/cdm}Veteran"/>
 *         &lt;element name="query" type="{http://vbms.vba.va.gov/cdm}Document"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "veteran",
    "query"
})
@XmlRootElement(name = "fetchDocument")
public class FetchDocument {

    @XmlElement(required = true)
    protected Veteran veteran;
    @XmlElement(required = true)
    protected Document query;

    /**
     * Gets the value of the veteran property.
     * 
     * @return
     *     possible object is
     *     {@link Veteran }
     *     
     */
    public Veteran getVeteran() {
        return veteran;
    }

    /**
     * Sets the value of the veteran property.
     * 
     * @param value
     *     allowed object is
     *     {@link Veteran }
     *     
     */
    public void setVeteran(Veteran value) {
        this.veteran = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Document }
     *     
     */
    public Document getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document }
     *     
     */
    public void setQuery(Document value) {
        this.query = value;
    }

}
