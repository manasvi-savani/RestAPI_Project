package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import com.citi.training.Rest_API.repo.StockRepository;
import com.citi.training.Rest_API.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @Override
    public User getUserById(int id) {
        Optional<User> userOptional =  userRepository.findById(id);
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        else return null;
    }

    @Override
    public User addNewUser(User user) {
        user.setId(0);
        return userRepository.save(user);
    }

    public void deleteUser(int  id) {
        User user = userRepository.findById(id).get();
        deleteUser(user);
    }
    
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public double total_cash(){
        return userRepository.findtotalCash();
    }

    @Override
    public double total_networth(){
        return userRepository.findtotalNetWorth();
    }

    @Override
    public double total_investment(){
        return userRepository.findtotalinvestment();
    }
}
