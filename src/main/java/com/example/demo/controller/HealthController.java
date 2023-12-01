package com.example.demo.controller;

import com.example.demo.dto.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping
    public String sayHello(
            @RequestHeader Map<String, String> headers
    ) {

        return "Yo!";
        //return new MessageDto("Hello...!!!");
    }
}
