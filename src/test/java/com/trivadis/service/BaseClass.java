package com.trivadis.service;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class BaseClass {

    @Autowired
    private CustomerController customerController;

    @BeforeEach
    public void before() {
        RestAssuredMockMvc.standaloneSetup(customerController);
    }
}
