package com.citi.training.Rest_API.rest;

import com.citi.training.Rest_API.entities.User;
import com.citi.training.Rest_API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody User user){ userService.addNewUser(user); }

//    @RequestMapping(method = RequestMethod.GET, value = "/{stock}")
//    public User getStocks(@PathVariable("stock") String stock) {
//        return userService.getUsersByStock(stock);
//    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }

}
