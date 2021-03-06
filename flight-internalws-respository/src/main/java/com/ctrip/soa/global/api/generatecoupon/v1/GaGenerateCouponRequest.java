/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.generatecoupon.v1;

import com.ctrip.soa.global.api.comm.head.v1.RequestHead;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 优惠券生成请求
 */
@DtoDoc("优惠券生成请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGenerateCouponRequest", namespace = "http://soa.ctrip.com/Global/API/GenerateCoupon/v1")
@XmlType(name = "GaGenerateCouponRequest", propOrder = {
    "promotionID",
    "productLineID"
})
@SuppressWarnings("all")
public class GaGenerateCouponRequest extends RequestHead  {

    private static final long serialVersionUID = 1L;

    public GaGenerateCouponRequest(
        Integer promotionID, 
        Integer productLineID) {
        this.promotionID = promotionID;
        this.productLineID = productLineID;
    }

    public GaGenerateCouponRequest() {
    }

    @FieldDoc("策略编号")
    @JsonProperty("PromotionID")
    @XmlElement(name = "PromotionID", nillable = true)
    private Integer promotionID;

    @FieldDoc("生产线ID")
    @JsonProperty("ProductLineID")
    @XmlElement(name = "ProductLineID", nillable = true)
    private Integer productLineID;

    /**
     * 策略编号
     */
    public Integer getPromotionID() {
        return this.promotionID;
    }

    public void setPromotionID(Integer promotionID) {
        this.promotionID = promotionID;
    }

    /**
     * 生产线ID
     */
    public Integer getProductLineID() {
        return this.productLineID;
    }

    public void setProductLineID(Integer productLineID) {
        this.productLineID = productLineID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGenerateCouponRequest other = (GaGenerateCouponRequest)obj;
        return
            Objects.equal(this.promotionID, other.promotionID) && 
            Objects.equal(this.productLineID, other.productLineID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.promotionID);
        result = 31 * result + Objects.hashCode(this.productLineID);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("promotionID", promotionID)
            .add("productLineID", productLineID)
            .toString();
    }
}