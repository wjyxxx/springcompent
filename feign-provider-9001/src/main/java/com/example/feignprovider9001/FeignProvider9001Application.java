package com.example.feignprovider9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * feign提供者,eureka发现者
 */
//@Configuration
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class FeignProvider9001Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignProvider9001Application.class, args);
    }

}
