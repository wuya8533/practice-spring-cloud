package com.ps.consumer.hystrix;

import com.ps.consumer.feign.ProducerRemote;
import org.springframework.stereotype.Component;

/**
 * @Author lingy
 * @Version 1.0.0
 * @Created 2019/4/11 09:51
 * @Description
 * @Copyright www.palacesun.com
 */
@Component
public class RemoteHystrix implements ProducerRemote {

    @Override
    public String hello(String name) {
        return "hello " + name + " message field";
    }
}
