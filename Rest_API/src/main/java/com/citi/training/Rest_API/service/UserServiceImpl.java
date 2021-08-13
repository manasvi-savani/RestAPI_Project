package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.User;
import com.citi.training.Rest_API.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Collection<User> getAllUsers() {
        return userRepository.findAll();
    }
}
