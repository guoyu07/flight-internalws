/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.flightcommon.v1;

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
 * 满仓查询返回值
 */
@DtoDoc("满仓查询返回值")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookabilityResponse", propOrder = {
    "errorCode",
    "errorMsg",
    "tokenNumber",
    "errorResult",
    "bookable",
    "bookabilityStatus"
})
@SuppressWarnings("all")
public class BookabilityResponse  {

    private static final long serialVersionUID = 1L;

    public BookabilityResponse(
        int errorCode, 
        String errorMsg, 
        String tokenNumber, 
        int errorResult, 
        boolean bookable, 
        String bookabilityStatus) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.tokenNumber = tokenNumber;
        this.errorResult = errorResult;
        this.bookable = bookable;
        this.bookabilityStatus = bookabilityStatus;
    }

    public BookabilityResponse() {
    }

    @FieldDoc("错误编号,0为正确")
    @JsonProperty("ErrorCode")
    @XmlElement(name = "ErrorCode")
    private int errorCode;

    @FieldDoc("错误消息")
    @JsonProperty("ErrorMsg")
    @XmlElement(name = "ErrorMsg")
    private String errorMsg;

    @FieldDoc("唯一标识的TokenNumber")
    @JsonProperty("TokenNumber")
    @XmlElement(name = "TokenNumber")
    private String tokenNumber;

    @FieldDoc("0：校验不通过  1：处理中  2：异常")
    @JsonProperty("ErrorResult")
    @XmlElement(name = "ErrorResult")
    private int errorResult;

    @FieldDoc("是否可订")
    @JsonProperty("Bookable")
    @XmlElement(name = "Bookable")
    private boolean bookable;

    @FieldDoc("验舱结果状态 AV_YES.AV_FULL.AV_NO.AV_IN_PROCESS")
    @JsonProperty("BookabilityStatus")
    @XmlElement(name = "BookabilityStatus")
    private String bookabilityStatus;

    /**
     * 错误编号,0为正确
     */
    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 错误消息
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * 唯一标识的TokenNumber
     */
    public String getTokenNumber() {
        return this.tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    /**
     * 0：校验不通过  1：处理中  2：异常
     */
    public int getErrorResult() {
        return this.errorResult;
    }

    public void setErrorResult(int errorResult) {
        this.errorResult = errorResult;
    }

    /**
     * 是否可订
     */
    public boolean getBookable() {
        return this.bookable;
    }

    public void setBookable(boolean bookable) {
        this.bookable = bookable;
    }

    /**
     * 验舱结果状态 AV_YES.AV_FULL.AV_NO.AV_IN_PROCESS
     */
    public String getBookabilityStatus() {
        return this.bookabilityStatus;
    }

    public void setBookabilityStatus(String bookabilityStatus) {
        this.bookabilityStatus = bookabilityStatus;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final BookabilityResponse other = (BookabilityResponse)obj;
        return
            Objects.equal(this.errorCode, other.errorCode) && 
            Objects.equal(this.errorMsg, other.errorMsg) && 
            Objects.equal(this.tokenNumber, other.tokenNumber) && 
            Objects.equal(this.errorResult, other.errorResult) && 
            Objects.equal(this.bookable, other.bookable) && 
            Objects.equal(this.bookabilityStatus, other.bookabilityStatus);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.errorCode);
        result = 31 * result + Objects.hashCode(this.errorMsg);
        result = 31 * result + Objects.hashCode(this.tokenNumber);
        result = 31 * result + Objects.hashCode(this.errorResult);
        result = 31 * result + Objects.hashCode(this.bookable);
        result = 31 * result + Objects.hashCode(this.bookabilityStatus);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("errorCode", errorCode)
            .add("errorMsg", errorMsg)
            .add("tokenNumber", tokenNumber)
            .add("errorResult", errorResult)
            .add("bookable", bookable)
            .add("bookabilityStatus", bookabilityStatus)
            .toString();
    }
}