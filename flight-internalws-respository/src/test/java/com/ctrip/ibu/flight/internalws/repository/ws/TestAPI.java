package com.ctrip.ibu.flight.internalws.repository.ws;

import com.ctrip.soa.global.api.comm.head.v1.Head;
import com.ctrip.soa.global.api.orderdetailsearch.v1.GaOrderDetailSearchRequest;
import com.ctrip.soa.global.api.orderdetailsearch.v1.GaOrderDetailSearchResponse;
import com.ctrip.soa.international.ibuflightapi.service.v1.IBUFlightAPIClient;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyxie on 2017/6/13.
 */
public class TestAPI extends TestCase {

    @Test
    public void testApi(){
        IBUFlightAPIClient client = IBUFlightAPIClient.getInstance("http://ws.flight.ibu.fat55.qa.nt.ctripcorp.com/intlflightapi");
        Assert.assertNotNull(client);

        GaOrderDetailSearchResponse orderDetail = null;
        GaOrderDetailSearchRequest request = new GaOrderDetailSearchRequest();

        try{
            orderDetail = client.gaOrderDetailSearch(request);
        }catch (Exception e){
            e.printStackTrace();
        }

        Assert.assertNotNull(orderDetail);

        //new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
    }

    @Test
    public void testFlightApiInvoker(){

    }
}
