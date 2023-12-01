package com.example.demo.controller;

import com.example.demo.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/cdr-register/v1/banking")
public class DiscoveryController {

    @GetMapping("/data-recipients")
    public ResponseEntity<DataRecipientsDto> getDataRecipients(
            @RequestHeader("x-v") String xV
    ) {

        DataRecipientsDto dataRecipientsDto = new DataRecipientsDto(
                Arrays.asList(
                        new DataRecipientDto(
                                "19723b8f-193e-4399-bf2a-d5a2c04bf62c",
                                Arrays.asList(
                                        new BrandDto(
                                                "358e37b1-1556-4810-90ef-a01255cf10d0",
                                                Arrays.asList(
                                                        new SoftwareProductDto(
                                                                "3190515c-d3fe-45e3-8fe8-871217606136",
                                                                "ACTIVE"
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );

        return ResponseEntity.ok(dataRecipientsDto);

    }
}
