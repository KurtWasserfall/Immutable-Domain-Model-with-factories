/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.mycompany.secondAttemptCrud.CustomerCrudService;
import com.mycompany.secondattemptClasses.Customer;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import org.testng.annotations.Test;

/**
 *
 * @author kurt wasserfall 211150142 3B
 */
public class CustomerTestCrudService {
    
    public CustomerTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Mock
    CustomerCrudService crudService;
    
    @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CustomerCrudService.class);
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
        Customer c = new Customer.Builder("John").Surname("Hendricks").IdentificationNo("0128937463528").Phone("021701234").Address("20 Garden rd Cape Town").build();
        Customer returnCustomer = crudService.persist(c);
        when(crudService.persist(c)).thenReturn(returnCustomer);
        Mockito.verify(crudService).persist(c);
      }
    
    @Test
    public void testRead() throws Exception {
        Customer c = new Customer.Builder("John").Surname("Hendricks").IdentificationNo("0128937463528").Phone("021701234").Address("20 Garden rd Cape Town").build();
        Customer returnCustomer = crudService.find(c.getName());
        when(crudService.find(c.getName())).thenReturn(returnCustomer);
        Mockito.verify(crudService).find(c.getName());

    }
    
    @Test
    public void testUpdate() throws Exception {
      
   //This method is used to save the current state of Entity t         

Customer c = new Customer.Builder("John").Surname("Hendricks").IdentificationNo("0128937463528").Phone("021701234").Address("20 Garden rd Cape Town").build();

//second record
Customer a = crudService.find(c.getName());
//update
crudService.merge(a);
Mockito.verify(crudService).merge(a);

/*
       System.out.println("merge");
        Customer entity = null;
        CustomerCrudServiceImpl instance = new CarVOLGSWAGENCrudServiceImpl();
        Customer expResult = null;
        Customer result = instance.merge(entity);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
*/

        
          
    }

    @Test
    public void testDelete() throws Exception {

        Customer c = new Customer.Builder("peter").Surname("Hendricks").IdentificationNo("0128937463528").Phone("021701234").Address("20 Garden rd Cape Town").build();
        Customer returnCustomer = crudService.remove(c);
        when(crudService.remove(c)).thenReturn(returnCustomer);
        Mockito.verify(crudService).remove(c);


}
}
