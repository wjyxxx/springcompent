package com.example.feigncustomer10001;

//import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.apache.ibatis.datasource.DataSourceFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * feign的消费者,eureka的发现者
 */
@MapperScan("com.example.feigncustomer10001.mapper")
@Configuration
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
@RefreshScope
@SpringBootApplication
public class FeignCustomer10001Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignCustomer10001Application.class, args);
    }

}
