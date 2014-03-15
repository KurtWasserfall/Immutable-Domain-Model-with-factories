/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondAttemptCrud;

import com.mycompany.secondattemptClasses.carBMW;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@author kurt wasserfall 211150142 3B

public class CarBMWCrudServiceImpl implements CarBMWCrudService {

    @Transactional(propagation = Propagation.SUPPORTS)
    public carBMW find(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return null;
    }
 
    @Transactional(propagation = Propagation.MANDATORY)
    public carBMW persist(carBMW entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public carBMW merge(carBMW entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public carBMW remove(carBMW entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return null;
    }

    
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<carBMW> findAll() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }
    
}
