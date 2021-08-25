package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StockServiceImpl implements StockService{
    @Autowired
    private StockRepository stockRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Stock> getAllStock() {
        return stockRepository.findAll();
    }

}
