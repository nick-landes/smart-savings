package com.savings.accounts.creation.checkrules;

import com.savings.accounts.structs.AccountDto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

@Component
public class BalancePositiveCheckRule implements AccountCreationCheckRule {

    @Override
    public void check(AccountDto accountDto) {
        if (accountDto.getBalance() < 0) {
            throw new HttpClientErrorException(HttpStatus.NOT_ACCEPTABLE, "Balance must be non negative");
        }
    }
}
