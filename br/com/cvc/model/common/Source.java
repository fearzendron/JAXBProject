//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.01 at 01:12:49 AM BRT 
//


package br.com.cvc.model.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for source.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="source">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTO"/>
 *     &lt;enumeration value="CVC"/>
 *     &lt;enumeration value="EXPEDIA"/>
 *     &lt;enumeration value="JUNIPER"/>
 *     &lt;enumeration value="OMNIBEES"/>
 *     &lt;enumeration value="HOTELBEDS"/>
 *     &lt;enumeration value="CANGOOROO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "source")
@XmlEnum
public enum Source {

    AUTO,
    CVC,
    EXPEDIA,
    JUNIPER,
    OMNIBEES,
    HOTELBEDS,
    CANGOOROO;

    public String value() {
        return name();
    }

    public static Source fromValue(String v) {
        return valueOf(v);
    }

}
