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

public interface UserRepository extends JpaRepository<User, Integer> {

      List<User> findByName(String name);

      @Query(value = "SELECT SUM(Cash_value) FROM users_table", nativeQuery = true)
      double findtotalCash();

      @Query(value = "SELECT Net_worth FROM users_table", nativeQuery = true)
      double findtotalNetWorth();

      @Query(value = "SELECT Investment_value FROM users_table", nativeQuery = true)
      double findtotalinvestment();


}
