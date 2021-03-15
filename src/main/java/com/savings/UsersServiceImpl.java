package com.savings;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class UsersServiceImpl implements UsersService {

    UsersRepository usersRepository;
    UserMapper userMapper;

    @Override
    public void add(UserDto userDto) {
        usersRepository.saveAndFlush(userMapper.toUserEntity(userDto));
    }
}
