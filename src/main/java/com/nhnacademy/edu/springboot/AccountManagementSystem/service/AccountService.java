package com.nhnacademy.edu.springboot.AccountManagementSystem.service;

import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAccounts();

    Account createAccount(Account account);

    Account getAccount(Long id);

    void deleteAccount(Long id);

}
