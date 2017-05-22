
package com.pawmot.mtom.test.b64u;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for base64UploadResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="base64UploadResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.pawmot.com/Base64Upload_1_0/}base64UploadStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "base64UploadResponseType", propOrder = {
    "status"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:20+02:00", comments = "JAXB RI v2.2.11")
public class Base64UploadResponseType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:20+02:00", comments = "JAXB RI v2.2.11")
    protected Base64UploadStatusType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Base64UploadStatusType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:20+02:00", comments = "JAXB RI v2.2.11")
    public Base64UploadStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64UploadStatusType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:20+02:00", comments = "JAXB RI v2.2.11")
    public void setStatus(Base64UploadStatusType value) {
        this.status = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:20+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
