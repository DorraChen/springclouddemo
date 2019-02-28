package com.example.springcloud.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author clz
 * @date 2019/02/28 10:22
 */
@RestController
public class RibbonController {
    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("testribbon")
    public String testRibbon(){
        ServiceInstance instance = loadBalancer.choose("stores");
        return instance.getHost() + ":" + instance.getPort();
    }
}
