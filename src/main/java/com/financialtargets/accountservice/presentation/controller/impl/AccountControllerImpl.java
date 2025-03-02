package com.financialtargets.accountservice.presentation.controller.impl;

import com.financialtargets.accountservice.application.dto.AccountCreateDTO;
import com.financialtargets.accountservice.application.service.AccountService;
import com.financialtargets.accountservice.domain.model.Account;
import com.financialtargets.accountservice.presentation.controller.AccountController;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountControllerImpl implements AccountController {
    private final AccountService accountService;

    @GetMapping("/all")
    @Override
    public ResponseEntity<List<Account>> listAll() {
        List<Account> accounts = accountService.listAll();

        return ResponseEntity.ok(accounts);
    }

    @PostMapping
    @Override
    public ResponseEntity<Account> create(@RequestBody @Valid AccountCreateDTO accountCreate) {
        Account account = accountService.create(accountCreate);

        return ResponseEntity.status(HttpStatus.CREATED).body(account);
    }

    @PatchMapping("/active")
    @Override
    public ResponseEntity<Void> active(long accountId) {
        return null;
    }

    @PatchMapping("/inactive")
    @Override
    public ResponseEntity<Void> inactive(long accountId) {
        return null;
    }
}