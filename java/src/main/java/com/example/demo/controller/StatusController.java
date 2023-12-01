package com.example.demo.controller;


import com.example.demo.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/cdr-register/v1/banking")
public class StatusController {

    @GetMapping("/data-recipients/status")
    public ResponseEntity<AdrStatusesDto> getDataRecipientsStatus(){

        AdrStatusesDto adrStatusesDto = new AdrStatusesDto(
                Arrays.asList(
                        new AdrStatusDto(
                                "adr113",
                                "Active"
                        ),
                        new AdrStatusDto(
                                "adr02",
                                "Active"
                        ),
                        new AdrStatusDto(
                                "adr03",
                                "Active"
                        ),
                        new AdrStatusDto(
                                "adr04",
                                "Suspended"
                        ),
                        new AdrStatusDto(
                                "adr05",
                                "Revoked"
                        ),
                        new AdrStatusDto(
                                "adr06",
                                "Surrendered"
                        ),
                        new AdrStatusDto(
                                "adr07",
                                "Active"
                        ),
                        new AdrStatusDto(
                                "adr08",
                                "Active"
                        ),
                        new AdrStatusDto(
                                "adr09",
                                "ACTIVE"
                        ),
                        new AdrStatusDto(
                                "adr10",
                                "Active"
                        ),
                        new AdrStatusDto(
                                "adr11",
                                "Active"
                        ),
                        new AdrStatusDto(
                                "adr12",
                                "Active"
                        ),
                        new AdrStatusDto(
                                "adr13",
                                "Active"
                        ),
                        new AdrStatusDto(
                                "adr14",
                                "Active"
                        )

                )
        );

        return ResponseEntity.ok(adrStatusesDto);

    }

    @GetMapping("/data-recipients/brands/software-products/status")
    public ResponseEntity<ProductStatusesDto> getSoftwareProductsStatus(){

        ProductStatusesDto productStatusesDto = new ProductStatusesDto(
                Arrays.asList(
                        new ProductStatusDto(
                                "Testing - sp18",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sptest123",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp02",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp12345",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp123456",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp03",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp04",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp05",
                                "Inactive"
                        ),
                        new ProductStatusDto(
                                "sp06",
                                "Removed"
                        ),
                        new ProductStatusDto(
                                "sp07",
                                "Inactive"
                        ),
                        new ProductStatusDto(
                                "sp08",
                                "Removed"
                        ),
                        new ProductStatusDto(
                                "sp09",
                                "Removed"
                        ),
                        new ProductStatusDto(
                                "sp10",
                                "Removed"
                        ),
                        new ProductStatusDto(
                                "sp11",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp12",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp13",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp14",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp15",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp16",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp17",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp18",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp19",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp20",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "sp21",
                                "Active"
                        ),
                        new ProductStatusDto(
                                "Testing - sp2000",
                                "Active"
                        )
                )
        );

        return ResponseEntity.ok(productStatusesDto);

    }
}
