package com.nhnacademy.edu.springboot.AccountManagementSystem.service;

import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();
}
