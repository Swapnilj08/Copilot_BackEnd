package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByName(String name);

    boolean existsByEmail(String email);

    User findByEmail(String email);
    
}
