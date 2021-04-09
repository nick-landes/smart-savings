package com.savings.accounts.structs.mapper;

import com.savings.accounts.AccountEntity;
import com.savings.accounts.structs.AccountDto;
import com.savings.accounts.structs.SplitDto;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    @Mapping(target = "uuid", ignore = true)
    AccountEntity toAccountEntity(AccountDto accountDto);

    @Mapping(target = "userUUID", ignore = true)
    AccountDto toAccountDto(AccountEntity accountEntity);

    List<AccountDto> toAccountDto(List<AccountEntity> accounts);

    @Mapping(target = "accountUUID", source = "uuid")
    @Mapping(target = "accountName", source = "name")
    @Mapping(target = "amount", source = ".", qualifiedByName = "incomeSplit")
    SplitDto toSplitDto(AccountEntity account, @Context Double income);

    List<SplitDto> toSplitDto(List<AccountEntity> accounts, @Context Double income);

    @Named("incomeSplit")
    default Double getIncomeSplit(@Context Double income, AccountEntity account) {
        return income * account.getIncomeInterest() * 0.01;
    }
}
