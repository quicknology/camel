
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuggestionSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuggestionSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="historical"/>
 *     &lt;enumeration value="bodypart"/>
 *     &lt;enumeration value="disability"/>
 *     &lt;enumeration value="manual"/>
 *     &lt;enumeration value="analyzedbodysystem"/>
 *     &lt;enumeration value="manualbodysystem"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SuggestionSource")
@XmlEnum
public enum SuggestionSource {

    @XmlEnumValue("historical")
    HISTORICAL("historical"),
    @XmlEnumValue("bodypart")
    BODYPART("bodypart"),
    @XmlEnumValue("disability")
    DISABILITY("disability"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("analyzedbodysystem")
    ANALYZEDBODYSYSTEM("analyzedbodysystem"),
    @XmlEnumValue("manualbodysystem")
    MANUALBODYSYSTEM("manualbodysystem");
    private final String value;

    SuggestionSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuggestionSource fromValue(String v) {
        for (SuggestionSource c: SuggestionSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
