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
import model.Fornecedor;

/**
 *
 * @author renanperes
 */
public class FornecedorDao {

    private Connection conexao = null;

    public FornecedorDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(Fornecedor fornecedor) throws SQLException {
        String sql = "INSERT INTO FORNECEDOR(PES_CODIGO,FOR_CONTATO)"
                + "VALUES (?,?)";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, fornecedor.getPES_CODIGO());
            stm.setString(2, fornecedor.getFOR_CONTATO());
            stm.execute();
        }
    }

    public void alterar(Fornecedor fornecedor) throws SQLException {
        String sql = "UPDATE FORNECEDOR SET FOR_CONTATO = ? WHERE FOR_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setString(1, fornecedor.getFOR_CONTATO());
            stm.setInt(2, fornecedor.getFOR_CODIGO());
            stm.execute();
        }
    }

    public void excluir(Fornecedor fornecedor) throws SQLException {
        String sql = "DELETE FROM FORNECEDOR WHERE FOR_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, fornecedor.getFOR_CODIGO());
            stm.execute();
        }
    }

    public ArrayList<Fornecedor> consultar(String condicao) throws SQLException {
        ArrayList<Fornecedor> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM FORNECEDOR";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            Fornecedor objusu = new Fornecedor();
            objusu.setFOR_CODIGO(rs.getInt("FOR_CODIGO"));
            objusu.setPES_CODIGO(rs.getInt("PES_CODIGO"));
            objusu.setFOR_CONTATO(rs.getString("FOR_CONTATO"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }

}
