package com.savings.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AccountsRepository extends JpaRepository<AccountEntity, UUID> {

    List<AccountEntity> findByUserUUID(UUID userUUID);
}
