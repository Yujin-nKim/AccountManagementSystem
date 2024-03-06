package com.nhnacademy.edu.springboot.AccountManagementSystem.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AccountControllerTest_mock {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @Order(1)
    void testGetAccounts() throws Exception {
        mockMvc.perform(get("/accounts"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].balance", equalTo(1)));
    }

    @Test
    @Order(2)
    void testGetAccount() throws Exception {
        mockMvc.perform(get("/accounts/{id}", 1L))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.balance", equalTo(13333)));
    }

    @Test
    @Order(3)
    void testCreateAccount() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Account account = new Account(2L, "23334", 13333);
        mockMvc.perform(post("/accounts")
                    .content(objectMapper.writeValueAsString(account))
                    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.balance", equalTo(13333)));
    }

    @Test
    @Order(4)
    void deleteAccount() throws Exception {
        this.mockMvc.perform(delete("/accounts/{id}", 10L))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.result", equalTo("OK")));
    }
}
