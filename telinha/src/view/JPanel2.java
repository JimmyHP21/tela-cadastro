/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author renanperes
 */
public class JPanel2 extends JPanel {

     public JPanel2() {
        init();
    }
    private void init() {
        setLayout(new BorderLayout());
        add(new JLabel("Oi, sou o Painel2!!"), BorderLayout.EAST);
        setBackground(Color.RED);
    }
    
}
