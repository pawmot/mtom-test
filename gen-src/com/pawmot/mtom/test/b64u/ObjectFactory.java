
package com.pawmot.mtom.test.b64u;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pawmot.mtom.test.b64u package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Base64UploadRequest_QNAME = new QName("http://www.pawmot.com/Base64Upload_1_0/", "base64UploadRequest");
    private final static QName _Base64UploadResponse_QNAME = new QName("http://www.pawmot.com/Base64Upload_1_0/", "base64UploadResponse");
    private final static QName _Fault_QNAME = new QName("http://www.pawmot.com/Base64Upload_1_0/", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pawmot.mtom.test.b64u
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Base64UploadRequestType }
     * 
     */
    public Base64UploadRequestType createBase64UploadRequestType() {
        return new Base64UploadRequestType();
    }

    /**
     * Create an instance of {@link Base64UploadResponseType }
     * 
     */
    public Base64UploadResponseType createBase64UploadResponseType() {
        return new Base64UploadResponseType();
    }

    /**
     * Create an instance of {@link Base64ServiceFaultType }
     * 
     */
    public Base64ServiceFaultType createBase64ServiceFaultType() {
        return new Base64ServiceFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64UploadRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pawmot.com/Base64Upload_1_0/", name = "base64UploadRequest")
    public JAXBElement<Base64UploadRequestType> createBase64UploadRequest(Base64UploadRequestType value) {
        return new JAXBElement<Base64UploadRequestType>(_Base64UploadRequest_QNAME, Base64UploadRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64UploadResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pawmot.com/Base64Upload_1_0/", name = "base64UploadResponse")
    public JAXBElement<Base64UploadResponseType> createBase64UploadResponse(Base64UploadResponseType value) {
        return new JAXBElement<Base64UploadResponseType>(_Base64UploadResponse_QNAME, Base64UploadResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64ServiceFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pawmot.com/Base64Upload_1_0/", name = "fault")
    public JAXBElement<Base64ServiceFaultType> createFault(Base64ServiceFaultType value) {
        return new JAXBElement<Base64ServiceFaultType>(_Fault_QNAME, Base64ServiceFaultType.class, null, value);
    }

}
