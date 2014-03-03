
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentionCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentionCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ancillary"/>
 *     &lt;enumeration value="Pension"/>
 *     &lt;enumeration value="Service-Connected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentionCategory")
@XmlEnum
public enum ContentionCategory {

    @XmlEnumValue("Ancillary")
    ANCILLARY("Ancillary"),
    @XmlEnumValue("Pension")
    PENSION("Pension"),
    @XmlEnumValue("Service-Connected")
    SERVICE_CONNECTED("Service-Connected");
    private final String value;

    ContentionCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentionCategory fromValue(String v) {
        for (ContentionCategory c: ContentionCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
