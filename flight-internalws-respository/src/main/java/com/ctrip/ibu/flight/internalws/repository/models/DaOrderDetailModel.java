package com.ctrip.ibu.flight.internalws.repository.models;

import java.util.List;

/**
 * Created by kyxie on 2017/6/18.
 */
public class DaOrderDetailModel {
    private List<DaOrderDetail> orderDetails;

    public List<DaOrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<DaOrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
