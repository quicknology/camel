
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Verified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinkStatus")
@XmlEnum
public enum LinkStatus {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Verified")
    VERIFIED("Verified");
    private final String value;

    LinkStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinkStatus fromValue(String v) {
        for (LinkStatus c: LinkStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
