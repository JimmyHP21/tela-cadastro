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
import model.Usuario;

/**
 *
 * @author renanperes
 */
public class UsuarioDao {

    private Connection conexao = null;

    public UsuarioDao() throws SQLException {
        this.conexao = Conexao.getConexao();
    }

    public void adicionar(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO USUARIO (USU_NOME,USU_LOGIN,USU_SENHA,USU_CADASTRO,USU_ATIVO)"
                + "VALUES (?,?,?,?,?)";

        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, usuario.getUSU_NOME());
        stm.setString(2, usuario.getUSU_LOGIN());
        stm.setString(3, usuario.getUSU_SENHA());
        stm.setString(4, usuario.getUSU_CADASTRO());
        stm.setInt(5, usuario.getUSU_ATIVO());
        stm.execute();
        stm.close();
    }

    public void alterar(Usuario usuario) throws SQLException {
        String sql = "UPDATE USUARIO SET USU_LOGIN = ? WHERE USU_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setString(1, usuario.getUSU_LOGIN());
            stm.setInt(2, usuario.getUSU_CODIGO());
            stm.execute();
        }
    }

    public void excluir(Usuario usuario) throws SQLException {
        String sql = "DELETE FROM USUARIO WHERE USU_CODIGO = ?";
        try (PreparedStatement stm = conexao.prepareStatement(sql)) {
            stm.setInt(1, usuario.getUSU_CODIGO());
            stm.execute();
        }
    }

    public ArrayList<Usuario> consultar(String condicao) throws SQLException {
        ArrayList<Usuario> lista = null;
        PreparedStatement stm;
        ResultSet rs;
        String sql = "SELECT * FROM USUARIO";
        if (!condicao.equals("")) {
            sql += " where " + condicao;
        }
        stm = conexao.prepareStatement(sql);
        rs = stm.executeQuery();
        lista = new ArrayList<>();

        while (rs.next()) {
            Usuario objusu = new Usuario();
            objusu.setUSU_CODIGO(rs.getInt("USU_CODIGO"));
            objusu.setUSU_NOME(rs.getString("USU_NOME"));
            objusu.setUSU_LOGIN(rs.getString("USU_LOGIN"));
            lista.add(objusu);
        }
        rs.close();
        stm.close();
        return lista;
    }
}
