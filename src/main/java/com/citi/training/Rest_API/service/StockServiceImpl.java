package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {


    @Autowired
    private StockRepository stockRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }


    public void deleteUserByUserId(int  id) {
        Stock stock = stockRepository.findById(id).get();
        deleteUserByUserId(stock);
    }

    public void deleteUserByUserId(Stock stock) {
        stockRepository.delete(stock);
    }
}
