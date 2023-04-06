/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.service.Controllers;

import com.mycompany.service.Models.Checkout;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A V I A N
 */
public class CheckoutControllerTest {
    
    public CheckoutControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of customerRegister method, of class CheckoutController.
     */
    @Test
    public void testCustomerRegister() {
        System.out.println("customerRegister");
        CheckoutController instance = new CheckoutController();
        Checkout checkout = new Checkout("test1","test1","test1","test1");
        boolean expResult = true;
        boolean result = instance.customerRegister(checkout);
        
        assertEquals(expResult, result);
        
        Checkout resultCustomers = new Checkout("test1","test1","test1","test1");
        assertEquals(checkout.getItem(), resultCustomers.getItem());
        assertEquals(checkout.getSize(), resultCustomers.getSize());
        assertEquals(checkout.getQuantity(), resultCustomers.getQuantity());
        assertEquals(checkout.getPrice(), resultCustomers.getPrice()); 
    }
    
}
