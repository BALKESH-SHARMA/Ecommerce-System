package com.example.crud.service;

import com.example.crud.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    UserDto registerUser(UserDto userDto);
    List<UserDto> getAllUsers();
    UserDto getUserById(Long id);
    void deleteUser(Long id);
}
