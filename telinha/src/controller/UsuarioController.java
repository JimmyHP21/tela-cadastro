/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 *
 * @author renanperes
 */
public class UsuarioController {

    private List<Usuario> listausuarios;

    public ArrayList<Usuario> consultar(String filtro) throws SQLException {
        listausuarios = new UsuarioDao().consultar(filtro);
        return (ArrayList<Usuario>) listausuarios;
    }

    public void excluir(Usuario usuario) throws SQLException {
        UsuarioDao dao = new UsuarioDao();
        dao.excluir(usuario);
    }

    public void adicionar(Usuario usuario) throws SQLException {
        UsuarioDao dao = new UsuarioDao();
        dao.adicionar(usuario);
    }

    public void alterar(Usuario usuario) throws SQLException {
        UsuarioDao dao = new UsuarioDao();
        dao.alterar(usuario);
    }

    public void gravar(String operacao, Usuario usuario) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(usuario);
        } else if (operacao.equals("alterar")) {
            alterar(usuario);
        }
    }
}
