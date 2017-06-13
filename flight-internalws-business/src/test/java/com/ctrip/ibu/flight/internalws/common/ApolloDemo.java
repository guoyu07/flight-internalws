package com.ctrip.ibu.flight.internalws.common;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import org.junit.Test;

public class ApolloDemo {
    @Test
    public void getAppConfig() throws Exception {
        Config config = ConfigService.getAppConfig();
        String key = "timeout";
        Integer defaultTimeout = 5000;

        Integer value = config.getIntProperty(key, defaultTimeout);

        System.out.println(String.format("======== Value for application config: %s is %d ========", key, value));
    }
}
