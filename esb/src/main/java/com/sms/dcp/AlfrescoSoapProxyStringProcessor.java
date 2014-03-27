package com.sms.dcp;

import java.io.StringReader;

import javax.xml.transform.stream.StreamSource;

import org.apache.camel.Exchange;
import org.apache.log4j.Logger;

public class AlfrescoSoapProxyStringProcessor {
	Logger logger = Logger.getLogger(AlfrescoSoapProxyStringProcessor.class);

	public void process(Exchange exchange) {
		String soapRequest = exchange.getIn().getBody(String.class);
		logger.info("Proxy string processor:"+soapRequest);
		exchange.getIn().setBody(
				new StreamSource(new StringReader(soapRequest)));
	}

}
