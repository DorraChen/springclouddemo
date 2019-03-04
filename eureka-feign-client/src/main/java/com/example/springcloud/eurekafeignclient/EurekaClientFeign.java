package com.example.springcloud.eurekafeignclient;

import com.example.springcloud.eurekafeignclient.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author clz
 * @date 2019/02/28 16:10
 */
@FeignClient(value = "eureka-client",configuration = FeignConfig.class)
public interface EurekaClientFeign {
    /**
     * @param name
     * @return
     */
    @GetMapping("hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
