package com.savings.accounts.history.structs;

import com.savings.accounts.history.enums.HistoryType;
import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

@ApiModel("Account history creation description")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountHistoryDto {

    Long id;

    Double amount;

    String datetime;

    HistoryType type;

    String transferAccountName;

}
