package com.sms.dcp;

import javax.xml.soap.SOAPException;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class SAMLElementFactory {
	Logger logger = Logger.getLogger(SAMLElementFactory.class);
	private static Document samlDocument;

	public void process(Exchange exchange) throws SOAPException {
		samlDocument = exchange.getIn().getBody(Document.class);
		logger.info("SAML Doc1:"+samlDocument.getDocumentElement().toString());
	}
	
	public static Element getSAMLElement() {
		return samlDocument.getDocumentElement();
	}
}
