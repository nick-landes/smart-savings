package com.savings.accounts.creation.checkrules;

import com.savings.accounts.structs.AccountCreationDto;

public interface AccountCreationCheckRule {

    void check(AccountCreationDto accountCreationDto);
}
