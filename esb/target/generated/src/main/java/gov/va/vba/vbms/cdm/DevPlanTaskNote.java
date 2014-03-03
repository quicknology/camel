
package gov.va.vba.vbms.cdm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevPlanTaskNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevPlanTaskNote">
 *   &lt;complexContent>
 *     &lt;extension base="{http://vbms.vba.va.gov/cdm}VbmsNote">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="devPlanTask_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevPlanTaskNote")
public class DevPlanTaskNote
    extends VbmsNote
{

    @XmlAttribute(name = "devPlanTask_ID", required = true)
    protected long devPlanTaskID;

    /**
     * Gets the value of the devPlanTaskID property.
     * 
     */
    public long getDevPlanTaskID() {
        return devPlanTaskID;
    }

    /**
     * Sets the value of the devPlanTaskID property.
     * 
     */
    public void setDevPlanTaskID(long value) {
        this.devPlanTaskID = value;
    }

}
