package com.citi.training.Rest_API.repo;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface StockRepository extends JpaRepository<Stock, Integer> {
    @Query(value = "SELECT * FROM stocks_table ORDER BY gain_loss DESC LIMIT 5", nativeQuery = true)
    List<Stock> findTopByGain_loss();

    @Query(value = "SELECT * FROM stocks_table ORDER BY gain_loss ASC LIMIT 5", nativeQuery = true)
    List<Stock> findLoserByGain_loss();

    @Query(value = "SELECT ROUND(SUM(total_gain_loss),2) FROM stocks_table", nativeQuery = true)
    double findtotal_gain_loss();

    @Query(value = "SELECT ROUND(SUM(gain_loss),2) FROM stocks_table", nativeQuery = true)
    double findgain_loss();

}