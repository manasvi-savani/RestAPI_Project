package com.citi.training.Rest_API.service;

import com.citi.training.Rest_API.entities.Cash;
import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.repo.CashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CashServiceImpl implements CashService {

    @Autowired
    private CashRepository cashRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Cash> getAllCash() {
        return cashRepository.findAll();
    }


}
