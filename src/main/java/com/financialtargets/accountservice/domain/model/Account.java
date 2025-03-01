package com.financialtargets.accountservice.domain.model;

import com.financialtargets.accountservice.domain.enums.AccountTypeEnum;
import lombok.Data;

import java.time.Instant;

@Data
public class Account {
    private Long id;

    private AccountTypeEnum accountType;

    private String name;

    private boolean isMain;

    private Instant createdAt;

    private Instant updatedAt;

    private boolean isActive;
}
