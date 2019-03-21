package com.tao;

import com.tao.entity.HouseInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author tao 2018/10/23
 */
@FeignClient(value = "fsh-house",path = "/house")
public interface HouseRemoteClient {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    HouseInfo getData(@RequestParam("name") String name);
}
