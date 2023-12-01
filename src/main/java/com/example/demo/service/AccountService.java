package com.example.demo.service;

import com.example.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountService {

    public List<AccountDto> getAccounts(String memberId) {

        List<AccountDto> accountDtos = new ArrayList<AccountDto>();

        LinkedMemberDto linkedMember1 = new LinkedMemberDto("10902838","OWNER");
        LinkedMemberDto linkedMember2 = new LinkedMemberDto("12082104","OWNER");
        List<LinkedMemberDto> linkedMembers = new ArrayList<>();
        linkedMembers.add(linkedMember1);
        linkedMembers.add(linkedMember2);
        JointAccountInfoDto jointAccountInfo1 = new JointAccountInfoDto(linkedMembers);
        AccountDto account1 = new AccountDto("336304200","Special Monthly Interest",
                "","Personal","TRANS_AND_SAVINGS_ACCOUNTS",
                true,true, true,
                jointAccountInfo1,"650-000",false,
                false,null,null);

        AccountDto account2 = new AccountDto("443174800","Rapid Saver Statement",
                "","Personal","TRANS_AND_SAVINGS_ACCOUNTS",
                true,false, false,
                null,"650-000",false,
                false,null,null);

        AccountDto account3 = new AccountDto("481706409","Special Monthly Interest",
                "","Personal","TRANS_AND_SAVINGS_ACCOUNTS",
                true,true, true,
                jointAccountInfo1,"650-000",false,
                false,null,null);

        AccountOwnerDto accountOwner1 = new AccountOwnerDto("12082104");
        List<AccountOwnerDto> accountOwners = new ArrayList<>();
        accountOwners.add(accountOwner1);
        SecondaryAccountInfoDto secondaryAccountInfo1 = new SecondaryAccountInfoDto(false, accountOwners);

        AccountDto account4 = new AccountDto("637698506","Special Monthly Interest",
                "","Personal","TRANS_AND_SAVINGS_ACCOUNTS",
                true,false, false,
                null,"650-000",true,
                true,null,secondaryAccountInfo1);

        AccountDto account5 = new AccountDto("666283203","Special Monthly Interest",
                "","Personal","TRANS_AND_SAVINGS_ACCOUNTS",
                true,false, false,
                null,"650-000",true,
                true,null,secondaryAccountInfo1);

        accountDtos.add(account1);
        accountDtos.add(account2);
        accountDtos.add(account3);
        accountDtos.add(account4);
        accountDtos.add(account5);

//        = Arrays.asList(response.getBody()).stream().map(
//                d -> {
//
//                    AccountDto accountDto = new AccountDto();
//                    accountDto.setAccountId(d.getAccountNumber());
//                    accountDto.setAccountName(d.getAccountName());
//                    accountDto.setNickName(d.getNickName());
//                    accountDto.setType(d.getType());
//                    accountDto.setEligible(d.isEligible());
//                    accountDto.setJointAccount(d.isJointAccount());
//
//                    if(d.isJointAccount()){
//                        accountDto.setJointAccountConsentElectionStatus(d.isJointAccountConsentElectionStatus());
//
//                        List<LinkedMemberDto> LinkedMember = d.getLinkedMembers().stream().map(m -> {
//                            return new LinkedMemberDto(
//                                    m.getMemberNumber(),
//                                    m.getLinkedMemberType()
//                            );
//                        }).collect(Collectors.toList());
//
//                        accountDto.setJointAccountinfo(new JointAccountInfoDto(LinkedMember));
//                    }
//                    return accountDto;
//                }
//        ).collect(Collectors.toList());

        return accountDtos;
    }
}
