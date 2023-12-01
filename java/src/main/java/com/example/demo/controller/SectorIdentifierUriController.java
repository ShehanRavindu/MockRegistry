package com.example.demo.controller;

import com.example.demo.dto.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/cds-v1/sector_identifier")

public class SectorIdentifierUriController {
    @GetMapping("/{sectorId}")
    public ResponseEntity<JSONArray> getSectorIdentifierData(@PathVariable String sectorId) throws JSONException {
        String[] data = {"https://localhost:8444/redirects/redirect1",
                "https://localhost:8444/redirects/redirect2"};
        JSONArray json = new JSONArray(Arrays.toString(data));
        return ResponseEntity.ok(json);
    }


}
