package com.savings.accounts.history;

import com.savings.accounts.AccountEntity;
import com.savings.accounts.history.enums.HistoryType;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account_history")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountHistoryEntity {

    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false)
    Double amount;

    @CreationTimestamp
    LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    HistoryType type;

    @ManyToOne
    @JoinColumn(name="account_uuid", nullable=false)
    AccountEntity account;

    @OneToOne
    AccountEntity transferAccount;
}
