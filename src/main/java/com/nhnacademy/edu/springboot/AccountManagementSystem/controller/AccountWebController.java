package com.nhnacademy.edu.springboot.AccountManagementSystem.controller;

import com.nhnacademy.edu.springboot.AccountManagementSystem.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
class AccountWebController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/web/accounts/{id}")
    public String getAccount(@PathVariable Long id,
                             Model model){
        model.addAttribute("account", accountService.getAccount(id));

        return "account";
    }
}