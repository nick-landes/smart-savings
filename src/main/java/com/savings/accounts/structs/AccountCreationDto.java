package com.savings.accounts.structs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@ApiModel("Account creation description")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountCreationDto {

    @ApiModelProperty("User UUID")
    UUID userUUID;

    @ApiModelProperty("Name")
    String name;

    @ApiModelProperty("Current balance")
    Double balance;

    @ApiModelProperty("Interest rate")
    Double interest;
}
