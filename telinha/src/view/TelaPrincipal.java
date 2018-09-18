/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author renanperes
 */
public final class TelaPrincipal extends JFrame {

    private CardLayout cardLayout;
    private JPanel painelCardLayout;
    JMenuBar barraMenu;
    JMenu menu_cadastro, menu_remover;
    JMenuItem cd_pessoa, cd_fornecedor, cd_form_pag, cd_usuario, mv_venda, mv_compra;
    JMenuItem menu_sair;

    public TelaPrincipal() throws ParseException {
        setTitle("Menu Principal");
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        instanciar();

        init();
        event();
    }

    private void init() throws ParseException {
        setLayout(new BorderLayout());
        add(getCardLayout(), BorderLayout.CENTER);
    }

    private JPanel getCardLayout() throws ParseException {
        if (painelCardLayout == null) {
            cardLayout = new CardLayout();
            painelCardLayout = new JPanel();
            painelCardLayout.setLayout(cardLayout);
            painelCardLayout.add(new JPanel1(), "panel1");
            painelCardLayout.add(new JPanel2(), "panel2");
            painelCardLayout.add(new JPanel(), "principal");
            cardLayout.show(painelCardLayout, "principal");
            painelCardLayout.setBackground(Color.GREEN);
            return painelCardLayout;
        } else {
            return painelCardLayout;
        }
    }

    public void event() {
        cd_pessoa.addActionListener((ActionEvent e) -> {
            cardLayout.show(painelCardLayout, "panel1");
            setTitle("Cadastro Cliente");
        });
        cd_fornecedor.addActionListener((ActionEvent e) -> {
            cardLayout.show(painelCardLayout, "panel2");
            setTitle("Cadastro Fornecedor");
        });
        menu_sair.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }

    public void instanciar() {
        barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);

        //MENU CADASTRO//
        menu_cadastro = new JMenu("Cadastros");
        menu_remover = new JMenu("Movimentos");
        menu_sair = new JMenuItem("Sair");

        barraMenu.add(menu_cadastro);
        barraMenu.add(menu_remover);
        barraMenu.add(menu_sair);

        cd_pessoa = new JMenuItem("   Cliente   ");
        menu_cadastro.add(cd_pessoa);

        cd_fornecedor = new JMenuItem("   Fornecedor   ");
        menu_cadastro.add(cd_fornecedor);

        cd_form_pag = new JMenuItem("   Forma de Pagamento   ");
        menu_cadastro.add(cd_form_pag);

        cd_usuario = new JMenuItem("   Usuário   ");
        menu_cadastro.add(cd_usuario);

        //MENU MOVIMENTACAO 
        mv_venda = new JMenuItem("   Venda   ");
        menu_remover.add(mv_venda);

        mv_compra = new JMenuItem("   Compra   ");
        menu_remover.add(mv_compra);

    }
}
