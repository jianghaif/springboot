package com.springboot.chapter1.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="/hello")
    public String HelloWorld(){

        return "Hello World";
    }
}
