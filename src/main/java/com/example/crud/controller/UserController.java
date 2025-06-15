package com.example.crud.controller;

import com.example.crud.dto.UserDto;
import com.example.crud.service.UserService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public UserDto registerUser(@RequestBody UserDto userDto){
        return userService.registerUser(userDto);
    }

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDto getuserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        try {
            userService.deleteUser(id);
            return "Successfully deleted user with id: " + id;
        }
        catch (Exception e){
return e.toString();
        }
    }
}
