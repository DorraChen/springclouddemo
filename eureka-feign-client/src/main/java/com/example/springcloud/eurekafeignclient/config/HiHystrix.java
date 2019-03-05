package com.example.springcloud.eurekafeignclient.config;

import com.example.springcloud.eurekafeignclient.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @author clz
 * @date 2019/03/04 16:24
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi, "+name+", sorry, error exists!";
    }
}
