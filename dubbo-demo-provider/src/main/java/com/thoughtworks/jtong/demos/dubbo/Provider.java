package com.thoughtworks.jtong.demos.dubbo;


import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDubboConfiguration
public class Provider {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Provider.class, args);

        new CountDownLatch(1).await();
    }
}
