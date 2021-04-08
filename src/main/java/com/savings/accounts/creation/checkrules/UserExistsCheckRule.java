package com.savings.accounts.creation.checkrules;

import com.savings.accounts.structs.AccountDto;
import com.savings.users.reading.UsersReadingService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

@Component
@AllArgsConstructor
public class UserExistsCheckRule implements AccountCreationCheckRule {

    UsersReadingService usersReadingService;

    @Override
    public void check(AccountDto accountDto) {
        usersReadingService.findOptionalByUUID(accountDto.getUserUUID())
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND, "User not found"));
    }
}
