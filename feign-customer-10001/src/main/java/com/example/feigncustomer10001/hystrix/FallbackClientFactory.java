package com.example.feigncustomer10001.hystrix;

import com.example.feigncustomer10001.service.FeignService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FallbackClientFactory implements FallbackFactory<FeignService> {
    @Override
    public FeignService create(Throwable throwable) {
        return new FeignService() {
            @Override
            public String getPort() {
                return "服务已断开...";
            }
        };
    }
}
