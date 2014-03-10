package com.sms.dcp;

import gov.va.vba.vbms.cdm.Document;
import gov.va.vba.vbms.cdm.Veteran;

import java.util.List;

import org.apache.camel.Exchange;

public class SoapProxyProcessor {

	public void process(Exchange exchange) {
		List obj = exchange.getIn().getBody(List.class);
        if (obj.get(0) instanceof Veteran) {
        	System.out.println("Got Veteran");
        	Veteran vet = (Veteran) obj.get(0);
        	System.out.println(vet.getFileNumber()+","+vet.getFirstName()+","+vet.getLastName());
        } 
        if (obj.get(1) instanceof Document) {
        	System.out.println("Got Document");
        }
	}
	
}
