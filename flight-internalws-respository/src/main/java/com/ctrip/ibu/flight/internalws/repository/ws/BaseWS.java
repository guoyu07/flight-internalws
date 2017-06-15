package com.ctrip.ibu.flight.internalws.repository.ws;

import com.ctrip.soa.global.api.comm.head.v1.Head;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by kyxie on 2017/6/15.
 */
public class BaseWS {

    /**
     * 获取请求头
     * @param uid 用户ID
     *            @return 请求Head
     * */
    public Head getHead(String uid){
        Head head = new Head();
        head.setApiKey("FlightInternalWS");
        head.setUid(uid);
        try {
            InetAddress address = InetAddress.getLocalHost();
            head.setIp(address.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return head;
    };
}
