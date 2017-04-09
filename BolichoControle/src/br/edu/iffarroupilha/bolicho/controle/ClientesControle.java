/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;

/**
 *<p>
 * Classe logica para controle da entidade cliente
 *</p>
 * @author Matheus Coffy Bazanella 
 * @version 1.0
 * @since 2017
 *
 */
public class ClientesControle extends AContorle{
    /**
     * <p>
     * Valida os dados do Cliente estao corretos
     * </p>
     * @param cliente
     * @return 
     */
    
    public String validarDados(Cliente cliente){
       
        if (cliente != null) {
            if(cliente.getCpf()==0){
                return "Informa o CPF, parsa";
            }else if(cliente.getNome() == null || cliente.getNome().isEmpty()){
                return "Insira o nome, parsa";
                
            }
            
        }else return "Dados não informados, parsa";
        
       
        
       return null;
        
    }
}