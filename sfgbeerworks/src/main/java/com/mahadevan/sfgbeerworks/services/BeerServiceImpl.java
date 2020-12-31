package com.mahadevan.sfgbeerworks.services;

import java.util.UUID;

import com.mahadevan.sfgbeerworks.web.model.BeerDto;

import org.springframework.stereotype.Service;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
            .id(UUID.randomUUID())
            .beerName("Kingfisher")
            .beerStyle("Strong")
            .build();
    }

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        return BeerDto.builder()
            .id(UUID.randomUUID())
            .beerName("Corona")
            .beerStyle("Ultra")
            .build();
    }   
    
}
