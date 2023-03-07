/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.Models;

/**
 *
 * @author A V I A N
 */
public class Admin {
    private String Admin_id;
    private String password;
    private boolean isValide;

    public Admin(String Admin_id, String password) {
        this.Admin_id = Admin_id;
        this.password = password;
    }

    public Admin() {
    }

    public String getAdmin_id() {
        return Admin_id;
    }

    public void setAdmin_id(String Admin_id) {
        this.Admin_id = Admin_id;
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
