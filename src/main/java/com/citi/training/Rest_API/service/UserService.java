package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    User addNewUser(User user);
    void deleteUser(int id);
    void deleteUser(User user);

    List<User> getUserByName(String name);
    //User getUserByName(String name);
}
