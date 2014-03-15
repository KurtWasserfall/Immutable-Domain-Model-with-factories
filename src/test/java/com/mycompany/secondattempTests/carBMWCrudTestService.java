/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondAttemptCrud.CarBMWCrudService;
import com.mycompany.secondattemptClasses.carBMW;
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
public class carBMWCrudTestService {
    
    public carBMWCrudTestService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    CarBMWCrudService crudService;
        
    @BeforeClass
    public  void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CarBMWCrudService.class);
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
        carBMW a = new carBMW.Builder("2006").Colour("Red").Damaged("Fender").PartNo("ex3212").build();
        carBMW returnCarBMW  = crudService.persist(a);
        when(crudService.persist(a)).thenReturn(returnCarBMW );
        Mockito.verify(crudService).persist(a);
      }
    @Test
    public void testRead() throws Exception {
        carBMW a = new carBMW.Builder("2006").Colour("Red").Damaged("Fender").PartNo("ex3212").build();
        carBMW returnCarBMW = crudService.find(a.getCarModel());
        when(crudService.find(a.getCarModel())).thenReturn(returnCarBMW);
        Mockito.verify(crudService).find(a.getCarModel());

    }
    
    @Test
    public void testUpdate() throws Exception {
      
   //This method is used to save the current state of Entity t         

carBMW a = new carBMW.Builder("2006").Colour("Red").Damaged("Fender").PartNo("ex3212").build();

//second record
carBMW b = crudService.find(a.getCarModel());
//update
crudService.merge(b);
Mockito.verify(crudService).merge(b);
}

    @Test
    public void testDelete() throws Exception {

        carBMW a = new carBMW.Builder("2006").Colour("Red").Damaged("Fender").PartNo("ex3212").build();
        carBMW returnCarBMW = crudService.remove(a);
        when(crudService.remove(a)).thenReturn(returnCarBMW);
        Mockito.verify(crudService).remove(a);


}
}
