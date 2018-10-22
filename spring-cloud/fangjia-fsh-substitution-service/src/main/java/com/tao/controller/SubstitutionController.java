package com.tao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author tao 2018/10/20
 */
@RestController
@RequestMapping("/substitution")
public class SubstitutionController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "callHello", method = RequestMethod.GET)
    public String callHello() {
        return restTemplate.getForObject("http://fsh-house/house/hello", String.class);
    }
}
