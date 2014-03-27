package com.sms.dcp;

import gov.va.vba.cmp.cmp.FormDocument;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;

import org.apache.cxf.binding.soap.SoapMessage;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class AlfrescoSoapProxyProcessor {
	Logger logger = Logger.getLogger(AlfrescoSoapProxyProcessor.class);

	public void process(Exchange exchange) throws SOAPException {
		// List obj = exchange.getIn().getBody(List.class);

		logger.info("VA SOAP Request operation name:"
				+ exchange.getIn().getHeader("operationName")
				+ ", message type:"
				+ exchange.getIn().getBody().getClass().getName());
		// exchange.getOut().setBody(exchange.getIn().getBody());
		// exchange.getOut().setHeader("operationName", "uploadFormDocument");
		// if(exchange.getIn().getBody() instanceof SoapMessage) {
		// logger.info("VA SOAP Request message type is SoapMessage");
		// }

		String operationName = (String) exchange.getIn().getHeader(
				"operationName");
		if (exchange.getIn().getBody() instanceof SOAPMessage) {
			SOAPMessage soapMessage = exchange.getIn().getBody(
					SOAPMessage.class);
			logger.info("VA SOAP body is SOAPMEssage");
			final SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart()
					.getEnvelope();
			Iterator<String> prefixes = soapEnvelope.getNamespacePrefixes();

			while (prefixes.hasNext()) {
				String prefix = prefixes.next();
				String nsURI = soapEnvelope.getNamespaceURI(prefix);
				logger.info("VA SOAP prefixes:" + prefixes.next() + ", nsURI:"
						+ nsURI);
			}
			
			soapEnvelope.removeNamespaceDeclaration("cmp");
			soapEnvelope.addNamespaceDeclaration("cmp",
					"http://vbms.vba.va.gov/cdm");
			logger.info("VA SOAP prefixes replace cmp");

			soapEnvelope.removeNamespaceDeclaration("edoc");
			soapEnvelope.addNamespaceDeclaration("edoc",
					"http://vbms.vba.va.gov/external/eDocumentService");
			logger.info("VA SOAP prefixes replace edoc");

			// Iterator<SOAPHeaderElement> iterator =
			// soapEnvelope.getHeader().examineAllHeaderElements();
			// while (iterator.hasNext()) {
			// final SOAPHeaderElement headerElement = iterator.next();
			// headerElement.getE
			// if
			// (CoordinationConstants.WSCOOR_ELEMENT_COORDINATION_CONTEXT_QNAME.equals(headerElement.getElementQName()))
			// {
			// // found it - clear the must understand flag, retrieve the value
			// and store an arjuna
			// // context in the message context
			// headerElement.setMustUnderstand(false);
			// final JAXBContext jaxbCtx = getJaxbContext();
			// final JAXBElement<CoordinationContextType> elt =
			// jaxbCtx.createUnmarshaller().unmarshal(headerElement,
			// CoordinationContextType.class);
			// final CoordinationContextType coordinationContext =
			// elt.getValue();
			// CoordinationContextManager.setContext(context,
			// coordinationContext);
			// }
		}
		exchange.getOut().setBody(exchange.getIn().getBody());

	};
	// if (null == operationName || operationName.length() == 0) {
	// logger.info("VA SOAP Request operation name is NULL. BAD!");
	// } else if (operationName.equals("uploadFormDocument")) {
	// for (Object currentObj : exchange.getIn().getBody(List.class)) {
	// if (currentObj instanceof FormDocument) {
	// logger.info("Got FormDocument");
	// FormDocument formDoc = (FormDocument)
	// exchange.getIn().getBody(List.class).get(0);
	//
	// gov.va.vba.vbms.cdm.FormDocument vaFormDoc = new
	// gov.va.vba.vbms.cdm.FormDocument();
	//
	// // set alfresco headers
	// if (formDoc.getVeteranFirstName() != null &&
	// formDoc.getVeteranFirstName().length() != 0) {
	// vaFormDoc.setVeteranFirstName(formDoc.getVeteranFirstName());
	// }
	// if (formDoc.getVeteranLastName() != null &&
	// formDoc.getVeteranLastName().length() != 0) {
	// vaFormDoc.setVeteranLastName(formDoc.getVeteranLastName());
	// }
	// if (formDoc.getVeteranMiddleName() != null &&
	// formDoc.getVeteranMiddleName().length() != 0) {
	// vaFormDoc.setVeteranMiddleName(formDoc.getVeteranMiddleName());
	// }
	// if (formDoc.getFilename() != null && formDoc.getFilename().length() != 0)
	// {
	// vaFormDoc.setFilename(formDoc.getFilename());
	// }
	//
	// // docMetadatas.put("sve:ssn", formDoc.??);
	// // docMetadatas.put("sve:scanDate", formDoc.getReceivedDt());??
	// if (formDoc.getFileNumber() != null && formDoc.getFileNumber().length()
	// != 0) {
	// vaFormDoc.setFileNumber(formDoc.getFileNumber());
	// }
	//
	// if (formDoc.getDocType() != null && formDoc.getDocType().length() != 0 )
	// {
	// vaFormDoc.setDocType(formDoc.getDocType());
	// }
	// // doesn't exist in WSDL, but it is in VAUpload code??
	// // formDoc.getDcsId());
	// // docMetadatas.put("sve:lastImageIndicator", formDoc.get);
	// if (formDoc.getReceivedDt() != null) {
	// vaFormDoc.setReceivedDt(formDoc.getReceivedDt());
	// }
	//
	// if (formDoc.getDocContent() != null) {
	// vaFormDoc.setDocContent(formDoc.getDocContent());
	// }
	// exchange.getOut().setBody(vaFormDoc);
	// // exchange.getOut().setHeader("operationName", operationName);
	// }
	// }
	// }
	//
	// }

}
