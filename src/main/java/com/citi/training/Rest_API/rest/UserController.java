package com.citi.training.Rest_API.rest;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import com.citi.training.Rest_API.service.StockService;
import com.citi.training.Rest_API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private StockService stockService;

    @GetMapping
    List<User> getUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/stocks")
    List<Stock> getStocks() {
        return stockService.getAllStock();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public User getUser(@PathVariable("id") int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody User user){ userService.addNewUser(user); }


    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/name/{name}")
    public List<User> getUserByName(@PathVariable("name") String name) {
        return userService.getUserByName(name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/top5")
    List<Stock> getTop5Stock() {    return stockService.getTop5Stock();}

    @RequestMapping(method = RequestMethod.GET, value = "/loser5")
        List<Stock> getLoser5Stock() {    return stockService.getLoser5Stock();}

}
