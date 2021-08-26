package com.citi.training.Rest_API.repo;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import com.citi.training.Rest_API.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    @Query(value = "SELECT * FROM transaction_table WHERE transaction_type='BUY' AND transaction_date BETWEEN :date1 AND :date2", nativeQuery = true)
    List<Transaction> findBuyInRange(Date date1, Date date2);

    @Query(value = "SELECT * FROM transaction_table WHERE transaction_type='SELL' AND transaction_date BETWEEN :date1 and :date2", nativeQuery = true)
    List<Transaction> findSellInRange(Date date1, Date date2);
}
