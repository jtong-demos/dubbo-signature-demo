package com.thoughtworks.jtong.demos.dubbo;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcException;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {
    @Reference
    DemoService demoService;


    @Test
    public void should_call_service_successfully(){
        String message = demoService.sayHello("World");
        System.out.println(message);
        assertThat(message, Is.is("Hello World"));
    }

    @Test
    public void should_call_service_successfully_with_object(){
        MyResponse message = demoService.communicate(new Person("张三", "M"), new MyMessage("飞越长城走向世界"));
        assertThat(message.getResponse(), Is.is("Hi, 张三: I get your message '飞越长城走向世界'."));
    }

    @Test
    public void should_call_service_successfully_when_params_has_more_getter_in_server_side_and_less_getter_in_client_side(){
        MyResponse message = demoService.communicate(new Person("张三", "M"), new MyMessage("飞越长城走向世界"));
        assertThat(message.getResponse(), Is.is("Hi, 张三: I get your message '飞越长城走向世界'."));
    }


    @Test
    public void should_call_service_successfully_when_client_has_more_method_but_cannot_call_it(){
        try {
            Person person = demoService.get(1L);
        }catch (RpcException e){

        }
    }
}
