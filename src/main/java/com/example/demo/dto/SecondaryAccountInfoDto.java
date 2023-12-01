package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class SecondaryAccountInfoDto {

    private boolean isJointAccount;

    @JsonProperty("AccountOwner")
    private List<AccountOwnerDto> accountOwner = new ArrayList<>();

    public SecondaryAccountInfoDto() {
    }

    public SecondaryAccountInfoDto(boolean isJointAccount, List<AccountOwnerDto> accountOwner ) {
        this.isJointAccount = isJointAccount;
        this.accountOwner = accountOwner;
    }

}



//       "secondaryAccountInfo":{
//          "isJointAccount":false,
//          "AccountOwner":[
//             {
//                "memberId":"12082104",
//                "meta":null
//             }
//          ]
//       },