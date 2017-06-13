/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.gachangepaymentrelation.v1;

import com.ctrip.soa.global.api.comm.head.v1.Head;
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
 * 继续支付更换ExternalNo请求
 */
@DtoDoc("继续支付更换ExternalNo请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "GaChangePaymentRelationRequest", namespace = "http://soa.ctrip.com/Global/API/GaChangePaymentRelation/v1")
@XmlType(name = "GaChangePaymentRelationRequest", propOrder = {
    "head",
    "mainOrderID",
    "orderID",
    "merchantID",
    "refExternalNo",
    "allOrderID"
})
@SuppressWarnings("all")
public class GaChangePaymentRelationRequest  {

    private static final long serialVersionUID = 1L;

    public GaChangePaymentRelationRequest(
        Head head, 
        long mainOrderID, 
        long orderID, 
        int merchantID, 
        String refExternalNo, 
        List<Long> allOrderID) {
        this.head = head;
        this.mainOrderID = mainOrderID;
        this.orderID = orderID;
        this.merchantID = merchantID;
        this.refExternalNo = refExternalNo;
        this.allOrderID = allOrderID;
    }

    public GaChangePaymentRelationRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("主订单ID，详情接口有返回")
    @JsonProperty("MainOrderID")
    @XmlElement(name = "MainOrderID")
    private long mainOrderID;

    @FieldDoc("订单ID")
    @JsonProperty("OrderID")
    @XmlElement(name = "OrderID")
    private long orderID;

    @FieldDoc("商户号")
    @JsonProperty("MerchantID")
    @XmlElement(name = "MerchantID")
    private int merchantID;

    @FieldDoc("老的ExternalNo，详情接口有返回")
    @JsonProperty("RefExternalNo")
    @XmlElement(name = "RefExternalNo")
    private String refExternalNo;

    @FieldDoc("所有订单ID，从订单详情去拿,老版本继续传orderid，新的版本传这个字段，api会去做兼容，当拆单，所有订单id都要给，没有拆单的时候，就只传一个订单号")
    @JsonProperty("AllOrderID")
    @XmlElement(name = "AllOrderID")
    private List<Long> allOrderID;

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
     * 主订单ID，详情接口有返回
     */
    public long getMainOrderID() {
        return this.mainOrderID;
    }

    public void setMainOrderID(long mainOrderID) {
        this.mainOrderID = mainOrderID;
    }

    /**
     * 订单ID
     */
    public long getOrderID() {
        return this.orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    /**
     * 商户号
     */
    public int getMerchantID() {
        return this.merchantID;
    }

    public void setMerchantID(int merchantID) {
        this.merchantID = merchantID;
    }

    /**
     * 老的ExternalNo，详情接口有返回
     */
    public String getRefExternalNo() {
        return this.refExternalNo;
    }

    public void setRefExternalNo(String refExternalNo) {
        this.refExternalNo = refExternalNo;
    }

    /**
     * 所有订单ID，从订单详情去拿,老版本继续传orderid，新的版本传这个字段，api会去做兼容，当拆单，所有订单id都要给，没有拆单的时候，就只传一个订单号
     */
    public List<Long> getAllOrderID() {
        return this.allOrderID;
    }

    public void setAllOrderID(List<Long> allOrderID) {
        this.allOrderID = allOrderID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final GaChangePaymentRelationRequest other = (GaChangePaymentRelationRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.mainOrderID, other.mainOrderID) && 
            Objects.equal(this.orderID, other.orderID) && 
            Objects.equal(this.merchantID, other.merchantID) && 
            Objects.equal(this.refExternalNo, other.refExternalNo) && 
            Objects.equal(this.allOrderID, other.allOrderID);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.mainOrderID);
        result = 31 * result + Objects.hashCode(this.orderID);
        result = 31 * result + Objects.hashCode(this.merchantID);
        result = 31 * result + Objects.hashCode(this.refExternalNo);
        result = 31 * result + Objects.hashCode(this.allOrderID);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("mainOrderID", mainOrderID)
            .add("orderID", orderID)
            .add("merchantID", merchantID)
            .add("refExternalNo", refExternalNo)
            .add("allOrderID", allOrderID)
            .toString();
    }
}