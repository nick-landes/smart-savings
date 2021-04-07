package com.savings.users.reading;

import com.savings.users.structs.UserReadingDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/")
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UsersReadingController {

    UsersReadingService usersReadingService;

    @GetMapping("/")
    public List<UserReadingDto> findAll() {
        return usersReadingService.findAll();
    }
}
