package com.example.feigncustomer10001.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient("feign-provider-9000")
public interface FeignService {

    @GetMapping("/test/port")
    public String getPort();

}
