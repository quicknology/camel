
package gov.va.vba.vbms.external.edocumentservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.va.vba.vbms.external.edocumentservice package. 
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

    private final static QName _DataValidationFaultDetailBean_QNAME = new QName("http://vbms.vba.va.gov/external/eDocumentService/", "dataValidationFaultDetailBean");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.va.vba.vbms.external.edocumentservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FormFieldError }
     * 
     */
    public FormFieldError createFormFieldError() {
        return new FormFieldError();
    }

    /**
     * Create an instance of {@link ListDocumentsResponse }
     * 
     */
    public ListDocumentsResponse createListDocumentsResponse() {
        return new ListDocumentsResponse();
    }

    /**
     * Create an instance of {@link UploadDocument }
     * 
     */
    public UploadDocument createUploadDocument() {
        return new UploadDocument();
    }

    /**
     * Create an instance of {@link UploadFormDocument }
     * 
     */
    public UploadFormDocument createUploadFormDocument() {
        return new UploadFormDocument();
    }

    /**
     * Create an instance of {@link UploadDocumentWithAssociationsResponse }
     * 
     */
    public UploadDocumentWithAssociationsResponse createUploadDocumentWithAssociationsResponse() {
        return new UploadDocumentWithAssociationsResponse();
    }

    /**
     * Create an instance of {@link FetchDocumentResponse }
     * 
     */
    public FetchDocumentResponse createFetchDocumentResponse() {
        return new FetchDocumentResponse();
    }

    /**
     * Create an instance of {@link FetchDocument }
     * 
     */
    public FetchDocument createFetchDocument() {
        return new FetchDocument();
    }

    /**
     * Create an instance of {@link UploadLetterDocument }
     * 
     */
    public UploadLetterDocument createUploadLetterDocument() {
        return new UploadLetterDocument();
    }

    /**
     * Create an instance of {@link UploadLetterDocumentResponse }
     * 
     */
    public UploadLetterDocumentResponse createUploadLetterDocumentResponse() {
        return new UploadLetterDocumentResponse();
    }

    /**
     * Create an instance of {@link GetDocumentTypesResponse }
     * 
     */
    public GetDocumentTypesResponse createGetDocumentTypesResponse() {
        return new GetDocumentTypesResponse();
    }

    /**
     * Create an instance of {@link GetDocumentTypes }
     * 
     */
    public GetDocumentTypes createGetDocumentTypes() {
        return new GetDocumentTypes();
    }

    /**
     * Create an instance of {@link UploadDocumentWithAssociations }
     * 
     */
    public UploadDocumentWithAssociations createUploadDocumentWithAssociations() {
        return new UploadDocumentWithAssociations();
    }

    /**
     * Create an instance of {@link ConvertedDocumentResponse }
     * 
     */
    public ConvertedDocumentResponse createConvertedDocumentResponse() {
        return new ConvertedDocumentResponse();
    }

    /**
     * Create an instance of {@link GetFormFieldsForDocumentTypeResponse }
     * 
     */
    public GetFormFieldsForDocumentTypeResponse createGetFormFieldsForDocumentTypeResponse() {
        return new GetFormFieldsForDocumentTypeResponse();
    }

    /**
     * Create an instance of {@link ListDocuments }
     * 
     */
    public ListDocuments createListDocuments() {
        return new ListDocuments();
    }

    /**
     * Create an instance of {@link GetFormFieldsForDocumentType }
     * 
     */
    public GetFormFieldsForDocumentType createGetFormFieldsForDocumentType() {
        return new GetFormFieldsForDocumentType();
    }

    /**
     * Create an instance of {@link DataValidationFaultDetailBean }
     * 
     */
    public DataValidationFaultDetailBean createDataValidationFaultDetailBean() {
        return new DataValidationFaultDetailBean();
    }

    /**
     * Create an instance of {@link FetchDocumentById }
     * 
     */
    public FetchDocumentById createFetchDocumentById() {
        return new FetchDocumentById();
    }

    /**
     * Create an instance of {@link UploadFormDocumentResponse }
     * 
     */
    public UploadFormDocumentResponse createUploadFormDocumentResponse() {
        return new UploadFormDocumentResponse();
    }

    /**
     * Create an instance of {@link UploadDocumentResponse }
     * 
     */
    public UploadDocumentResponse createUploadDocumentResponse() {
        return new UploadDocumentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataValidationFaultDetailBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vbms.vba.va.gov/external/eDocumentService/", name = "dataValidationFaultDetailBean")
    public JAXBElement<DataValidationFaultDetailBean> createDataValidationFaultDetailBean(DataValidationFaultDetailBean value) {
        return new JAXBElement<DataValidationFaultDetailBean>(_DataValidationFaultDetailBean_QNAME, DataValidationFaultDetailBean.class, null, value);
    }

}
