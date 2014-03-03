
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkItemStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkItemStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkItemStatus")
@XmlEnum
public enum WorkItemStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    WorkItemStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkItemStatus fromValue(String v) {
        for (WorkItemStatus c: WorkItemStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
