package com.savings.accounts.history.reading;

import com.savings.accounts.history.AccountHistoryEntity;
import com.savings.accounts.history.structs.AccountHistoryDto;

import java.util.List;
import java.util.UUID;

public interface AccountHistoryReadingService {

    List<AccountHistoryDto> findByAccountUUID(UUID accountUUID);
}
