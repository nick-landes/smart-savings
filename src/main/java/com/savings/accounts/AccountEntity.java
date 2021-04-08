package com.savings.accounts;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
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
}
