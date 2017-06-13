package com.ctrip.ibu.flight.internalws.service;

import com.ctriposs.baiji.rpc.common.types.*;
import org.springframework.stereotype.Component;

/**
 * IBU机票内部服务
 */
@Component
public class IBUFlightInternalWSImpl implements IBUFlightInternalWS {
    @Override
    public SendMessageResponseType sendMessage(SendMessageRequestType request) throws Exception {
        return new SendMessageResponseType();
    }

    @Override
    public CheckHealthResponseType checkHealth(CheckHealthRequestType request) throws Exception {
        return new CheckHealthResponseType();
    }
}