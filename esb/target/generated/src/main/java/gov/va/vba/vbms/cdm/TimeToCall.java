
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeToCall.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeToCall">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Day Time"/>
 *     &lt;enumeration value="Night Time"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeToCall")
@XmlEnum
public enum TimeToCall {

    @XmlEnumValue("Day Time")
    DAY_TIME("Day Time"),
    @XmlEnumValue("Night Time")
    NIGHT_TIME("Night Time");
    private final String value;

    TimeToCall(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeToCall fromValue(String v) {
        for (TimeToCall c: TimeToCall.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
