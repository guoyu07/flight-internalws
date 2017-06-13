/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.reservation.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
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

@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ReservationRequest", namespace = "http://soa.ctrip.com/Global/API/Reservation/v1")
@XmlType(name = "ReservationRequest", propOrder = {
    "head",
    "isSynchronized",
    "tokenNumber",
    "orderID"
})
@SuppressWarnings("all")
public class ReservationRequest  {

    private static final long serialVersionUID = 1L;

    public ReservationRequest(
        Head head, 
        boolean isSynchronized, 
        String tokenNumber, 
        long orderID) {
        this.head = head;
        this.isSynchronized = isSynchronized;
        this.tokenNumber = tokenNumber;
        this.orderID = orderID;
    }

    public ReservationRequest() {
    }

    @FieldDoc("request头信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("是否同步")
    @JsonProperty("IsSynchronized")
    @XmlElement(name = "IsSynchronized")
    private boolean isSynchronized;

    @FieldDoc("唯一的Token：如果不为空，表示是异步获取订位结果")
    @JsonProperty("TokenNumber")
    @XmlElement(name = "TokenNumber")
    private String tokenNumber;

    @FieldDoc("订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    /**
     * request头信息
     */
    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    /**
     * 是否同步
     */
    public boolean getIsSynchronized() {
        return this.isSynchronized;
    }

    public void setIsSynchronized(boolean isSynchronized) {
        this.isSynchronized = isSynchronized;
    }

    /**
     * 唯一的Token：如果不为空，表示是异步获取订位结果
     */
    public String getTokenNumber() {
        return this.tokenNumber;
    }

    public void setTokenNumber(String tokenNumber) {
        this.tokenNumber = tokenNumber;
    }

    /**
     * 订单号
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ReservationRequest other = (ReservationRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.isSynchronized, other.isSynchronized) && 
            Objects.equal(this.tokenNumber, other.tokenNumber) && 
            Objects.equal(this.orderID, other.orderID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.isSynchronized);
        result = 31 * result + Objects.hashCode(this.tokenNumber);
        result = 31 * result + Objects.hashCode(this.orderID);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("isSynchronized", isSynchronized)
            .add("tokenNumber", tokenNumber)
            .add("orderID", orderID)
            .toString();
    }
}