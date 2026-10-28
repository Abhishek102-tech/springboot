package com.abhishek.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path="/hello")
    public String HelloWorld(){
        return "Hello World!";
    }

    @GetMapping(path="/Ak")
    public String helloAbhishek(){
        return "Hello Abhishek!";
    }
}
