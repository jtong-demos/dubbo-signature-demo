package com.thoughtworks.jtong.demos.dubbo;


import com.alibaba.dubbo.config.annotation.Reference;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {
    @Reference
    DemoService demoService;


    @Test
    public void should_get_service(){
        String message = demoService.sayHello("World");
        System.out.println(message);
        assertThat(message, Is.is("Hello World"));
    }
}
