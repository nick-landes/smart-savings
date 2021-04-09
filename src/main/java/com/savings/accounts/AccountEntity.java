package com.savings.accounts;

import com.savings.accounts.history.AccountHistoryEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountEntity {

    @Id
    @GeneratedValue
    UUID uuid;

    UUID userUUID;

    String name;

    Double balance;

    Double interest;

    Double incomeInterest;

    @CreationTimestamp
    LocalDateTime createdAt;

    @OneToMany
    List<AccountHistoryEntity> history;
}
