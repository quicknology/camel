http://www.jroller.com/gmazza/entry/cxf_x509_profile

1. Create key pairs for the client and the web service provider. We'll be creating two key pairs using Java keytool--one for the web service provider and the other for the client. From the DoubleIt project folder, run the following commands to create these keys
keytool -genkey -keyalg RSA -sigalg SHA1withRSA -validity 730 -alias myservicekey -keypass skpass -storepass sspass -keystore serviceKeystore.jks -dname "cn=localhost"
keytool -genkey -keyalg RSA -sigalg SHA1withRSA -validity 730 -alias myclientkey  -keypass ckpass -storepass cspass -keystore clientKeystore.jks -dname "cn=clientuser"

keytool -selfcert -alias myservicekey -keystore serviceKeystore.jks -storepass sspass -keypass skpass
keytool -selfcert -alias myclientkey -keystore clientKeystore.jks -storepass cspass -keypass ckpass

2. Note these keys are self-signed so should not be used in actual production, and of course the passwords used should be different in your production work. (You may also wish to have the keys expire sooner than the 730 days, or two years, given above.) Also I've found the case sensitivity of key aliases to vary depending on the tool generating and/or processing them; for that reason I've kept the aliases all lowercase here.

Next, we'll be setting up two-way trust between the SOAP client and web service provider, which involves each one's public key being loaded into the keystore of the other. The following commands will accomplish this:

keytool -export -rfc -keystore clientKeystore.jks -storepass cspass -alias myclientkey -file MyClient.cer
keytool -import -trustcacerts -keystore serviceKeystore.jks -storepass sspass -alias myclientkey -file MyClient.cer -noprompt

keytool -export -rfc -keystore serviceKeystore.jks -storepass sspass -alias myservicekey -file MyService.cer
keytool -import -trustcacerts -keystore clientKeystore.jks -storepass cspass -alias myservicekey -file MyService.cer -noprompt

3. Create a WSS4J properties file for the client's combination keystore/truststore and place it in the same folder:

clientKeystore.properties:

org.apache.ws.security.crypto.merlin.keystore.file=clientKeystore.jks
org.apache.ws.security.crypto.merlin.keystore.password=cspass
org.apache.ws.security.crypto.merlin.keystore.type=jks
org.apache.ws.security.crypto.merlin.keystore.alias=myclientkey

4. create the following WSS4J properties file for the service's keystore/truststore and place it in the service/src/main/resources folder:

serviceKeystore.properties:

org.apache.ws.security.crypto.merlin.keystore.file=serviceKeystore.jks
org.apache.ws.security.crypto.merlin.keystore.password=sspass
org.apache.ws.security.crypto.merlin.keystore.type=jks
org.apache.ws.security.crypto.merlin.keystore.alias=myservicekey

5. Configure the SOAP client to encrypt and sign the SOAP request, and decrypt and verify the signature of the SOAP response. A few files will need to be created for this step:

Create the following Spring cxf.xml file and place it in the client/src/main/resources folder. It's configured for the WS-SecurityPolicy approach by providing additional information beyond that provided by the WSDL as property elements under the jaxws:client element. If you're using the CXF interceptor approach, make the changes given in the comments in this source file. Note the CXF interceptor approach, both here and later with the service-side configuration, uses a DefaultCoverageCryptoChecker to ensure necessary elements are signed; see CXF's WS-Security sign_encryption sample to see how the DefaultCoverageCryptoChecker can be further customized via Java API.

<beans xmlns="http://www.springframework.org/schema/beans"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xmlns:jaxws="http://cxf.apache.org/jaxws"
   xsi:schemaLocation="http://www.springframework.org/schema/beans 
   http://www.springframework.org/schema/beans/spring-beans.xsd
   http://cxf.apache.org/jaxws 
   http://cxf.apache.org/schemas/jaxws.xsd">

    <jaxws:client name="{http://www.example.org/contract/DoubleIt}DoubleItPort" createdFromAPI="true">
        <!-- Comment below element to use non-WS-SecPol CXF interceptor method -->
        <jaxws:properties>
            <entry key="ws-security.callback-handler" value="client.ClientKeystorePasswordCallback"/>        
            <entry key="ws-security.encryption.properties" value="clientKeystore.properties"/>
            <entry key="ws-security.signature.properties" value="clientKeystore.properties"/>
            <entry key="ws-security.encryption.username" value="myservicekey"/>
        </jaxws:properties>

        <!-- Uncomment below interceptors to use CXF interceptor method -->
        <!--jaxws:inInterceptors>
            <ref bean="TimestampSignEncrypt_Response"/>
            <bean class="org.apache.cxf.ws.security.wss4j.DefaultCryptoCoverageChecker"/>
        </jaxws:inInterceptors>
        <jaxws:outInterceptors>
            <ref bean="TimestampSignEncrypt_Request"/>
        </jaxws:outInterceptors-->
    </jaxws:client>

    <!-- 
        This bean is needed only if you're using the CXF interceptor method (per above 
        configuration, it's ignored if you're using the WS-SecurityPolicy method.)
        
        This bean is an Out interceptor which will add a timestamp, 
        sign the timestamp and body, and then encrypt the timestamp 
        and body.  It uses 3DES as the symmetric key algorithm.
    -->
    <!--bean 
        class="org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor"
        id="TimestampSignEncrypt_Request">
        <constructor-arg>
            <map>
                <entry key="action" value="Timestamp Signature Encrypt"/>
                <entry key="user" value="myclientkey"/>
                <entry key="signaturePropFile" value="clientKeystore.properties"/>
                <entry key="encryptionPropFile" value="clientKeystore.properties"/>
                <entry key="encryptionUser" value="myservicekey"/>
                <entry key="passwordCallbackClass" value="client.ClientKeystorePasswordCallback"/>
                <entry key="signatureParts" value="{Element}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp;{Element}{http://schemas.xmlsoap.org/soap/envelope/}Body"/>
                <entry key="encryptionParts" value="{Element}{http://www.w3.org/2000/09/xmldsig#}Signature;{Content}{http://schemas.xmlsoap.org/soap/envelope/}Body"/>
                <entry key="encryptionSymAlgorithm" value="http://www.w3.org/2001/04/xmlenc#tripledes-cbc"/>
                <entry key="encryptionKeyTransportAlgorithm" value="http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/>
                <entry key="signatureAlgorithm" value="http://www.w3.org/2000/09/xmldsig#rsa-sha1"/>
            </map>
        </constructor-arg>
    </bean-->
    
    <!--    
        This bean is needed only if you're using the CXF interceptor method (per above 
        configuration, it's ignored if you're using the WS-SecurityPolicy method.)

        This bean is an In interceptor which will validate a signed,    
         encrypted response, and timestamp it.    
    -->
    <!--bean 
        class="org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor"
        id="TimestampSignEncrypt_Response">
        <constructor-arg>
            <map>
                <entry key="action" value="Timestamp Signature Encrypt"/>
                <entry key="signaturePropFile" value="clientKeystore.properties"/>
                <entry key="decryptionPropFile" value="clientKeystore.properties"/>
                <entry key="passwordCallbackClass" value="client.ClientKeystorePasswordCallback"/>
                <entry key="encryptionKeyTransportAlgorithm" value="http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/>
                <entry key="signatureAlgorithm" value="http://www.w3.org/2000/09/xmldsig#rsa-sha1"/>
            </map>
        </constructor-arg>
    </bean-->

</beans>

6. Add the keystore callback handler in order to obtain the key password for the private key. Place the following ClientKeystorePasswordCallback.java file into the same package as the client's WSClient class:
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class ClientKeystorePasswordCallback implements CallbackHandler {
    
    private Map<String, String> passwords = 
        new HashMap<String, String>();
    
    public ClientKeystorePasswordCallback() {
        passwords.put("myclientkey", "ckpass");
    }

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];

            String pass = passwords.get(pc.getIdentifier());
            if (pass != null) {
                pc.setPassword(pass);
                return;
            }
        }
    }   
}

7. Configure the server to decrypt and verify the signature of the SOAP request, and encrypt and sign the SOAP response. For this process we'll need to modify the WEB-INF/cxf-servlet.xml from Step #6 of the WSDL-first tutorial to declare security configuration. Replace that file with the following, and make the changes listed within the file if you're using the CXF interceptor approach:

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xmlns:jaxws="http://cxf.apache.org/jaxws"
   xsi:schemaLocation="
         http://www.springframework.org/schema/beans 
         http://www.springframework.org/schema/beans/spring-beans.xsd
         http://cxf.apache.org/jaxws
         http://cxf.apache.org/schemas/jaxws.xsd">

    <bean id="myPasswordCallback"
        class="service.ServiceKeystorePasswordCallback" />

    <jaxws:endpoint 
        id="doubleit"
        implementor="service.DoubleItPortTypeImpl"
        address="/doubleit" 
        wsdlLocation="WEB-INF/wsdl/DoubleIt.wsdl">
 
        <!-- Comment below element to use non-WS-SecPol CXF interceptor method -->
        <jaxws:properties>
            <entry key="ws-security.callback-handler">
                <ref bean="myPasswordCallback"/>
            </entry>
            <entry key="ws-security.encryption.properties" value="serviceKeystore.properties"/>
            <entry key="ws-security.signature.properties" value="serviceKeystore.properties"/>
            <entry key="ws-security.encryption.username" value="useReqSigCert"/>
        </jaxws:properties> 

        <!-- Uncomment below interceptors to use CXF interceptor method -->
        <!--jaxws:outInterceptors>
            <ref bean="TimestampSignEncrypt_Response"/>
        </jaxws:outInterceptors>
        <jaxws:inInterceptors>
            <ref bean="TimestampSignEncrypt_Request"/>
            <bean class="org.apache.cxf.ws.security.wss4j.DefaultCryptoCoverageChecker"/>
        </jaxws:inInterceptors-->
    </jaxws:endpoint>

    <!--    
        This bean is needed only if you're using the CXF interceptor method (per above 
        configuration, it's ignored if you're using the WS-SecurityPolicy method.)

        WSS4JInInterceptor for decrypting and validating the signature of the
        SOAP request.
    -->
    <!--bean 
        id="TimestampSignEncrypt_Request"
        class="org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor"
        >
        <constructor-arg>
            <map>
                <entry key="action" value="Timestamp Signature Encrypt"/>
                <entry key="signaturePropFile" value="serviceKeystore.properties"/>
                <entry key="decryptionPropFile" value="serviceKeystore.properties"/>
                <entry key="passwordCallbackClass" value="service.ServiceKeystorePasswordCallback"/>
                <entry key="encryptionKeyTransportAlgorithm" value="http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/>
                <entry key="signatureAlgorithm" value="http://www.w3.org/2000/09/xmldsig#rsa-sha1"/>
            </map>
        </constructor-arg>
    </bean-->
    
    <!--    
        This bean is needed only if you're using the CXF interceptor method (per above 
        configuration, it's ignored if you're using the WS-SecurityPolicy method.)

        WSS4JOutInterceptor for encoding and signing the SOAP response.    
    -->
    <!--bean 
        id="TimestampSignEncrypt_Response"
        class="org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor"
        >
        <constructor-arg>
            <map>
                <entry key="action" value="Timestamp Signature Encrypt"/>
                <entry key="user" value="myservicekey"/>
                <entry key="signaturePropFile" value="serviceKeystore.properties"/>
                <entry key="encryptionPropFile" value="serviceKeystore.properties"/>
                <entry key="encryptionUser" value="useReqSigCert"/>
                <entry key="passwordCallbackClass" value="service.ServiceKeystorePasswordCallback"/>
                <entry key="signatureParts" value="{Element}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp;{Element}{http://schemas.xmlsoap.org/soap/envelope/}Body"/>
                <entry key="encryptionParts" value="{Element}{http://www.w3.org/2000/09/xmldsig#}Signature;{Content}{http://schemas.xmlsoap.org/soap/envelope/}Body"/>
                <entry key="encryptionSymAlgorithm" value="http://www.w3.org/2001/04/xmlenc#tripledes-cbc"/>
                <entry key="encryptionKeyTransportAlgorithm" value="http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/>
                <entry key="signatureAlgorithm" value="http://www.w3.org/2000/09/xmldsig#rsa-sha1"/>
            </map>
        </constructor-arg>
    </bean-->   

</beans>
