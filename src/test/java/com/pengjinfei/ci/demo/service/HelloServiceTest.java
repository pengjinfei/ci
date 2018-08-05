package com.pengjinfei.ci.demo.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloServiceTest {

    private HelloService helloService;

    @Before
    public void init() {
        helloService = new HelloService();
    }

    @Test
    public void sayHello() {
        String test = helloService.sayHello("test");
        Assert.assertEquals(test, "hello test");
    }
}