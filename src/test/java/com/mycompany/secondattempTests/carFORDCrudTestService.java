/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondAttemptCrud.CarFORDCrudService;
import com.mycompany.secondattemptClasses.carFORD;
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
public class carFORDCrudTestService {
    
    public carFORDCrudTestService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    CarFORDCrudService crudService;
    @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CarFORDCrudService.class);
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
        carFORD a = new  carFORD.Builder("1995").Colour("orange").Damaged("bonnet").PartNo("fd232").build();
        carFORD returnCarFORD = crudService.persist(a);
        when(crudService.persist(a)).thenReturn(returnCarFORD );
        Mockito.verify(crudService).persist(a);
      }
    
    @Test
    public void testRead() throws Exception {
      carFORD a = new  carFORD.Builder("1995").Colour("orange").Damaged("bonnet").PartNo("fd232").build();
        carFORD returnCarFORD = crudService.find(a.getCarModel());
        when(crudService.find(a.getCarModel())).thenReturn(returnCarFORD);
        Mockito.verify(crudService).find(a.getCarModel());

    }
    
    @Test
    public void testUpdate() throws Exception {
      
   //This arFORDmethod is used to save the current state of Entity t         

 carFORD a = new  carFORD.Builder("1995").Colour("orange").Damaged("bonnet").PartNo("fd232").build();

//second record
carFORD b = crudService.find(a.getCarModel());
//update
crudService.merge(b);
Mockito.verify(crudService).merge(b);
}

    @Test
    public void testDelete() throws Exception {

       carFORD a = new  carFORD.Builder("1995").Colour("orange").Damaged("bonnet").PartNo("fd232").build();
        carFORD returnCarFORD = crudService.remove(a);
        when(crudService.remove(a)).thenReturn(returnCarFORD);
        Mockito.verify(crudService).remove(a);


}
}
