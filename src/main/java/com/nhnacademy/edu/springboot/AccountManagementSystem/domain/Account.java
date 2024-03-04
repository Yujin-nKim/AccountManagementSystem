package com.nhnacademy.edu.springboot.AccountManagementSystem.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Account {
    private final String number;
    private final Integer balance;

    public Account(String number, Integer balance) {
        this.number = number;
        this.balance = balance;
    }
}
