package com.syh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/hello")
public class HelloWorld {
    @ResponseBody
    @RequestMapping("/world")
    public String hello() {
        return "hello world";
    }
}
