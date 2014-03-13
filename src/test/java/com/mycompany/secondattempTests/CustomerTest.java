/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondattemptClasses.Customer;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurt wasserfall 211150142 3B
 */
public class CustomerTest {
    
    public CustomerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     @Test
    public void testCreation() throws Exception {
        //object tests
        Customer c = new Customer.Builder("John").Surname("Hendricks").IdentificationNo("0128937463528").Phone("021701234").Address("20 Garden rd Cape Town").build();
        Customer b = new Customer.Builder("Peter").Surname("Pan").build();
        Assert.assertEquals(c.getSurname(),"Hendricks");
        Assert.assertEquals(c.getName(),"John");//this is the expected result
        
        //print test to see if varianles is pass
        System.out.println("\nCustomer Details tester in customer test method");
        System.out.println(c.toString());
        

    }

  
}
