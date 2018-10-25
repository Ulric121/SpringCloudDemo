package com.tao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author tao 2018/10/20
 */
@SpringBootApplication
@EnableDiscoveryClient// 当前的服务是eureka客户端
@EnableFeignClients// 启用feign
public class FshSubstitutionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FshSubstitutionServiceApplication.class, args);
    }
}
