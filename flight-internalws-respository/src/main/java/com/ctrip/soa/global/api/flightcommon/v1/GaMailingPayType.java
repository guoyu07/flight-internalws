// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.flightcommon.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 配送费支付类型类型
 */
@XmlType(name = "GaMailingPayType")
@XmlEnum
@SuppressWarnings("all")
public enum GaMailingPayType {

    @XmlEnumValue("Normal")
    Normal(0, "Normal"),

    @XmlEnumValue("Integral")
    Integral(1, "Integral"),

    @XmlEnumValue("GiftCard")
    GiftCard(2, "GiftCard"),

    @XmlEnumValue("DiamondFree")
    DiamondFree(3, "DiamondFree");

    private final int intValue;
    private final String value;

    GaMailingPayType(int intValue, String value) {
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
    public static GaMailingPayType fromValue(String v) {
        for (GaMailingPayType e: GaMailingPayType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static GaMailingPayType findByValue(int value) {
        switch (value) {
            case 0:
                return Normal;
            case 1:
                return Integral;
            case 2:
                return GiftCard;
            case 3:
                return DiamondFree;
            default:
                return null;
        }
    }
}