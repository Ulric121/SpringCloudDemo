package com.tao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tao 2018/10/23
 */
@FeignClient(value = "fsh-house",path = "/house")
public interface HouseRemoteClient {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();
}
