/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondAttemptCrud.EmployeeCrudService;
import com.mycompany.secondattemptClasses.Employee;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurt wasserfall 211150142 3B
 */
public class EmployeeTestCrudService {
    
    public EmployeeTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Mock
    EmployeeCrudService crudService;
    @BeforeClass
    public void setUpClass() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(EmployeeCrudService.class);
    }

    @AfterClass
    public  void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     @Test
    public void testCreate() throws Exception {
        Employee e = new Employee.Builder("Darrel").Surname("van reenan").IdentificationNo("0128937463528").Phone("021701234").Address("20 Garden rd Cape Town").build();
        Employee returnEmployee = crudService.persist(e);
        when(crudService.persist(e)).thenReturn(returnEmployee);
        Mockito.verify(crudService).persist(e);
      }
    
    @Test
    public void testRead() throws Exception {
        Employee e = new Employee.Builder("Darrel").Surname("van reenan").IdentificationNo("0128937463528").Phone("021701234").Address("20 Garden rd Cape Town").build();
        Employee returnEmployee = crudService.find(e.getName());
        when(crudService.find(e.getName())).thenReturn(returnEmployee);
        Mockito.verify(crudService).find(e.getName());

    }
    @Test
    public void testUpdate() throws Exception {
      
   //This method is used to save the current state of Entity t         

Employee e = new Employee.Builder("Dorel").Surname("van reenan").IdentificationNo("0128937463528").Phone("0213401234").Address("20 Gredden rd Cape Town").build();

//second record
Employee b = crudService.find(e.getName());
//update
crudService.merge(b);
Mockito.verify(crudService).merge(b);
}
    
     @Test
    public void testDelete() throws Exception {

        Employee e = new Employee.Builder("Dorel").Surname("van reenan").IdentificationNo("0128937463528").Phone("0213401234").Address("20 Gredden rd Cape Town").build();
        Employee returnEmployee = crudService.remove(e);
        when(crudService.remove(e)).thenReturn(returnEmployee);
        Mockito.verify(crudService).remove(e);


    }
}
