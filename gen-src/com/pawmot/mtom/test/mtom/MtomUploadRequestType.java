
package com.pawmot.mtom.test.mtom;

import javax.activation.DataHandler;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for mtomUploadRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mtomUploadRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filename" type="{http://www.pawmot.com/MtomUpload_1_0/}string50Type"/&gt;
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mtomUploadRequestType", propOrder = {
    "filename",
    "content"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
public class MtomUploadRequestType {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    protected String filename;
    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    protected DataHandler content;

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public DataHandler getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public void setContent(DataHandler value) {
        this.content = value;
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
