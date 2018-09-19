/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author Renan
 */
public class ClienteController {

    private List<Cliente> listacliente;

    public ArrayList<Cliente> consultar(String filtro) throws SQLException {
        listacliente = new ClienteDao().consultar(filtro);
        return (ArrayList<Cliente>) listacliente;
    }

    public void excluir(Cliente cliente) throws SQLException {
        ClienteDao dao = new ClienteDao();
        dao.excluir(cliente);
    }

    public void adicionar(Cliente cliente) throws SQLException {
        ClienteDao dao = new ClienteDao();
        dao.adicionar(cliente);
    }

    public void alterar(Cliente cliente) throws SQLException {
        ClienteDao dao = new ClienteDao();
        dao.alterar(cliente);
    }

    public void gravar(String operacao, Cliente cliente) throws SQLException {
        boolean retorno = true;
        if (operacao.equals("incluir")) {
            adicionar(cliente);
        } else if (operacao.equals("alterar")) {
            alterar(cliente);
        }
    }
}
