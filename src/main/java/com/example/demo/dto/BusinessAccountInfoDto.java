package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class BusinessAccountInfoDto {

    @JsonProperty("AccountOwner")
    private List<AccountOwnerDto> accountOwner = new ArrayList<>();

    public BusinessAccountInfoDto() {
    }

    public BusinessAccountInfoDto(List<AccountOwnerDto> accountOwner ) {
        this.accountOwner = accountOwner;
    }
}
