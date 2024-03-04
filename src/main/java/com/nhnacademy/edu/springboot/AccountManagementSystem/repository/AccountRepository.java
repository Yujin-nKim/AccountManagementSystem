package com.nhnacademy.edu.springboot.AccountManagementSystem.repository;

import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;

import java.util.List;

public interface AccountRepository {
    List<Account> findAll();
}
