package com.savings.users.structs;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@ApiModel("User creation description")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationDto {

    @ApiModelProperty("Surname")
    String surname;

    @ApiModelProperty("Name")
    String name;

    @ApiModelProperty("Patronymic")
    String patronymic;

    @ApiModelProperty("Email")
    String email;

    @ApiModelProperty("Phone number")
    String phoneNumber;
}
