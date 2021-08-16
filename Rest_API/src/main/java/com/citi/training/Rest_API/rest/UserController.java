package com.citi.training.Rest_API.rest;

import com.citi.training.Rest_API.entities.User;
import com.citi.training.Rest_API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    List<User> getUsers() {
        return userService.getAllUsers();
    }


}
