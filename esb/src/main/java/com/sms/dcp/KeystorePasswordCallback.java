package com.sms.dcp;

import org.apache.ws.security.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * A Callback Handler implementation for the case of finding a password to
 * access a cert/private key in a keystore.
 */
public class KeystorePasswordCallback implements CallbackHandler {

	private static Map<String, String> users;

	public KeystorePasswordCallback() {
		users = new HashMap<String, String>();
		users.put("myclientkey", "ckpass");
		users.put("myservicekey", "skpass");
		users.put("clientkey", "storepassword");
	}

	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		for (String user : users.keySet()) {
			System.out.println("set users:" + user + ", passwd:"
					+ users.get(user));
		}
		this.users = users;
	}

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			if (callbacks[i] instanceof WSPasswordCallback) {
				WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
				System.out.println("callback for ID:" + pc.getIdentifier());

				String passwd = users.get(pc.getIdentifier());
				System.out.println("callback passwd:" + passwd);
				if (passwd != null) {
					pc.setPassword(passwd);
				} else {
					System.out.println("ERROR: no password found");
				}
			} else {
				throw new UnsupportedCallbackException(callbacks[i],
						"Unrecognized Callback");
			}
		}
	}
}
