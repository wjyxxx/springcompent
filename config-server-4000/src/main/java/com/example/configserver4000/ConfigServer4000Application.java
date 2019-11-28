package com.example.configserver4000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
//@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServer4000Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer4000Application.class, args);
    }

}
