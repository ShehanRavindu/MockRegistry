package com.example.demo.dto;

public class LinkedMemberDto {

    private String memberId;
    private String type;

    public LinkedMemberDto() {
    }

    public LinkedMemberDto(String memberId, String type) {
        this.memberId = memberId;
        this.type = type;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

