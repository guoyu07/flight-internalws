package com.ctrip.ibu.flight.internalws.repository;

import com.ctrip.ibu.flight.internalws.business.model.ApiInvokeException;
import com.ctrip.ibu.flight.internalws.business.model.OrderDetailModel;
import com.ctrip.ibu.flight.internalws.business.model.OrderDetailSearchModel;
import com.ctrip.ibu.flight.internalws.repository.ws.FlightApiInvoker;
import com.ctrip.ibu.flight.internalws.repository.ws.MethodInvoker;
import com.ctrip.ibu.flight.internalws.repository.ws.OrderDetailWS;
import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.orderdetailsearch.v1.GaOrderDetailSearchRequest;
import com.ctrip.soa.global.api.orderdetailsearch.v1.GaOrderDetailSearchResponse;
import com.ctrip.soa.international.ibuflightapi.service.v1.IBUFlightAPIClient;

import javax.inject.Inject;

/**
 * Created by kyxie on 2017/6/15.
 */
public class FlightRepository implements IFlightRepository{

    @Inject
    private OrderDetailWS orderDetailWS;

    @Override
    public OrderDetailModel getOrderDetail(OrderDetailSearchModel searchModel) {

        OrderDetailModel result = null;

        try{
            FlightApiInvoker.invokeApi(searchModel,orderDetailWS);
        } catch (ApiInvokeException e) {
            e.printStackTrace();
        } catch (Exception e){

        }

        return result;
    }
}
