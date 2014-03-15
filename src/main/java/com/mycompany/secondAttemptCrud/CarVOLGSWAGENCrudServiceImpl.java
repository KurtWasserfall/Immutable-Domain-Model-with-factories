/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondAttemptCrud;

import com.mycompany.secondattemptClasses.carVOLGSWAGEN;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kurt wasserfall 211150142 3B
 */
public class CarVOLGSWAGENCrudServiceImpl implements CarVOLGSWAGENCrudService {

    @Transactional(propagation = Propagation.SUPPORTS)
    public carVOLGSWAGEN find(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.MANDATORY)
    public carVOLGSWAGEN persist(carVOLGSWAGEN entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public carVOLGSWAGEN merge(carVOLGSWAGEN entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public carVOLGSWAGEN remove(carVOLGSWAGEN entity) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<carVOLGSWAGEN> findAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return null;
    }
    
}
