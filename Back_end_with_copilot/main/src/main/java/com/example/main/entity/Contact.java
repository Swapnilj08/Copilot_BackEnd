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

    //getters and setters methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //getters and setters methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getters and setters methods
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //getters and setters methods
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //getters and setters methods
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    


    //toString method
    @Override
    public String toString() {
        return "Contact [id=" + id + 
                ", name=" + name + 
                ", email=" + email + 
                ", phone=" + phone + 
                ", address=" + address + "]";
    }


}
