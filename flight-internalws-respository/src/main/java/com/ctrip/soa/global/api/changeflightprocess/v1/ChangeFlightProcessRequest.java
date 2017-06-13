/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.changeflightprocess.v1;

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
@XmlRootElement(name = "ChangeFlightProcessRequest", namespace = "http://soa.ctrip.com/Global/API/ChangeFlightProcess/v1")
@XmlType(name = "ChangeFlightProcessRequest", propOrder = {
    "head",
    "orderID",
    "changeOrderID"
})
@SuppressWarnings("all")
public class ChangeFlightProcessRequest  {

    private static final long serialVersionUID = 1L;

    public ChangeFlightProcessRequest(
        Head head, 
        long orderID, 
        long changeOrderID) {
        this.head = head;
        this.orderID = orderID;
        this.changeOrderID = changeOrderID;
    }

    public ChangeFlightProcessRequest() {
    }

    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("航变订单处理流水号")
    @JsonProperty("ChangeOrderID")
    @XmlElement(name = "ChangeOrderID")
    private long changeOrderID;

    public Head getHead() {
        return this.head;
    }

    public void setHead(Head head) {
        this.head = head;
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

    /**
     * 航变订单处理流水号
     */
    public long getChangeOrderID() {
        return this.changeOrderID;
    }

    public void setChangeOrderID(long changeOrderID) {
        this.changeOrderID = changeOrderID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final ChangeFlightProcessRequest other = (ChangeFlightProcessRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.changeOrderID, other.changeOrderID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.changeOrderID);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("orderID", orderID)
            .add("changeOrderID", changeOrderID)
            .toString();
    }
}