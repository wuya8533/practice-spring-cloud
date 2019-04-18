package com.ps.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lingy
 * @Version 1.0.0
 * @Created 2019/4/8 21:33
 * @Description
 * @Copyright www.palacesun.com
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${fuzai.name}")
    private String productor;

    @RequestMapping("hello")
    public String hello(@RequestParam String name){
        return productor + " say hello to " + name;
    }

}
