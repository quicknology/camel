
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkItemPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkItemPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkItemPriority")
@XmlEnum
public enum WorkItemPriority {

    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Normal")
    NORMAL("Normal");
    private final String value;

    WorkItemPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkItemPriority fromValue(String v) {
        for (WorkItemPriority c: WorkItemPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
