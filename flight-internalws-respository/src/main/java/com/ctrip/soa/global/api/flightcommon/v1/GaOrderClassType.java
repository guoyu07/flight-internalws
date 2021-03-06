// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.flightcommon.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 订单类型
 */
@XmlType(name = "GaOrderClassType")
@XmlEnum
@SuppressWarnings("all")
public enum GaOrderClassType {

    /**
     * 国际航班
     */
    @XmlEnumValue("I")
    I(0, "I"),

    /**
     * 国内航班
     */
    @XmlEnumValue("N")
    N(1, "N");

    private final int intValue;
    private final String value;

    GaOrderClassType(int intValue, String value) {
        this.intValue = intValue;
        this.value = value;
    }

    public int getValue() {
        return intValue;
    }

    @JsonValue
    public String value() {
        return value;
    }

    @JsonCreator
    public static GaOrderClassType fromValue(String v) {
        for (GaOrderClassType e: GaOrderClassType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static GaOrderClassType findByValue(int value) {
        switch (value) {
            case 0:
                return I;
            case 1:
                return N;
            default:
                return null;
        }
    }
}