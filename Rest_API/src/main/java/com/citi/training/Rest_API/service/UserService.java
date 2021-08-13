package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.User;

import java.util.Collection;

public interface UserService {
    Collection<User> getAllUsers();
}
