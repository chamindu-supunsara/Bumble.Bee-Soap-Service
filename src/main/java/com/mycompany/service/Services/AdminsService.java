/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.service.Services;

import com.mycompany.service.Controllers.AdminController;
import com.mycompany.service.DBConnection;
import com.mycompany.service.Models.Admin;
import com.mycompany.service.Models.Customers;
import com.mycompany.service.Models.Orders;
import com.mycompany.service.Models.SalesDetails;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author A V I A N
 */
@WebService(serviceName = "AdminsService")
public class AdminsService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "loginAdmin")
    public Admin loginAdmin(@WebParam(name = "id") String id,
    @WebParam(name = "password")String password)  {
    AdminController adminOpe = new AdminController();
    return adminOpe.Login(id, password);
    }
    
    /*@WebMethod(operationName = "update")
    public boolean update(@WebParam(name="customers")Customers customer) {
    AdminController ord_controller = new AdminController();
    return ord_controller.customerUpdate(customer);
    }*/
    
     @WebMethod(operationName = "getSales")
     public SalesDetails getSales (@WebParam(name = "id") String id) {
     AdminController adminOpe = new AdminController();
     return adminOpe.getSales(id);
    }
     
     @WebMethod(operationName = "deleteCustomer")
    public boolean deleteCustomer(@WebParam(name="id") String id){
    AdminController adminOpe = new AdminController();
    return adminOpe.deleteCustomer(id);
    }
    
}
