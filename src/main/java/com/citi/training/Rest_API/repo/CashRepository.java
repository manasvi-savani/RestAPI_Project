package com.citi.training.Rest_API.repo;

import com.citi.training.Rest_API.entities.Cash;
import com.citi.training.Rest_API.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CashRepository extends JpaRepository<Cash, Integer> {


}

