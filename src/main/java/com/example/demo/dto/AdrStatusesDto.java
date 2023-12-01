package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AdrStatusesDto {

    @JsonProperty("dataRecipients")
    private List<AdrStatusDto> dataRecipients;

    public AdrStatusesDto() {
    }

    public AdrStatusesDto(List<AdrStatusDto> dataRecipients) {
        this.dataRecipients = dataRecipients;
    }

    public List<AdrStatusDto> getDataRecipients() {
        return dataRecipients;
    }

    public void setDataRecipients(List<AdrStatusDto> dataRecipients) {
        this.dataRecipients = dataRecipients;
    }
}
