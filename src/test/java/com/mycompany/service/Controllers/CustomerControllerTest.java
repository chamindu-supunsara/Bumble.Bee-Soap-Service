/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.service.Controllers;

import com.mycompany.service.Models.Customers;
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
public class CustomerControllerTest {
    
    public CustomerControllerTest() {
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
     * Test of customerRegister method, of class CustomerController.
     */
    /*@Test
    public void testCustomerRegister() {
        System.out.println("customerRegister");
        CustomerController instance = new CustomerController();
        Customers customer = new Customers("13","test","test","123");
        boolean expResult = true;
        boolean result = instance.customerRegister(customer);
        
        assertEquals(expResult, result);
        
        Customers resultCustomers = instance.customerRegister(customer.getId());
        assertEquals(customer.getId(), resultCustomers.getId());
        assertEquals(customer.getName(), resultCustomers.getName());
        assertEquals(customer.getEmail(), resultCustomers.getEmail());
        assertEquals(customer.getPassword(), resultCustomers.getPassword());   
    }*/

    /**
     * Test of customerUpdate method, of class CustomerController.
     */
    /*@Test
    public void testCustomerUpdate() {
        System.out.println("customerUpdate");
        Customers customer = null;
        CustomerController instance = new CustomerController();
        boolean expResult = false;
        boolean result = instance.customerUpdate(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class CustomerController.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String id = "11";
        String password = "1234";
        CustomerController instance = new CustomerController();
        Customers expResult = new Customers("11","ravindu","ravindu@gmail.com","1234");
        Customers result = instance.Login(id, password);
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getPassword(), result.getPassword());
    }
    
}
