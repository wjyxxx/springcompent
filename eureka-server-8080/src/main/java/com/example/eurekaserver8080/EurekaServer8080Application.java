package com.example.eurekaserver8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务端
 */
@EnableDiscoveryClient
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8080Application.class, args);
    }

}
