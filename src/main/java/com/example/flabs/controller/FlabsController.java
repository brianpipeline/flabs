package com.example.flabs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FlabsController {
    @GetMapping("/hello-world")
    @ResponseBody
    public String helloWorld() {
        return "Version 6.0 now. YEAH.";
    }
}
