/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
 *<p>
 * Classe logica para controle da entidade produto
 *</p>
 * @author Matheus Coffy Bazanella 
 * @version 1.0
 * @since 2017
 *
 */
public class ProdutoControle extends AContorle{
    public String validarDados(Produto produto){
    if (produto != null) {
            if(produto.getPreco()==0){
                return "Informa o Preco, parsa";
            }else if(produto.getDescricao()== null || produto.getDescricao().isEmpty()){
                return "Insira a Descrição, parsa";
                
            }
            
        }else{ return "Dados não informados, parsa";
    }
       
        
        return null;
        
    }
    
     public double StringToDouble(String termo){
       try {
           return Double.parseDouble(termo);
       } catch (Exception e) {
           return 0;
       }
       
   } 
    
    
    

}
