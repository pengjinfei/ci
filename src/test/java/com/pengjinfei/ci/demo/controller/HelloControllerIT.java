package com.pengjinfei.ci.demo.controller;

import com.pengjinfei.ci.demo.service.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerIT {

    @Autowired
    private HelloService helloService;

    @Test
    public void test() {
        String test = helloService.sayHello("test");
        Assert.assertEquals(test, "hello test");
    }
}