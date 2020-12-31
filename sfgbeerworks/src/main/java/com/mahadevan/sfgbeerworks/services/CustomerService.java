package com.mahadevan.sfgbeerworks.services;

import java.util.UUID;

import com.mahadevan.sfgbeerworks.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
