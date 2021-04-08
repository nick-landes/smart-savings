package com.savings.accounts.structs;

import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@ApiModel("Income reading description")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SplitDto {

    UUID accountUUID;

    String accountName;

    Double amount;
}
