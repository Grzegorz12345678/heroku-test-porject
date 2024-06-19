package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @RequestMapping("/")
    public String index() {
        return "WWSIS 5819";
    }

}

