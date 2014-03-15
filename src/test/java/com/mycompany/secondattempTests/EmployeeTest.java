/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondattemptClasses.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 *@author kurt wasserfall 211150142 3B
 */
public class EmployeeTest {
    
      @Test
    public void testCreation() throws Exception {
        //object tests
        Employee e = new Employee.Builder("Darrel").Surname("van reenan").IdentificationNo("0128937463528").Phone("021701234").Address("20 Garden rd Cape Town").build();

        Assert.assertEquals(e.getSurname(),"van reenan");//expected result on surname
        Assert.assertEquals(e.getName(),"Darrel");//this is the expected result name
        
        //print test to see if varianles is pass
        System.out.println("\nEmployee Details tester in customer test method");
        System.out.println(e.toString());
    }
    
}
