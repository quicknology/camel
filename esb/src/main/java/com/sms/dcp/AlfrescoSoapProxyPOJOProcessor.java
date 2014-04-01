package com.sms.dcp;

import gov.va.vba.cmp.cmp.FormDocument;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class AlfrescoSoapProxyPOJOProcessor {
	Logger logger = Logger.getLogger(AlfrescoSoapProxyProcessor.class);

	public void process(Exchange exchange) {
		// List obj = exchange.getIn().getBody(List.class);

		logger.info("VA SOAP Request operation name:"
				+ exchange.getIn().getHeader("operationName")
				+ ", message type:"
				+ exchange.getIn().getBody().getClass().getName());

		String operationName = (String) exchange.getIn().getHeader(
				"operationName");

		if (null == operationName || operationName.length() == 0) {
			logger.info("VA SOAP Request operation name is NULL. BAD!");
		} else if (operationName.equals("uploadFormDocument")) {
			for (Object currentObj : exchange.getIn().getBody(List.class)) {
				if (currentObj instanceof FormDocument) {
					logger.info("Got FormDocument");
					FormDocument formDoc = (FormDocument) currentObj;

					gov.va.vba.vbms.cdm.FormDocument vaFormDoc = new gov.va.vba.vbms.cdm.FormDocument();

					// set alfresco headers
					if (formDoc.getVeteranFirstName() != null
							&& formDoc.getVeteranFirstName().length() != 0) {
						vaFormDoc.setVeteranFirstName(formDoc
								.getVeteranFirstName());
					}
					if (formDoc.getVeteranLastName() != null
							&& formDoc.getVeteranLastName().length() != 0) {
						vaFormDoc.setVeteranLastName(formDoc
								.getVeteranLastName());
					}
					if (formDoc.getVeteranMiddleName() != null
							&& formDoc.getVeteranMiddleName().length() != 0) {
						vaFormDoc.setVeteranMiddleName(formDoc
								.getVeteranMiddleName());
					}
					if (formDoc.getFilename() != null
							&& formDoc.getFilename().length() != 0) {
						vaFormDoc.setFilename(formDoc.getFilename());
					}

					// docMetadatas.put("sve:ssn", formDoc.??);
					// docMetadatas.put("sve:scanDate",
					// formDoc.getReceivedDt());??
					if (formDoc.getFileNumber() != null
							&& formDoc.getFileNumber().length() != 0) {
						vaFormDoc.setFileNumber(formDoc.getFileNumber());
					}

					if (formDoc.getDocType() != null
							&& formDoc.getDocType().length() != 0) {
						vaFormDoc.setDocType(formDoc.getDocType());
					}
					// doesn't exist in WSDL, but it is in VAUpload code??
					// formDoc.getDcsId());
					// docMetadatas.put("sve:lastImageIndicator", formDoc.get);
					if (formDoc.getReceivedDt() != null) {
						vaFormDoc.setReceivedDt(formDoc.getReceivedDt());
					}

					if (formDoc.getDocContent() != null) {
						vaFormDoc.setDocContent(formDoc.getDocContent());
					}
					exchange.getOut().setBody(vaFormDoc);
					exchange.getOut().setHeader("operationName", operationName);
				}
			}
		}

	}

}
