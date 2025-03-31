package com.example.backendfordemoalenaproject.controller;

import com.example.backendfordemoalenaproject.model.RequestDataDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController()
@RequestMapping("/api/v1")
public class AppController {
    @GetMapping("/send-message")
    public String getHello(@RequestBody RequestDataDto requestDataDto) {
        log.info("Get request data: {}", requestDataDto);
        return "Get req received: Hello from backend";
    }

    @PostMapping("/send-message")
    public String postHello(@RequestBody RequestDataDto requestDataDto) {
        log.info("Get request data: {}", requestDataDto);
        return "Post req received: Hello from backend";
    }
}
