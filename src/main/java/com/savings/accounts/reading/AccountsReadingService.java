package com.savings.accounts.reading;

import com.savings.accounts.structs.AccountDto;
import com.savings.accounts.structs.SplitDto;

import java.util.List;
import java.util.UUID;

public interface AccountsReadingService {

    List<AccountDto> findByUserUUID(UUID uuid);

    List<SplitDto> getIncomeSplits(UUID userUUID, Double income);
}
