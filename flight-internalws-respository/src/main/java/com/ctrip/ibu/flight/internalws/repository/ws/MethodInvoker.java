package com.ctrip.ibu.flight.internalws.repository.ws;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.international.ibuflightapi.service.v1.IBUFlightAPIClient;

/**
 * Created by kyxie on 2017/6/15.
 */
public interface MethodInvoker <TRequest,TResponse,GaTRequest,GaTResponse> {

    /**
     * Request参数转换
     * */
    GaTRequest convertRequestToGaRequest(TRequest request);

    /**
     * 调用方法
     * */
    GaTResponse invokeMethod(IBUFlightAPIClient client,GaTRequest request) throws Exception;

    /**
     * Response转换
     * */
    TResponse convertGaResponseToResponse(GaTResponse gaResponse);

    /**
     * 调用的方法名称
     * */
    String methodName();

}
