
package gov.va.vba.cmp.external.edocumentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.va.vba.cmp.external.edocumentservice package. 
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

    private final static QName _DataValidationFaultDetailBean_QNAME = new QName("http://cmp.vba.va.gov/external/eDocumentService/", "dataValidationFaultDetailBean");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.va.vba.cmp.external.edocumentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDocumentStatus }
     * 
     */
    public GetDocumentStatus createGetDocumentStatus() {
        return new GetDocumentStatus();
    }

    /**
     * Create an instance of {@link DataValidationFaultDetailBean }
     * 
     */
    public DataValidationFaultDetailBean createDataValidationFaultDetailBean() {
        return new DataValidationFaultDetailBean();
    }

    /**
     * Create an instance of {@link GetDocumentStatusResponse }
     * 
     */
    public GetDocumentStatusResponse createGetDocumentStatusResponse() {
        return new GetDocumentStatusResponse();
    }

    /**
     * Create an instance of {@link UploadFormDocumentResponse }
     * 
     */
    public UploadFormDocumentResponse createUploadFormDocumentResponse() {
        return new UploadFormDocumentResponse();
    }

    /**
     * Create an instance of {@link FormFieldError }
     * 
     */
    public FormFieldError createFormFieldError() {
        return new FormFieldError();
    }

    /**
     * Create an instance of {@link UploadFormDocument }
     * 
     */
    public UploadFormDocument createUploadFormDocument() {
        return new UploadFormDocument();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataValidationFaultDetailBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cmp.vba.va.gov/external/eDocumentService/", name = "dataValidationFaultDetailBean")
    public JAXBElement<DataValidationFaultDetailBean> createDataValidationFaultDetailBean(DataValidationFaultDetailBean value) {
        return new JAXBElement<DataValidationFaultDetailBean>(_DataValidationFaultDetailBean_QNAME, DataValidationFaultDetailBean.class, null, value);
    }

}
