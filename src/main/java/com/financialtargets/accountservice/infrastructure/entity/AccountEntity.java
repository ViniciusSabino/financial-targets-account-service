package com.financialtargets.accountservice.infrastructure.entity;

import com.financialtargets.accountservice.domain.enums.AccountTypeEnum;
import com.financialtargets.accountservice.domain.model.Account;
import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
@Table(name = "account")
public class AccountEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "account_type_id", nullable = false, unique = true)
    private AccountTypeEntity accountType;

    @Column(name="name", length=255, nullable=false, unique=true)
    private String name;

    @Column(name="balance", nullable = false)
    private float balance;

    @Column(name="is_main", nullable=false)
    private boolean isMain;

    @Column(name="created_at", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Instant createdAt;

    @Column(name="updated_at", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Instant updatedAt;

    @Column(name="is_active", nullable=false)
    private boolean isActive;

    public Account toModel() {
        return Account.builder()
                .id(this.id)
                .name(this.name)
                .accountType(AccountTypeEnum.valueOf(this.accountType.getName()))
                .balance(this.balance)
                .createdAt(this.createdAt)
                .updatedAt(this.updatedAt)
                .isActive(this.isActive)
                .isMain(this.isMain)
                .build();
    }
}
