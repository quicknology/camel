package com.sms.dcp;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import org.apache.cxf.helpers.DOMUtils;
import org.apache.log4j.Logger;
import org.apache.ws.security.saml.ext.AssertionWrapper;
import org.apache.ws.security.saml.ext.SAMLCallback;
import org.apache.ws.security.saml.ext.SAMLParms;

public class SAMLElementOutCallbackHandler implements CallbackHandler {
	Logger logger = Logger.getLogger(SAMLElementOutCallbackHandler.class);
	private boolean saml2 = true;

	public SAMLElementOutCallbackHandler() {

	}

	public SAMLElementOutCallbackHandler(boolean saml2) {
		this.saml2 = saml2;
	}

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			if (callbacks[i] instanceof SAMLCallback) {
				SAMLCallback callback = (SAMLCallback) callbacks[i];
				Element assertionElement= null;
				try {
					assertionElement = SAMLElementFactory.getSAMLElement();
					logger.info("assertionElement:"+assertionElement);
				} catch (Exception e) {
					throw new IOException(e.getMessage());
				}
				callback.setAssertionElement(assertionElement);
			}
		}
	}
}
