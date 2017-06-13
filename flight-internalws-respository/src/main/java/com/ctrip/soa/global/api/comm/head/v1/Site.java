// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.comm.head.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 站点缩写
 */
@XmlType(name = "Site")
@XmlEnum
@SuppressWarnings("all")
public enum Site {

    @XmlEnumValue("HK_EN")
    HK_EN(0, "HK_EN"),

    @XmlEnumValue("EnglishSite")
    EnglishSite(1, "EnglishSite"),

    @XmlEnumValue("HKSite")
    HKSite(2, "HKSite"),

    @XmlEnumValue("KRSite")
    KRSite(3, "KRSite"),

    @XmlEnumValue("JPSite")
    JPSite(4, "JPSite"),

    @XmlEnumValue("SGSite")
    SGSite(5, "SGSite"),

    @XmlEnumValue("TWSite")
    TWSite(6, "TWSite"),

    @XmlEnumValue("THSite")
    THSite(7, "THSite"),

    @XmlEnumValue("DESite")
    DESite(8, "DESite"),

    @XmlEnumValue("FRSite")
    FRSite(9, "FRSite"),

    @XmlEnumValue("ESSite")
    ESSite(10, "ESSite"),

    @XmlEnumValue("RUSite")
    RUSite(11, "RUSite"),

    @XmlEnumValue("VNSite")
    VNSite(12, "VNSite"),

    @XmlEnumValue("MYSite")
    MYSite(13, "MYSite"),

    @XmlEnumValue("IDSite")
    IDSite(14, "IDSite"),

    @XmlEnumValue("CNSite")
    CNSite(15, "CNSite");

    private final int intValue;
    private final String value;

    Site(int intValue, String value) {
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
    public static Site fromValue(String v) {
        for (Site e: Site.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static Site findByValue(int value) {
        switch (value) {
            case 0:
                return HK_EN;
            case 1:
                return EnglishSite;
            case 2:
                return HKSite;
            case 3:
                return KRSite;
            case 4:
                return JPSite;
            case 5:
                return SGSite;
            case 6:
                return TWSite;
            case 7:
                return THSite;
            case 8:
                return DESite;
            case 9:
                return FRSite;
            case 10:
                return ESSite;
            case 11:
                return RUSite;
            case 12:
                return VNSite;
            case 13:
                return MYSite;
            case 14:
                return IDSite;
            case 15:
                return CNSite;
            default:
                return null;
        }
    }
}