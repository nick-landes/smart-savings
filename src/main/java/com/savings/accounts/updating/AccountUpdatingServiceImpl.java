package com.savings.accounts.updating;

import com.savings.accounts.AccountEntity;
import com.savings.accounts.AccountsRepository;
import com.savings.accounts.history.creation.AccountHistoryCreationService;
import com.savings.accounts.history.enums.HistoryType;
import com.savings.accounts.reading.AccountsReadingService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountUpdatingServiceImpl implements AccountUpdatingService {

    AccountsReadingService accountsReadingService;
    AccountHistoryCreationService accountHistoryCreationService;
    AccountsRepository accountsRepository;

    @Override
    public void withdraw(UUID accountUUID, Double amount) {
        AccountEntity account = accountsReadingService.findById(accountUUID);
        account.setBalance(account.getBalance() - amount);
        accountHistoryCreationService.create(account, amount, HistoryType.WITHDRAW);
    }

    @Override
    public void transfer(UUID accountFromUUID, UUID accountToUUID, Double amount) {
        AccountEntity accountFrom = accountsReadingService.findById(accountFromUUID);
        AccountEntity accountTo = accountsReadingService.findById(accountToUUID);

        accountFrom.setBalance(accountFrom.getBalance() - amount);
        accountTo.setBalance(accountTo.getBalance() + amount);

        accountsRepository.saveAll(Arrays.asList(accountFrom, accountTo));

        accountHistoryCreationService.create(accountFrom, accountTo, amount);
    }

    @Override
    public void deposit(UUID accountUUID, Double amount) {
        AccountEntity account = accountsReadingService.findById(accountUUID);
        account.setBalance(account.getBalance() + amount);
        accountHistoryCreationService.create(account, amount, HistoryType.DEPOSIT);
    }
}
