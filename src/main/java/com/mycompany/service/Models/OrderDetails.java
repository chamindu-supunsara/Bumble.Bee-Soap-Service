/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.Models;

/**
 *
 * @author A V I A N
 */
public class OrderDetails {
    private String id;
    private String name;
    private String address;
    private String price;
    private String plan;
    private String birthday;
    private String loan;

    public OrderDetails(String id, String name, String address, String price, String plan, String birthday, String loan) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
        this.plan = plan;
        this.birthday = birthday;
        this.loan = loan;
    }

    public OrderDetails() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan;
    }
    
    
}
