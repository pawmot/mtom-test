
package com.pawmot.mtom.test.mtom;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for mtomUploadResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mtomUploadResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.pawmot.com/MtomUpload_1_0/}mtomUploadStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mtomUploadResponseType", propOrder = {
    "status"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
public class MtomUploadResponseType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    protected MtomUploadStatusType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link MtomUploadStatusType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public MtomUploadStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link MtomUploadStatusType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public void setStatus(MtomUploadStatusType value) {
        this.status = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
