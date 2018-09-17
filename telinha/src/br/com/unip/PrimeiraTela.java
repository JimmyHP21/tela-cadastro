/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unip;

import br.com.unip.dao.EnumUF;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author Leonardo Zanaro
 */
public class PrimeiraTela extends JFrame {

    private JLabel lblTitulo, lblRA, lblNome, lblFone, lblSenha, lblTrabalha, lblIdade, lblNasc, lblSex, lblCurso;
    private JTextField edtRA, edtNome, edtFone;
    private JButton btnIncluir, btnAlterar, btnConsultar, btnExcluir, btnSair;
    private JComboBox cbCurso, cbDia, cbMes, cbAno;
    private JRadioButton rbTrab, rbTrabN, rbSexM, rbSexF;
    private JPasswordField pSenha;
    private JSlider sIdade;
    public ArrayList<String> d;
    public ArrayList<String> m;
    public ArrayList<String> a;
    public ArrayList<EnumUF> areas;
    public ArrayList<String> uf;
    private final int WIDTH = 1200;
    private final int HEIGHT = 720;

    public PrimeiraTela() {
        setTitle("Desafio 1");
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setLayout(null);

        CriarComponentes();
        AdicionarComponentes();
        ConfigurarPosicoes();
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

    }

    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
    }

    public void CriarComponentes() {
        d = new ArrayList<>();
        m = new ArrayList<>();
        a = new ArrayList<>();
        lblTitulo = new JLabel("Desafio 1");
        lblRA = new JLabel("R.A");
        lblNome = new JLabel("Nome");
        lblFone = new JLabel("Fone");
        lblNasc = new JLabel("Nasc.");
        lblSex = new JLabel("Sexo");
        lblCurso = new JLabel("Curso");
        lblSenha = new JLabel("Senha");
        lblTrabalha = new JLabel("Trabalha");
        lblIdade = new JLabel("Idade");

        edtRA = new JTextField(5);
        edtNome = new JTextField(30);
        edtFone = new JTextField(30);

        for (int i = 1; i < 31; i++) {
            d.add("" + i);
        }
        for (int i = 1; i < 12; i++) {
            m.add("" + i);
        }
        for (int i = 1950; i <= 2018; i++) {
            a.add("" + i);
        }

        cbDia = new JComboBox(d.toArray());
        cbMes = new JComboBox(m.toArray());
        cbAno = new JComboBox(a.toArray());

        String[] curso = {"Selecione o Curso", "Tecnologia da Informação", "Administração", "Nutrição", EnumUF.SP.toString()};
        
        
        areas = new ArrayList<>();
        
        List<EnumUF> myArrayList = new ArrayList<EnumUF>();
        myArrayList.addAll(Arrays.asList(EnumUF.values()));

        cbCurso = new JComboBox(myArrayList.toArray());

        pSenha = new JPasswordField("");

        rbSexF = new JRadioButton("F");
        rbSexM = new JRadioButton("M");
        rbTrab = new JRadioButton("Sim");
        rbTrabN = new JRadioButton("Não");

        sIdade = new JSlider(0, 100);

        btnAlterar = new JButton("Alterar");
        btnIncluir = new JButton("Incluir");
        btnExcluir = new JButton("Excluir");
        btnConsultar = new JButton("Consultar");
        btnSair = new JButton("Sair");

    }

    public void AdicionarComponentes() {
        add(lblTitulo);
        add(lblRA);
        add(lblNome);
        add(lblFone);
        add(lblNasc);
        add(lblSex);
        add(lblCurso);
        add(lblSenha);
        add(lblTrabalha);
        add(lblIdade);

        add(edtRA);
        add(edtNome);
        add(edtFone);

        add(cbDia);
        add(cbMes);
        add(cbAno);

        add(rbSexF);
        add(rbSexM);

        add(cbCurso);
        add(pSenha);

        add(rbTrab);
        add(rbTrabN);

        add(sIdade);

        add(btnIncluir);
        add(btnAlterar);
        add(btnConsultar);
        add(btnExcluir);
        add(btnSair);
    }

    private void ConfigurarPosicoes() {
        lblTitulo.setBounds(1200 / 2, 720 - 680, 150, 25);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblRA.setBounds(150, 120, 100, 25);
        lblNome.setBounds(150, 180, 150, 25);
        lblFone.setBounds(150, 240, 150, 25);
        lblSex.setBounds(150, 350, 150, 25);
        lblCurso.setBounds(750, 120, 100, 25);
        lblSenha.setBounds(750, 180, 100, 25);
        lblTrabalha.setBounds(750, 240, 100, 25);
        lblIdade.setBounds(750, 300, 100, 25);
        lblNasc.setBounds(150, 300, 100, 25);

        edtRA.setBounds(200, 120, 300, 25);
        edtNome.setBounds(200, 180, 300, 25);
        edtFone.setBounds(200, 240, 300, 25);

        cbDia.setBounds(200, 300, 75, 25);
        cbDia.setBackground(Color.white);
        cbMes.setBounds(275, 300, 75, 25);
        cbMes.setBackground(Color.white);
        cbAno.setBounds(350, 300, 150, 25);
        cbAno.setBackground(Color.white);

        rbSexF.setBounds(200, 350, 50, 25);
        rbSexM.setBounds(250, 350, 50, 25);

        cbCurso.setBounds(800, 120, 300, 25);
        cbCurso.setBackground(Color.white);

        pSenha.setBounds(800, 180, 300, 25);

        rbTrab.setBounds(825, 240, 50, 25);
        rbTrabN.setBounds(875, 240, 50, 25);

        sIdade.setBounds(800, 280, 300, 100);
        sIdade.setMajorTickSpacing(10);
        sIdade.setMinorTickSpacing(5);
        sIdade.setPaintTicks(true);
        sIdade.setPaintLabels(true);

        btnIncluir.setBounds(100, 550, 150, 55);
        btnAlterar.setBounds(300, 550, 150, 55);
        btnConsultar.setBounds(500, 550, 150, 55);
        btnExcluir.setBounds(700, 550, 150, 55);
        btnSair.setBounds(900, 550, 150, 55);
    }

    public static void main(String[] args) {
        PrimeiraTela pt = new PrimeiraTela();
    }
}
