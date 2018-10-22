package com.tao.controller;

import com.tao.entity.HouseInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author tao 2018/10/20
 */
@RestController
@RequestMapping("/house")
public class HouseController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World" + serverPort;
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public HouseInfo getData(@RequestParam("name") String name) {
        return new HouseInfo(1L, "上海", "虹口区", "东体小区");
    }

    @RequestMapping(value = "/data/{name}", method = RequestMethod.GET)
    public String getData2(@PathVariable("name") String name) {
        return name;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Long addData(@RequestBody HouseInfo houseInfo) {
        System.out.println(houseInfo.getAddress());
        return 1001L;
    }
}
