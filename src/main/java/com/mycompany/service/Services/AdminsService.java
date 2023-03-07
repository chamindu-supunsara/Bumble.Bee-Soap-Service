/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.service.Services;

import com.mycompany.service.Controllers.AdminController;
import com.mycompany.service.Models.Admin;
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
}
