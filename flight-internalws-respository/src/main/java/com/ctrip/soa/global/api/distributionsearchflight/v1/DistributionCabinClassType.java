// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.distributionsearchflight.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 主舱类型
 */
@XmlType(name = "DistributionCabinClassType")
@XmlEnum
@SuppressWarnings("all")
public enum DistributionCabinClassType {

    /**
     * 经济舱
     */
    @XmlEnumValue("Economy")
    Economy(0, "Economy"),

    /**
     * 超级经济舱
     */
    @XmlEnumValue("Premium")
    Premium(1, "Premium"),

    /**
     * 商务舱
     */
    @XmlEnumValue("Business")
    Business(2, "Business"),

    /**
     * 头等舱
     */
    @XmlEnumValue("First")
    First(3, "First");

    private final int intValue;
    private final String value;

    DistributionCabinClassType(int intValue, String value) {
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
    public static DistributionCabinClassType fromValue(String v) {
        for (DistributionCabinClassType e: DistributionCabinClassType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static DistributionCabinClassType findByValue(int value) {
        switch (value) {
            case 0:
                return Economy;
            case 1:
                return Premium;
            case 2:
                return Business;
            case 3:
                return First;
            default:
                return null;
        }
    }
}