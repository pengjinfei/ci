package com.pengjinfei.ci.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created on 8/5/18
 *
 * @author jinfei
 */
@Service
public class TimeService {

    public LocalDateTime time() {
        return LocalDateTime.now();
    }

}
