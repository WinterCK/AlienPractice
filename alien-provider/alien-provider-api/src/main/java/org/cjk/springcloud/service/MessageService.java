package org.cjk.springcloud.service;

import org.cjk.springcloud.fallback.MessageServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "alien-provider-core", fallback = MessageServiceHystric.class)//指定调用哪个服务（eureka-client）
public interface MessageService {

    @RequestMapping(value = "/message/{name}",method = RequestMethod.GET)
    String sendMessage(@PathVariable("name") String name);
}
