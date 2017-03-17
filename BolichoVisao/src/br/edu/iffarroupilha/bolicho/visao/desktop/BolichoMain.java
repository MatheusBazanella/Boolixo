/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iffarroupilha.bolicho.visao.desktop;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *<p>
 * Classe principal do projeto
 * que contempla a tela inicial da aplicação
 * </p>
 * @author Note-do-Sett7
 */
public class BolichoMain extends JFrame{

    public BolichoMain() {
        setTitle("Bolicho ::");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        desenhaComponentes();
        try {
            // muda a aparencia a aplicação java
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(BolichoMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        setVisible(true); // deve ser o ultimo
    } 
    
    public static void main(String[] args) {
        new BolichoMain();
    }

    private void desenhaComponentes() {
        JMenuBar menu = new JMenuBar(); // cria uma barra de menu 
        JMenu cadastro = new JMenu("Cadastro");// JMenuItem adiciona itens ao menu
        // cria os subitens do menu bar
        JMenuItem cliente = new JMenuItem("Clientes");
        JMenuItem produto = new JMenuItem("Produtos");
        JMenuItem venda = new JMenuItem("Vendas");
        
        
        // adiciona os subitens
        cadastro.add(cliente);
        cadastro.add(produto);
        cadastro.add(venda);
        
       /**
        cliente.addActionListener(e -> {       // expressoes lambidas: e(variave de entrada)->(corpo){aqui dentro vai a implementação}
       // soh funciona em maquinas com java virtual machine 8 
            JOptionPane.showMessageDialog(null, "clicou");
            
        
        
        });
       **/
       // vincula ações ao itens
       cliente.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                new FrmCliente(BolichoMain.this);
            }
        });
       produto.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(BolichoMain.this, "Voce Clicou");
            
            }
        });
       venda.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(BolichoMain.this, "Voce Clicou");
            
            }
        });
       menu.add(cadastro);// adiciona a barra cadastro ao menu
       
        setJMenuBar(menu);// seta o menu e seus itens para a barra de menu
    }
    
}
