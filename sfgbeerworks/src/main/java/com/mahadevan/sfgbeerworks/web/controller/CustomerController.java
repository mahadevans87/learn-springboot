package com.mahadevan.sfgbeerworks.web.controller;

import java.util.UUID;

import com.mahadevan.sfgbeerworks.services.BeerService;
import com.mahadevan.sfgbeerworks.services.CustomerService;
import com.mahadevan.sfgbeerworks.web.model.BeerDto;
import com.mahadevan.sfgbeerworks.web.model.CustomerDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/customer")
public class CustomerController {
    
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<CustomerDto>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }


}
