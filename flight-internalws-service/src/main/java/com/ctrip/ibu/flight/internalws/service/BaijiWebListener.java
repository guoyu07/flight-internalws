package com.ctrip.ibu.flight.internalws.service;

import com.ctriposs.baiji.rpc.server.BaijiListener;
import com.ctriposs.baiji.rpc.server.HostConfig;

import javax.servlet.annotation.WebListener;

/**
 * IBU机票内部服务
 */
@WebListener
public class BaijiWebListener extends BaijiListener {
    public BaijiWebListener(){
	    super(IBUFlightInternalWSImpl.class);
	}

    @Override
    protected void configure(final HostConfig hostConfig) {

    }
}