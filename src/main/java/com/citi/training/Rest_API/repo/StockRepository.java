package com.citi.training.Rest_API.repo;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock, Integer> {
    List<User> findByName(String name);

}
