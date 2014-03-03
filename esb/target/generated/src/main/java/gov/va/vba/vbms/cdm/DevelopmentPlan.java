
package gov.va.vba.vbms.cdm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevelopmentPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevelopmentPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskList" type="{http://vbms.vba.va.gov/cdm}DevelopmentPlanTask" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevelopmentPlan", propOrder = {
    "taskList"
})
public class DevelopmentPlan {

    @XmlElement(nillable = true)
    protected List<DevelopmentPlanTask> taskList;

    /**
     * Gets the value of the taskList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taskList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DevelopmentPlanTask }
     * 
     * 
     */
    public List<DevelopmentPlanTask> getTaskList() {
        if (taskList == null) {
            taskList = new ArrayList<DevelopmentPlanTask>();
        }
        return this.taskList;
    }

}
