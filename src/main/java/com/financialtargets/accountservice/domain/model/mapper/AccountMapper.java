package com.financialtargets.accountservice.domain.model.mapper;

import com.financialtargets.accountservice.domain.model.Account;
import com.financialtargets.accountservice.infrastructure.entity.AccountEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    Account entityToModel(AccountEntity entity);
}
