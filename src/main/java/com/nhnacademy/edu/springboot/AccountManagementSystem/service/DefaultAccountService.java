package com.nhnacademy.edu.springboot.AccountManagementSystem.service;

import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;
import com.nhnacademy.edu.springboot.AccountManagementSystem.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultAccountService implements AccountService{
    private final AccountRepository accountRepository;

    public DefaultAccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    @Transactional(readOnly=true)
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    @Transactional
    public Account createAccount(Account account) {
        boolean present = accountRepository.findById(account.getId()).isPresent();
        if ( present ) throw new IllegalStateException("already exist " + account.getId());

        return accountRepository.save(account);
    }
    @Override
    @Transactional(readOnly=true)
    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }

    @Override
    @Transactional
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
