package com.savings;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UsersCreationController {

    UsersService usersService;

    @PostMapping(path = "/")
    public void add(@RequestBody UserDto userDto) {
        usersService.add(userDto);
    }
}
