package com.rocky.d2rdatahub.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@Slf4j
public class TestController {
    
    @GetMapping("/status")
    public String getStatus(){
        log.info("test");
        return "OK";
    }
}
