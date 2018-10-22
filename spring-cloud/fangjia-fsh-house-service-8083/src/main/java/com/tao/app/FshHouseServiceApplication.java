package com.tao.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tao 2018/10/20
 */
@SpringBootApplication
@EnableDiscoveryClient//当前服务是eureka客户端
@ComponentScan("com.tao")
public class FshHouseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FshHouseServiceApplication.class, args);
    }
}