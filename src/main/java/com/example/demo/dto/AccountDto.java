package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class AccountDto {

    private String accountId;
    private String accountName;
    private String nickName;
    private String customerAccountType;
    private String type;
    private String bsb;
    private boolean jointAccountConsentElectionStatus;
    @JsonProperty("isSecondaryAccount")
    private boolean isSecondaryAccount;
    private boolean secondaryAccountPrivilegeStatus;
    private JointAccountInfoDto jointAccountinfo;
    private BusinessAccountInfoDto businessAccountInfo;
    private SecondaryAccountInfoDto secondaryAccountInfo;

    @JsonProperty("isEligible")
    private boolean isEligible;

    @JsonProperty("isJointAccount")
    private boolean isJointAccount;

    public AccountDto() {
    }

    public AccountDto(String accountId, String accountName, String nickName, String customerAccountType, String type, boolean isEligible,
                      boolean isJointAccount, boolean jointAccountConsentElectionStatus, JointAccountInfoDto jointAccountinfo, String bsb,
                      boolean isSecondaryAccount, boolean secondaryAccountPrivilegeStatus, BusinessAccountInfoDto businessAccountInfo,
                      SecondaryAccountInfoDto secondaryAccountInfo) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.nickName = nickName;
        this.customerAccountType = customerAccountType;
        this.type = type;
        this.isEligible = isEligible;
        this.isJointAccount = isJointAccount;
        this.jointAccountConsentElectionStatus = jointAccountConsentElectionStatus;
        this.jointAccountinfo = jointAccountinfo;
        this.bsb = bsb;
        this.isSecondaryAccount = isSecondaryAccount;
        this.secondaryAccountPrivilegeStatus = secondaryAccountPrivilegeStatus;
        this.businessAccountInfo = businessAccountInfo;
        this.secondaryAccountInfo = secondaryAccountInfo;
    }

    public void setBsb(String bsb) {
        this.bsb = bsb;
    }

    public String getBsb() {
        return bsb;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
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

    public String getCustomerAccountType() {
        return customerAccountType;
    }

    public void setCustomerAccountType(String customerAccountType) {
        this.customerAccountType = customerAccountType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsEligible() {
        return isEligible;
    }

    public void setEligible(boolean eligible) {
        isEligible = eligible;
    }

    public boolean getIsJointAccount() {
        return isJointAccount;
    }

    public void setJointAccount(boolean jointAccount) {
        isJointAccount = jointAccount;
    }

    public boolean getIsSecondaryAccount() {
        return isSecondaryAccount;
    }

    public void setIsSecondaryAccount(boolean isSecondaryAccount) {
        isSecondaryAccount = isSecondaryAccount;
    }

    public boolean getJointAccountConsentElectionStatus() {
        return jointAccountConsentElectionStatus;
    }

    public void setJointAccountConsentElectionStatus(boolean jointAccountConsentElectionStatus) {
        this.jointAccountConsentElectionStatus = jointAccountConsentElectionStatus;
    }

    public boolean isSecondaryAccountPrivilegeStatus() {
        return secondaryAccountPrivilegeStatus;
    }

    public void setSecondaryAccountPrivilegeStatus(boolean secondaryAccountPrivilegeStatus) {
        this.secondaryAccountPrivilegeStatus = secondaryAccountPrivilegeStatus;
    }

    public JointAccountInfoDto getJointAccountinfo() {
        return jointAccountinfo;
    }

    public void setJointAccountinfo(JointAccountInfoDto jointAccountinfo) {
        this.jointAccountinfo = jointAccountinfo;
    }

    public BusinessAccountInfoDto getBusinessAccountInfo() {
        return businessAccountInfo;
    }

    public void setBusinessAccountInfo(BusinessAccountInfoDto businessAccountInfo) {
        this.businessAccountInfo = businessAccountInfo;
    }

    public SecondaryAccountInfoDto getSecondaryAccountInfo() {
        return secondaryAccountInfo;
    }

    public void setSecondaryAccountInfo(SecondaryAccountInfoDto secondaryAccountInfo) {
        this.secondaryAccountInfo = secondaryAccountInfo;
    }
}
