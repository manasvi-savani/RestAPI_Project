package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

public interface UserService {
    Collection<User> getAllUsers();
}
