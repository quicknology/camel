
package gov.va.vba.vbms.external.edocumentservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormFieldErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormFieldErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MISSING_REQUIRED_FIELD"/>
 *     &lt;enumeration value="EXCEEDED_MAXIMUM_LENGTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormFieldErrorType")
@XmlEnum
public enum FormFieldErrorType {

    MISSING_REQUIRED_FIELD,
    EXCEEDED_MAXIMUM_LENGTH;

    public String value() {
        return name();
    }

    public static FormFieldErrorType fromValue(String v) {
        return valueOf(v);
    }

}
