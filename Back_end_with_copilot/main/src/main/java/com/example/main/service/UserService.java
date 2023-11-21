package com.example.main.service;

//define interface UserService

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.main.entity.User;

@Component
public interface UserService {
    public List<User> getUsers();
    //define method to add user in a list and return added user 
    public User addUser(User user) throws Exception;
    //define method to update user in a list and return updated user
    public User updateUser(User user);
    //define method to delete user in a list and return deleted user
    public User deleteUser(Long id);
    //define method to get user by id in a list and return user
    public User getUserById(Long id);
    //define method to get user by name in a list and return user
    public User getUserByName(String name);
    //define method to get user by email in a list and return user
    public User getUserByEmail(String email);
    
    
}

