package com.savings.users.structs.mapper;

import com.savings.users.UserEntity;
import com.savings.users.structs.UserCreationDto;
import com.savings.users.structs.UserReadingDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsersMapper {

    // User Entity
    UserEntity toUserEntity(UserCreationDto userCreationDto);

    // Creation
    UserCreationDto toUserCreationDto(UserEntity userEntity);
    List<UserCreationDto> toUserCreationDto(List<UserEntity> users);

    // Reading
    @Mapping(target = "fullName", source = ".", qualifiedByName = "fullName")
    UserReadingDto toUserReadingDto(UserEntity userEntity);

    List<UserReadingDto> toUserReadingDto(List<UserEntity> users);

    @Named("fullName")
    default String getUserFullName(UserEntity user) {
        if (user.getPatronymic() == null) {
            return String.format("%s %s", user.getSurname(), user.getName());
        } else {
            return String.format("%s %s %s", user.getSurname(), user.getName(), user.getPatronymic());
        }
    }
}
