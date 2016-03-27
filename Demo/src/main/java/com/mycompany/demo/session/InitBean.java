/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.session;

import com.mycompany.demo.entity.Person;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author pc
 */
@Startup
@Singleton
public class InitBean {
    @Inject PersonFacade personFacade;
    @PostConstruct
    private void init(){
        personFacade.create(new Person(100L,"wildfly"));
        System.err.println(personFacade.find(100L).getName());
    }
}
