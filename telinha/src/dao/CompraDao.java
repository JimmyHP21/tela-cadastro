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
import model.Cliente;
import model.Compra;

/**
 *
 * @author renanperes
 */
public class CompraDao {

    private Connection conexao = null;

    public CompraDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(Compra compra) throws SQLException {
        String sql = "INSERT INTO COMPRA (USU_CODIGO,FOR_CODIGO,CPR_EMISSAO,CPR_VALOR)"
                + " VALUES (?, ?, ?,?)";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, compra.getUSU_CODIGO());
            stm.setInt(2, compra.getFOR_CODIGO());
            stm.setDate(3, compra.getCPR_EMISSAO());
            stm.setFloat(4, compra.getCPR_VALOR());
            stm.execute();
        }
    }

    public void alterar(Compra compra) throws SQLException {
        String sql = "UPDATE COMPRA SET CPR_VALOR = ? WHERE CPR_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setFloat(1, compra.getCPR_VALOR());
            stm.setInt(2, compra.getCPR_CODIGO());
            stm.execute();
        }
    }

    public void excluir(Compra compra) throws SQLException {
        String sql = "DELETE FROM COMPRA WHERE CPR_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, compra.getCPR_CODIGO());
            stm.execute();
        }
    }

    public ArrayList<Compra> consultar(String condicao) throws SQLException {
        ArrayList<Compra> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM COMPRA";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            Compra objusu = new Compra();
            objusu.setCPR_CODIGO(rs.getInt("CLI_ID"));
            objusu.setUSU_CODIGO(rs.getInt("PES_ID"));
            objusu.setFOR_CODIGO(rs.getInt("FOR_ID"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
