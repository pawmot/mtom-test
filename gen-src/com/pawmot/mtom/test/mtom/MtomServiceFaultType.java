
package com.pawmot.mtom.test.mtom;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for mtomServiceFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mtomServiceFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mtomServiceFaultType", propOrder = {
    "code",
    "message",
    "source",
    "additionalInformation"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
public class MtomServiceFaultType {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    protected String code;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    protected String message;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    protected String source;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    protected String additionalInformation;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
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
