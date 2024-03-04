package com.nhnacademy.edu.springboot.AccountManagementSystem.repository;

import com.nhnacademy.edu.springboot.AccountManagementSystem.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
//    List<Account> findAll();
}
