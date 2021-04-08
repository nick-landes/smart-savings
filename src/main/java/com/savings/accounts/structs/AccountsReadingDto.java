package com.savings.accounts.structs;

import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@ApiModel("Account reading description")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountsReadingDto {

    UUID uuid;

    String name;

    Double balance;

    Double interest;
}
