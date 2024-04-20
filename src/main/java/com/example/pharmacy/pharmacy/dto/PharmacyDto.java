package com.example.pharmacy.pharmacy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PharmacyDto {

    private Long id;
    private String pharmacyName;
    private String pharmacyAddress;
    private double latitude;
    private double longitude;
}
