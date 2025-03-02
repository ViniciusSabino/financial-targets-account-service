package com.financialtargets.accountservice.application.service.impl;

import com.financialtargets.accountservice.application.dto.AccountCreateDTO;
import com.financialtargets.accountservice.application.service.AccountService;
import com.financialtargets.accountservice.domain.model.Account;
import com.financialtargets.accountservice.infrastructure.entity.AccountEntity;
import com.financialtargets.accountservice.infrastructure.entity.AccountTypeEntity;
import com.financialtargets.accountservice.infrastructure.repository.AccountRepository;
import com.financialtargets.accountservice.infrastructure.repository.AccountTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountTypeRepository accountTypeRepository;

    @Override
    public List<Account> listAll() {
        return accountRepository.findAll().stream().map(AccountEntity::toModel).toList();
    }

    @Override
    public Account create(AccountCreateDTO accountCreate) {
        ZoneId userTimeZone = ZoneId.of("America/Sao_Paulo");

        AccountTypeEntity accountType = accountTypeRepository.getByName(accountCreate.type());

        AccountEntity account = new AccountEntity();

        account.setName(accountCreate.name());
        account.setAccountType(accountType);
        account.setMain(accountCreate.isMain());
        account.setCreatedAt(Instant.now().atZone(userTimeZone).toInstant());
        account.setUpdatedAt(Instant.now().atZone(userTimeZone).toInstant());
        account.setActive(false);
        account.setBalance(0.0F);

        return accountRepository.save(account).toModel();
    }

    @Override
    public void active(long accountId) {

    }

    @Override
    public void inactive(long accountId) {

    }
}
