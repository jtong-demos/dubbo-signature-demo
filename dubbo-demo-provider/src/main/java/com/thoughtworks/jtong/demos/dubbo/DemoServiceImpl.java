package com.thoughtworks.jtong.demos.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


@Service
@Component
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello "+ name;
    }

    public MyResponse communicate(Person person, MyMessage message) {
        return new MyResponse("Hi, " + person.getName() + ": I get your message '"+ message.getMessage()+"'.");
    }
}
