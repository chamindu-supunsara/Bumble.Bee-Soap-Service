/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.Models;

/**
 *
 * @author A V I A N
 */
public class Customers {
    private String id;
    private String name;
    private String email;
    private String password;
    private boolean isValide;

    public Customers(String id, String name, String email, String password, boolean isValide) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isValide = isValide;
    }

    public Customers() {
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsValide() {
        return isValide;
    }

    public void setIsValide(boolean isValide) {
        this.isValide = isValide;
    }

    
}
