package com.example.main.service;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.main.entity.Contact;

//define interface ContactService
@Component
public interface ContactService {
    public List<Contact> getContacts();
    //define method to add contact in a list and return added contact 
    public Contact addContact(Contact contact);
    //define method to update contact in a list and return updated contact
    public Contact updateContact(Contact contact);
    //define method to delete contact in a list and return deleted contact
    public Contact deleteContact(Long id);
    //define method to get contact by id in a list and return contact
    public Contact getContactById(Long id);
    //define method to get contact by name in a list and return contact
    public Contact getContactByName(String name);
    //define method to get contact by email in a list and return contact
    public Contact getContactByEmail(String email);
    
    
}
