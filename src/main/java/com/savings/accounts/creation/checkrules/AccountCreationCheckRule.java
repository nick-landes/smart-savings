package com.savings.accounts.creation.checkrules;

import com.savings.accounts.structs.AccountDto;

public interface AccountCreationCheckRule {

    void check(AccountDto accountDto);
}
