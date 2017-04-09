/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.dao.HibernateDao;
import java.util.*;
import org.hibernate.Session;

/**
 *<p>
 * Controleador generico q agrupa as funções comuns de logicas
 *</p>
 * @author Matheus Coffy Bazanella 
 * @version 1.0
 * @since 2017
 *
 */
public abstract class AContorle {
     
    // gravar ou atualizar uma informação em banco
    public void gravar(Object entity){
        
        Session session = HibernateDao.getSession();
        session.getTransaction().begin();
        session.saveOrUpdate(entity);
        session.getTransaction().commit();
        
    }
    
    // Busca todos os registros de uma determinada entidade
    public List buscarTodos(Class classe) {
        return  null;
    }
    
    public Void remove(Class classe){
        return null;
    }
    /**
     * <p>
     * Converte uma String para Inteiro, caso esteja em formato invalido retorna zero
     * </p>
     * @param string
     * @return 
     */
    public int stringToInt(String string){
        try {
           return  Integer.parseInt(string);
        
        } catch (Exception e) {
            return 0;
        }
 
        
        
        
    }

}
