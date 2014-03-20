
package gov.va.vba.cmp.cmp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.va.vba.cmp.cmp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FaultDetailBean_QNAME = new QName("http://cmp.vba.va.gov/cmp", "faultDetailBean");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.va.vba.cmp.cmp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FormDocument }
     * 
     */
    public FormDocument createFormDocument() {
        return new FormDocument();
    }

    /**
     * Create an instance of {@link FaultDetailBean }
     * 
     */
    public FaultDetailBean createFaultDetailBean() {
        return new FaultDetailBean();
    }

    /**
     * Create an instance of {@link FormField }
     * 
     */
    public FormField createFormField() {
        return new FormField();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link TrackedItem }
     * 
     */
    public TrackedItem createTrackedItem() {
        return new TrackedItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultDetailBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cmp.vba.va.gov/cmp", name = "faultDetailBean")
    public JAXBElement<FaultDetailBean> createFaultDetailBean(FaultDetailBean value) {
        return new JAXBElement<FaultDetailBean>(_FaultDetailBean_QNAME, FaultDetailBean.class, null, value);
    }

}
