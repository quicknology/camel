package com.sms.dcp.esb;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cmis.CamelCMISConstants;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.chemistry.opencmis.commons.PropertyIds;
import org.junit.Test;

public class CamelCMISTest extends CamelTestSupport {

//	final String CMIS_URI="cmis://http://vm-dconvjboss-1.ammscloud.com:8181/alfresco/cmisatom#?username=talend.esb&password=t1esb23$$&repositoryId=-default-";
	final String CMIS_URI="cmis://http://cmis.alfresco.com/cmisatom?username=admin&password=admin&repositoryId=bb212ecb-122d-47ea-b5c1-128affb9cd8f";
	
    @Test
    public void testCMISAlfrescoQuery() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMinimumMessageCount(1);

//        template.sendBody("direct:query", "SELECT * FROM cmis:folder WHERE cmis:name LIKE 'camel%'");
//        template.sendBody("direct:query", "SELECT * FROM cmis:folder");
        
//        assertMockEndpointsSatisfied();

    }
    
    @Test
    public void testCMISAlfrescoUpload() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(1);

//        template.sendBody("direct:upload", "Hello Camel");
//        
//        assertMockEndpointsSatisfied();

    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                getContext().setTracing(true);
                
//                from("timer://foo?repeatCount=1")
                from("direct:query")
                .to(CMIS_URI+"&queryMode=true")
                .split(body())
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        Map<String, Object> body = (Map<String, Object>)exchange.getIn().getBody();
                        exchange.getIn().getHeaders().put(Exchange.FILE_NAME, body.get(PropertyIds.NAME));
                        exchange.getIn().setBody(body.get(CamelCMISConstants.CAMEL_CMIS_CONTENT_STREAM));
                    }
                }).
                log(LoggingLevel.INFO, "big-brother", "Processing message with id='${header.CamelFileName}' body='${body}'")
                .to("mock:result");
                
                from("direct:upload").setProperty("my:lastname", constant("Doe")).process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
//                        exchange.getIn().getHeaders().put(PropertyIds.CONTENT_STREAM_MIME_TYPE, "text/plain; charset=UTF-8");
//                        exchange.getIn().getHeaders().put(PropertyIds.NAME, "cameldemo.txt");
//                        exchange.getIn().getHeaders().put(CamelCMISConstants.CMIS_FOLDER_PATH, "/cameldemoFolder");
                        exchange.getIn().getHeaders().put(CamelCMISConstants.CMIS_FOLDER_PATH, "/");
                    	
                      exchange.getIn().getHeaders().put(PropertyIds.CONTENT_STREAM_MIME_TYPE, "text/plain");
                      exchange.getIn().getHeaders().put(PropertyIds.NAME, "cameldemo12.txt");
                      exchange.getIn().getHeaders().put("my:lastName", "Smith");
//                      exchange.getIn().getHeaders().put(CamelCMISConstants.CMIS_FOLDER_PATH, "/Sites/regional-office-1/documentLibrary/Open Exceptions");
                    	
//                    	exchange.getIn().getHeaders().put(PropertyIds.NAME, "cameldemoFolder");
//                        exchange.getIn().getHeaders().put(PropertyIds.OBJECT_TYPE_ID, CamelCMISConstants.CMIS_FOLDER); 
                    }
                })
                .to(CMIS_URI)
                .log(LoggingLevel.INFO, "big-brother", "Processing message with id='${header.id}' body='${body}'")
                .to("mock:result");
                
            }
        };
    }
}
