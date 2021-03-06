/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.generatecoupon.v1;

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
 * 优惠券生成回应
 */
@DtoDoc("优惠券生成回应")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGenerateCouponResponse", namespace = "http://soa.ctrip.com/Global/API/GenerateCoupon/v1")
@XmlType(name = "GaGenerateCouponResponse", propOrder = {
    "responseHead",
    "isSuccessful",
    "resultCode",
    "resultNo",
    "responseStatus",
    "couponSerialNumberList",
    "couponList"
})
@SuppressWarnings("all")
public class GaGenerateCouponResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaGenerateCouponResponse(
        ResponseHead responseHead, 
        boolean isSuccessful, 
        String resultCode, 
        Integer resultNo, 
        ResponseStatusType responseStatus, 
        List<Integer> couponSerialNumberList, 
        List<CouponItem> couponList) {
        this.responseHead = responseHead;
        this.isSuccessful = isSuccessful;
        this.resultCode = resultCode;
        this.resultNo = resultNo;
        this.responseStatus = responseStatus;
        this.couponSerialNumberList = couponSerialNumberList;
        this.couponList = couponList;
    }

    public GaGenerateCouponResponse() {
    }

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("处理状态")
    @JsonProperty("IsSuccessful")
    @XmlElement(name = "IsSuccessful")
    private boolean isSuccessful;

    @FieldDoc("处理结果 \"Success\":接口调用成功，\"Fail\":接口调用失败，“UnKown”：SOA等异常")
    @JsonProperty("ResultCode")
    @XmlElement(name = "ResultCode")
    private String resultCode;

    @FieldDoc("返回代码" +
"int--适用于SOA1.0" +
"返回代码可能的值如下：" +
"1001-优惠策略ID[PromotionID]不能为空！" +
"1002-产品线ID[ProductLineID]不能为空！" +
"1003-生成数量[Count]不能超过20个！" +
"1004-生成数量[Count]不能小于等于0！" +
"byte--适用于SOA2.0" +
"返回代码可能的值如下：" +
"101-优惠策略ID[PromotionID]不能为空！" +
"102-产品线ID[ProductLineID]不能为空！" +
"103-生成数量[Count]不能超过20个！" +
"104-生成数量[Count]不能小于等于0！" +
"【以上为两种不同方式调用返回结果不同。】" +
"255-未知错误" +
"0-成功" +
"1-产品线不存在" +
"2-优惠策略不存在" +
"3-只有单次券和团购券才允许调用该接口" +
"4-当前优惠券代码生成次数余量小于请求的个数" +
"5-本次活动中已经申领过")
    @JsonProperty("ResultNo")
    @XmlElement(name = "ResultNo", nillable = true)
    private Integer resultNo;

    @FieldDoc("返回状态信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("优惠券ID列表")
    @JsonProperty("CouponSerialNumberList")
    @XmlElement(name = "CouponSerialNumberList")
    private List<Integer> couponSerialNumberList;

    @FieldDoc("优惠券信息列表")
    @JsonProperty("CouponList")
    @XmlElement(name = "CouponList")
    private List<CouponItem> couponList;

    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    /**
     * 处理状态
     */
    public boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public void setIsSuccessful(boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    /**
     * 处理结果 "Success":接口调用成功，"Fail":接口调用失败，“UnKown”：SOA等异常
     */
    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 返回代码
     * int--适用于SOA1.0
     * 返回代码可能的值如下：
     * 1001-优惠策略ID[PromotionID]不能为空！
     * 1002-产品线ID[ProductLineID]不能为空！
     * 1003-生成数量[Count]不能超过20个！
     * 1004-生成数量[Count]不能小于等于0！
     * byte--适用于SOA2.0
     * 返回代码可能的值如下：
     * 101-优惠策略ID[PromotionID]不能为空！
     * 102-产品线ID[ProductLineID]不能为空！
     * 103-生成数量[Count]不能超过20个！
     * 104-生成数量[Count]不能小于等于0！
     * 【以上为两种不同方式调用返回结果不同。】
     * 255-未知错误
     * 0-成功
     * 1-产品线不存在
     * 2-优惠策略不存在
     * 3-只有单次券和团购券才允许调用该接口
     * 4-当前优惠券代码生成次数余量小于请求的个数
     * 5-本次活动中已经申领过
     */
    public Integer getResultNo() {
        return this.resultNo;
    }

    public void setResultNo(Integer resultNo) {
        this.resultNo = resultNo;
    }

    /**
     * 返回状态信息
     */
    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * 优惠券ID列表
     */
    public List<Integer> getCouponSerialNumberList() {
        return this.couponSerialNumberList;
    }

    public void setCouponSerialNumberList(List<Integer> couponSerialNumberList) {
        this.couponSerialNumberList = couponSerialNumberList;
    }

    /**
     * 优惠券信息列表
     */
    public List<CouponItem> getCouponList() {
        return this.couponList;
    }

    public void setCouponList(List<CouponItem> couponList) {
        this.couponList = couponList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGenerateCouponResponse other = (GaGenerateCouponResponse)obj;
        return
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.isSuccessful, other.isSuccessful) && 
            Objects.equal(this.resultCode, other.resultCode) && 
            Objects.equal(this.resultNo, other.resultNo) && 
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.couponSerialNumberList, other.couponSerialNumberList) && 
            Objects.equal(this.couponList, other.couponList);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.isSuccessful);
        result = 31 * result + Objects.hashCode(this.resultCode);
        result = 31 * result + Objects.hashCode(this.resultNo);
        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.couponSerialNumberList);
        result = 31 * result + Objects.hashCode(this.couponList);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseHead", responseHead)
            .add("isSuccessful", isSuccessful)
            .add("resultCode", resultCode)
            .add("resultNo", resultNo)
            .add("responseStatus", responseStatus)
            .add("couponSerialNumberList", couponSerialNumberList)
            .add("couponList", couponList)
            .toString();
    }
}