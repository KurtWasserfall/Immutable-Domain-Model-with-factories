/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondattemptrunMain;

import com.mycompany.secondAttemptCrud.CarBMWCrudService;
import com.mycompany.secondAttemptCrud.CarBMWCrudServiceImpl;
import com.mycompany.secondAttemptCrud.CarFORDCrudService;
import com.mycompany.secondAttemptCrud.CarFORDCrudServiceImpl;
import com.mycompany.secondAttemptCrud.CarKIACrudService;
import com.mycompany.secondAttemptCrud.CarKIACrudServiceImpl;
import com.mycompany.secondAttemptCrud.CarMAZDACrudService;
import com.mycompany.secondAttemptCrud.CarMAZDACrudServiceImpl;
import com.mycompany.secondAttemptCrud.CarMERCEDEZCrudService;
import com.mycompany.secondAttemptCrud.CarMERCEDEZCrudServiceImpl;
import com.mycompany.secondAttemptCrud.CarTOYOTACrudService;
import com.mycompany.secondAttemptCrud.CarTOYOTACrudServiceImpl;
import com.mycompany.secondAttemptCrud.CarVOLGSWAGENCrudService;
import com.mycompany.secondAttemptCrud.CarVOLGSWAGENCrudServiceImpl;
import com.mycompany.secondAttemptCrud.CustomerCrudService;
import com.mycompany.secondAttemptCrud.CustomerCrudServiceImpl;
import com.mycompany.secondAttemptCrud.EmployeeCrudService;
import com.mycompany.secondAttemptCrud.EmployeeCrudServiceImpl;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author kurt wasserfall 211150142 3B
 */
public class Appconfig {

    /**
     *
     * @return
     */
    @Bean(name = "CustomerCrudService")
     
    public CustomerCrudService getCustomerCrudService(){
        return new CustomerCrudServiceImpl();
    }
    
    @Bean(name="EmployeeCrudService")
    public EmployeeCrudService getEmployeeCrudService(){
        return new EmployeeCrudServiceImpl();
    }
    
    
    @Bean(name="CarBMWCrudService")
    public CarBMWCrudService getACarBMWCrudService(){
        return new CarBMWCrudServiceImpl();
    }
    
    
    @Bean(name="CarFORDCrudService")
    public CarFORDCrudService getCarFORDCrudService(){
        return new CarFORDCrudServiceImpl();
    }
    
    
    @Bean(name="CarKIACrudService")
    public CarKIACrudService getCarKIACrudService(){
        return new CarKIACrudServiceImpl();
    }
    
    @Bean(name="CarMAZDACrudService")
    public CarMAZDACrudService getCarMAZDACrudService(){
        return new CarMAZDACrudServiceImpl();
    }
    
    @Bean(name="CarMERCEDEZCrudService")
    public CarMERCEDEZCrudService getCarMERCEDEZCrudService(){
        return new CarMERCEDEZCrudServiceImpl();
    }
    
    @Bean(name="CarTOYOTACrudService")
    public CarTOYOTACrudService getCarTOYOTACrudService(){
        return new CarTOYOTACrudServiceImpl();
    }
    
    @Bean(name="CarVOLGSWAGENCrudService")
    public CarVOLGSWAGENCrudService getCarVOLGSWAGENCrudService(){
        return new CarVOLGSWAGENCrudServiceImpl();
    }
}
