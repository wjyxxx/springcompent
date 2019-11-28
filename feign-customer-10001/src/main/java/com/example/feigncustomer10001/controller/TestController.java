package com.example.feigncustomer10001.controller;

import com.example.feigncustomer10001.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private FeignService feignService;

    @Value("${server.port}")
    String port;

    @GetMapping("/remote/{pt}")
    public String getPort(@PathVariable String pt){

        return feignService.getPort() + ">>>feign-customer-10000`port is :" +port + ">>>参数路径为:"+pt;
    }


}
