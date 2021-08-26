package com.citi.training.Rest_API.rest;

import com.citi.training.Rest_API.entities.Cash;
import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.Transaction;
import com.citi.training.Rest_API.entities.User;
import com.citi.training.Rest_API.service.CashService;
import com.citi.training.Rest_API.service.StockService;
import com.citi.training.Rest_API.service.TransactionService;
import com.citi.training.Rest_API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private StockService stockService;

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private CashService cashService;

    @GetMapping
    List<User> getUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/stocks")
    List<Stock> getStocks() {
        return stockService.getAllStock();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/cash")
    List<Cash> getCash() {
        return cashService.getAllCash();
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

    @RequestMapping(method = RequestMethod.GET, value = "/buyInRange/{date1}/{date2}")
    List<Transaction> getBuyStocksInRange(@PathVariable("date1") Date date1, @PathVariable("date2") Date date2) {    return transactionService.getBuyStocksInRange(date1, date2);}

    @RequestMapping(method = RequestMethod.GET, value = "/sellInRange/{date1}/{date2}")
    List<Transaction> getSellStocksInRange(@PathVariable("date1") Date date1, @PathVariable("date2") Date date2) {    return transactionService.getSellStocksInRange(date1, date2);}

    @RequestMapping(method = RequestMethod.GET, value = "/total_cash")
     public double getTotal_Cash() {    return userService.total_cash();}

    @RequestMapping(method = RequestMethod.GET, value = "/net_worth")
    public double getTotal_Networth() {    return userService.total_networth();}

    @RequestMapping(method = RequestMethod.GET, value = "/investment")
    public double getTotal_Investment() {    return userService.total_investment();}
}
