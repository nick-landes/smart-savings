package com.savings.accounts.structs.mapper;

import com.savings.accounts.AccountEntity;
import com.savings.accounts.structs.AccountCreationDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(target = "uuid", ignore = true)
    AccountEntity toAccountEntity(AccountCreationDto accountCreationDto);
}
