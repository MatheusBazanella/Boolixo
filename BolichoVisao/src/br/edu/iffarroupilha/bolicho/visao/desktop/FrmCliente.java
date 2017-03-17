/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *<p>
 *Classe que representa a view para gerir clientes 
 *</p>
 * @author Matheus Coffy Bazanella 
 * @version 1.0
 * @since 2017
 *
 */

public class FrmCliente extends JFrame{

    private BolichoMain telaPrincipal;

    public FrmCliente(BolichoMain telaPrincipal )  {
        this.telaPrincipal = telaPrincipal;
        setTitle("Bolicho -> Cliente");
        setSize(320, 240);
        setLocationRelativeTo(telaPrincipal);
        desenhaComponentes();
        setVisible(true);
    
    }

    private void desenhaComponentes() {
        JLabel lblCpf = new JLabel("CPF: ");
        JLabel lblNome = new JLabel("Nome: ");
        JButton bntGravar = new JButton("Gravar");
        JTextField txtCpf = new JTextField(20);
        JTextField txtNome = new JTextField(20);
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        // adiciona os componentes em tela
        
        add(lblCpf);
        add(txtCpf);
        add(lblNome);
        add(txtNome);
        add(bntGravar);
        
    }

    
    
       
}
