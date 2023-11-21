package com.example.main.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.main.entity.User;
import com.example.main.repository.UserRepository;
import com.example.main.service.UserService;


@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        
        //get all users from database
        List<User> users = userRepository.findAll();

        return users;

       
    }

    @Override
    public User addUser(User user) throws Exception {
        //check if user already exists in database by id or email 
        // if (userRepository.existsById(user.getId()) || userRepository.existsByEmail(user.getEmail())) {
        //       //if exists return null
        //      throw new Exception("User already exists");
        // }      
        //else add user to database and return user
        return userRepository.save(user);

       

    }

    @Override
    public User updateUser(User user) {
        //check if user present in database by id 
        //if not present update user and return user
        //else return null
        if (userRepository.findById(user.getId()) != null) {
            return userRepository.save(user);
        }
        throw new RuntimeException("User not found");

    }

    @Override
    public User deleteUser(Long id) {
      //check if user present in database by id 
        //if not present delete user and return user
        //else return null
        if (userRepository.findById(id) != null) {
            User user = userRepository.findById(id).get();
            userRepository.deleteById(id);
            return user;
        }
        throw new RuntimeException("User not found");
    }

    @Override
    public User getUserById(Long id) {
        //check if user present in database by id 
        //if present return user
        //else return null
        if (userRepository.findById(id) != null) {
            return userRepository.findById(id).get();
        }
        throw new RuntimeException("User not found");
    }

    @Override
    public User getUserByName(String name) {
        //check if user present in database by name 
        //if present return user
        //else return null
        if (userRepository.findByName(name) != null) {
            return userRepository.findByName(name);
        }
        throw new RuntimeException("User not found");
    }

    @Override
    public User getUserByEmail(String email) {
        //check if user present in database by email 
        //if present return user
        //else return null
        if (userRepository.existsByEmail(email)) {
            return userRepository.findByEmail(email);
        }
        throw new RuntimeException("User not found");
    }



}












