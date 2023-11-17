package com.example.main.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.main.entity.Contact;


public interface ContactRepo extends JpaRepository<Contact, Long> {

    boolean existsByEmail(String email);

    boolean existsByName(String name);

    Contact findByName(String name);

    Contact findByEmail(String email);

}

