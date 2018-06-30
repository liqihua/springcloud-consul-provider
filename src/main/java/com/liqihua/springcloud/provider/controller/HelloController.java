package com.liqihua.springcloud.provider.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liqihua
 * @since 2018/6/24
 */
@RestController
@RequestMapping("/helloController")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("--- hello ... abcd ");
        return "i am helloController aaaaa .... 123";
    }

}
