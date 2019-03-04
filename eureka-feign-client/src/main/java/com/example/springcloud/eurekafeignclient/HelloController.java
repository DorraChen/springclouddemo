package com.example.springcloud.eurekafeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author clz
 * @date 2019/02/28 16:17
 */
@RestController
public class HelloController {
    @Autowired
    EurekaClientFeign eurekaClientFeign;

    @GetMapping("hi")
    public String sayHi(@RequestParam(defaultValue = "springcloud", required = false) String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
