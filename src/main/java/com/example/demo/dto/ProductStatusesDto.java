package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductStatusesDto {

    @JsonProperty("softwareProducts")
    private List<ProductStatusDto> softwareProducts;

    public ProductStatusesDto() {
    }

    public ProductStatusesDto(List<ProductStatusDto> softwareProducts) {
        this.softwareProducts = softwareProducts;
    }

    public List<ProductStatusDto> getSoftwareProducts() {
        return softwareProducts;
    }

    public void setSoftwareProducts(List<ProductStatusDto> softwareProducts) {
        this.softwareProducts = softwareProducts;
    }
}
