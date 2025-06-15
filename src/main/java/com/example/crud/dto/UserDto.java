package com.example.crud.dto;

import lombok.Data;

@Data
public class UserDto {
    private String password;
    private String name;
    private String email;
    private String role;
}
