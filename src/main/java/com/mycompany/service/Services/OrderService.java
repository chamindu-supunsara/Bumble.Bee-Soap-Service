/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.service.Services;


import com.mycompany.service.Controllers.OrderController;
import com.mycompany.service.Models.Orders;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author A V I A N
 */
@WebService(serviceName = "OrderService")
public class OrderService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "customerOrder")
    public boolean Cus_ord(@WebParam(name="order")Orders order) {
        OrderController ord_controller = new OrderController();
        return ord_controller.customerOrder(order);  
    }
    
     @WebMethod(operationName = "deleteOrder")
    public boolean deleteOrder(@WebParam(name="id") String id){
    OrderController ord_controller = new OrderController();
    return ord_controller.deleteOrder(id);
    }
}
