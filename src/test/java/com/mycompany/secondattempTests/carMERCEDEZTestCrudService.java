/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattempTests;

import com.mycompany.secondAttemptCrud.CarMERCEDEZCrudService;
import com.mycompany.secondattemptClasses.carMERCEDEZ;
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
public class carMERCEDEZTestCrudService {
    
    public carMERCEDEZTestCrudService() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    CarMERCEDEZCrudService crudService;
    @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CarMERCEDEZCrudService.class);
    }

    /**
     *
     * @throws Exception
     */
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
         carMERCEDEZ a = new  carMERCEDEZ.Builder("1996 Compressor").Colour("Matalic Silver").Damaged("Right Mirror").PartNo("mzdz323402839").build();
        carMERCEDEZ returnCarMERCEDEZ = crudService.persist(a);
        when(crudService.persist(a)).thenReturn(returnCarMERCEDEZ );
        Mockito.verify(crudService).persist(a);
      }
    @Test
    public void testRead() throws Exception {
        carMERCEDEZ a = new  carMERCEDEZ.Builder("1996 Compressor").Colour("Matalic Silver").Damaged("Right Mirror").PartNo("mzdz323402839").build();
        carMERCEDEZ returnCarMERCEDEZ = crudService.find(a.getCarModel());
        when(crudService.find(a.getCarModel())).thenReturn(returnCarMERCEDEZ);
        Mockito.verify(crudService).find(a.getCarModel());

    }
    
    @Test
    public void testUpdate() throws Exception {
      
   //This method is used to save the current state of Entity t         

 carMERCEDEZ a = new  carMERCEDEZ.Builder("1996 Compressor").Colour("Matalic Silver").Damaged("Right Mirror").PartNo("mzdz323402839").build();

//second record
carMERCEDEZ b = crudService.find(a.getCarModel());
//update
crudService.merge(b);
Mockito.verify(crudService).merge(b);
}

    @Test
    public void testDelete() throws Exception {

       carMERCEDEZ a = new  carMERCEDEZ.Builder("1996 Compressor").Colour("Matalic Silver").Damaged("Right Mirror").PartNo("mzdz323402839").build();
        carMERCEDEZ returnCarMERCEDEZ = crudService.remove(a);
        when(crudService.remove(a)).thenReturn(returnCarMERCEDEZ);
        Mockito.verify(crudService).remove(a);


}
}
