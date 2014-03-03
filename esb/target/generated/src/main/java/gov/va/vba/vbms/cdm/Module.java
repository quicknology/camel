
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Module.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Module">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Claim"/>
 *     &lt;enumeration value="Search"/>
 *     &lt;enumeration value="EFolder"/>
 *     &lt;enumeration value="EFolderDoc"/>
 *     &lt;enumeration value="WorkQueue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Module")
@XmlEnum
public enum Module {

    @XmlEnumValue("Claim")
    CLAIM("Claim"),
    @XmlEnumValue("Search")
    SEARCH("Search"),
    @XmlEnumValue("EFolder")
    E_FOLDER("EFolder"),
    @XmlEnumValue("EFolderDoc")
    E_FOLDER_DOC("EFolderDoc"),
    @XmlEnumValue("WorkQueue")
    WORK_QUEUE("WorkQueue");
    private final String value;

    Module(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Module fromValue(String v) {
        for (Module c: Module.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
