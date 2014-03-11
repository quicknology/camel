package com.sms.dcp;

import gov.va.vba.vbms.cdm.Document;
import gov.va.vba.vbms.cdm.Veteran;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class SoapProxyProcessor {
	Logger logger = Logger.getLogger(SoapProxyProcessor.class);
	
	public void process(Exchange exchange) {
		List obj = exchange.getIn().getBody(List.class);
		for (Object currentObj : obj) {
			if (currentObj instanceof Veteran) {
				logger.info("Got Veteran");
	        	Veteran vet = (Veteran) obj.get(0);
	        	logger.info(vet.getFileNumber()+","+vet.getFirstName()+","+vet.getLastName());
	        	
	        	// set alfresco headers
	        	exchange.getIn().getHeaders().put("sve:veteransFirstName", vet.getFirstName());
	        	exchange.getIn().getHeaders().put("sve:veteransLastName", vet.getLastName());
			} else if (currentObj instanceof Document) {
				logger.info("Got Document");
				Document doc = (Document) currentObj;
				// set alfresco headers
				exchange.getIn().getHeaders().put("meta:fileName", doc.getFilename());
				exchange.getIn().setBody("camel upload");
			}
		}
        
	}
	
}
