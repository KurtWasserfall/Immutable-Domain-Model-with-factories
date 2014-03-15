/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondAttemptCrud;

import com.mycompany.secondattemptClasses.carKIA;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@author kurt wasserfall 211150142 3B
public class CarKIACrudServiceImpl implements CarKIACrudService {

    @Transactional(propagation = Propagation.SUPPORTS)
    public carKIA find(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return null;    
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public carKIA persist(carKIA entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public carKIA merge(carKIA entity) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public carKIA remove(carKIA entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<carKIA> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }
    
}
