package com.example.demo.dto;

public class LinkedMemberResponseDto {

    private String memberNumber;
    private String linkedMemberType;

    public LinkedMemberResponseDto() {
    }

    public LinkedMemberResponseDto(String memberNumber, String linkedMemberType) {
        this.memberNumber = memberNumber;
        this.linkedMemberType = linkedMemberType;
    }

    public String getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getLinkedMemberType() {
        return linkedMemberType;
    }

    public void setLinkedMemberType(String linkedMemberType) {
        this.linkedMemberType = linkedMemberType;
    }
}
