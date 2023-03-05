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
    private String cus_id;
    private String cus_name;
    private String cus_email;
    private String password;

    public Customers(String cus_id, String cus_name, String cus_email, String password) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_email = cus_email;
        this.password = password;
    }

    public Customers() {
    }
    
    

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_email() {
        return cus_email;
    }

    public void setCus_email(String cus_email) {
        this.cus_email = cus_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
