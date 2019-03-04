package com.example.springcloud.eurekafeignclient.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author clz
 * @date 2019/02/28 16:11
 */
@Configuration
public class FeignConfig {
    @Bean
    public Retryer retryer(){
        return new Retryer.Default(100, SECONDS.toMillis(1), 5);
    }
}
