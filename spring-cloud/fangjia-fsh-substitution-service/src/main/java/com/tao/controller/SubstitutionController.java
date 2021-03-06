package com.tao.controller;

import com.tao.HouseRemoteClient;
import com.tao.entity.HouseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author tao 2018/10/20
 */
@RestController
@RequestMapping("/substitution")
public class SubstitutionController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HouseRemoteClient houseRemoteClient;

    @RequestMapping(value = "/callHello", method = RequestMethod.GET)
    public String callHello() {
        //String result = restTemplate.getForObject("http://fsh-house/house/hello", String.class);
        String result = houseRemoteClient.hello();
        System.out.println("调用结果是：" + result);
        return result;
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public HouseInfo getData(@RequestParam("name") String name) {
        //return restTemplate.getForObject("http://fsh-house/house/data?name=" + name, HouseInfo.class);
        return houseRemoteClient.getData(name);
    }

    @RequestMapping(value = "/data/{name}", method = RequestMethod.GET)
    public String getData2(@PathVariable("name") String name) {
        return restTemplate.getForObject("http://fsh-house/house/data/{name}", String.class, name);
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public Long add() {
        HouseInfo houseInfo = new HouseInfo();
        houseInfo.setCity("上海");
        houseInfo.setArea("虹口");
        houseInfo.setAddress("东体小区");
        Long id = restTemplate.postForObject("http://fsh-house/house/save", houseInfo, Long.class);
        return id;
    }
}
