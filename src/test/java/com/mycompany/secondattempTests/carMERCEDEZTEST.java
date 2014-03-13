/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondattemptClasses.carMERCEDEZ;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurt
 */
public class carMERCEDEZTEST {
    
    public carMERCEDEZTEST() {
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
        carMERCEDEZ a = new  carMERCEDEZ.Builder("1996 Compressor").Colour("Matalic Silver").Damaged("Right Mirror").PartNo("mzdz323402839").build();
      

        Assert.assertEquals(a.getPartNo(),"mzdz323402839");//this is the expected result
        
        //print test to see if variables is pass
        System.out.println("\nCar Details");
        System.out.println(a.toString());
    }
}
