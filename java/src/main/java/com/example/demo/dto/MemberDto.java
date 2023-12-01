package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MemberDto {

    @JsonProperty("memberId")
    private String memberId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("lastUpdateAt")
    private String lastUpdateAt;

    @JsonProperty("customerUType")
    private String customerUType;

    @JsonProperty("memberStatus")
    private String memberStatus;

    @JsonProperty("contactNumber")
    private String contactNumber;

    public MemberDto() {
    }

    public MemberDto(String memberId, String email, String fullName, String firstName, String surname,
                     String lastUpdateAt, String customerUType, String memberStatus, String contactNumber) {

        this.memberId = memberId;
        this.email = email;
        this.fullName = fullName;
        this.firstName = firstName;
        this.surname = surname;
        this.lastUpdateAt = lastUpdateAt;
        this.customerUType = customerUType;
        this.memberStatus = memberStatus;
        this.contactNumber = contactNumber;

    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    public String getCustomerUType() {
        return customerUType;
    }

    public void setCustomerUType(String customerUType) {
        this.customerUType = customerUType;
    }

    public String getLastUpdateAt() {
        return lastUpdateAt;
    }

    public void setLastUpdateAt(String lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
