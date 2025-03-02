package com.financialtargets.accountservice.infrastructure.repository;

import com.financialtargets.accountservice.infrastructure.entity.AccountTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountTypeEntity, Long> {
    AccountTypeEntity getByName(String name);
}
