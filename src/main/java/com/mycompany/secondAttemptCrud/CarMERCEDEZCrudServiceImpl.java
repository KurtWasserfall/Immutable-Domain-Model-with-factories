/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondAttemptCrud;

import com.mycompany.secondattemptClasses.carMERCEDEZ;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@author kurt wasserfall 211150142 3B
public class CarMERCEDEZCrudServiceImpl implements CarMERCEDEZCrudService {

    @Transactional(propagation = Propagation.SUPPORTS)
    public carMERCEDEZ find(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public carMERCEDEZ persist(carMERCEDEZ entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public carMERCEDEZ merge(carMERCEDEZ entity) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public carMERCEDEZ remove(carMERCEDEZ entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<carMERCEDEZ> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }
    
}
