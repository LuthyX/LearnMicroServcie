package com.luti.customer.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Customer {
    private Long id;
    private String email;
    private String firstname;
    private String lastname;

}
