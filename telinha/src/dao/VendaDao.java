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
import model.Usuario;
import model.Venda;

/**
 *
 * @author renanperes
 */
public class VendaDao {

    private Connection conexao = null;

    public VendaDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(Venda venda) throws SQLException {
        String sql = "INSERT INTO VENDA (USU_CODIGO,CLI_CODIGO,VDA_DATA,VDA_VALOR,VDA_DESCONTO)"
                + "VALUES (?,?,?,?,?)";

        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, venda.getUSU_CODIGO());
        stm.setInt(2, venda.getCLI_CODIGO());
        stm.setString(3, venda.getVDA_DATA());
        stm.setFloat(4, venda.getVDA_VALOR());
        stm.setFloat(5, venda.getVDA_DESCONTO());
        stm.execute();
        stm.close();
    }

    public void alterar(Venda venda) throws SQLException {
        String sql = "UPDATE VENDA SET VDA_VALOR = ? WHERE VDA_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setFloat(1, venda.getVDA_VALOR());
            stm.setInt(2, venda.getVDA_CODIGO());
            stm.execute();
        }
    }

    public void excluir(Venda venda) throws SQLException {
        String sql = "DELETE FROM VENDA WHERE VDA_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, venda.getVDA_CODIGO());
            stm.execute();
        }
    }

    public ArrayList<Venda> consultar(String condicao) throws SQLException {
        ArrayList<Venda> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM VENDA";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            Venda objusu = new Venda();
            objusu.setVDA_CODIGO(rs.getInt("VDA_CODIGO"));
            objusu.setUSU_CODIGO(rs.getInt("USU_CODIGO"));
            objusu.setCLI_CODIGO(rs.getInt("CLI_CODIGO"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
