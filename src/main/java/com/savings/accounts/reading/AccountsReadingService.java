package com.savings.accounts.reading;

import com.savings.accounts.AccountEntity;
import com.savings.accounts.structs.AccountDto;
import com.savings.accounts.structs.SplitDto;

import java.util.List;
import java.util.UUID;

public interface AccountsReadingService {

    AccountEntity findById(UUID uuid);

    List<AccountDto> findByUserUUID(UUID userUUID);

    List<SplitDto> getIncomeSplits(UUID userUUID, Double income);
}
