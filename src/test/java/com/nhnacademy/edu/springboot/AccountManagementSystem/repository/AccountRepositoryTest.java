package com.nhnacademy.edu.springboot.AccountManagementSystem.repository;

import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;

    @Test
    void testAccountRepository() {
        //given
        Account zbum = new Account(1L, "zbum", 100);
        accountRepository.save(zbum);
        //when
        Optional<Account> actual = accountRepository.findById(1L);
        //then
        Assertions.assertThat(actual).isPresent();
        Assertions.assertThat(actual.get()).isEqualTo(zbum);
    }
}
