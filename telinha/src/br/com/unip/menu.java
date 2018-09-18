/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unip;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Zanaro
 */
public class menu extends JFrame{
    JMenuBar barraMenu;
    JMenu menu_arquivo, menu_opcoes, mi_ferramentas;
    JMenuItem mi_abrir, mi_salvar, mi_preferencia, mi_salvar_como, sair;
    JCheckBoxMenuItem mi_importar;

    public menu() {
        setTitle("Menu em Java/Swing");
        setPreferredSize(new Dimension(600, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        
        instanciar();
        posicionar();
        adicionar();
        eventos();

    }

    public void instanciar() {
        barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        
        menu_arquivo = new JMenu("Cadastro");
        menu_opcoes = new JMenu("Opções");
        
        barraMenu.add(menu_arquivo);
        barraMenu.add(menu_opcoes);

        mi_abrir = new JMenuItem("Abrir");

        menu_arquivo.add(mi_abrir);

        mi_salvar = new JMenuItem("Salvar");
        menu_arquivo.add(mi_salvar);

        mi_salvar_como = new JMenuItem("Salvar Como...");
        menu_arquivo.add(mi_salvar_como);

        sair = new JMenuItem("Sair");
        menu_arquivo.add(sair);

        mi_preferencia = new JMenuItem("Preferências");
        menu_opcoes.add(mi_preferencia);

        mi_ferramentas = new JMenu("Ferramentas");
        menu_opcoes.add(mi_ferramentas);

        mi_importar = new JCheckBoxMenuItem("Importar");
        mi_ferramentas.add(mi_importar);

    }

    public void posicionar() {

    }

    public void eventos() {
        mi_abrir.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, "Abrindo..");

        });

        mi_salvar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Salvar");
        });

        mi_salvar_como.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Salvar Como...");
        });

        sair.addActionListener(e -> {
            System.exit(0);
        });

        mi_preferencia.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Preferências");
        });

        mi_ferramentas.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Preferências");
        });

        mi_importar.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Confirmado");
        });
    }

    public void adicionar() {
        barraMenu.add(menu_arquivo);
        barraMenu.add(menu_opcoes);
        menu_arquivo.add(mi_abrir);
        menu_arquivo.add(mi_salvar);
        menu_arquivo.add(mi_salvar_como);
        menu_arquivo.add(sair);
        menu_opcoes.add(mi_preferencia);
        menu_opcoes.add(mi_ferramentas);
        mi_ferramentas.add(mi_importar);

    }

    public static void main(String[] args) {
        menu swing = new menu();
    }
}
