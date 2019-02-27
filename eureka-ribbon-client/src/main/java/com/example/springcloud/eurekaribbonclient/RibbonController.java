package com.example.springcloud.eurekaribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author clz
 * @date 2019/02/27 14:58
 */
@RestController
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("hi")
    public String hi(@RequestParam(required = false,defaultValue = "springclouddemo") String name){
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }
}
