package com.financialtargets.accountservice.infrastructure.entity;

import com.financialtargets.accountservice.domain.model.Account;
import com.financialtargets.accountservice.domain.model.mapper.AccountMapper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
        return AccountMapper.INSTANCE.entityToModel(this);
    }
}
