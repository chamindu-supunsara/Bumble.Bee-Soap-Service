/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.Controllers;

import com.mycompany.service.DBConnection;
import com.mycompany.service.Models.Orders;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author A V I A N
 */
public class OrderController {
    
    public boolean customerOrder(Orders order){
        
        Connection connection = DBConnection.getConnection();
        
        try{
         
            Statement stam = connection.createStatement();
            int rows = stam.executeUpdate((" INSERT INTO `order`(`id`,"
              + " `name`, `address`, `price`, `loan`, `birthday`, `plan`) VALUES ('"+order.getOrder_id()+"','"
            +order.getOrder_name()+"','"+order.getOrder_address()+"','"+order.getOrder_price()+"','"+order.getOrder_loan()+"','"+order.getOrder_birthday()+"','"+order.getOrder_plan()+"')"));
            
           return rows>0;
            
        }catch(Exception ex){
            System.out.println("ERROR"+" "+ex);
        }
         
        return false;
    }
    
     public boolean deleteOrder(String id){
    Connection connection = DBConnection.getConnection(); 
     
        try{
          Statement stmt=connection.createStatement();
           
          int rows=stmt.executeUpdate(" DELETE FROM `order` WHERE "
           + "(`id`='"+id+"');");
      		
	    return rows>0;
	
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
