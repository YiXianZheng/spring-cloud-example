package com.biz.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BizBApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizBApplication.class, args);
    }
}
