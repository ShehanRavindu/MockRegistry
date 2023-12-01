package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BrandDto {

    @JsonProperty("dataRecipientBrandId")
    private String dataRecipientBrandId;

    @JsonProperty("softwareProducts")
    private List<SoftwareProductDto> softwareProducts;

    public BrandDto() {
    }

    public BrandDto(String dataRecipientBrandId, List<SoftwareProductDto> softwareProducts) {
        this.dataRecipientBrandId = dataRecipientBrandId;
        this.softwareProducts = softwareProducts;
    }

    public String getDataRecipientBrandId() {
        return dataRecipientBrandId;
    }

    public void setDataRecipientBrandId(String dataRecipientBrandId) {
        this.dataRecipientBrandId = dataRecipientBrandId;
    }

    public List<SoftwareProductDto> getSoftwareProducts() {
        return softwareProducts;
    }

    public void setSoftwareProducts(List<SoftwareProductDto> softwareProducts) {
        this.softwareProducts = softwareProducts;
    }
}
