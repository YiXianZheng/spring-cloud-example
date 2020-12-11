package com.biz.a.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "spring-cloud-example-biz-b")
public interface RemoteService {

    @GetMapping("/hello")
    String sayHello();
}
