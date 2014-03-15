/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondAttemptCrud.CarTOYOTACrudService;
import com.mycompany.secondattemptClasses.carTOYOTA;
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
public class carTOYOTATestCrudService {
    
    public carTOYOTATestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    CarTOYOTACrudService crudService;
    @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CarTOYOTACrudService.class);
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
        carTOYOTA a = new carTOYOTA.Builder("2012 G38").Colour("Red").Damaged("Left Door").PartNo("98712").build();
        carTOYOTA returnCarTOYOTA  = crudService.persist(a);
        when(crudService.persist(a)).thenReturn(returnCarTOYOTA );
        Mockito.verify(crudService).persist(a);
      }
    
    @Test
    public void testRead() throws Exception {
        carTOYOTA a = new carTOYOTA.Builder("2012 G38").Colour("Red").Damaged("Left Door").PartNo("98712").build();
        carTOYOTA returnCarTOYOTA = crudService.find(a.getCarModel());
        when(crudService.find(a.getCarModel())).thenReturn(returnCarTOYOTA);
        Mockito.verify(crudService).find(a.getCarModel());

    }
    
    @Test
    public void testUpdate() throws Exception {
      
   //This method is used to save the current state of Entity t         

carTOYOTA a = new carTOYOTA.Builder("2012 G38").Colour("Red").Damaged("Left Door").PartNo("98712").build();

//second record
carTOYOTA b = crudService.find(a.getCarModel());
//update
crudService.merge(b);
Mockito.verify(crudService).merge(b);
}

    @Test
    public void testDelete() throws Exception {

        carTOYOTA a = new carTOYOTA.Builder("2012 G38").Colour("Red").Damaged("Left Door").PartNo("98712").build();
        carTOYOTA returnCarTOYOTA = crudService.remove(a);
        when(crudService.remove(a)).thenReturn(returnCarTOYOTA);
        Mockito.verify(crudService).remove(a);


}
}
