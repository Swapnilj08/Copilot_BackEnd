package com.example.main.controller;
import com.example.main.entity.User;
import com.example.main.service.UserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

//Define @RestController userController class with @getMapping, @PostMapping, @PutMapping, @DeleteMapping annotations
@RestController
@RequestMapping("/user")
public class UserController {

    //define UserService object
    @Autowired
    private UserService userService;

    //define constructor for userController class
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //define method to get users and return users
    @GetMapping("/all")
    public List<User> getUsers() {
        return userService.getUsers();

    }

    //define method to add user in a list and return added user
    @PostMapping("/add")
    public User addUser(@RequestBody User user) throws Exception {
        return userService.addUser(user);
    }

    //define method to update user in a list and return updated user
    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    //define method to delete user in a list and return deleted user
    @DeleteMapping("/delete/{id}")
    public User deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
    
    //define method to get user by id in a list and return user
    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    
    //define method to get user by name in a list and return user
    @GetMapping("/get/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }
    
    //define method to get user by email in a list and return user
    @GetMapping("/get/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }
    
    
}
