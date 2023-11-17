package com.example.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//define Contact class with id, name, email, phone, and address also define getters and setters parameterise constructor and toString method
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private int age;

    public Contact() {
        super();
    }

    public Contact(Long id, String name, String email, String phone, String address) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    
    //define getters and setters for all fields of Contact class in one go
    
    //getters
    
    

    
    
    


    //toString method
    @Override
    public String toString() {
        return "Contact [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
                + address + "]";
    }


}
