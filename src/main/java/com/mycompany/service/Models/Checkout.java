/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.Models;

/**
 *
 * @author A V I A N
 */
public class Checkout {
    private String item;
    private String size;
    private String quantity;
    private String price;

    public Checkout(String item, String size, String quantity, String price) {
        this.item = item;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public Checkout() {
    }

    
    
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
