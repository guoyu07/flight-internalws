/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.validationmulticurrencycoupon.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 优惠券验证响应
 */
@DtoDoc("优惠券验证响应")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ValidationMultiCurrencyCouponResponse", namespace = "http://soa.ctrip.com/Global/API/ValidationMultiCurrencyCoupon/v1")
@XmlType(name = "ValidationMultiCurrencyCouponResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "code",
    "validMultiCurrencyCouponInfoList"
})
@SuppressWarnings("all")
public class ValidationMultiCurrencyCouponResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public ValidationMultiCurrencyCouponResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        Integer code, 
        List<ValidMultiCurrencyCouponInfo> validMultiCurrencyCouponInfoList) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.code = code;
        this.validMultiCurrencyCouponInfoList = validMultiCurrencyCouponInfoList;
    }

    public ValidationMultiCurrencyCouponResponse() {
    }

    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("1:成功 0:失败")
    @JsonProperty("Code")
    @XmlElement(name = "Code", nillable = true)
    private Integer code;

    @FieldDoc("优惠券Code")
    @JsonProperty("ValidMultiCurrencyCouponInfoList")
    @XmlElement(name = "ValidMultiCurrencyCouponInfoList")
    private List<ValidMultiCurrencyCouponInfo> validMultiCurrencyCouponInfoList;

    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    /**
     * 1:成功 0:失败
     */
    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 优惠券Code
     */
    public List<ValidMultiCurrencyCouponInfo> getValidMultiCurrencyCouponInfoList() {
        return this.validMultiCurrencyCouponInfoList;
    }

    public void setValidMultiCurrencyCouponInfoList(List<ValidMultiCurrencyCouponInfo> validMultiCurrencyCouponInfoList) {
        this.validMultiCurrencyCouponInfoList = validMultiCurrencyCouponInfoList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ValidationMultiCurrencyCouponResponse other = (ValidationMultiCurrencyCouponResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.code, other.code) && 
            Objects.equal(this.validMultiCurrencyCouponInfoList, other.validMultiCurrencyCouponInfoList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.code);
        result = 31 * result + Objects.hashCode(this.validMultiCurrencyCouponInfoList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("code", code)
            .add("validMultiCurrencyCouponInfoList", validMultiCurrencyCouponInfoList)
            .toString();
    }
}