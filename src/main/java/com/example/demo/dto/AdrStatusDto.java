package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdrStatusDto {

    @JsonProperty("dataRecipientId")
    private String dataRecipientId;

    @JsonProperty("dataRecipientStatus")
    private String dataRecipientStatus;

    public AdrStatusDto() {
    }

    public AdrStatusDto(String dataRecipientId, String dataRecipientStatus) {
        this.dataRecipientId = dataRecipientId;
        this.dataRecipientStatus = dataRecipientStatus;
    }

    public String getDataRecipientId() {
        return dataRecipientId;
    }

    public void setDataRecipientId(String dataRecipientId) {
        this.dataRecipientId = dataRecipientId;
    }

    public String getDataRecipientStatus() {
        return dataRecipientStatus;
    }

    public void setDataRecipientStatus(String dataRecipientStatus) {
        this.dataRecipientStatus = dataRecipientStatus;
    }
}
