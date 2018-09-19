/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import java.awt.Color;
import java.sql.SQLException;
import model.TamanhoFixoJTextField;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.text.MaskFormatter;
import model.Usuario;

/**
 *
 * @author renanperes
 */
public class PessoaView extends JPanel {

    private ArrayList<Usuario> lista;
    private String operacao;
    private String colunas[] = {"ID", "Nome", "Login", "Ativo"};

    private JLabel lbl_nome;
    private JFormattedTextField txt_nome;

    private JLabel lbl_cpfcnpj;
    private JFormattedTextField txt_cpfcnpj;

    private JLabel lbl_rgie;
    private JFormattedTextField txt_rgie;

    private JLabel lbl_cadastro;
    private JFormattedTextField txt_data;

    private JCheckBoxMenuItem cx_ativo;

    private JButton btn_incluir, btn_excluir;

    public MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
    public MaskFormatter mascaraCnpj = new MaskFormatter("##.###.###/####-##");
    public MaskFormatter mascara_data = new MaskFormatter("##/##/####");
    public MaskFormatter mascara_rg = new MaskFormatter("##.###.###-#");

    JTabbedPane jTabbedPane1 = new JTabbedPane();

    JPanel jp = new JPanel();
    JPanel consulta = new JPanel();

    public JTable table;
    private UsuarioTableModel tabela;

    public PessoaView() throws ParseException {
        jp.setLayout(null);
        jp.add(jTabbedPane1);
        init();
        setSize(500, 500);
    }

    private void init() throws ParseException {
        instanciar();
        AdicionarComponentes();
        ConfigurarPosicoes();
//        event();
    }

//    public void event() {
//        btn_fisica.addActionListener(e -> {
//
//            jp.remove(btn_juridica);
//
//            repaint();
//        });
//        btn_juridica.addActionListener((e) -> {
//            txt_cpfcnpj = new JFormattedTextField(mascaraCnpj);
//            txt_cpfcnpj.setBounds(1, 150, 140, 30);
//            btn_juridica.setBounds(1, 120, 90, 15);
//            jp.remove(btn_fisica);
//            jp.add(txt_cpfcnpj);
//            repaint();
//        });
//    }
    public void instanciar() throws ParseException {
        setLayout(null);
        lbl_nome = new JLabel("Nome: ");
        lbl_cpfcnpj = new JLabel("Cpf/Cnpj: ");
        lbl_rgie = new JLabel("RG/IE: ");
        lbl_cadastro = new JLabel("Data Cadastro: ");

        cx_ativo = new JCheckBoxMenuItem("Ativo");

        txt_nome = new JFormattedTextField();
        txt_nome.setDocument(new TamanhoFixoJTextField(5));
        txt_data = new JFormattedTextField(mascara_data);
        txt_cpfcnpj = new JFormattedTextField(mascaraCpf);
        txt_rgie = new JFormattedTextField(mascara_rg);

        btn_incluir = new JButton("Incluir");
        btn_excluir = new JButton("Excluir");

        table = new JTable();

    }

    public void AdicionarComponentes() {
        add(jTabbedPane1);
        add(btn_excluir);
        add(btn_incluir);
        jTabbedPane1.addTab("Cliente", jp);

        //LABELS
        jp.add(lbl_nome);
        jp.add(lbl_cpfcnpj);
        jp.add(lbl_rgie);
        jp.add(lbl_cadastro);
        //CHECKBOX
        jp.add(cx_ativo);
        //TEXTFIELD
        jp.add(txt_nome);
        jp.add(txt_data);
        jp.add(txt_cpfcnpj);
        jp.add(txt_rgie);

        jp.add(table);

    }

    public void ConfigurarPosicoes() {
        setBackground(Color.BLACK);
        jTabbedPane1.setBounds(10, 1, 480, 300);

        btn_excluir.setBounds(325, 305, 80, 20);
        btn_incluir.setBounds(410, 305, 80, 20);

        lbl_nome.setBounds(1, 20, 50, 20);
        txt_nome.setBounds(60, 20, 280, 20);

        lbl_cadastro.setBounds(1, 50, 120, 20);
        txt_data.setBounds(120, 50, 80, 20);

        lbl_cpfcnpj.setBounds(1, 80, 80, 20);
        txt_cpfcnpj.setBounds(80, 80, 120, 20);

        lbl_rgie.setBounds(1, 110, 50, 20);
        txt_rgie.setBounds(60, 110, 100, 20);

        cx_ativo.setBounds(1, 140, 80, 20);

        table.setBounds(5, 200, 475, 80);

    }

    private void consultar() {
        try {
            String condicao = filtroConsulta();
            UsuarioController usuariocontroller = new UsuarioController();
            lista = null;
            lista = usuariocontroller.consultar(condicao);
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
            } else {
                tabela = new UsuarioTableModel(lista, colunas);
                table.setModel(tabela);
                table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Consulta do Usuário \n" + ex.getMessage());
        }
    }

    private String filtroConsulta() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(USU_ID >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(USU_ID <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(USU_NOME LIKE ('%" + edtCONS_NOME.getText() + "%'))";
        }
        if (!edtCONS_LOGIN.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(USU_LOGIN LIKE ('%" + edtCONS_LOGIN.getText() + "%'))";
        }
        return condicao;
    }

}
