package com.example.main.serviceImpl;

import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.main.entity.Contact;
import com.example.main.repository.ContactRepo;
import com.example.main.service.ContactService;

@Component
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepo contactRepo;

    @Override
    public List<Contact> getContacts() {
        
        //get all contacts from database
        List<Contact> contacts = contactRepo.findAll();

        return contacts;

       
    }

    @Override
    public Contact addContact(Contact contact) {
        //check if contact already exists in database by id or email 
        if (contactRepo.existsById(contact.getId()) || contactRepo.existsByEmail(contact.getEmail())) {
              //if exists return null
            return null;
        }      
        //else add contact to database and return contact
        return contactRepo.save(contact);

      


    }

    @Override
    public Contact updateContact(Contact contact) {
        //check if contact present in database by id 
        //if not present update contact and return contact
        //else return null
        if (contactRepo.existsById(contact.getId())) {
            return contactRepo.save(contact);
        }
        return null;

    }

    @Override
    public Contact deleteContact(Long id) {
      //check if contact present in database by id 
        //if not present delete contact and return contact
         
        if (contactRepo.existsById(id)) {
            Contact contact = contactRepo.findById(id).get();
            contactRepo.deleteById(id);
            return contact;
        }
        //else return contact not found
        return null;

    }

    @Override
    public Contact getContactById(Long id) {
       //check if contact present in database by id 
        //if present return contact
        //else return null
        if (contactRepo.existsById(id)) {
            return contactRepo.findById(id).get();
        }
        return null;
    }

    @Override
    public Contact getContactByName(String name) {
        //check if contact present in database by name 
        //if present return contact
        //else return null
        if (contactRepo.existsByName(name)) {
            return contactRepo.findByName(name);
        }
        return null;

    }

    @Override
    public Contact getContactByEmail(String email) {
       //check if contact present in database by email 
        //if present return contact
        //else return null
        if (contactRepo.existsByEmail(email)) {
            return contactRepo.findByEmail(email);
        }
        return null;
        
    }

   
    
}
