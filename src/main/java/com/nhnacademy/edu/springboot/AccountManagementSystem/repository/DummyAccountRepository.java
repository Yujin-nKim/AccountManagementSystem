package com.nhnacademy.edu.springboot.AccountManagementSystem.repository;

import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DummyAccountRepository implements AccountRepository{
    @Override
    public List<Account> findAll() {
        return List.of(new Account("yejun", 100000), new Account("bamby", 200000), new Account("noah", 300000));
    }
}
