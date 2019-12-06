package com.example.feigncustomer10001.controller;

import com.example.feigncustomer10001.bean.TbUser;
import com.example.feigncustomer10001.service.FeignService;
import com.example.feigncustomer10001.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private FeignService feignService;

    @Autowired
    private TbUserService tbUserService;

    @Value("${server.port}")
    String port;

    @Value("${spring.datasource.url}")
    String url;
    @GetMapping("/url")
    public String getUrl(){
        return url;
    }

    @GetMapping("/remote/{pt}")
    public String getPort(@PathVariable String pt){
        return feignService.getPort();// + ">>>feign-customer-10000`port is :" +port + ">>>参数路径为:"+pt;
    }

    @GetMapping("/findAll")
    public List<TbUser> findAll(){
        return tbUserService.findAll();
    }
}
