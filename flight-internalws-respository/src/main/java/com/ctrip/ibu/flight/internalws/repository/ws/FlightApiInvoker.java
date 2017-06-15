package com.ctrip.ibu.flight.internalws.repository.ws;

import com.ctrip.ibu.flight.internalws.business.model.ApiInvokeException;
import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.international.ibuflightapi.service.v1.IBUFlightAPIClient;

/**
 * Created by kyxie on 2017/6/15.
 */
public class FlightApiInvoker {

    public static <TRequest,TResponse,GaTRequest,GaTResponse> TResponse invokeApi(TRequest request, MethodInvoker<TRequest,TResponse,GaTRequest,GaTResponse> methodInvoker)
            throws Exception {
        TResponse response = null;

        if (request == null)return response;

        IBUFlightAPIClient client = IBUFlightAPIClient.getInstance();

        //Request参数转换为调用API Request参数
        GaTRequest gaRequest = methodInvoker.convertRequestToGaRequest(request);

        GaTResponse gaResponse = null;
        try {
            //调用API
            gaResponse = methodInvoker.invokeMethod(client,gaRequest);
        }catch (Exception e){
            //包装异常，重新抛出
            throw new ApiInvokeException(methodInvoker.methodName(),e);
        }
        response = methodInvoker.convertGaResponseToResponse(gaResponse);
        return response;
    }
}
