package com.example.demo.dto;

public class AccountOwnerDto {

    private String memberId;
    private String meta;

    public AccountOwnerDto() {
    }

    public AccountOwnerDto(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }
}
