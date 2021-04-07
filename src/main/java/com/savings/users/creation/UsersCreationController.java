package com.savings.users.creation;

import com.savings.users.structs.UserCreationDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users/")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UsersCreationController {

    UsersCreationService usersCreationService;

    @PostMapping(path = "/")
    public void create(@RequestBody UserCreationDto userCreationDto) {
        usersCreationService.create(userCreationDto);
    }
}
