package com.savings.users.creation;

import com.savings.users.structs.UserCreationDto;
import com.savings.users.structs.mapper.UsersMapper;
import com.savings.users.UsersRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class UsersCreationServiceImpl implements UsersCreationService {

    UsersRepository usersRepository;
    UsersMapper usersMapper;

    @Override
    public void create(UserCreationDto userCreationDto) {
        usersRepository.saveAndFlush(usersMapper.toUserEntity(userCreationDto));
    }
}
