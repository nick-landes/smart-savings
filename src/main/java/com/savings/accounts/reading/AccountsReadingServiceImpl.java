package com.savings.accounts.reading;

import com.savings.accounts.AccountEntity;
import com.savings.accounts.AccountsRepository;
import com.savings.accounts.structs.AccountDto;
import com.savings.accounts.structs.SplitDto;
import com.savings.accounts.structs.mapper.AccountMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AccountsReadingServiceImpl implements AccountsReadingService {

    AccountsRepository accountsRepository;
    AccountMapper accountMapper;

    public List<AccountDto> findByUserUUID(UUID uuid) {
        List<AccountEntity> accounts = accountsRepository.findByUserUUID(uuid);
        return accountMapper.toAccountDto(accounts);
    }

    @Override
    public List<SplitDto> getIncomeSplits(UUID userUUID, Double income) {
        List<AccountEntity> accounts = accountsRepository.findByUserUUID(userUUID);
        return accountMapper.toSplitDto(accounts, income);
    }
}
