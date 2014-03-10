package com.sms.dcp;

import gov.va.vba.vbms.external.edocumentservice.UploadDocument;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;

import gov.va.vba.vbms.external.edocumentservice.UploadDocumentResponse;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        UploadDocumentResponse ok = new UploadDocumentResponse();
        ok.setMessage("ok");
//
//        UploadDocumentResponse accepted = new UploadDocumentResponse();
//        accepted.setMessage("Accepted");

        from("cxf:bean:edocument")
        .to("log:info")
        .to("bean:soapProxyProcessor")
//            .convertBodyTo(UploadDocument.class).to("log:info")
//            .setHeader(Exchange.FILE_NAME, constant("request-${date:now:yyyy-MM-dd-HHmmssSSS}"))
//            .wireTap("file:outbox/");
            .setBody(constant("ok"));
//            .choice().when(simple("${body.veteran.lastName} == 'Smith'"))
//                .transform(constant(ok))
//            .otherwise()
//                .transform(constant(accepted));
            
    }

}
