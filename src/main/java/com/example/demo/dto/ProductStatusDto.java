package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductStatusDto {

    @JsonProperty("softwareProductId")
    private String softwareProductId;

    @JsonProperty("softwareProductStatus")
    private String softwareProductStatus;

    public ProductStatusDto() {
    }

    public ProductStatusDto(String softwareProductId, String softwareProductStatus) {
        this.softwareProductId = softwareProductId;
        this.softwareProductStatus = softwareProductStatus;
    }

    public String getSoftwareProductId() {
        return softwareProductId;
    }

    public void setSoftwareProductId(String softwareProductId) {
        this.softwareProductId = softwareProductId;
    }

    public String getSoftwareProductStatus() {
        return softwareProductStatus;
    }

    public void setSoftwareProductStatus(String softwareProductStatus) {
        this.softwareProductStatus = softwareProductStatus;
    }
}
