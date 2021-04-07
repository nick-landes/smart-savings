package com.savings.users.reading;

import com.savings.users.UserEntity;
import com.savings.users.structs.UserCreationDto;
import com.savings.users.structs.UserReadingDto;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsersReadingService {

    Optional<UserEntity> findOptionalByUUID(UUID uuid);

    List<UserReadingDto> findAll();
}
