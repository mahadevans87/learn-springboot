package com.mahadevan.sfgbeerworks.web.controller;

import java.util.UUID;

import com.mahadevan.sfgbeerworks.services.BeerService;
import com.mahadevan.sfgbeerworks.web.model.BeerDto;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
    
    private BeerService beerService;
    
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<BeerDto>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNewBeer(BeerDto beerDto) {
        BeerDto newBeer = beerService.createBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("location", "/api/v1/beer/" + newBeer.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

}
