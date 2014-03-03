
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionalArea.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionalArea">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CENTRAL"/>
 *     &lt;enumeration value="EASTERN"/>
 *     &lt;enumeration value="SOUTHERN"/>
 *     &lt;enumeration value="WESTERN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegionalArea")
@XmlEnum
public enum RegionalArea {

    CENTRAL,
    EASTERN,
    SOUTHERN,
    WESTERN;

    public String value() {
        return name();
    }

    public static RegionalArea fromValue(String v) {
        return valueOf(v);
    }

}
