package com.mahadevan.sfgbeerworks.services;

import java.util.UUID;

import com.mahadevan.sfgbeerworks.web.model.CustomerDto;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).customerName("Zone").build();
    }
    
}
