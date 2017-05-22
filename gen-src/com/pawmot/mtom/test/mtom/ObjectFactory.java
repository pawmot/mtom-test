
package com.pawmot.mtom.test.mtom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pawmot.mtom.test.mtom package. 
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

    private final static QName _MtomUploadRequest_QNAME = new QName("http://www.pawmot.com/MtomUpload_1_0/", "mtomUploadRequest");
    private final static QName _MtomUploadResponse_QNAME = new QName("http://www.pawmot.com/MtomUpload_1_0/", "mtomUploadResponse");
    private final static QName _Fault_QNAME = new QName("http://www.pawmot.com/MtomUpload_1_0/", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pawmot.mtom.test.mtom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MtomUploadRequestType }
     * 
     */
    public MtomUploadRequestType createMtomUploadRequestType() {
        return new MtomUploadRequestType();
    }

    /**
     * Create an instance of {@link MtomUploadResponseType }
     * 
     */
    public MtomUploadResponseType createMtomUploadResponseType() {
        return new MtomUploadResponseType();
    }

    /**
     * Create an instance of {@link MtomServiceFaultType }
     * 
     */
    public MtomServiceFaultType createMtomServiceFaultType() {
        return new MtomServiceFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MtomUploadRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pawmot.com/MtomUpload_1_0/", name = "mtomUploadRequest")
    public JAXBElement<MtomUploadRequestType> createMtomUploadRequest(MtomUploadRequestType value) {
        return new JAXBElement<MtomUploadRequestType>(_MtomUploadRequest_QNAME, MtomUploadRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MtomUploadResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pawmot.com/MtomUpload_1_0/", name = "mtomUploadResponse")
    public JAXBElement<MtomUploadResponseType> createMtomUploadResponse(MtomUploadResponseType value) {
        return new JAXBElement<MtomUploadResponseType>(_MtomUploadResponse_QNAME, MtomUploadResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MtomServiceFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pawmot.com/MtomUpload_1_0/", name = "fault")
    public JAXBElement<MtomServiceFaultType> createFault(MtomServiceFaultType value) {
        return new JAXBElement<MtomServiceFaultType>(_Fault_QNAME, MtomServiceFaultType.class, null, value);
    }

}
