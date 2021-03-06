//
// Copyright (c) 2015 Kamil Baczkowicz
//
// CSOFF: a.*
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Timestamp removed by maven-replacer-plugin to avoid detecting changes - see the project POM for details
//


package pl.baczkowicz.mqttspy.configuration.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Plain"/>
 *     &lt;enumeration value="HexDecode"/>
 *     &lt;enumeration value="HexEncode"/>
 *     &lt;enumeration value="Base64Decode"/>
 *     &lt;enumeration value="Base64Encode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
*/
@SuppressWarnings("all")
@XmlType(name = "ConversionMethod")
@XmlEnum
public enum ConversionMethod {

    @XmlEnumValue("Plain")
    PLAIN("Plain"),
    @XmlEnumValue("HexDecode")
    HEX_DECODE("HexDecode"),
    @XmlEnumValue("HexEncode")
    HEX_ENCODE("HexEncode"),
    @XmlEnumValue("Base64Decode")
    BASE_64_DECODE("Base64Decode"),
    @XmlEnumValue("Base64Encode")
    BASE_64_ENCODE("Base64Encode");
    private final String value;

    ConversionMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionMethod fromValue(String v) {
        for (ConversionMethod c: ConversionMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
