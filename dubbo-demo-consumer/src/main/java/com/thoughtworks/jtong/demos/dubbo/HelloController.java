package com.thoughtworks.jtong.demos.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference
    DemoService demoService;

    @RequestMapping
    public String hello(@RequestParam String name){
        return demoService.sayHello(name);
    }
}
