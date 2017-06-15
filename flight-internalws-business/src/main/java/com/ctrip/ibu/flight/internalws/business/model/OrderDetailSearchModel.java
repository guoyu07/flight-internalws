package com.ctrip.ibu.flight.internalws.business.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kyxie on 2017/6/15.
 */
public class OrderDetailSearchModel implements Serializable {
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
