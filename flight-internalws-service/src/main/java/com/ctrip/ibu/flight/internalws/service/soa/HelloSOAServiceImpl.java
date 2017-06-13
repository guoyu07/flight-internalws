package com.ctrip.ibu.flight.internalws.service.soa;

import org.springframework.stereotype.Component;

import com.ctrip.framework.soa.hellosoa.HelloInfo;
import com.ctrip.framework.soa.hellosoa.HelloRequestType;
import com.ctrip.framework.soa.hellosoa.HelloResponseType;
import com.ctrip.framework.soa.hellosoa.HelloSOAService;
import com.ctriposs.baiji.rpc.common.types.CheckHealthRequestType;
import com.ctriposs.baiji.rpc.common.types.CheckHealthResponseType;

@Component
public class HelloSOAServiceImpl implements HelloSOAService {

    @Override
    public HelloResponseType hello(HelloRequestType request) throws Exception {
        HelloResponseType response = new HelloResponseType();
        HelloInfo info = new HelloInfo();
        info.name = request.getName();
        info.message = "Hi " + request.getName() + ", welcome to use " + request.getService();
        response.setHelloInfo(info);
        return response;
    }

    @Override
    public CheckHealthResponseType checkHealth(CheckHealthRequestType request) throws Exception {
        return new CheckHealthResponseType();
    }
}