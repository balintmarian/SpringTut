package ro.jademy.springtut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "greetings! index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello!";
    }
}
