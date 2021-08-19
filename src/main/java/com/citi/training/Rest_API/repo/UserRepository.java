package com.citi.training.Rest_API.repo;

import com.citi.training.Rest_API.entities.Stock;
import com.citi.training.Rest_API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(String name);

//    @Query("SELECT s FROM Stock s WHERE LOWER(s.stock_name) = LOWER(:stock_name)")
//    public List<Stock> findByStockButIgnoreTheCase(@Param("stock_name") String stock_name);

//    Collection<CompactDisc> findByStock(String title);

}
