/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.ispaymentriskverifycompleted.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
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
 * 机票支付风控状态验证请求
 */
@DtoDoc("机票支付风控状态验证请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "IsPaymentRiskVerifyCompletedRequest", namespace = "http://soa.ctrip.com/Global/API/IsPaymentRiskVerifyCompleted/v1")
@XmlType(name = "IsPaymentRiskVerifyCompletedRequest", propOrder = {
    "head",
    "orderId"
})
@SuppressWarnings("all")
public class IsPaymentRiskVerifyCompletedRequest  {

    private static final long serialVersionUID = 1L;

    public IsPaymentRiskVerifyCompletedRequest(
        Head head, 
        long orderId) {
        this.head = head;
        this.orderId = orderId;
    }

    public IsPaymentRiskVerifyCompletedRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("订单Id")
    @JsonProperty("OrderId")
    @XmlElement(name = "OrderId")
    private long orderId;

    /**
     * SOA2.0请求头部信息
     */
    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * 订单Id
     */
    public long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final IsPaymentRiskVerifyCompletedRequest other = (IsPaymentRiskVerifyCompletedRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.orderId, other.orderId);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.orderId);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("orderId", orderId)
            .toString();
    }
}