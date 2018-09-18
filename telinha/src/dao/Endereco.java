/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author renanperes
 */
public class Endereco{
    private int ID_ENDERECO;
    private String ENDERECO;
    private String END_NUMERO;
    private String END_COMPLE;
    private String END_BAIRRO;
    private String END_CIDADE;
    private String END_UF;
    private String END_CEP;

    public int getID_ENDERECO() {
        return ID_ENDERECO;
    }

    public void setID_ENDERECO(int ID_ENDERECO) {
        this.ID_ENDERECO = ID_ENDERECO;
    }

    public String getENDERECO() {
        return ENDERECO;
    }

    public void setENDERECO(String ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    public String getEND_NUMERO() {
        return END_NUMERO;
    }

    public void setEND_NUMERO(String END_NUMERO) {
        this.END_NUMERO = END_NUMERO;
    }

    public String getEND_COMPLE() {
        return END_COMPLE;
    }

    public void setEND_COMPLE(String END_COMPLE) {
        this.END_COMPLE = END_COMPLE;
    }

    public String getEND_BAIRRO() {
        return END_BAIRRO;
    }

    public void setEND_BAIRRO(String END_BAIRRO) {
        this.END_BAIRRO = END_BAIRRO;
    }

    public String getEND_CIDADE() {
        return END_CIDADE;
    }

    public void setEND_CIDADE(String END_CIDADE) {
        this.END_CIDADE = END_CIDADE;
    }

    public String getEND_UF() {
        return END_UF;
    }

    public void setEND_UF(String END_UF) {
        this.END_UF = END_UF;
    }

    public String getEND_CEP() {
        return END_CEP;
    }

    public void setEND_CEP(String END_CEP) {
        this.END_CEP = END_CEP;
    }
    
    

}
