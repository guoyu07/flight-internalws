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
 * 重复订单状态信息
 */
@DtoDoc("重复订单状态信息")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepeatOrderInfo", propOrder = {
    "orderID",
    "repeatOrderStatus"
})
@SuppressWarnings("all")
public class RepeatOrderInfo  {

    private static final long serialVersionUID = 1L;

    public RepeatOrderInfo(
        long orderID, 
        String repeatOrderStatus) {
        this.orderID = orderID;
        this.repeatOrderStatus = repeatOrderStatus;
    }

    public RepeatOrderInfo() {
    }

    @FieldDoc("重复订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("当前重复订单状态(UNPAY:提交未支付,TIMEOVERLAP:已支付,乘机人信息相同且时间有重叠,FULLOVERLAP:已支付,乘机人信息相同且时间完全相同)")
    @JsonProperty("RepeatOrderStatus")
    @XmlElement(name = "RepeatOrderStatus")
    private String repeatOrderStatus;

    /**
     * 重复订单号
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * 当前重复订单状态(UNPAY:提交未支付,TIMEOVERLAP:已支付,乘机人信息相同且时间有重叠,FULLOVERLAP:已支付,乘机人信息相同且时间完全相同)
     */
    public String getRepeatOrderStatus() {
        return this.repeatOrderStatus;
    }

    public void setRepeatOrderStatus(String repeatOrderStatus) {
        this.repeatOrderStatus = repeatOrderStatus;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final RepeatOrderInfo other = (RepeatOrderInfo)obj;
        return
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.repeatOrderStatus, other.repeatOrderStatus);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.repeatOrderStatus);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("orderID", orderID)
            .add("repeatOrderStatus", repeatOrderStatus)
            .toString();
    }
}