// Generated by eBay Common SDK Platform
package com.ctrip.soa.global.api.distributionsearchflight.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * 打包产品类型
 */
@XmlType(name = "DistributionFlightPackageType")
@XmlEnum
@SuppressWarnings("all")
public enum DistributionFlightPackageType {

    /**
     * 普通产品
     */
    @XmlEnumValue("NA")
    NA(0, "NA"),

    /**
     * 国内旅行套餐（不累计携程积分 英文只做礼品卡）
     */
    @XmlEnumValue("TravelPackage")
    TravelPackage(1, "TravelPackage"),

    /**
     * 国内优选套餐（中文有 保险，租车优惠券，任我游礼品卡，英文只做 礼品卡）
     */
    @XmlEnumValue("PriorityPackage")
    PriorityPackage(2, "PriorityPackage"),

    /**
     * 国内商务优选（非套餐）
     */
    @XmlEnumValue("BusinessPriority")
    BusinessPriority(3, "BusinessPriority"),

    /**
     * 国内航司直营（同优选套餐，英文只做礼品卡）
     */
    @XmlEnumValue("AirLineMarketing")
    AirLineMarketing(4, "AirLineMarketing"),

    /**
     * 国内携程飞金产品
     */
    @XmlEnumValue("SubsidyProduct")
    SubsidyProduct(5, "SubsidyProduct"),

    /**
     * 特殊舱位
     */
    @XmlEnumValue("SpecialClass")
    SpecialClass(6, "SpecialClass"),

    /**
     * 国际旅行套餐
     */
    @XmlEnumValue("Exclusive")
    Exclusive(7, "Exclusive"),

    /**
     * 国际商务优选
     */
    @XmlEnumValue("Prioritizing")
    Prioritizing(8, "Prioritizing"),

    /**
     * 国际航司直营
     */
    @XmlEnumValue("LowestPrice")
    LowestPrice(9, "LowestPrice"),

    /**
     * 国际旗舰店
     */
    @XmlEnumValue("FlagShopStore")
    FlagShopStore(10, "FlagShopStore"),

    /**
     * 特惠专享，通过PU下RecommendedInfo有值时判断
     */
    @XmlEnumValue("Recommended")
    Recommended(11, "Recommended"),

    /**
     * 公布转私有产品
     */
    @XmlEnumValue("Cloud")
    Cloud(12, "Cloud"),

    /**
     * 多PU
     */
    @XmlEnumValue("CombinedProduct")
    CombinedProduct(13, "CombinedProduct");

    private final int intValue;
    private final String value;

    DistributionFlightPackageType(int intValue, String value) {
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
    public static DistributionFlightPackageType fromValue(String v) {
        for (DistributionFlightPackageType e: DistributionFlightPackageType.values()) {
            if (e.value.equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public static DistributionFlightPackageType findByValue(int value) {
        switch (value) {
            case 0:
                return NA;
            case 1:
                return TravelPackage;
            case 2:
                return PriorityPackage;
            case 3:
                return BusinessPriority;
            case 4:
                return AirLineMarketing;
            case 5:
                return SubsidyProduct;
            case 6:
                return SpecialClass;
            case 7:
                return Exclusive;
            case 8:
                return Prioritizing;
            case 9:
                return LowestPrice;
            case 10:
                return FlagShopStore;
            case 11:
                return Recommended;
            case 12:
                return Cloud;
            case 13:
                return CombinedProduct;
            default:
                return null;
        }
    }
}