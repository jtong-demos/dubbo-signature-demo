package com.thoughtworks.jtong.demos.dubbo;

public interface DemoService {
    String sayHello(String name);

    MyResponse communicate(Person person, MyMessage message);

}
