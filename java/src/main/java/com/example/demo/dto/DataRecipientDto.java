package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DataRecipientDto {

    @JsonProperty("legalEntityId")
    private String legalEntityId;

    @JsonProperty("dataRecipientBrands")
    private List<BrandDto> dataRecipientBrands;

    public DataRecipientDto() {
    }

    public DataRecipientDto(String legalEntityId, List<BrandDto> dataRecipientBrands) {
        this.legalEntityId = legalEntityId;
        this.dataRecipientBrands = dataRecipientBrands;
    }

    public String getLegalEntityId() {
        return legalEntityId;
    }

    public void setLegalEntityId(String legalEntityId) {
        this.legalEntityId = legalEntityId;
    }

    public List<BrandDto> getDataRecipientBrands() {
        return dataRecipientBrands;
    }

    public void setDataRecipientBrands(List<BrandDto> dataRecipientBrands) {
        this.dataRecipientBrands = dataRecipientBrands;
    }
}
