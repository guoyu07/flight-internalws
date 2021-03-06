/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.orderdetailsearch.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * X产品信息
 */
@DtoDoc("X产品信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XProductDetail", propOrder = {
    "valueAddedBaggageInfo",
    "airportLoungeInfo",
    "xCouponProductInfo"
})
@SuppressWarnings("all")
public class XProductDetail  {

    private static final long serialVersionUID = 1L;

    public XProductDetail(
        ValueAddedBaggageDetail valueAddedBaggageInfo, 
        AirportLoungeDetail airportLoungeInfo, 
        XCouponProductDetail xCouponProductInfo) {
        this.valueAddedBaggageInfo = valueAddedBaggageInfo;
        this.airportLoungeInfo = airportLoungeInfo;
        this.xCouponProductInfo = xCouponProductInfo;
    }

    public XProductDetail() {
    }

    @FieldDoc("行李额信息")
    @JsonProperty("ValueAddedBaggageInfo")
    @XmlElement(name = "ValueAddedBaggageInfo")
    private ValueAddedBaggageDetail valueAddedBaggageInfo;

    @FieldDoc("休息室信息")
    @JsonProperty("AirportLoungeInfo")
    @XmlElement(name = "AirportLoungeInfo")
    private AirportLoungeDetail airportLoungeInfo;

    @FieldDoc("优惠券信息")
    @JsonProperty("XCouponProductInfo")
    @XmlElement(name = "XCouponProductInfo")
    private XCouponProductDetail xCouponProductInfo;

    /**
     * 行李额信息
     */
    public ValueAddedBaggageDetail getValueAddedBaggageInfo() {
        return this.valueAddedBaggageInfo;
    }

    public void setValueAddedBaggageInfo(ValueAddedBaggageDetail valueAddedBaggageInfo) {
        this.valueAddedBaggageInfo = valueAddedBaggageInfo;
    }

    /**
     * 休息室信息
     */
    public AirportLoungeDetail getAirportLoungeInfo() {
        return this.airportLoungeInfo;
    }

    public void setAirportLoungeInfo(AirportLoungeDetail airportLoungeInfo) {
        this.airportLoungeInfo = airportLoungeInfo;
    }

    /**
     * 优惠券信息
     */
    public XCouponProductDetail getXCouponProductInfo() {
        return this.xCouponProductInfo;
    }

    public void setXCouponProductInfo(XCouponProductDetail xCouponProductInfo) {
        this.xCouponProductInfo = xCouponProductInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final XProductDetail other = (XProductDetail)obj;
        return
            Objects.equal(this.valueAddedBaggageInfo, other.valueAddedBaggageInfo) && 
            Objects.equal(this.airportLoungeInfo, other.airportLoungeInfo) && 
            Objects.equal(this.xCouponProductInfo, other.xCouponProductInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.valueAddedBaggageInfo);
        result = 31 * result + Objects.hashCode(this.airportLoungeInfo);
        result = 31 * result + Objects.hashCode(this.xCouponProductInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("valueAddedBaggageInfo", valueAddedBaggageInfo)
            .add("airportLoungeInfo", airportLoungeInfo)
            .add("xCouponProductInfo", xCouponProductInfo)
            .toString();
    }
}