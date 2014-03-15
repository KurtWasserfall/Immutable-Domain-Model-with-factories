/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondAttemptCrud;

import com.mycompany.secondattemptClasses.carMAZDA;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//@author kurt wasserfall 211150142 3B
public class CarMAZDACrudServiceImpl implements CarMAZDACrudService {

    @Transactional(propagation = Propagation.SUPPORTS)
    public carMAZDA find(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public carMAZDA persist(carMAZDA entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public carMAZDA merge(carMAZDA entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public carMAZDA remove(carMAZDA entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<carMAZDA> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }
    
}
