package com.ctrip.ibu.flight.internalws.repository.models;

/**
 * Created by kyxie on 2017/6/18.
 */
public class DaOrderDetail {
    private Long orderId;
    private String uid;
    private Long temoOrderId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getTemoOrderId() {
        return temoOrderId;
    }

    public void setTemoOrderId(Long temoOrderId) {
        this.temoOrderId = temoOrderId;
    }
}
