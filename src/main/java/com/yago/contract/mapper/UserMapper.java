package com.yago.contract.mapper;

import com.yago.contract.model.entity.User;
import com.yago.contract.model.response.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toResponse(User user);
}
