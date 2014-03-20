
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UnsolicitedEvidence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsolicitedEvidence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rcvdDt" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *       &lt;attribute name="descTxt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="evdnceTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Incoming_Document_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Participant_Person_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserProfile_UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsolicitedEvidence", propOrder = {
    "rcvdDt"
})
public class UnsolicitedEvidence {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rcvdDt;
    @XmlAttribute(name = "descTxt")
    protected String descTxt;
    @XmlAttribute(name = "evdnceTypeCd")
    protected String evdnceTypeCd;
    @XmlAttribute(name = "Incoming_Document_ID")
    protected String incomingDocumentID;
    @XmlAttribute(name = "Participant_Person_ID")
    protected String participantPersonID;
    @XmlAttribute(name = "UserProfile_UserName")
    protected String userProfileUserName;

    /**
     * Gets the value of the rcvdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRcvdDt() {
        return rcvdDt;
    }

    /**
     * Sets the value of the rcvdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRcvdDt(XMLGregorianCalendar value) {
        this.rcvdDt = value;
    }

    /**
     * Gets the value of the descTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTxt() {
        return descTxt;
    }

    /**
     * Sets the value of the descTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTxt(String value) {
        this.descTxt = value;
    }

    /**
     * Gets the value of the evdnceTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvdnceTypeCd() {
        return evdnceTypeCd;
    }

    /**
     * Sets the value of the evdnceTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvdnceTypeCd(String value) {
        this.evdnceTypeCd = value;
    }

    /**
     * Gets the value of the incomingDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingDocumentID() {
        return incomingDocumentID;
    }

    /**
     * Sets the value of the incomingDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingDocumentID(String value) {
        this.incomingDocumentID = value;
    }

    /**
     * Gets the value of the participantPersonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantPersonID() {
        return participantPersonID;
    }

    /**
     * Sets the value of the participantPersonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantPersonID(String value) {
        this.participantPersonID = value;
    }

    /**
     * Gets the value of the userProfileUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserProfileUserName() {
        return userProfileUserName;
    }

    /**
     * Sets the value of the userProfileUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserProfileUserName(String value) {
        this.userProfileUserName = value;
    }

}
