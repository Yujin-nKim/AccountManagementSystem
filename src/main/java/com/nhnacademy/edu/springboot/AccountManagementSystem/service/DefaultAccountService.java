package com.nhnacademy.edu.springboot.AccountManagementSystem.service;

import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;
import com.nhnacademy.edu.springboot.AccountManagementSystem.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultAccountService implements AccountService{

    private final AccountRepository accountRepository;

    public DefaultAccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }
}
