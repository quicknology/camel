
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentAssociationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentAssociationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLAIM"/>
 *     &lt;enumeration value="CONTENTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentAssociationType")
@XmlEnum
public enum DocumentAssociationType {

    CLAIM,
    CONTENTION;

    public String value() {
        return name();
    }

    public static DocumentAssociationType fromValue(String v) {
        return valueOf(v);
    }

}
