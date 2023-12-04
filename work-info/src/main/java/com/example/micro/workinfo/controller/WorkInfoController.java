package com.example.micro.workinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorkInfoController {

    @GetMapping("")
    public String getInfo() {
        return "test message";
    }
}
