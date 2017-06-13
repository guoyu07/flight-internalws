/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gaflightintlverify.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctrip.soa.global.api.flightcommon.v1.BookabilityResponse;
import com.ctrip.soa.global.api.flightcommon.v1.RepricingResponse;
import com.ctriposs.baiji.rpc.common.HasResponseStatus;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
import com.ctriposs.baiji.rpc.common.types.ResponseStatusType;
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
 * 国际机票满仓查询返回值
 */
@DtoDoc("国际机票满仓查询返回值")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaFlightIntlVerifyResponse", namespace = "http://soa.ctrip.com/Global/API/GaFlightIntlVerify/v1")
@XmlType(name = "GaFlightIntlVerifyResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "errorCode",
    "errorMsg",
    "bookabilityResponse",
    "repricingResponse",
    "needStopVerify",
    "validationResult"
})
@SuppressWarnings("all")
public class GaFlightIntlVerifyResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaFlightIntlVerifyResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        int errorCode, 
        String errorMsg, 
        BookabilityResponse bookabilityResponse, 
        RepricingResponse repricingResponse, 
        boolean needStopVerify, 
        String validationResult) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.bookabilityResponse = bookabilityResponse;
        this.repricingResponse = repricingResponse;
        this.needStopVerify = needStopVerify;
        this.validationResult = validationResult;
    }

    public GaFlightIntlVerifyResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("**弃用，挪到ResponseHead中**")
    @JsonProperty("ErrorCode")
    @XmlElement(name = "ErrorCode")
    private int errorCode;

    @FieldDoc("**弃用，挪到ResponseHead中**")
    @JsonProperty("ErrorMsg")
    @XmlElement(name = "ErrorMsg")
    private String errorMsg;

    @FieldDoc("可定检查信息")
    @JsonProperty("BookabilityResponse")
    @XmlElement(name = "BookabilityResponse")
    private BookabilityResponse bookabilityResponse;

    @FieldDoc("运价检查信息")
    @JsonProperty("RepricingResponse")
    @XmlElement(name = "RepricingResponse")
    private RepricingResponse repricingResponse;

    @FieldDoc("客户端是否需要停止验舱验价")
    @JsonProperty("NeedStopVerify")
    @XmlElement(name = "NeedStopVerify")
    private boolean needStopVerify;

    @FieldDoc("验证结果（通过 拦截 处理中 变价）")
    @JsonProperty("ValidationResult")
    @XmlElement(name = "ValidationResult")
    private String validationResult;

    /**
     * SOA2.0返回头部信息
     */
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
     * **弃用，挪到ResponseHead中**
     */
    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * **弃用，挪到ResponseHead中**
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * 可定检查信息
     */
    public BookabilityResponse getBookabilityResponse() {
        return this.bookabilityResponse;
    }

    public void setBookabilityResponse(BookabilityResponse bookabilityResponse) {
        this.bookabilityResponse = bookabilityResponse;
    }

    /**
     * 运价检查信息
     */
    public RepricingResponse getRepricingResponse() {
        return this.repricingResponse;
    }

    public void setRepricingResponse(RepricingResponse repricingResponse) {
        this.repricingResponse = repricingResponse;
    }

    /**
     * 客户端是否需要停止验舱验价
     */
    public boolean getNeedStopVerify() {
        return this.needStopVerify;
    }

    public void setNeedStopVerify(boolean needStopVerify) {
        this.needStopVerify = needStopVerify;
    }

    /**
     * 验证结果（通过 拦截 处理中 变价）
     */
    public String getValidationResult() {
        return this.validationResult;
    }

    public void setValidationResult(String validationResult) {
        this.validationResult = validationResult;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaFlightIntlVerifyResponse other = (GaFlightIntlVerifyResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.errorCode, other.errorCode) && 
            Objects.equal(this.errorMsg, other.errorMsg) && 
            Objects.equal(this.bookabilityResponse, other.bookabilityResponse) && 
            Objects.equal(this.repricingResponse, other.repricingResponse) && 
            Objects.equal(this.needStopVerify, other.needStopVerify) && 
            Objects.equal(this.validationResult, other.validationResult);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.errorCode);
        result = 31 * result + Objects.hashCode(this.errorMsg);
        result = 31 * result + Objects.hashCode(this.bookabilityResponse);
        result = 31 * result + Objects.hashCode(this.repricingResponse);
        result = 31 * result + Objects.hashCode(this.needStopVerify);
        result = 31 * result + Objects.hashCode(this.validationResult);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("errorCode", errorCode)
            .add("errorMsg", errorMsg)
            .add("bookabilityResponse", bookabilityResponse)
            .add("repricingResponse", repricingResponse)
            .add("needStopVerify", needStopVerify)
            .add("validationResult", validationResult)
            .toString();
    }
}