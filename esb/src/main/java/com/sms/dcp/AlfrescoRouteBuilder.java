package com.sms.dcp;

import java.util.ArrayList;
import java.util.List;

import gov.va.vba.vbms.external.edocumentservice.UploadDocument;
import gov.va.vba.vbms.external.edocumentservice.UploadDocumentResponse;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cmis.CamelCMISConstants;
import org.apache.chemistry.opencmis.commons.PropertyIds;

public class AlfrescoRouteBuilder extends RouteBuilder {

//	final String CMIS_URI="cmis://http://vm-dconvjboss-1.ammscloud.com:8181/alfresco/cmisatom#?username=talend.esb&password=t1esb23$$&repositoryId=-default-";
//	final String CMIS_URI="cmis://http://cmis.alfresco.com/cmisatom?username=admin&password=admin&repositoryId=bb212ecb-122d-47ea-b5c1-128affb9cd8f";
	final String CMIS_URI="cmis:http://vm-dconvjboss-1.ammscloud.com:8383/alfresco/api/-default-/public/cmis/versions/1.1/atom#?username=talend.esb&password=t1esb23$$&repositoryId=-default-";
    public void configure() {

    	getContext().setTracing(true);
    	
        from("file://inbox?noop=true&delay=10000").id("alfresco-route").process(new Processor() {
            public void process(Exchange exchange) throws Exception {
//                exchange.getIn().getHeaders().put(PropertyIds.CONTENT_STREAM_MIME_TYPE, "text/plain; charset=UTF-8");
//                exchange.getIn().getHeaders().put(PropertyIds.NAME, "cameldemo.txt");
//                exchange.getIn().getHeaders().put(CamelCMISConstants.CMIS_FOLDER_PATH, "/cameldemoFolder");
//                exchange.getIn().getHeaders().put(CamelCMISConstants.CMIS_FOLDER_PATH, "/");
            	
            	if (exchange.getIn().getHeader("CamelFileNameOnly", String.class).endsWith("pdf")) {
            		exchange.getIn().getHeaders().put(PropertyIds.CONTENT_STREAM_MIME_TYPE, "application/pdf");
            	} else {
            		exchange.getIn().getHeaders().put(PropertyIds.CONTENT_STREAM_MIME_TYPE, "text/plain; charset=UTF-8");	
            	}
//              exchange.getIn().getHeaders().put(PropertyIds.CONTENT_STREAM_MIME_TYPE, "text/plain; charset=UTF-8");
              exchange.getIn().getHeaders().put(PropertyIds.NAME, exchange.getIn().getHeader("CamelFileNameOnly"));
              exchange.getIn().getHeaders().put(CamelCMISConstants.CMIS_FOLDER_PATH, "/Sites/regional-office-1/documentLibrary/Open Exceptions/");
//              exchange.getIn().getHeaders().put(CamelCMISConstants.CMIS_FOLDER_PATH, "/");
              
      		List<String> aspects = new ArrayList<String>();
    		aspects.add("P:sve:exception");
    		aspects.add("P:cm:titled"); // don't really need it. Just example
    		aspects.add("P:cm:description");
    		exchange.getOut().setHeader("cmis:secondaryObjectTypeIds", aspects);
              exchange.getIn().getHeaders().put("cmis:sve:veteransFirstName", "v_first");
              exchange.getIn().getHeaders().put("cmis:cm:description", "camel uploade ... ");
              
//            	exchange.getIn().getHeaders().put(PropertyIds.NAME, "cameldemoFolder");
//                exchange.getIn().getHeaders().put(PropertyIds.OBJECT_TYPE_ID, CamelCMISConstants.CMIS_FOLDER); 
            }
        })
        .to(CMIS_URI)
        .log(LoggingLevel.INFO, "big-brother", "Processing message with fileName=${header.CamelFileName}");
            
    }

}
