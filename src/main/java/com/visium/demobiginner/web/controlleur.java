package com.visium.demobiginner.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controlleur {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
