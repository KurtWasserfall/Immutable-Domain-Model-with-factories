/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondAttemptCrud;

import com.mycompany.secondattemptClasses.Employee;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kurt wasserfall 211150142 3B
 */
public class EmployeeCrudServiceImpl implements EmployeeCrudService {
    
    @Transactional(propagation = Propagation.SUPPORTS)
    public Employee find(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

     @Transactional(propagation = Propagation.MANDATORY)
    public Employee persist(Employee entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Employee merge(Employee entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public Employee remove(Employee entity) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Employee> findAll() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return null;
    }
    

 }
