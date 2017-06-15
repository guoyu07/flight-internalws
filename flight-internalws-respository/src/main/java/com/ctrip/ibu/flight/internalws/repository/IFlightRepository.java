package com.ctrip.ibu.flight.internalws.repository;

import com.ctrip.ibu.flight.internalws.business.model.OrderDetailModel;
import com.ctrip.ibu.flight.internalws.business.model.OrderDetailSearchModel;

/**
 * 机票仓储
 * Created by kyxie on 2017/6/15.
 */
public interface IFlightRepository {

    OrderDetailModel getOrderDetail(OrderDetailSearchModel searchModel);
}
