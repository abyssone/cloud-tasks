package com.example.micro.workinfo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorkInfoController {

    @Value("${appId}")
    private String appId;

    @GetMapping("")
    public String getInfo() {
        return String.format("Test message from wi-%s", appId);
    }
}
