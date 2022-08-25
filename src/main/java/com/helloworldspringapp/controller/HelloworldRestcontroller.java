package com.helloworldspringapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldRestcontroller {
    @RequestMapping("/")
    public String index(){
        return "HelloWorld from BridgeLabz";
    }

}
