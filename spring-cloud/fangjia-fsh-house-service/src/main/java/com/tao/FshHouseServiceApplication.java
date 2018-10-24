package com.tao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tao 2018/10/20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FshHouseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FshHouseServiceApplication.class, args);
    }
}
