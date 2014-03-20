package gov.va.vba.cmp.external.edocumentservicealfresco;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-14T00:08:28.248-04:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://cmp.vba.va.gov/external/eDocumentServiceAlfresco/", name = "eDocumentServiceAlfresco")
@XmlSeeAlso({ObjectFactory.class, gov.va.vba.cmp.cmp.ObjectFactory.class})
public interface EDocumentServiceAlfresco {

    @WebResult(name = "message", targetNamespace = "http://cmp.vba.va.gov/external/eDocumentServiceAlfresco/")
    @RequestWrapper(localName = "uploadFormDocument", targetNamespace = "http://cmp.vba.va.gov/external/eDocumentServiceAlfresco/", className = "gov.va.vba.cmp.external.edocumentservicealfresco.UploadFormDocument")
    @WebMethod(action = "http://cmp.vba.va.gov/external/eDocumentServiceAlfresco/uploadFormDocument")
    @ResponseWrapper(localName = "uploadFormDocumentResponse", targetNamespace = "http://cmp.vba.va.gov/external/eDocumentServiceAlfresco/", className = "gov.va.vba.cmp.external.edocumentservicealfresco.UploadFormDocumentResponse")
    public java.lang.String uploadFormDocument(
        @WebParam(name = "formDocument", targetNamespace = "http://cmp.vba.va.gov/external/eDocumentServiceAlfresco/")
        gov.va.vba.cmp.cmp.FormDocument formDocument
    ) throws DocumentServiceException, DocumentDataValidationException;
}
