package com.example.demo.dto;

import java.util.List;

public class DataRecipientsDto {

    private List<DataRecipientDto> data;

    public DataRecipientsDto() {
    }

    public DataRecipientsDto(List<DataRecipientDto> data) {
        this.data = data;
    }

    public List<DataRecipientDto> getData() {
        return data;
    }

    public void setData(List<DataRecipientDto> data) {
        this.data = data;
    }
}
