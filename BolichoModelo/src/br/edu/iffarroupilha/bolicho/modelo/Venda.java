/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.iffarroupilha.bolicho.modelo;

import java.util.Date;

/**
 *<p>
 *</p>
 * @author Matheus Coffy Bazanella 
 * @version 1.0
 * @since 2017
 *
 */
public class Venda {

    private int idVenda;
    private Cliente cliente;
    private Date data;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
