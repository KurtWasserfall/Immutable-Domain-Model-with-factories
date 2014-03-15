/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondAttemptCrud.CarVOLGSWAGENCrudService;
import com.mycompany.secondattemptClasses.carVOLGSWAGEN;
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
 * @author kurt
 */
public class carVOLGSWAGENTestCrudService {
    
    public carVOLGSWAGENTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    CarVOLGSWAGENCrudService crudService;
    @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CarVOLGSWAGENCrudService.class);
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
        carVOLGSWAGEN a = new carVOLGSWAGEN.Builder("2013 Golf 6 R-line").Colour("White").Damaged("Bumper").PartNo("vw342").build();
        carVOLGSWAGEN returnCarVOLGSWAGEN  = crudService.persist(a);
        when(crudService.persist(a)).thenReturn(returnCarVOLGSWAGEN);
        Mockito.verify(crudService).persist(a);
      }
    @Test
    public void testRead() throws Exception {
        carVOLGSWAGEN a = new carVOLGSWAGEN.Builder("2013 Golf 6 R-line").Colour("White").Damaged("Bumper").PartNo("vw342").build();
        carVOLGSWAGEN  returnCarVOLGSWAGEN = crudService.find(a.getCarModel());
        when(crudService.find(a.getCarModel())).thenReturn(returnCarVOLGSWAGEN);
        Mockito.verify(crudService).find(a.getCarModel());

    }
    
    @Test
    public void testUpdate() throws Exception {
      
   //This method is used to save the current state of Entity          

carVOLGSWAGEN a = new carVOLGSWAGEN.Builder("2013 Golf 6 R-line").Colour("White").Damaged("Bumper").PartNo("vw342").build();

//second record
carVOLGSWAGEN b = crudService.find(a.getCarModel());
//update
crudService.merge(b);
Mockito.verify(crudService).merge(b);
}

    @Test
    public void testDelete() throws Exception {

        carVOLGSWAGEN a = new carVOLGSWAGEN.Builder("2013 Golf 6 R-line").Colour("White").Damaged("Bumper").PartNo("vw342").build();
        carVOLGSWAGEN returnCarVOLGSWAGEN = crudService.remove(a);
        when(crudService.remove(a)).thenReturn(returnCarVOLGSWAGEN);
        Mockito.verify(crudService).remove(a);

    }
}
