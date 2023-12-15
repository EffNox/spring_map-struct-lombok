package nr.spring_mapstructlombok.modules.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMAP {

    UserDTO toDto(UserEntity e);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "username", source = "email")
    UserEntity toEntity(UserDTO e);

}
