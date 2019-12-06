package com.example.feigncustomer10001.service;

import com.example.feigncustomer10001.hystrix.FallbackClientFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value = "feign-provider-9000", fallbackFactory = FallbackClientFactory.class)
public interface FeignService {

    @GetMapping("/test/port")
    public String getPort();

}
