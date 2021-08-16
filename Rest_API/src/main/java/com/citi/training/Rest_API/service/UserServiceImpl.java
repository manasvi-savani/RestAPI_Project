package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.User;
import com.citi.training.Rest_API.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
