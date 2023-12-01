package com.example.demo.controller;


import com.example.demo.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/member/{userId}")
public class MemberController {

    @GetMapping("/loginprofile")
    public ResponseEntity<MemberDto> getMemberDetail(){

        MemberDto memberDto = new MemberDto(
                "400293297", "admin@wso2.com", "Kasuni Hemasika", "Kasuni",
                "Hemasika", "01/01/2022", "Individual",
                "Active", "+94712850379"
        );

        return ResponseEntity.ok(memberDto);

    }
}



