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
	
	final static String USERNAME_DEFAULT = "talend.esb";
	final static String PASSWORD_DEFAULT = "t1esb23$$";
	final static String REPOSITORY_DEFAULT = "-default-";
	//http://vm-dconvjboss-1.ammscloud.com:8383/share to browse the content
	final static String URL_DEFAULT="http://vm-dconvjboss-1.ammscloud.com:8383/alfresco/api/-default-/public/cmis/versions/1.1/atom";
	// future the regional office could be dynamic based on the request
	final static String PATH_DEFAULT = "/sites/regional-office-1/documentLibrary/Open Exceptions/";

	String alfrescoURL;
	String alfrescoUsername;
	String alfrescoPassword;
	String alfrescoRepository;
	String alfrescoFolder;
	
	public String getAlfrescoURL() {
		if (alfrescoURL == null || alfrescoURL.length()==0) {
			return URL_DEFAULT;
		}
		return alfrescoURL;
	}
	public void setAlfrescoURL(String alfrescoURL) {
		this.alfrescoURL = alfrescoURL;
	}
	public String getAlfrescoUsername() {
		if (alfrescoUsername == null || alfrescoUsername.length()==0) {
			return USERNAME_DEFAULT;
		}
		return alfrescoUsername;
	}
	public void setAlfrescoUsername(String alfrescoUsername) {
		this.alfrescoUsername = alfrescoUsername;
	}
	public String getAlfrescoPassword() {
		if (alfrescoPassword == null || alfrescoPassword.length()==0) {
			return PASSWORD_DEFAULT;
		}
		return alfrescoPassword;
	}
	public void setAlfrescoPassword(String alfrescoPassword) {
		this.alfrescoPassword = alfrescoPassword;
	}
	public String getAlfrescoRepository() {
		if (alfrescoRepository == null || alfrescoRepository.length()==0) {
			return REPOSITORY_DEFAULT;
		}
		return alfrescoRepository;
	}
	public void setAlfrescoRepository(String alfrescoRepository) {
		this.alfrescoRepository = alfrescoRepository;
	}
	public String getAlfrescoFolder() {
		if (alfrescoFolder == null || alfrescoFolder.length()==0) {
			return PATH_DEFAULT;
		}
		return alfrescoFolder;
	}
	public void setAlfrescoFolder(String alfrescoFolder) {
		this.alfrescoFolder = alfrescoFolder;
	}
	
	/**
	 *
	 * 
	 * @param exchange
	 */
	public void uploadFile(Exchange exchange) throws Exception {

		Map<String, Object> metadatas = new HashMap<String, Object>();
		metadatas.put("meta:fileName", (String) exchange.getIn().getHeader("CamelFileNameOnly"));
		metadatas.put("sve:veteransLastName", "Doe");
		metadatas.put("sve:veteransFirstName", "John");
		//get the content from the message
		byte[] content = exchange.getIn().getBody((new byte[0]).getClass());
	
		doUpload(metadatas, content);
	}
	
	public void uploadSOAPReq(Exchange exchange) throws Exception {
		byte[] content = exchange.getIn().getBody((new byte[0]).getClass());
		doUpload((Map<String,Object>)exchange.getIn().getHeader("metadatas"), content);
	}
	
	public void doUpload(Map<String, Object> metadatas, byte[] content) {
		logger.info("doUpload");
		
		String fileName = (String) metadatas.get("meta:fileName");
		String fileExt = fileName.substring(fileName.lastIndexOf(".")+1, fileName.length());
		logger.info("fileExt:"+fileExt);
		String name = fileName.replace(fileExt, "") +Calendar.getInstance().getTimeInMillis()+"."+fileExt;
		String mimetype = MimeTypes.getMIMEType(fileExt);	
		logger.debug("Mimetype : " + mimetype);

		
		// Example using apache chemistry's library directly
		SessionFactory factory = SessionFactoryImpl.newInstance();
		Map<String, String> parameter = new HashMap<String, String>();

		// user credentials
		parameter.put(SessionParameter.USER, getAlfrescoUsername());
		parameter.put(SessionParameter.PASSWORD, getAlfrescoPassword());
		// connection settings
		parameter.put(SessionParameter.ATOMPUB_URL,	getAlfrescoURL());
		parameter.put(SessionParameter.BINDING_TYPE, BindingType.ATOMPUB.value());
		parameter.put(SessionParameter.REPOSITORY_ID, getAlfrescoRepository());

		// create session
		Session session = factory.createSession(parameter);
		
		//Get Folder path to save document
		Folder folder = (Folder) session.getObjectByPath(getAlfrescoFolder());

		if (folder==null) {
			throw new RuntimeException("Folder Does not Exist");
		}	
		
		// create a major version
		
		// Setting document properties, 
		// such as custom VA properties.
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(PropertyIds.OBJECT_TYPE_ID, "cmis:document");
		List<String> aspects = new ArrayList<String>();
		aspects.add("P:sve:exception");
//		aspects.add("P:cm:titled"); // don't really need it. Just example
		properties.put(PropertyIds.SECONDARY_OBJECT_TYPE_IDS, aspects);
		for (String propName : metadatas.keySet()) {
			if (propName.startsWith("sve:")) {
				properties.put(propName, metadatas.get(propName));
			}
		}
		properties.put(PropertyIds.NAME, name);
		
		logger.debug("Uploading " + name + " to " + folder.getPath());
		logger.debug("Size: " + content.length);
		//get the content from the message
		InputStream stream = new ByteArrayInputStream(content);
		ContentStream contentStream = new ContentStreamImpl(name,
				BigInteger.valueOf(content.length), mimetype, stream);
		Document newDoc = folder.createDocument(properties, contentStream,
				VersioningState.MAJOR);
		logger.info("Successfully Crated Document with ID:" + newDoc.getId());
	}
}
