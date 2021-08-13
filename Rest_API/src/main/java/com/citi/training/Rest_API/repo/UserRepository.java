package com.citi.training.Rest_API.repo;

import com.citi.training.Rest_API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;


public interface UserRepository extends JpaRepository<User, Integer> {
    Collection<User> findByName(String name);
}
