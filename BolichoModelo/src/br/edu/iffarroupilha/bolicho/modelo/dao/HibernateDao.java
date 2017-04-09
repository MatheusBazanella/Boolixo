/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.iffarroupilha.bolicho.modelo.dao;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *<p>
 *</p>
 * @author Matheus Coffy Bazanella 
 * @version 1.0
 * @since 2017
 *
 */
public class HibernateDao{
    
    private static SessionFactory factory;
    static{// sempres q a classe for chamada esse metodo será executado
        Configuration  cfg = new Configuration();
      //depois adicionar as demais entidades
      //apos ter feito o anotamento das outras classes
        cfg.addAnnotatedClass(Cliente.class);
        cfg.configure();
        //forma mais facil de cirar uma fabrica
        factory = cfg.buildSessionFactory();
    }
    public static Session getSession(){
        return factory.openSession();
    }
        
        
        

}
