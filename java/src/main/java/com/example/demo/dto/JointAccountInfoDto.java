package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class JointAccountInfoDto {

    @JsonProperty("LinkedMember")
    private List<LinkedMemberDto> LinkedMember = new ArrayList<>();

    public JointAccountInfoDto() {
    }

    public JointAccountInfoDto(List<LinkedMemberDto> LinkedMember) {
        this.LinkedMember = LinkedMember;
    }
}
