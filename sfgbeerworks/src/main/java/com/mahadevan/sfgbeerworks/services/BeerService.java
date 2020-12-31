package com.mahadevan.sfgbeerworks.services;

import java.util.UUID;

import com.mahadevan.sfgbeerworks.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    BeerDto createBeer(BeerDto beerDto);
}
