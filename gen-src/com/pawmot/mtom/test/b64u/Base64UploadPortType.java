package com.pawmot.mtom.test.b64u;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-20T17:09:20.917+02:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://www.pawmot.com/Base64Upload_1_0/", name = "base64UploadPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2017-05-20T17:09:20.917+02:00", comments = "Apache CXF 3.1.11")
public interface Base64UploadPortType {

    @WebMethod(action = "http://www.pawmot.com/Base64Upload_1_0/base64Upload")
    @WebResult(name = "base64UploadResponse", targetNamespace = "http://www.pawmot.com/Base64Upload_1_0/", partName = "response")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2017-05-20T17:09:20.917+02:00")
    public Base64UploadResponseType base64Upload(
        @WebParam(partName = "request", name = "base64UploadRequest", targetNamespace = "http://www.pawmot.com/Base64Upload_1_0/")
        Base64UploadRequestType request
    ) throws FaultMsg;
}
