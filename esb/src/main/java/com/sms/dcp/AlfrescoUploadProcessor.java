package com.sms.dcp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.activation.DataHandler;

import org.apache.camel.Exchange;
import org.apache.chemistry.opencmis.client.api.Document;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.api.SessionFactory;
import org.apache.chemistry.opencmis.client.runtime.FolderImpl;
import org.apache.chemistry.opencmis.client.runtime.SessionFactoryImpl;
import org.apache.chemistry.opencmis.commons.PropertyIds;
import org.apache.chemistry.opencmis.commons.SessionParameter;
import org.apache.chemistry.opencmis.commons.data.ContentStream;
import org.apache.chemistry.opencmis.commons.enums.BindingType;
import org.apache.chemistry.opencmis.commons.enums.VersioningState;
import org.apache.chemistry.opencmis.commons.impl.MimeTypes;
import org.apache.chemistry.opencmis.commons.impl.dataobjects.ContentStreamImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * 		 Setting additional CMIS Attributes. The CMIS Aspect must
 *         be set as an array, so instead of using <setHeader
 *         headerName="cmis:secondaryObjectTypeIds"> <constant>[P:sve:exception,
 *         P:cm:titled]</constant> </setHeader> This class is used to pass a
 *         List<String> into the header value.
 *         
 *         NB: This example uses cmis 1.1 specification, implemented on Alfresco 4.2
 */
public class AlfrescoUploadProcessor {
	Logger logger = Logger.getLogger(AlfrescoUploadProcessor.class);
	final String username = "talend.esb";
	final String password = "t1esb23$$";
	final String repository = "-default-";
	//http://vm-dconvjboss-1.ammscloud.com:8383/share to browse the content
	final String url="http://vm-dconvjboss-1.ammscloud.com:8383/alfresco/api/-default-/public/cmis/versions/1.1/atom";
	// future the regional office could be dynamic based on the request
	final String path = "/sites/regional-office-1/documentLibrary/Open Exceptions/";

	/**
	 *
	 * 
	 * @param exchange
	 */
	public void uploadFile(Exchange exchange) throws Exception {

		String name = (String) exchange.getIn().getHeader("CamelFileNameOnly") +Calendar.getInstance().getTimeInMillis() + ".pdf";
		String mimetype=MimeTypes.getMIMEType("pdf"); //
		
		logger.debug("Mimetype for pdf: " + mimetype);
		List<String> aspects = new ArrayList<String>();
		aspects.add("P:sve:exception");
		aspects.add("P:cm:titled"); // don't really need it. Just example
		exchange.getOut().setHeader("cmis:secondaryObjectTypeIds", aspects);
		exchange.getOut().setHeader(PropertyIds.NAME, name);
		exchange.getOut().setHeader(PropertyIds.CONTENT_STREAM_MIME_TYPE, mimetype);
		
		// Example using apache chemistry's library directly
		SessionFactory factory = SessionFactoryImpl.newInstance();
		Map<String, String> parameter = new HashMap<String, String>();

		// user credentials
		parameter.put(SessionParameter.USER, username);
		parameter.put(SessionParameter.PASSWORD, password);
		// connection settings
		parameter
				.put(SessionParameter.ATOMPUB_URL,
						url);
		parameter.put(SessionParameter.BINDING_TYPE,
				BindingType.ATOMPUB.value());
		parameter.put(SessionParameter.REPOSITORY_ID, repository);

		// create session
		Session session = factory.createSession(parameter);
		
		//Get Folder path to save document
		Folder folder = (Folder) session.getObjectByPath(path);

		if (folder==null) {
			throw new RuntimeException("Folder Does not Exist");
		}
		
		//get the content from the message
		byte[] content = exchange.getIn().getBody((new byte[0]).getClass());
		InputStream stream = new ByteArrayInputStream(content);
		
		logger.debug("Size: " + content.length);
		// create a major version
		
		// Setting document properties, 
		// such as custom VA properties.
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(PropertyIds.OBJECT_TYPE_ID, "cmis:document");
		properties.put(PropertyIds.SECONDARY_OBJECT_TYPE_IDS, aspects);
		properties.put("sve:veteransFirstName", "John");
		properties.put("sve:veteransLastName", "Doe");
		properties.put(PropertyIds.NAME, name);
		
		logger.debug("Uploading " + name + " to "
				+ folder.getPath());
		ContentStream contentStream = new ContentStreamImpl(name,
				BigInteger.valueOf(content.length), mimetype, stream);
		Document newDoc = folder.createDocument(properties, contentStream,
				VersioningState.MAJOR);
		logger.info("Successfully Crated Document with ID:" + newDoc.getId());
	}
}
