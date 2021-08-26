package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.Transaction;
import com.citi.training.Rest_API.repo.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.sql.Date;


import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Transaction> getAllTransactions() {return transactionRepository.findAll();}

    @Override
    public List<Transaction> getBuyStocksInRange(Date date1, Date date2) {
        return transactionRepository.findBuyInRange(date1, date2);
    }

    @Override
    public List<Transaction> getSellStocksInRange(Date date1, Date date2) {
        return transactionRepository.findSellInRange(date1, date2);
    }

}
