/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.Controllers;

import com.mycompany.service.DBConnection;
import com.mycompany.service.Models.Checkout;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author A V I A N
 */
public class CheckoutController {
    
    public boolean customerRegister(Checkout checkout){
        
        Connection connection=DBConnection.getConnection();
        
        try{
         
            Statement stam=connection.createStatement();
            int rows=stam.executeUpdate((" INSERT INTO `checkout`(`item`,"
              + " `size`, `quantity`, `price`) VALUES ('"+checkout.getItem()+"','"
            +checkout.getSize()+"','"+checkout.getQuantity())+"','"+checkout.getPrice()+"')");
            
           return rows>0;
            
        }catch(Exception ex){
            System.out.println("ERROR"+" "+ex);
        }
         
        return false;
    }
}
