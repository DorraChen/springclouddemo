package com.example.springcloud.eurekafeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author admin
 * @date 2019-02-28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignClientApplication.class, args);
	}

}
