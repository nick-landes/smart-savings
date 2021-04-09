package com.savings.users;

import com.savings.accounts.AccountEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserEntity {

    @Id
    @GeneratedValue
    UUID id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String surname;

    String patronymic;

    String email;

    String phoneNumber;

    @CreationTimestamp
    LocalDateTime createdAt;

    @OneToMany
    List<AccountEntity> accounts;
}
