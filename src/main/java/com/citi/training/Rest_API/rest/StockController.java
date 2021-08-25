package com.citi.training.Rest_API.rest;


import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import com.citi.training.Rest_API.service.StockService;
import com.citi.training.Rest_API.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping
    List<Stock> getStocks() {
        return stockService.getAllStocks();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{user_id}")
    public void deleteUserByUserId(@PathVariable("user_id") int user_id) {
        stockService.deleteUserByUserId(user_id);
    }
}
