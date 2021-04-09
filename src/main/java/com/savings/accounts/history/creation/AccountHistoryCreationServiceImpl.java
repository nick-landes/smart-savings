package com.savings.accounts.history.creation;

import com.savings.accounts.AccountEntity;
import com.savings.accounts.history.AccountHistoryEntity;
import com.savings.accounts.history.AccountHistoryRepository;
import com.savings.accounts.history.enums.HistoryType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;

@Service
@Transactional
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountHistoryCreationServiceImpl implements AccountHistoryCreationService {

    AccountHistoryRepository accountHistoryRepository;

    @Override
    public void create(AccountEntity account, Double amount, HistoryType historyType) {
        AccountHistoryEntity accountHistoryEntity = AccountHistoryEntity.builder()
                .account(account)
                .amount(amount)
                .type(historyType).build();

        accountHistoryRepository.save(accountHistoryEntity);
    }

    @Override
    public void create(AccountEntity accountFrom, AccountEntity accountTo, Double amount) {
        AccountHistoryEntity accountHistoryEntityFrom = AccountHistoryEntity.builder()
                .account(accountFrom)
                .transferAccount(accountTo)
                .amount(amount)
                .type(HistoryType.TRANSFER_FROM).build();

        AccountHistoryEntity accountHistoryEntityTo = AccountHistoryEntity.builder()
                .account(accountTo)
                .transferAccount(accountFrom)
                .amount(amount)
                .type(HistoryType.TRANSFER_TO).build();

        accountHistoryRepository.saveAll(Arrays.asList(accountHistoryEntityFrom, accountHistoryEntityTo));
    }
}
