package com.savings.accounts.creation;

import com.savings.accounts.structs.AccountCreationDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/accounts/")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountCreationController {

    AccountsCreationService accountsCreationService;

    @PostMapping("/")
    void create(@RequestBody AccountCreationDto accountCreationDto) {
        accountsCreationService.create(accountCreationDto);
    }
}
