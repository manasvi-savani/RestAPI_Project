package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Transaction;
import com.citi.training.Rest_API.repo.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Transaction> getAllTransactions() {return transactionRepository.findAll();}

}
