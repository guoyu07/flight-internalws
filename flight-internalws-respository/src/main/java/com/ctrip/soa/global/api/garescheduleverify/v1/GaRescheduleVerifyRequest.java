/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.garescheduleverify.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.flightcommon.v1.ProductKeyInfo;
import com.ctrip.soa.global.api.flightcommon.v1.RQPassengerInfo;
import com.ctrip.soa.global.api.flightcommon.v1.RescheduleSegment;
import com.ctriposs.baiji.rpc.common.apidoc.DtoDoc;
import com.ctriposs.baiji.rpc.common.apidoc.FieldDoc;
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
 * 机票改签验舱验价接口请求
 */
@DtoDoc("机票改签验舱验价接口请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaRescheduleVerifyRequest", namespace = "http://soa.ctrip.com/Global/API/GaRescheduleVerify/v1")
@XmlType(name = "GaRescheduleVerifyRequest", propOrder = {
    "head",
    "orderID",
    "flightOrderClass",
    "passengerInfoList",
    "rescheduleSegmentList",
    "productKeyInfo",
    "verifyTokenNumber",
    "isSynchronized"
})
@SuppressWarnings("all")
public class GaRescheduleVerifyRequest  {

    private static final long serialVersionUID = 1L;

    public GaRescheduleVerifyRequest(
        Head head, 
        long orderID, 
        String flightOrderClass, 
        List<RQPassengerInfo> passengerInfoList, 
        List<RescheduleSegment> rescheduleSegmentList, 
        ProductKeyInfo productKeyInfo, 
        String verifyTokenNumber, 
        boolean isSynchronized) {
        this.head = head;
        this.orderID = orderID;
        this.flightOrderClass = flightOrderClass;
        this.passengerInfoList = passengerInfoList;
        this.rescheduleSegmentList = rescheduleSegmentList;
        this.productKeyInfo = productKeyInfo;
        this.verifyTokenNumber = verifyTokenNumber;
        this.isSynchronized = isSynchronized;
    }

    public GaRescheduleVerifyRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("改签订单号")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("I：国际，N：国内")
    @JsonProperty("FlightOrderClass")
    @XmlElement(name = "FlightOrderClass")
    private String flightOrderClass;

    @FieldDoc("改签人")
    @JsonProperty("PassengerInfoList")
    @XmlElement(name = "PassengerInfoList")
    private List<RQPassengerInfo> passengerInfoList;

    @FieldDoc("改签航班列表")
    @JsonProperty("RescheduleSegmentList")
    @XmlElement(name = "RescheduleSegmentList")
    private List<RescheduleSegment> rescheduleSegmentList;

    @FieldDoc("国际机票验舱验价必传，来源于GetBookingInfo接口中")
    @JsonProperty("ProductKeyInfo")
    @XmlElement(name = "ProductKeyInfo")
    private ProductKeyInfo productKeyInfo;

    @FieldDoc("可定检查TokenNumber")
    @JsonProperty("VerifyTokenNumber")
    @XmlElement(name = "VerifyTokenNumber")
    private String verifyTokenNumber;

    @FieldDoc("是否同步")
    @JsonProperty("IsSynchronized")
    @XmlElement(name = "IsSynchronized")
    private boolean isSynchronized;

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
     * 改签订单号
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * I：国际，N：国内
     */
    public String getFlightOrderClass() {
        return this.flightOrderClass;
    }

    public void setFlightOrderClass(String flightOrderClass) {
        this.flightOrderClass = flightOrderClass;
    }

    /**
     * 改签人
     */
    public List<RQPassengerInfo> getPassengerInfoList() {
        return this.passengerInfoList;
    }

    public void setPassengerInfoList(List<RQPassengerInfo> passengerInfoList) {
        this.passengerInfoList = passengerInfoList;
    }

    /**
     * 改签航班列表
     */
    public List<RescheduleSegment> getRescheduleSegmentList() {
        return this.rescheduleSegmentList;
    }

    public void setRescheduleSegmentList(List<RescheduleSegment> rescheduleSegmentList) {
        this.rescheduleSegmentList = rescheduleSegmentList;
    }

    /**
     * 国际机票验舱验价必传，来源于GetBookingInfo接口中
     */
    public ProductKeyInfo getProductKeyInfo() {
        return this.productKeyInfo;
    }

    public void setProductKeyInfo(ProductKeyInfo productKeyInfo) {
        this.productKeyInfo = productKeyInfo;
    }

    /**
     * 可定检查TokenNumber
     */
    public String getVerifyTokenNumber() {
        return this.verifyTokenNumber;
    }

    public void setVerifyTokenNumber(String verifyTokenNumber) {
        this.verifyTokenNumber = verifyTokenNumber;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaRescheduleVerifyRequest other = (GaRescheduleVerifyRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.flightOrderClass, other.flightOrderClass) && 
            Objects.equal(this.passengerInfoList, other.passengerInfoList) && 
            Objects.equal(this.rescheduleSegmentList, other.rescheduleSegmentList) && 
            Objects.equal(this.productKeyInfo, other.productKeyInfo) && 
            Objects.equal(this.verifyTokenNumber, other.verifyTokenNumber) && 
            Objects.equal(this.isSynchronized, other.isSynchronized);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.flightOrderClass);
        result = 31 * result + Objects.hashCode(this.passengerInfoList);
        result = 31 * result + Objects.hashCode(this.rescheduleSegmentList);
        result = 31 * result + Objects.hashCode(this.productKeyInfo);
        result = 31 * result + Objects.hashCode(this.verifyTokenNumber);
        result = 31 * result + Objects.hashCode(this.isSynchronized);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("orderID", orderID)
            .add("flightOrderClass", flightOrderClass)
            .add("passengerInfoList", passengerInfoList)
            .add("rescheduleSegmentList", rescheduleSegmentList)
            .add("productKeyInfo", productKeyInfo)
            .add("verifyTokenNumber", verifyTokenNumber)
            .add("isSynchronized", isSynchronized)
            .toString();
    }
}