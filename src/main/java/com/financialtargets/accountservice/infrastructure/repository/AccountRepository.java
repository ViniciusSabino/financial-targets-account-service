package com.financialtargets.accountservice.infrastructure.repository;

import com.financialtargets.accountservice.infrastructure.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
