package com.yourpackage.entity; // <-- Replace 'yourpackage' with your actual package name

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    // Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User() {} // Required default constructor

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}