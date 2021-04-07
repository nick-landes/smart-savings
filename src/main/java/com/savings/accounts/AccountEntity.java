package com.savings.accounts;

import com.savings.users.UserEntity;
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

    //@Column(columnDefinition = "")
    Double balance;

    Double interest;
}
