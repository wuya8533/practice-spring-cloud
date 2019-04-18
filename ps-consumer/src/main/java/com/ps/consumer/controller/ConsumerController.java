package com.ps.consumer.controller;

import com.ps.consumer.feign.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lingy
 * @Version 1.0.0
 * @Created 2019/4/8 21:44
 * @Description
 * @Copyright www.palacesun.com
 */
@RestController
@RequestMapping("/consumer")
@RefreshScope
public class ConsumerController {

    @Autowired
    private ProducerRemote producerRemote;

    @Value("${neo.hello}")
    private String something;

    @RequestMapping("/hello/{name}")
    public String helloRemote(@PathVariable("name") String name){
        name = name + " and get something from github is '"+something+"'";
        return producerRemote.hello(name);
    }
}
