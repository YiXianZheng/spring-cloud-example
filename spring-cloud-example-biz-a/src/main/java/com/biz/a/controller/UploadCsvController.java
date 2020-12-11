package com.biz.a.controller;

import com.biz.a.feign.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadCsvController {

    @Autowired
    private RemoteService remoteService;

    @GetMapping("hello")
    public String hello() {
        return "hello, this is A service.";
    }

    @GetMapping("/call2b")
    public String sayHello2B() {
        return remoteService.sayHello();
    }
}
