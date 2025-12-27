package com.longkathon;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/")
    public String test() {
        return "Server is running";
    }
}
