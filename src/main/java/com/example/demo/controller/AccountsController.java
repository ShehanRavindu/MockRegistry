package com.example.demo.controller;

import com.example.demo.dto.AccountDto;
import com.example.demo.service.AccountService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountsController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts/{memberId}")
    public ResponseEntity<List<AccountDto>> getAccounts(
            @PathVariable String memberId
    ){

        System.out.println ("test**************************************");

        return ResponseEntity.ok(accountService.getAccounts(memberId));
    }

}

