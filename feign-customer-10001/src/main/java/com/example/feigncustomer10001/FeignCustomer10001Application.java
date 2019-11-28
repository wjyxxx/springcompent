package com.example.feigncustomer10001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * feign的消费者,eureka的发现者
 */

@Configuration
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class FeignCustomer10001Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignCustomer10001Application.class, args);
    }

}
