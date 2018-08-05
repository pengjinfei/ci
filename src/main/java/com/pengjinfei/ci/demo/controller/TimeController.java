package com.pengjinfei.ci.demo.controller;

import com.pengjinfei.ci.demo.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created on 8/5/18
 *
 * @author jinfei
 */
@RestController
public class TimeController {

    private final TimeService timeService;

    @Autowired
    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public LocalDateTime time() {
        return timeService.time();
    }
}
