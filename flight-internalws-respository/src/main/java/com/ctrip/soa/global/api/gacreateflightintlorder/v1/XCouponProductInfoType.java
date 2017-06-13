/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gacreateflightintlorder.v1;

import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 所有优惠券信息
 */
@DtoDoc("所有优惠券信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCouponProductInfoType", propOrder = {
    "hotelCouponProductList",
    "couponProductDetail"
})
@SuppressWarnings("all")
public class XCouponProductInfoType  {

    private static final long serialVersionUID = 1L;

    public XCouponProductInfoType(
        List<HotelCouponProductType> hotelCouponProductList, 
        List<HotelCouponProductType> couponProductDetail) {
        this.hotelCouponProductList = hotelCouponProductList;
        this.couponProductDetail = couponProductDetail;
    }

    public XCouponProductInfoType() {
    }

    @FieldDoc("酒店优惠券")
    @JsonProperty("HotelCouponProductList")
    @XmlElement(name = "HotelCouponProductList")
    private List<HotelCouponProductType> hotelCouponProductList;

    @FieldDoc("特权接送券")
    @JsonProperty("CouponProductDetail")
    @XmlElement(name = "CouponProductDetail")
    private List<HotelCouponProductType> couponProductDetail;

    /**
     * 酒店优惠券
     */
    public List<HotelCouponProductType> getHotelCouponProductList() {
        return this.hotelCouponProductList;
    }

    public void setHotelCouponProductList(List<HotelCouponProductType> hotelCouponProductList) {
        this.hotelCouponProductList = hotelCouponProductList;
    }

    /**
     * 特权接送券
     */
    public List<HotelCouponProductType> getCouponProductDetail() {
        return this.couponProductDetail;
    }

    public void setCouponProductDetail(List<HotelCouponProductType> couponProductDetail) {
        this.couponProductDetail = couponProductDetail;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final XCouponProductInfoType other = (XCouponProductInfoType)obj;
        return
            Objects.equal(this.hotelCouponProductList, other.hotelCouponProductList) && 
            Objects.equal(this.couponProductDetail, other.couponProductDetail);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.hotelCouponProductList);
        result = 31 * result + Objects.hashCode(this.couponProductDetail);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("hotelCouponProductList", hotelCouponProductList)
            .add("couponProductDetail", couponProductDetail)
            .toString();
    }
}