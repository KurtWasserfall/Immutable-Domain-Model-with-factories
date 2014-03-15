/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondAttemptCrud.CarKIACrudService;
import com.mycompany.secondattemptClasses.carKIA;
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
public class carKIATestCrudService {
    
    public carKIATestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

     CarKIACrudService crudService;
        
    @BeforeClass
    public void setUpClass() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CarKIACrudService.class);
    }

    @AfterClass
    public void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     @Test
    public void testCreate() throws Exception {
       carKIA a = new carKIA.Builder("2007 Shuma").Colour("Black").Damaged("Bootlid").PartNo("kaui34").build();
        carKIA returnCarKIA  = crudService.persist(a);
        when(crudService.persist(a)).thenReturn(returnCarKIA);
      }
    @Test
    public void testRead() throws Exception {
        carKIA a = new carKIA.Builder("2007 Shuma").Colour("Black").Damaged("Bootlid").PartNo("kaui34").build();
        carKIA returnCarKIA = crudService.find(a.getCarModel());
        when(crudService.find(a.getCarModel())).thenReturn(returnCarKIA);
        Mockito.verify(crudService).find(a.getCarModel());

    }
    
    @Test
    public void testUpdate() throws Exception {
      
   //This method is used to save the current state of Entity t         

carKIA a = new carKIA.Builder("2007 Shuma").Colour("Black").Damaged("Bootlid").PartNo("kaui34").build();
//second record
carKIA b = crudService.find(a.getCarModel());
//update
crudService.merge(b);
Mockito.verify(crudService).merge(b);
}

    @Test
    public void testDelete() throws Exception {

       carKIA a = new carKIA.Builder("2007 Shuma").Colour("Black").Damaged("Bootlid").PartNo("kaui34").build();
        carKIA returnCarKIA = crudService.remove(a);
        when(crudService.remove(a)).thenReturn(returnCarKIA);
        Mockito.verify(crudService).remove(a);


}
}
