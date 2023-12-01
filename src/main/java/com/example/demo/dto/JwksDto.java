package com.example.demo.dto;

import java.util.List;

public class JwksDto {

    private List<JwkDto> keys;

    public JwksDto() {
    }

    public JwksDto(List<JwkDto> keys) {
        this.keys = keys;
    }

    public List<JwkDto> getKeys() {
        return keys;
    }

    public void setKeys(List<JwkDto> keys) {
        this.keys = keys;
    }
}
