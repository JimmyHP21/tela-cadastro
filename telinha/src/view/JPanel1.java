/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.TamanhoFixoJTextField;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author renanperes
 */
public class JPanel1 extends JPanel {

    private JLabel lbl_nome;
    private JFormattedTextField txt_nome;

    private JLabel lbl_fantasia;
    private JTextField txt_fantasia;

    private JLabel lbl_cpfcnpj;
    private JFormattedTextField txt_cpfcnpj;

    private JLabel lbl_rgie;
    private JFormattedTextField txt_rgie;

    private JLabel lbl_cadastro;
    private JFormattedTextField txt_data;

    private JCheckBoxMenuItem cx_ativo;

    private JButton btn_fisica, btn_juridica;

    public MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
    public MaskFormatter mascaraCnpj = new MaskFormatter("##.###.###/####-##");
    public MaskFormatter mascara_data = new MaskFormatter("##/##/####");

    public JPanel1() throws ParseException {
        init();
        setSize(500, 500);
    }

    private void init() throws ParseException {
        instanciar();
        AdicionarComponentes();
        ConfigurarPosicoes();
        event();
    }

    public void event() {
        btn_fisica.addActionListener(e -> {
            txt_cpfcnpj = new JFormattedTextField(mascaraCpf);
            txt_cpfcnpj.setBounds(1, 150, 120, 30);
            remove(btn_juridica);
            add(txt_cpfcnpj);
            repaint();
        });
        btn_juridica.addActionListener((e) -> {
            txt_cpfcnpj = new JFormattedTextField(mascaraCnpj);
            txt_cpfcnpj.setBounds(1, 150, 140, 30);
            btn_juridica.setBounds(1, 120, 90, 15);
            remove(btn_fisica);
            add(txt_cpfcnpj);
            repaint();
        });
    }

    public void instanciar() throws ParseException {
        setLayout(null);
        lbl_nome = new JLabel("Nome: ");
        lbl_fantasia = new JLabel("Nome Fantasia: ");
        lbl_cpfcnpj = new JLabel("Cpf/Cnpj: ");
        lbl_rgie = new JLabel("RG/IE: ");
        lbl_cadastro = new JLabel("Data Cadastro: ");

        cx_ativo = new JCheckBoxMenuItem("Ativo");

        btn_fisica = new JButton("Fisica");
        btn_juridica = new JButton("Juridica");

        txt_nome = new JFormattedTextField();
        txt_nome.setDocument(new TamanhoFixoJTextField(5));
        txt_data = new JFormattedTextField(mascara_data);

    }

    public void AdicionarComponentes() {
        //LABELS
        add(lbl_nome);
        add(lbl_fantasia);
        add(lbl_cpfcnpj);
        add(lbl_rgie);
        add(lbl_cadastro);
        //CHECKBOX
        add(cx_ativo);
        //BUTTON
        add(btn_fisica);
        add(btn_juridica);
        //TEXTFIELD
        add(txt_nome);
        add(txt_data);

    }

    public void ConfigurarPosicoes() {
        lbl_nome.setBounds(1, 50, 50, 10);
        txt_nome.setBounds(100, 50, 150, 20);

        lbl_cadastro.setBounds(1, 80, 120, 20);
        txt_data.setBounds(120, 80, 80, 22);

        btn_fisica.setBounds(1, 120, 80, 15);
        btn_juridica.setBounds(100, 120, 90, 15);

    }

}
