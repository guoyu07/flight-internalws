package com.ctrip.ibu.flight.internalws.common;

import credis.java.client.CacheProvider;
import credis.java.client.util.CacheFactory;

/**
 * Created by f_xie on 2017/1/5.
 */
public class CredisDemo {

    private static CacheProvider provider;
    static {
        //集群名需要申请,FrameworkTest01属于测试集群名
        provider = CacheFactory.GetProvider("FrameworkTest01");
    }

    public static void main(String[] args) {
        provider.del("TestKey");
        provider.set("TestKey","TestValue");
        System.out.printf("输出结果:"+provider.get("TestKey"));
    }
}