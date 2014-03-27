package com.sms.dcp;

import gov.va.vba.cmp.external.edocumentservice.UploadFormDocument;

import java.util.Iterator;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.camel.Exchange;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;

import com.sun.xml.ws.encoding.xml.XMLCodec;

public class FacilitySoapProxyMessageProcessor {
	Logger logger = Logger.getLogger(FacilitySoapProxyMessageProcessor.class);

	public void process(Exchange exchange) throws SOAPException {

		logger.info("DDC SOAP Request operation name:"
				+ exchange.getIn().getHeader("operationName")
				+ ", message type:"
				+ exchange.getIn().getBody().getClass().getName());

		if (exchange.getIn().getBody() instanceof SOAPMessage) {
			SOAPMessage soapMessage = exchange.getIn().getBody(
					SOAPMessage.class);
			logger.info("DDC SOAP body is SOAPMEssage");
			final SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart()
					.getEnvelope();
			Iterator<String> prefixes = soapEnvelope.getNamespacePrefixes();


			while (prefixes.hasNext()) {
				String prefix = prefixes.next();
				String nsURI = soapEnvelope.getNamespaceURI(prefix);
				logger.info("DDC SOAP prefixes:" + prefix + ", nsURI:"
						+ nsURI);
			}
			
			Object soapBody = soapEnvelope.getBody();
			logger.info("DDC SOAP request body:"+soapBody.getClass().getName());
			if (soapBody instanceof SOAPBody) {
				Document doc = (Document) ((SOAPBody)soapBody).extractContentAsDocument();
				logger.info("DDC SOAP doc:"+doc.toString());
			}
			if (soapBody instanceof UploadFormDocument) {
				UploadFormDocument uploadFormDoc = (UploadFormDocument)soapBody;
				logger.info("DDC SOAP fileName:"+uploadFormDoc.getFormDocument().getFilename());
			}
		}
		exchange.getOut().setBody(exchange.getIn().getBody());

	};
}
