package com.sms.dcp;

import gov.va.vba.cmp.cmp.FormDocument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class FacilitySoapProxyProcessor {
	Logger logger = Logger.getLogger(FacilitySoapProxyProcessor.class);

	public void process(Exchange exchange) {

		Map<String, Object> docMetadatas = new HashMap<String, Object>();

		logger.info("VA SOAP Request operation name:"
				+ exchange.getIn().getHeader("operationName"));
		String operationName = (String) exchange.getIn().getHeader(
				"operationName");
		if (null == operationName || operationName.length() == 0) {
			logger.info("VA SOAP Request operation name is NULL. BAD!");
		} else if (operationName.equals("uploadFormDocument")) {
			List bodyObj = exchange.getIn().getBody(List.class);
			if (bodyObj != null && bodyObj.size() != 0) {
				if (bodyObj.get(0) instanceof FormDocument) {
					logger.info("Got FormDocument:"
							+ exchange.getIn().getBody().getClass().getName());
					FormDocument formDoc = (FormDocument) (bodyObj.get(0));

					// set alfresco headers
					if (formDoc.getVeteranFirstName() != null
							&& formDoc.getVeteranFirstName().length() != 0) {
						docMetadatas.put("sve:veteransFirstName",
								formDoc.getVeteranFirstName());
					}
					if (formDoc.getVeteranLastName() != null
							&& formDoc.getVeteranLastName().length() != 0) {
						docMetadatas.put("sve:veteransLastName",
								formDoc.getVeteranLastName());
					}
					if (formDoc.getVeteranMiddleName() != null
							&& formDoc.getVeteranMiddleName().length() != 0) {
						docMetadatas.put("sve:veteransMiddle",
								formDoc.getVeteranMiddleName());
					}
					if (formDoc.getFilename() != null
							&& formDoc.getFilename().length() != 0) {
						docMetadatas
								.put("meta:fileName", formDoc.getFilename());
					}

					// docMetadatas.put("sve:ssn", formDoc.??);
					// docMetadatas.put("sve:scanDate",
					// formDoc.getReceivedDt());??
					if (formDoc.getFileNumber() != null
							&& formDoc.getFileNumber().length() != 0) {
						docMetadatas.put("sve:fileNumber",
								formDoc.getFileNumber());
					}

					if (formDoc.getDocType() != null
							&& formDoc.getDocType().length() != 0) {
						docMetadatas.put("sve:docTypeId", formDoc.getDocType());
					}

					docMetadatas.put("sve:dcsId", formDoc.getDcsId());
					// docMetadatas.put("sve:lastImageIndicator", formDoc.get);
					if (formDoc.getReceivedDt() != null) {
						docMetadatas.put("sve:receivedDate",
								formDoc.getReceivedDt());
					}

					if (formDoc.getDocContent() != null) {
						// Is document required?
						exchange.getOut().setBody(formDoc.getDocContent());
					}

				}

				// }
				exchange.getOut().getHeaders().put("metadatas", docMetadatas);
				exchange.getOut().getHeaders().put("operationName", operationName);
			}
		}
		// code with VA WSDL
		// } else if (operationName.equals("uploadDocument")) {
		// for (Object currentObj : obj) {
		// if (currentObj instanceof Veteran) {
		// logger.info("Got Veteran");
		// Veteran vet = (Veteran) obj.get(0);
		// logger.info(vet.getFileNumber()+","+vet.getFirstName()+","+vet.getLastName());
		//
		// // set alfresco headers
		// docMetadatas.put("sve:veteransFirstName", vet.getFirstName());
		// docMetadatas.put("sve:veteransLastName", vet.getLastName());
		// } else if (currentObj instanceof Document) {
		// logger.info("Got Document");
		// Document doc = (Document) currentObj;
		// // set alfresco headers
		// docMetadatas.put("meta:fileName", doc.getFilename());
		// exchange.getIn().setBody("camel upload");
		// }
		// }
		// }

	}

}
