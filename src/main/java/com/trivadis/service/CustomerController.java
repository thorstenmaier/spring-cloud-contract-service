package com.trivadis.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@RestController
public class CustomerController {

    @GetMapping("customers")
    public Collection<Customer> getAllCustomers() {
        return Arrays.asList(new Customer("Thorsten"), new Customer("Simon"));
    }
}

class Customer {
    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
