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
              + " `name`, `email`, `password`) VALUES ('"+customer.getId()+"','"
            +customer.getName()+"','"+customer.getEmail())+"','"+customer.getPassword()+"')");
            
           return rows>0;
            
        }catch(Exception ex){
            System.out.println("ERROR"+" "+ex);
        }
         
        return false;
    }
    
    public boolean customerUpdate(Customers customer) {
        
         Connection connection = DBConnection.getConnection(); 
         try {   
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `customerregistor` SET  `name` = '"
                    + customer.getName() +  "', `email` = '" + customer.getEmail() +"', `password` = '" + customer.getPassword()+"' WHERE (`id` = '"  + customer.getId() + "')");
            
            return rows > 0;
            
        } catch (Exception ex){
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
		customer.setId(id);
		customer.setPassword(password);
		customer.setIsValide(true);
				
		}
            
        }catch(Exception ex){
            System.out.println("ERROR"+ex);
        }
        return customer;
    }
}
