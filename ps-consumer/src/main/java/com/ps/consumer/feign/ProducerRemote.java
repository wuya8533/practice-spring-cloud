package com.ps.consumer.feign;

import com.ps.consumer.hystrix.RemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author lingy
 * @Version 1.0.0
 * @Created 2019/4/8 21:43
 * @Description
 * @Copyright www.palacesun.com
 */
@FeignClient(name="ps-producer",fallback = RemoteHystrix.class)
public interface ProducerRemote {

    @RequestMapping(value="/demo/hello")
    public String hello(@RequestParam("name") String name);
}
