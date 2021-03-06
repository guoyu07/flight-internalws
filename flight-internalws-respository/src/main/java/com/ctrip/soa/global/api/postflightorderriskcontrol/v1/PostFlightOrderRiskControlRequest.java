/**
 * Autogenerated by soa-sdk-toolkit
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ctrip.soa.global.api.postflightorderriskcontrol.v1;

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
 * 机票风控请求
 */
@DtoDoc("机票风控请求")
@JsonAutoDetect(getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PostFlightOrderRiskControlRequest", namespace = "http://soa.ctrip.com/Global/API/PostFlightOrderRiskControl/v1")
@XmlType(name = "PostFlightOrderRiskControlRequest", propOrder = {
    "head",
    "orderId",
    "merchantId",
    "did",
    "vid",
    "cybsdid",
    "rmsToken"
})
@SuppressWarnings("all")
public class PostFlightOrderRiskControlRequest  {

    private static final long serialVersionUID = 1L;

    public PostFlightOrderRiskControlRequest(
        Head head, 
        long orderId, 
        long merchantId, 
        String did, 
        String vid, 
        String cybsdid, 
        String rmsToken) {
        this.head = head;
        this.orderId = orderId;
        this.merchantId = merchantId;
        this.did = did;
        this.vid = vid;
        this.cybsdid = cybsdid;
        this.rmsToken = rmsToken;
    }

    public PostFlightOrderRiskControlRequest() {
    }

    @FieldDoc("SOA2.0请求头部信息")
    @JsonProperty("Head")
    @XmlElement(name = "Head")
    private Head head;

    @FieldDoc("订单Id")
    @JsonProperty("OrderId")
    @XmlElement(name = "OrderId")
    private long orderId;

    @FieldDoc("商户号")
    @JsonProperty("MerchantId")
    @XmlElement(name = "MerchantId")
    private long merchantId;

    @FieldDoc("订单下单页对应UBT数据中的DID")
    @JsonProperty("DID")
    @XmlElement(name = "DID")
    private String did;

    @FieldDoc("订单下单页对应UBT数据中的VID")
    @JsonProperty("VID")
    @XmlElement(name = "VID")
    private String vid;

    @FieldDoc("来自CYBS的DID信息")
    @JsonProperty("CYBSDID")
    @XmlElement(name = "CYBSDID")
    private String cybsdid;

    @FieldDoc("rmsToken")
    @JsonProperty("RmsToken")
    @XmlElement(name = "RmsToken")
    private String rmsToken;

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

    /**
     * 商户号
     */
    public long getMerchantId() {
        return this.merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 订单下单页对应UBT数据中的DID
     */
    public String getDid() {
        return this.did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    /**
     * 订单下单页对应UBT数据中的VID
     */
    public String getVid() {
        return this.vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    /**
     * 来自CYBS的DID信息
     */
    public String getCybsdid() {
        return this.cybsdid;
    }

    public void setCybsdid(String cybsdid) {
        this.cybsdid = cybsdid;
    }

    /**
     * rmsToken
     */
    public String getRmsToken() {
        return this.rmsToken;
    }

    public void setRmsToken(String rmsToken) {
        this.rmsToken = rmsToken;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        final PostFlightOrderRiskControlRequest other = (PostFlightOrderRiskControlRequest)obj;
        return
            Objects.equal(this.head, other.head) && 
            Objects.equal(this.orderId, other.orderId) && 
            Objects.equal(this.merchantId, other.merchantId) && 
            Objects.equal(this.did, other.did) && 
            Objects.equal(this.vid, other.vid) && 
            Objects.equal(this.cybsdid, other.cybsdid) && 
            Objects.equal(this.rmsToken, other.rmsToken);
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + Objects.hashCode(this.head);
        result = 31 * result + Objects.hashCode(this.orderId);
        result = 31 * result + Objects.hashCode(this.merchantId);
        result = 31 * result + Objects.hashCode(this.did);
        result = 31 * result + Objects.hashCode(this.vid);
        result = 31 * result + Objects.hashCode(this.cybsdid);
        result = 31 * result + Objects.hashCode(this.rmsToken);

        return result;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("head", head)
            .add("orderId", orderId)
            .add("merchantId", merchantId)
            .add("did", did)
            .add("vid", vid)
            .add("cybsdid", cybsdid)
            .add("rmsToken", rmsToken)
            .toString();
    }
}