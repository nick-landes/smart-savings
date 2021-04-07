package com.savings.users.structs;

import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@ApiModel("User reading description")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserReadingDto {

    UUID id;

    String fullName;
}
