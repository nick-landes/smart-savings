package com.savings.accounts.updating;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/accounts/")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountUpdatingController {

    AccountUpdatingService accountUpdatingService;

    @PutMapping("deposit")
    public void deposit(@RequestParam("accountUUID") UUID accountUUID,
                        @RequestParam("amount") Double amount) {
        accountUpdatingService.deposit(accountUUID, amount);
    }

    @PutMapping("withdraw")
    public void withdraw(@RequestParam("accountUUID") UUID accountUUID,
                        @RequestParam("amount") Double amount) {
        accountUpdatingService.withdraw(accountUUID, amount);
    }

    @PutMapping("transfer")
    public void transfer(@RequestParam("accountFromUUID") UUID accountFromUUID,
                         @RequestParam("accountToUUID") UUID accountToUUID,
                         @RequestParam("amount") Double amount) {
        accountUpdatingService.transfer(accountFromUUID, accountToUUID, amount);
    }
}
