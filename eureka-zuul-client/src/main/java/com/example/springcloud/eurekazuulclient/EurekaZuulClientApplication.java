package com.example.springcloud.eurekazuulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author admin
 * @date 2019-03-06 14:35:05
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class EurekaZuulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulClientApplication.class, args);
	}

}
