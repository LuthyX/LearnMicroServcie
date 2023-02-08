package com.luti.customer.service;

import com.luti.customer.model.Customer;
import com.luti.customer.request.CustomerRequest;

public record CustomerService () {

    public void registerCustomer(CustomerRequest request){
        Customer customer = Customer.builder()
                .email(request.email())
                .firstname(request.firstname())
                .lastname(request.lastname())
                .build();
    }

}
