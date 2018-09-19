/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author Renan
 */
public class PessoaDao {

    private Connection conexao = null;

    public PessoaDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(Pessoa pessoa) throws SQLException {
        String sql = "INSERT INTO PESSOA (PES_NOME,PES_FISICA,PES_CPFCNPJ,PES_RGIE,PES_ATIVO)"
                + "VALUES (?,?,?,?,?)";

        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setString(1, pessoa.getPES_NOME());
            stm.setString(2, pessoa.getPES_FISICA());
            stm.setString(3, pessoa.getPES_CPFCNPJ());
            stm.setString(4, pessoa.getPES_RGIE());
            stm.setInt(5, pessoa.getPES_ATIVO());
            stm.execute();
            stm.close();
        }
    }

    public void alterar(Pessoa pessoa) throws SQLException {
        String sql = "UPDATE PESSOA SET PES_ATIVO = ? WHERE PES_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, pessoa.getPES_ATIVO());
            stm.setInt(2, pessoa.getPES_CODIGO());
            stm.execute();
        }
    }

    public void excluir(Pessoa pessoa) throws SQLException {
        String sql = "DELETE FROM PESSOA WHERE PES_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, pessoa.getPES_CODIGO());
            stm.execute();
        }
    }

    public ArrayList<Pessoa> consultar(String condicao) throws SQLException {
        ArrayList<Pessoa> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM PESSOA";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            Pessoa objusu = new Pessoa();
            objusu.setPES_CODIGO(rs.getInt("PES_ID"));
            objusu.setPES_CODIGO(rs.getInt("PES_NOME"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
