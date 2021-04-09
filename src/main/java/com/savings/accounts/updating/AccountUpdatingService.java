package com.savings.accounts.updating;

import java.util.UUID;

public interface AccountUpdatingService {

    void withdraw(UUID accountUUID, Double amount);
    void transfer(UUID accountFromUUID, UUID accountToUUID, Double amount);
    void deposit(UUID accountUUID, Double amount);
}
