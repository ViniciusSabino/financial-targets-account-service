package com.financialtargets.accountservice.presentation.controller;

import com.financialtargets.accountservice.application.dto.AccountCreateDTO;
import com.financialtargets.accountservice.domain.model.Account;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AccountController {
    ResponseEntity<List<Account>> listAll();

    ResponseEntity<Account> create(AccountCreateDTO accountCreate);

    ResponseEntity<Void> active(long accountId);

    ResponseEntity<Void> inactive(long accountId);
}
