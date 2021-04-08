package com.savings.accounts.reading;

import com.savings.accounts.structs.AccountDto;
import com.savings.accounts.structs.SplitDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/accounts/")
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountsReadingController {

    AccountsReadingService accountsReadingService;

    @GetMapping
    public List<AccountDto> findAccountsByUserUUID(@RequestParam("userUUID") UUID uuid) {
        return accountsReadingService.findByUserUUID(uuid);
    }

    @GetMapping("splits")
    public List<SplitDto> getIncomeSplits(@RequestParam("userUUID") UUID uuid,
                                          @RequestParam("income") Double income) {
        return accountsReadingService.getIncomeSplits(uuid, income);
    }
}
