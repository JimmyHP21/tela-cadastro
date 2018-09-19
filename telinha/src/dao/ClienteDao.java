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

/**
 *
 * @author Renan
 */
public class ClienteDao {

    private Connection conexao = null;

    public ClienteDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO CLIENTE (CLI_CODIGO,PES_CODIGO, CLI_LIMITECRED)"
                + " VALUES (?, ?, ?)";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getCLI_CODIGO());
        stm.setInt(2, cliente.getPES_CODIGO());
        stm.setFloat(3, cliente.getCLI_LIMITECRED());
        stm.execute();
        stm.close();
    }

    public void alterar(Cliente cliente) throws SQLException {
        String sql = "UPDATE CLIENTE SET CLI_LIMITECRED = ? WHERE CLI_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setFloat(1, cliente.getCLI_LIMITECRED());
        stm.setInt(2, cliente.getCLI_CODIGO());
        stm.execute();
        stm.close();
    }

    public void excluir(Cliente cliente) throws SQLException {
        String sql = "DELETE FROM CLIENTE WHERE CLI_CODIGO = ?";
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, cliente.getCLI_CODIGO());
        stm.execute();
        stm.close();
    }

    public ArrayList<Cliente> consultar(String condicao) throws SQLException {
        ArrayList<Cliente> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM CLIENTE";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            Cliente objusu = new Cliente();
            objusu.setCLI_CODIGO(rs.getInt("CLI_ID"));
            objusu.setPES_CODIGO(rs.getInt("PES_ID"));
            objusu.setCLI_LIMITECRED(rs.getFloat("CLI_LIMITECRED"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
