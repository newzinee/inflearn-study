package com.example.clouduserservice.service;

import com.example.clouduserservice.dto.UserDto;
import com.example.clouduserservice.jpa.UserEntity;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();

}
