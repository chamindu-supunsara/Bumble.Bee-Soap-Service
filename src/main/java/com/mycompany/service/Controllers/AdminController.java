/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.Controllers;

import com.mycompany.service.DBConnection;
import com.mycompany.service.Models.Admin;
import com.mycompany.service.Models.Customers;
import com.mycompany.service.Models.Orders;
import com.mycompany.service.Models.SalesDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author A V I A N
 */
public class AdminController {
    
    public Admin Login(String id,String password){
        
        final Connection connection=DBConnection.getConnection();
        String sql_query="SELECT*FROM admin WHERE id=? and password=?";
        Admin admin=null;
        
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql_query);
            stmt.setString(1, id);
            stmt.setString(2, password);
            
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()) {
				
				
		admin = new Admin();
		admin.setAdmin_id(id);
		admin.setPassword(password);
		admin.setIsValide(true);
				
		}
            
        }catch(Exception ex){
            System.out.println("ERROR"+ex);
        }
        return admin;
    }

     public SalesDetails getSales (String id) {
        SalesDetails db = null;
                try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT id, name, address, price, loan, birthday, plan FROM order WHERE id='" + id + "'");
            
            while(resultSet.next()) {
                db = new SalesDetails(resultSet.getString("id"),  
                          resultSet.getString("name"),
                          resultSet.getString("address"),
                          resultSet.getString("price"),
                          resultSet.getString("loan"),
                          resultSet.getString("birthday"),
                          resultSet.getString("plan"));                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }    
        return db;
    }  
     
     public boolean deleteCustomer(String id){
    Connection connection = DBConnection.getConnection(); 
     
        try{
          Statement stmt=connection.createStatement();
           
          int rows=stmt.executeUpdate(" DELETE FROM `customerregistor` WHERE "
           + "(`id`='"+id+"');");
      		
	    return rows>0;
	
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
