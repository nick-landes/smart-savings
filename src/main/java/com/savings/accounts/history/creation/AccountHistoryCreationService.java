package com.savings.accounts.history.creation;

import com.savings.accounts.AccountEntity;
import com.savings.accounts.history.enums.HistoryType;

public interface AccountHistoryCreationService {

    void create(AccountEntity account, Double amount, HistoryType historyType);
    void create(AccountEntity accountFrom, AccountEntity accountTo, Double amount);
}
