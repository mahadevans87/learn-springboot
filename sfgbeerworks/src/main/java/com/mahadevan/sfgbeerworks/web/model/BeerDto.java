package com.mahadevan.sfgbeerworks.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
