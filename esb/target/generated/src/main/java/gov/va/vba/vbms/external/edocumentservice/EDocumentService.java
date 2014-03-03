package gov.va.vba.vbms.external.edocumentservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-02T23:26:43.596-05:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", name = "eDocumentService")
@XmlSeeAlso({gov.va.vba.vbms.cdm.ObjectFactory.class, ObjectFactory.class})
public interface EDocumentService {

    @WebResult(name = "message", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
    @RequestWrapper(localName = "uploadFormDocument", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.UploadFormDocument")
    @WebMethod(action = "http://vbms.vba.va.gov/external/eDocumentService/uploadFormDocument")
    @ResponseWrapper(localName = "uploadFormDocumentResponse", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.UploadFormDocumentResponse")
    public java.lang.String uploadFormDocument(
        @WebParam(name = "formDocument", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
        gov.va.vba.vbms.cdm.FormDocument formDocument
    ) throws VbmsServiceException, VbmsDataValidationException;

    @WebResult(name = "message", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
    @RequestWrapper(localName = "uploadDocument", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.UploadDocument")
    @WebMethod(action = "http://vbms.vba.va.gov/external/eDocumentService/uploadDocument")
    @ResponseWrapper(localName = "uploadDocumentResponse", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.UploadDocumentResponse")
    public java.lang.String uploadDocument(
        @WebParam(name = "veteran", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
        gov.va.vba.vbms.cdm.Veteran veteran,
        @WebParam(name = "document", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
        gov.va.vba.vbms.cdm.Document document
    ) throws VbmsServiceException;

    @WebResult(name = "result", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
    @RequestWrapper(localName = "fetchDocument", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.FetchDocument")
    @WebMethod(action = "http://vbms.vba.va.gov/external/eDocumentService/fetchDocument")
    @ResponseWrapper(localName = "fetchDocumentResponse", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.FetchDocumentResponse")
    public gov.va.vba.vbms.cdm.Document fetchDocument(
        @WebParam(name = "veteran", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
        gov.va.vba.vbms.cdm.Veteran veteran,
        @WebParam(name = "query", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
        gov.va.vba.vbms.cdm.Document query
    ) throws VbmsServiceException;

    @WebResult(name = "result", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
    @RequestWrapper(localName = "getDocumentTypes", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.GetDocumentTypes")
    @WebMethod(action = "http://vbms.vba.va.gov/external/eDocumentService/getDocumentTypes")
    @ResponseWrapper(localName = "getDocumentTypesResponse", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.GetDocumentTypesResponse")
    public java.util.List<gov.va.vba.vbms.cdm.DocumentType> getDocumentTypes();

    @WebResult(name = "message", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
    @RequestWrapper(localName = "uploadLetterDocument", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.UploadLetterDocument")
    @WebMethod(action = "http://vbms.vba.va.gov/external/eDocumentService/uploadLetterDocument")
    @ResponseWrapper(localName = "uploadLetterDocumentResponse", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.UploadLetterDocumentResponse")
    public java.lang.String uploadLetterDocument(
        @WebParam(name = "document", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
        gov.va.vba.vbms.cdm.LetterDocument document
    ) throws VbmsServiceException;

    @WebResult(name = "result", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
    @RequestWrapper(localName = "getFormFieldsForDocumentType", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.GetFormFieldsForDocumentType")
    @WebMethod(action = "http://vbms.vba.va.gov/external/eDocumentService/getFormFieldsForDocumentType")
    @ResponseWrapper(localName = "getFormFieldsForDocumentTypeResponse", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/", className = "gov.va.vba.vbms.external.edocumentservice.GetFormFieldsForDocumentTypeResponse")
    public java.util.List<gov.va.vba.vbms.cdm.FormField> getFormFieldsForDocumentType(
        @WebParam(name = "documentType", targetNamespace = "http://vbms.vba.va.gov/external/eDocumentService/")
        java.lang.String documentType
    ) throws VbmsServiceException;
}
