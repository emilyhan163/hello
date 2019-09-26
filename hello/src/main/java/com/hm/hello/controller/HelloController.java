package com.hm.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hmj
 * @date 2019/9/26
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello everyone!";
    }
}
