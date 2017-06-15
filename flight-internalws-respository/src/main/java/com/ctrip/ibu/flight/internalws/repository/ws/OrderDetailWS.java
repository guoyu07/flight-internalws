package com.ctrip.ibu.flight.internalws.repository.ws;

import com.ctrip.ibu.flight.internalws.business.model.OrderDetailModel;
import com.ctrip.ibu.flight.internalws.business.model.OrderDetailSearchModel;
import com.ctrip.soa.global.api.orderdetailsearch.v1.GaOrderDetailSearchRequest;
import com.ctrip.soa.global.api.orderdetailsearch.v1.GaOrderDetailSearchResponse;
import com.ctrip.soa.international.ibuflightapi.service.v1.IBUFlightAPIClient;

/**
 * Created by kyxie on 2017/6/15.
 */
public class OrderDetailWS extends BaseWS implements MethodInvoker<OrderDetailSearchModel,OrderDetailModel,GaOrderDetailSearchRequest,GaOrderDetailSearchResponse> {
    @Override
    public GaOrderDetailSearchRequest convertRequestToGaRequest(OrderDetailSearchModel searchModel) {
        GaOrderDetailSearchRequest gaRequest = new GaOrderDetailSearchRequest();
        if (searchModel == null){
            return gaRequest;
        }

        gaRequest.setHead(getHead(searchModel.getUid()));
        gaRequest.setOrderIDList(searchModel.getOrderIds());

        return gaRequest;
    }

    @Override
    public GaOrderDetailSearchResponse invokeMethod(IBUFlightAPIClient client, GaOrderDetailSearchRequest request) throws Exception {
        return client.gaOrderDetailSearch(request);
    }

    @Override
    public OrderDetailModel convertGaResponseToResponse(GaOrderDetailSearchResponse gaResponse) {
        return null;
    }

    @Override
    public String methodName() {
        return null;
    }

}
