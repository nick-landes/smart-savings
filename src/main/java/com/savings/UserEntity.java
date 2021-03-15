package com.savings;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
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

    @Column
    String name;

    @Column
    String surname;

    @Column
    String patronymic;

    @Column
    String email;

    @Column
    String phoneNumber;
}
