/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.secondAttemptCrud;

import java.util.List;

/**
 *
 * @author kurt wasserfall 211150142 3B
 * @param <S>
 * @param <Name>
 * */
public interface CrudService<S, Name> {
    
    public S find(Name name);

    public S persist(S entity);

    public S merge(S entity);

    public S remove(S entity);

    public List<S> findAll();   
}
