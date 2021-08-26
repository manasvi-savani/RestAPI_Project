package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.Transaction;

import java.util.List;
import java.sql.Date;

public interface TransactionService {
    List<Transaction> getAllTransactions();

    List<Transaction> getBuyStocksInRange(Date date1, Date date2);

    List<Transaction> getSellStocksInRange(Date date1, Date date2);
}
