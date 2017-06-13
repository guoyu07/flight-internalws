// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.flightcommon.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 机票进位规则
 */
@XmlType(name = "FlightCarryRule")
@XmlEnum
@SuppressWarnings("all")
public enum FlightCarryRule {

    /**
     * 向上取整13.01 换算为 14
     */
    @XmlEnumValue("IC")
    IC(0, "IC"),

    /**
     * 向下取整13.99 换算为13
     */
    @XmlEnumValue("IF")
    IF(1, "IF"),

    /**
     * 保留小数点，进位，如12.131，保留两位小数，等于12.14
     */
    @XmlEnumValue("DC")
    DC(2, "DC"),

    /**
     * 保留小数点，舍尾，如12.138，保留两位小数，等于12.13
     */
    @XmlEnumValue("DF")
    DF(3, "DF"),

    /**
     * 保留小数点，四舍五入，如12.135换算为12.14，12.1349 换算为12.13
     */
    @XmlEnumValue("DR")
    DR(4, "DR");

    private final int intValue;
    private final String value;

    FlightCarryRule(int intValue, String value) {
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
    public static FlightCarryRule fromValue(String v) {
        for (FlightCarryRule e: FlightCarryRule.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static FlightCarryRule findByValue(int value) {
        switch (value) {
            case 0:
                return IC;
            case 1:
                return IF;
            case 2:
                return DC;
            case 3:
                return DF;
            case 4:
                return DR;
            default:
                return null;
        }
    }
}