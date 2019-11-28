package com.example.feignprovider9002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @GetMapping("/test/port")
    public String getPort(){
        return "feign-provider-9000`port is :"+port;
    }


}
