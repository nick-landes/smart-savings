package com.savings.accounts.history.structs;

import com.savings.accounts.history.AccountHistoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountHistoryMapper {

    @Mapping(target = "datetime", source = "createdAt", dateFormat = "dd.MM.yyyy HH:mm:ss")
    @Mapping(target = "transferAccountName", source = "transferAccount.name")
    AccountHistoryDto toAccountHistoryDto(AccountHistoryEntity entity);

    List<AccountHistoryDto> toAccountHistoryDto(List<AccountHistoryEntity> entities);
}
