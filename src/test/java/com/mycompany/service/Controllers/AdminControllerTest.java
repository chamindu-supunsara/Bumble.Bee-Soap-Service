/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.service.Controllers;

import com.mycompany.service.Models.Admin;
import com.mycompany.service.Models.Customers;
import com.mycompany.service.Models.SalesDetails;
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
public class AdminControllerTest {
    
    public AdminControllerTest() {
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
     * Test of Login method, of class AdminController.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String id = "admin";
        String password = "admin123";
        AdminController instance = new AdminController();
        Admin expResult = new Admin("admin","admin123");
        Admin result = instance.Login(id, password);
        assertEquals(expResult.getAdmin_id(), result.getAdmin_id());
        assertEquals(expResult.getPassword(), result.getPassword());
    }

    /**
     * Test of getSales method, of class AdminController.
     */
    @Test
    public void testGetSales() {
        System.out.println("getSales");
        String id = "";
        AdminController instance = new AdminController();
        SalesDetails expResult = null;
        SalesDetails result = instance.getSales(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteCustomer method, of class AdminController.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        AdminController instance = new AdminController();
        String id = "99";
        Customers customer = new Customers("99","test1","test1","123");
        boolean expResult = true;
        boolean result = instance.deleteCustomer(id);
        
        assertEquals(expResult, result);
        
        Customers resultCustomers = new Customers("99","test1","test1","123");
        assertEquals(customer.getId(), resultCustomers.getId());
        assertEquals(customer.getName(), resultCustomers.getName());
        assertEquals(customer.getEmail(), resultCustomers.getEmail());
        assertEquals(customer.getPassword(), resultCustomers.getPassword());
    }
    
}
