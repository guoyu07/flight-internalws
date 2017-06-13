/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gareschedulechangepayment.v1;

import com.ctrip.soa.global.api.comm.responsehead.v1.ResponseHead;
import com.ctrip.soa.global.api.flightcommon.v1.FlightPaymentInfoV2;
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
 * 机票改签修改支付方式接口返回
 */
@DtoDoc("机票改签修改支付方式接口返回")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaRescheduleChangePaymentResponse", namespace = "http://soa.ctrip.com/Global/API/GaRescheduleChangePayment/v1")
@XmlType(name = "GaRescheduleChangePaymentResponse", propOrder = {
    "responseStatus",
    "responseHead",
    "orderID",
    "transactionID",
    "outputExternalNo",
    "reschedulePaymentInfo"
})
@SuppressWarnings("all")
public class GaRescheduleChangePaymentResponse implements HasResponseStatus {

    private static final long serialVersionUID = 1L;

    public GaRescheduleChangePaymentResponse(
        ResponseStatusType responseStatus, 
        ResponseHead responseHead, 
        long orderID, 
        String transactionID, 
        String outputExternalNo, 
        FlightPaymentInfoV2 reschedulePaymentInfo) {
        this.responseStatus = responseStatus;
        this.responseHead = responseHead;
        this.orderID = orderID;
        this.transactionID = transactionID;
        this.outputExternalNo = outputExternalNo;
        this.reschedulePaymentInfo = reschedulePaymentInfo;
    }

    public GaRescheduleChangePaymentResponse() {
    }

    @FieldDoc("SOA2.0返回头部信息")
    @JsonProperty("ResponseStatus")
    @XmlElement(name = "ResponseStatus")
    private ResponseStatusType responseStatus;

    @FieldDoc("IBU返回头部信息")
    @JsonProperty("ResponseHead")
    @XmlElement(name = "ResponseHead")
    private ResponseHead responseHead;

    @FieldDoc("支付的订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("流水号，Online用")
    @JsonProperty("TransactionID")
    @XmlElement(name = "TransactionID")
    private String transactionID;

    @FieldDoc("新的继续支付ExternalNo")
    @JsonProperty("OutputExternalNo")
    @XmlElement(name = "OutputExternalNo")
    private String outputExternalNo;

    @FieldDoc("改签支付明细")
    @JsonProperty("ReschedulePaymentInfo")
    @XmlElement(name = "ReschedulePaymentInfo")
    private FlightPaymentInfoV2 reschedulePaymentInfo;

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
     * 支付的订单号
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * 流水号，Online用
     */
    public String getTransactionID() {
        return this.transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * 新的继续支付ExternalNo
     */
    public String getOutputExternalNo() {
        return this.outputExternalNo;
    }

    public void setOutputExternalNo(String outputExternalNo) {
        this.outputExternalNo = outputExternalNo;
    }

    /**
     * 改签支付明细
     */
    public FlightPaymentInfoV2 getReschedulePaymentInfo() {
        return this.reschedulePaymentInfo;
    }

    public void setReschedulePaymentInfo(FlightPaymentInfoV2 reschedulePaymentInfo) {
        this.reschedulePaymentInfo = reschedulePaymentInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaRescheduleChangePaymentResponse other = (GaRescheduleChangePaymentResponse)obj;
        return
            Objects.equal(this.responseStatus, other.responseStatus) && 
            Objects.equal(this.responseHead, other.responseHead) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.transactionID, other.transactionID) && 
            Objects.equal(this.outputExternalNo, other.outputExternalNo) && 
            Objects.equal(this.reschedulePaymentInfo, other.reschedulePaymentInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.responseStatus);
        result = 31 * result + Objects.hashCode(this.responseHead);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.transactionID);
        result = 31 * result + Objects.hashCode(this.outputExternalNo);
        result = 31 * result + Objects.hashCode(this.reschedulePaymentInfo);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("responseStatus", responseStatus)
            .add("responseHead", responseHead)
            .add("orderID", orderID)
            .add("transactionID", transactionID)
            .add("outputExternalNo", outputExternalNo)
            .add("reschedulePaymentInfo", reschedulePaymentInfo)
            .toString();
    }
}