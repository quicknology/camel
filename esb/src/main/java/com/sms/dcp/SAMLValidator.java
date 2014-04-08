package com.sms.dcp;

import org.apache.log4j.Logger;
import org.apache.ws.security.WSSecurityException;
import org.apache.ws.security.saml.ext.AssertionWrapper;
import org.apache.ws.security.validate.SamlAssertionValidator;

public class SAMLValidator extends SamlAssertionValidator {
	
	private static Logger logger = Logger.getLogger(SAMLValidator.class);
	
	@Override
	protected void validateAssertion(AssertionWrapper assertion) throws WSSecurityException {
		// override the default behavior so that it will not validate against the SAML2 schema
		logger.info("SAMLVadlidator called to NOT validate against SAML2 schema");
	}

}
