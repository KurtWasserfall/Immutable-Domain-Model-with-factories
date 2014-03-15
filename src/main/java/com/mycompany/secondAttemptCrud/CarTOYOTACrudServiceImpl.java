/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondAttemptCrud;

import com.mycompany.secondattemptClasses.carTOYOTA;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@author kurt wasserfall 211150142 3B
public class CarTOYOTACrudServiceImpl implements CarTOYOTACrudService {

    @Transactional(propagation = Propagation.SUPPORTS)
    public carTOYOTA find(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public carTOYOTA persist(carTOYOTA entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public carTOYOTA merge(carTOYOTA entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public carTOYOTA remove(carTOYOTA entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<carTOYOTA> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }
    
}
