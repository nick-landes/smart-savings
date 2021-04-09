package com.savings.accounts.history.reading;

import com.savings.accounts.history.AccountHistoryEntity;
import com.savings.accounts.history.AccountHistoryRepository;
import com.savings.accounts.history.structs.AccountHistoryDto;
import com.savings.accounts.history.structs.AccountHistoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AccountHistoryReadingServiceImpl implements AccountHistoryReadingService {

    AccountHistoryRepository repository;
    AccountHistoryMapper mapper;

    public List<AccountHistoryDto> findByAccountUUID(UUID accountUUID) {
        List<AccountHistoryEntity> accountHistories = repository.findByAccount_Uuid(accountUUID);
        return mapper.toAccountHistoryDto(accountHistories);
    }
}
