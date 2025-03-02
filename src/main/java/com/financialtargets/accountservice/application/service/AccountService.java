package com.financialtargets.accountservice.application.service;

import com.financialtargets.accountservice.application.dto.AccountCreateDTO;
import com.financialtargets.accountservice.domain.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> listAll();

    Account create(AccountCreateDTO accountCreate);

    void active(long accountId);

    void inactive(long accountId);
}
