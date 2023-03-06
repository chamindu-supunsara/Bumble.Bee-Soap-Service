/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.Controllers;

import com.mycompany.service.DBConnection;
import com.mycompany.service.Models.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author A V I A N
 */
public class CustomerController {
    
    public boolean customerRegister(Customers customer){
        
        Connection connection=DBConnection.getConnection();
        
        try{
         
            Statement stam=connection.createStatement();
            int rows=stam.executeUpdate((" INSERT INTO `customerregistor`(`id`,"
              + " `name`, `email`, `password`) VALUES ('"+customer.getCus_id()+"','"
            +customer.getCus_name()+"','"+customer.getCus_email())+"','"+customer.getPassword()+"')");
            
           return rows>0;
            
        }catch(Exception ex){
            System.out.println("ERROR"+" "+ex);
        }
         
        return false;
    }
    
    public Customers Login(String id,String password){
        
        final Connection connection=DBConnection.getConnection();
        String sql_query="SELECT*FROM customerregistor WHERE id=? and password=?";
        Customers customer=null;
        
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql_query);
            stmt.setString(1, id);
            stmt.setString(2, password);
            
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()) {
				
				
		customer = new Customers();
		customer.setCus_id(id);
		customer.setPassword(password);
		customer.setIsValide(true);
				
		}
            
        }catch(Exception ex){
            System.out.println("ERROR"+ex);
        }
        return customer;
    }
}
