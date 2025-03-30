package com.example.backendfordemoalenaproject.controller;

import com.example.backendfordemoalenaproject.model.RequestDataDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
@RequestMapping("/api/v1")
public class AppController {
    @GetMapping("/send-message")
    public String hello(@RequestBody RequestDataDto requestDataDto) {
        log.info("Get request data: {}", requestDataDto);
        return "Hello from backend";
    }
}
