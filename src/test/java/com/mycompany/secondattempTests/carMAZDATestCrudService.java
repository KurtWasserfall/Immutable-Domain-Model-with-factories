/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondAttemptCrud.CarMAZDACrudService;
import com.mycompany.secondattemptClasses.carMAZDA;
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
public class carMAZDATestCrudService {
    
    public carMAZDATestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    CarMAZDACrudService crudService;
    @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CarMAZDACrudService.class);
    }

    /**
     *
     * @throws Exception
     */
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
         carMAZDA a = new carMAZDA.Builder("2011 mps").Colour("Yellow").Damaged("Boonet,Fender,Headlight").PartNo("b3212,b2342,b02").build();
        carMAZDA returnCarMAZDA  = crudService.persist(a);
        when(crudService.persist(a)).thenReturn(returnCarMAZDA );
        Mockito.verify(crudService).persist(a);
      }
    @Test
    public void testRead() throws Exception {
         carMAZDA a = new carMAZDA.Builder("2011 mps").Colour("Yellow").Damaged("Boonet,Fender,Headlight").PartNo("b3212,b2342,b02").build();
        carMAZDA returnCarMAZDA = crudService.find(a.getCarModel());
        when(crudService.find(a.getCarModel())).thenReturn(returnCarMAZDA);
        Mockito.verify(crudService).find(a.getCarModel());

    }
    
    @Test
    public void testUpdate() throws Exception {
      
   //This method is used to save the current state of Entity t         

carMAZDA a = new carMAZDA.Builder("2011 mps").Colour("Yellow").Damaged("Boonet,Fender,Headlight").PartNo("b3212,b2342,b02").build();

//second record
carMAZDA b = crudService.find(a.getCarModel());
//update
crudService.merge(b);
Mockito.verify(crudService).merge(b);
}

    @Test
    public void testDelete() throws Exception {

        carMAZDA a = new carMAZDA.Builder("2011 mps").Colour("Yellow").Damaged("Boonet,Fender,Headlight").PartNo("b3212,b2342,b02").build();
        carMAZDA returnCarMAZDA = crudService.remove(a);
        when(crudService.remove(a)).thenReturn(returnCarMAZDA);
        Mockito.verify(crudService).remove(a);


}
}
