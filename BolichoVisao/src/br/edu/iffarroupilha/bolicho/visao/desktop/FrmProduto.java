/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *<p>
 * Classe que repreenta a interface para o produto
 *</p>
 * @author Matheus Coffy Bazanella 
 * @version 1.0
 * @since 2017
 *
 */
public class FrmProduto extends JFrame{

    public FrmProduto(BolichoMain principal) {
        setTitle("Bolicho -> Produto");
        setSize(320, 240);
        setLocationRelativeTo(principal);
        desenhaComponentes();
        
        
        setVisible(true);
    }

    private void desenhaComponentes() {
    
        JLabel jblDescricao = new JLabel("Descrição"); 
        JLabel jblPreco = new JLabel("Preço");
        JTextField jtlDescricao = new JTextField(30);
        JTextField jtlPreco = new JTextField(30);
        JButton btnGravar = new JButton("Grevar");
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(jblDescricao);
        add(jtlDescricao);
        add(jblPreco);
        add(jtlPreco);
        add(btnGravar);
    }
    

}
