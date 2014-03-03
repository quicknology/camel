
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedicalInd.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MedicalInd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aggravated"/>
 *     &lt;enumeration value="Direct"/>
 *     &lt;enumeration value="Secondary"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MedicalInd")
@XmlEnum
public enum MedicalInd {

    @XmlEnumValue("Aggravated")
    AGGRAVATED("Aggravated"),
    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("Secondary")
    SECONDARY("Secondary"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    MedicalInd(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MedicalInd fromValue(String v) {
        for (MedicalInd c: MedicalInd.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
