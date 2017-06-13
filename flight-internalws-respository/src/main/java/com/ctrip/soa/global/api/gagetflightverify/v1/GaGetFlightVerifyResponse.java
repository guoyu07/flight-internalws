/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gagetflightverify.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctrip.soa.global.api.flightcommon.v1.GaVerifyStatus;
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
 * 移动端专用国际国内验舱验价响应
 */
@DtoDoc("移动端专用国际国内验舱验价响应")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaGetFlightVerifyResponse", namespace = "http://soa.ctrip.com/Global/API/GaGetFlightVerify/v1")
@XmlType(name = "GaGetFlightVerifyResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "verifyTokenNumber",
    "verifyStatus",
    "priceChangeInfo"
})
@SuppressWarnings("all")
public class GaGetFlightVerifyResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaGetFlightVerifyResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        String verifyTokenNumber, 
        GaVerifyStatus verifyStatus, 
        GaQTEPriceInfo priceChangeInfo) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.verifyTokenNumber = verifyTokenNumber;
        this.verifyStatus = verifyStatus;
        this.priceChangeInfo = priceChangeInfo;
    }

    public GaGetFlightVerifyResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("IBU返回头部信息")
    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("异步调用时，返回的Token")
    @JsonProperty("VerifyTokenNumber")
    @XmlElement(name = "VerifyTokenNumber")
    private String verifyTokenNumber;

    @FieldDoc("异步调用时，返回的Token")
    @JsonProperty("VerifyStatus")
    @XmlElement(name = "VerifyStatus")
    private GaVerifyStatus verifyStatus;

    @FieldDoc("变价信息")
    @JsonProperty("PriceChangeInfo")
    @XmlElement(name = "PriceChangeInfo")
    private GaQTEPriceInfo priceChangeInfo;

    /**
     * SOA2.0返回头部信息
     */
    public ResponseStatusType getResponseStatus() {
        return this.responseStatus;
    }

    public void setResponseStatus(ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }

    /**
     * IBU返回头部信息
     */
    public ResponseHead getResponseHead() {
        return this.responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    /**
     * 异步调用时，返回的Token
     */
    public String getVerifyTokenNumber() {
        return this.verifyTokenNumber;
    }

    public void setVerifyTokenNumber(String verifyTokenNumber) {
        this.verifyTokenNumber = verifyTokenNumber;
    }

    /**
     * 异步调用时，返回的Token
     */
    public GaVerifyStatus getVerifyStatus() {
        return this.verifyStatus;
    }

    public void setVerifyStatus(GaVerifyStatus verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * 变价信息
     */
    public GaQTEPriceInfo getPriceChangeInfo() {
        return this.priceChangeInfo;
    }

    public void setPriceChangeInfo(GaQTEPriceInfo priceChangeInfo) {
        this.priceChangeInfo = priceChangeInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaGetFlightVerifyResponse other = (GaGetFlightVerifyResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.verifyTokenNumber, other.verifyTokenNumber) && 
            Objects.equal(this.verifyStatus, other.verifyStatus) && 
            Objects.equal(this.priceChangeInfo, other.priceChangeInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.verifyTokenNumber);
        result = 31 * result + Objects.hashCode(this.verifyStatus);
        result = 31 * result + Objects.hashCode(this.priceChangeInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("verifyTokenNumber", verifyTokenNumber)
            .add("verifyStatus", verifyStatus)
            .add("priceChangeInfo", priceChangeInfo)
            .toString();
    }
}