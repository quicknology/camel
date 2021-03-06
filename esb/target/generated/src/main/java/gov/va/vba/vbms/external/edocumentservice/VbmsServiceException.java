
package gov.va.vba.vbms.external.edocumentservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-19T00:42:22.114-04:00
 * Generated source version: 3.0.0-milestone2
 */

@WebFault(name = "faultDetailBean", targetNamespace = "http://vbms.vba.va.gov/cdm")
public class VbmsServiceException extends Exception {
    
    private gov.va.vba.vbms.cdm.FaultDetailBean faultDetailBean;

    public VbmsServiceException() {
        super();
    }
    
    public VbmsServiceException(String message) {
        super(message);
    }
    
    public VbmsServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public VbmsServiceException(String message, gov.va.vba.vbms.cdm.FaultDetailBean faultDetailBean) {
        super(message);
        this.faultDetailBean = faultDetailBean;
    }

    public VbmsServiceException(String message, gov.va.vba.vbms.cdm.FaultDetailBean faultDetailBean, Throwable cause) {
        super(message, cause);
        this.faultDetailBean = faultDetailBean;
    }

    public gov.va.vba.vbms.cdm.FaultDetailBean getFaultInfo() {
        return this.faultDetailBean;
    }
}
