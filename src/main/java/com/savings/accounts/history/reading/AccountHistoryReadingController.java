package com.savings.accounts.history.reading;

import com.savings.accounts.history.structs.AccountHistoryDto;
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
@RequestMapping("/accounts/histories/")
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AccountHistoryReadingController {

    AccountHistoryReadingService service;

    @GetMapping
    public List<AccountHistoryDto> findAccountHistoriesByAccountUUID(@RequestParam("accountUUID") UUID accountUUID) {
        return service.findByAccountUUID(accountUUID);
    }
}
