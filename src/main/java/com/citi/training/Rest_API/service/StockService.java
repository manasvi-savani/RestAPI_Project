package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;

import java.util.List;

public interface StockService {
    List<Stock> getAllStock();
    List<Stock> getTop5Stock();
    List<Stock> getLoser5Stock();
    double totalGL();
    double getgainloss();
}
