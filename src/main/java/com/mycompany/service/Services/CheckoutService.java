/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.service.Services;

import com.mycompany.service.Controllers.CheckoutController;
import com.mycompany.service.Controllers.CustomerController;
import com.mycompany.service.Models.Checkout;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author A V I A N
 */
@WebService(serviceName = "CheckoutService")
public class CheckoutService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "registerCustomer")
    public boolean Che_out(@WebParam(name="customer")Checkout checkout) {
        CheckoutController che_controller=new CheckoutController();
        return che_controller.customerRegister(checkout);    
    }
}
