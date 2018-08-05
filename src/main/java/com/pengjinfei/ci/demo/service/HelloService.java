package com.pengjinfei.ci.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created on 8/5/18
 *
 * @author jinfei
 */
@Service
public class HelloService {

    public String sayHello(String name) {
        return "hello " + name;
    }
}
