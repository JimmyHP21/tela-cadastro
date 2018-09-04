/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unip.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Leonardo Zanaro
 */
public class Conexao {

    private static final String DRIVER = "oracle.jdbc.OracleDriver";
    private static final String BANCO = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USUARIO = "SYSTEM";
    private static final String SENHA = "1999";

    Connection conexao = null;
    PreparedStatement stm = null;

    public static String getDRIVER() {
        return DRIVER;
    }

    public static String getBANCO() {
        return BANCO;
    }

    public static String getUSUARIO() {
        return USUARIO;
    }

    public static String getSENHA() {
        return SENHA;
    }

    
}
