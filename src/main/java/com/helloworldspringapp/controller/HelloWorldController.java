package com.helloworldspringapp.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/web")
    public String hello(){
        return "hello.html";
    }

    @GetMapping("/web/message")
    public String message(Model model){
        model.addAttribute("message", "Hello From Mayur Pawar");
        return "message.html";
    }
}
