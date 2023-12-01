package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoftwareProductDto {

    @JsonProperty("softwareProductId")
    private String softwareProductId;

    private String status;

    public SoftwareProductDto() {
    }

    public SoftwareProductDto(String softwareProductId, String status) {
        this.softwareProductId = softwareProductId;
        this.status = status;
    }

    public String getSoftwareProductId() {
        return softwareProductId;
    }

    public void setSoftwareProductId(String softwareProductId) {
        this.softwareProductId = softwareProductId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
