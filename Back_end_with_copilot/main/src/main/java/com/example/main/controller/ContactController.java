package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.entity.Contact;
import com.example.main.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;
    

    @GetMapping("/all")
    public List<Contact> getContacts() {
        return contactService.getContacts();

    }

    //define method to add contact in a list and return added contact
    @PostMapping("/add")
    public Contact addContact(@RequestBody Contact contact) throws Exception {
        return contactService.addContact(contact);
    }

    //define method to update contact in a list and return updated contact
    @PutMapping("/update")
    public Contact updateContact(@RequestBody Contact contact) {
        return contactService.updateContact(contact);
    }

    //define method to delete contact in a list and return deleted contact
    @DeleteMapping("/delete/{id}")
    public Contact deleteContact(@PathVariable Long id) {
        return contactService.deleteContact(id);
    }
    

    


    
}

