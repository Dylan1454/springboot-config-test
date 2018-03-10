package com.dylan.springbootconfigtest.controller;

import com.dylan.springbootconfigtest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestServiceController {

    @Autowired
    TestService testService;

    @GetMapping("/")
    public String sayHello(){
        return testService.sayHello();
    }

}
