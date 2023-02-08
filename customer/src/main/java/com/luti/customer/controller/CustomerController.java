package com.luti.customer.controller;

import com.luti.customer.request.CustomerRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/v1/customer")
public record CustomerController() {

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRequest customerRequest){
        log.info("New Customer just registered: {}", customerRequest);
    }
}
