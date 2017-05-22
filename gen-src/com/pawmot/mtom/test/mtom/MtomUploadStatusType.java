
package com.pawmot.mtom.test.mtom;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mtomUploadStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mtomUploadStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "mtomUploadStatusType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-05-20T05:09:21+02:00", comments = "JAXB RI v2.2.11")
public enum MtomUploadStatusType {

    OK;

    public String value() {
        return name();
    }

    public static MtomUploadStatusType fromValue(String v) {
        return valueOf(v);
    }

}
