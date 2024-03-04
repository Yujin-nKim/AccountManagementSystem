package com.nhnacademy.edu.springboot.AccountManagementSystem.service;

import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DefaultAccountServiceTest {
    @Autowired
    AccountService accountService;

    @Test
    void testGetAccounts() {
        List<Account> accountList = accountService.getAccounts();
        Assertions.assertThat(accountList).hasSize(3);
    }
}
