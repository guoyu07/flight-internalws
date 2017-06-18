package com.ctrip.ibu.flight.internalws.repository.models;

import java.util.List;

/**
 * Created by kyxie on 2017/6/18.
 */
public class DaOrderDetailSearchModel {

    private List<Long> orderIds;
    private String uid;

    public List<Long> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
