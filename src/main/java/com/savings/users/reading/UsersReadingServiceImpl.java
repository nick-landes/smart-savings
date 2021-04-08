package com.savings.users.reading;

import com.savings.users.UserEntity;
import com.savings.users.UsersRepository;
import com.savings.users.structs.UserReadingDto;
import com.savings.users.structs.mapper.UsersMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UsersReadingServiceImpl implements UsersReadingService {

    UsersRepository usersRepository;
    UsersMapper usersMapper;

    @Override
    public Optional<UserEntity> findOptionalByUUID(UUID uuid) {
        return usersRepository.findById(uuid);
    }

    @Override
    public List<UserReadingDto> findAll() {
        List<UserEntity> users = usersRepository.findAll();
        return usersMapper.toUserReadingDto(users);
    }
}
