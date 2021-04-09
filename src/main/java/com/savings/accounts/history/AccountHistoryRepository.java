package com.savings.accounts.history;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AccountHistoryRepository extends JpaRepository<AccountHistoryEntity, Long> {

    List<AccountHistoryEntity> findByAccount_Uuid(UUID accountUUID);
}
