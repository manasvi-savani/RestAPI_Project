package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAllTransactions();
}
