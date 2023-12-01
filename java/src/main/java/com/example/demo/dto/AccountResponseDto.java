package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class AccountResponseDto {

    private String accountNumber;
    private String accountName;
    private String nickName;
    private String type;

    @JsonProperty("isJointAccount")
    private boolean isJointAccount;

    @JsonProperty("isEligible")
    private boolean isEligible;

    private boolean jointAccountConsentElectionStatus;
    private List<LinkedMemberResponseDto> LinkedMember = new ArrayList<>();

    public AccountResponseDto() {
    }

    public AccountResponseDto(String accountNumber, String accountName, String nickName, String type,
                              boolean isJointAccount, boolean isEligible, boolean jointAccountConsentElectionStatus, List<LinkedMemberResponseDto> LinkedMember) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.nickName = nickName;
        this.type = type;
        this.isJointAccount = isJointAccount;
        this.isEligible = isEligible;
        this.jointAccountConsentElectionStatus = jointAccountConsentElectionStatus;
        this.LinkedMember = LinkedMember;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isJointAccount() {
        return isJointAccount;
    }

    public void setJointAccount(boolean jointAccount) {
        isJointAccount = jointAccount;
    }

    public boolean isEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        isEligible = eligible;
    }

    public boolean isJointAccountConsentElectionStatus() {
        return true;
    }

    public void setJointAccountConsentElectionStatus(boolean jointAccountConsentElectionStatus) {
        this.jointAccountConsentElectionStatus = jointAccountConsentElectionStatus;
    }

    public List<LinkedMemberResponseDto> getLinkedMembers() {
        return LinkedMember;
    }

    public void setLinkedMember(List<LinkedMemberResponseDto> LinkedMember) {
        this.LinkedMember = LinkedMember;
    }
}

