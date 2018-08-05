package com.pengjinfei.ci.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimeServiceIT {

    @Autowired
    private TimeService timeService;

    @Test
    public void time() {
        LocalDateTime time = timeService.time();
    }
}