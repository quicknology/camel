
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaimStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Ready for Decision"/>
 *     &lt;enumeration value="Ready to Work"/>
 *     &lt;enumeration value="Rating Incomplete"/>
 *     &lt;enumeration value="Rating Decision Complete"/>
 *     &lt;enumeration value="Secondary Ready for Decision"/>
 *     &lt;enumeration value="Pending Authorization"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Rating Correction"/>
 *     &lt;enumeration value="Pending Concur"/>
 *     &lt;enumeration value="Self Returned"/>
 *     &lt;enumeration value="Returned by Other User"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaimStatus")
@XmlEnum
public enum ClaimStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Ready for Decision")
    READY_FOR_DECISION("Ready for Decision"),
    @XmlEnumValue("Ready to Work")
    READY_TO_WORK("Ready to Work"),
    @XmlEnumValue("Rating Incomplete")
    RATING_INCOMPLETE("Rating Incomplete"),
    @XmlEnumValue("Rating Decision Complete")
    RATING_DECISION_COMPLETE("Rating Decision Complete"),
    @XmlEnumValue("Secondary Ready for Decision")
    SECONDARY_READY_FOR_DECISION("Secondary Ready for Decision"),
    @XmlEnumValue("Pending Authorization")
    PENDING_AUTHORIZATION("Pending Authorization"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Rating Correction")
    RATING_CORRECTION("Rating Correction"),
    @XmlEnumValue("Pending Concur")
    PENDING_CONCUR("Pending Concur"),
    @XmlEnumValue("Self Returned")
    SELF_RETURNED("Self Returned"),
    @XmlEnumValue("Returned by Other User")
    RETURNED_BY_OTHER_USER("Returned by Other User");
    private final String value;

    ClaimStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaimStatus fromValue(String v) {
        for (ClaimStatus c: ClaimStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
