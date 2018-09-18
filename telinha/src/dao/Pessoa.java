package dao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Leonardo Zanaro
 */
public class Pessoa {

    private int PES_ID;
    private String PES_NOME;
    private String PES_FANTASIA;
    private char PES_FISICA;
    private String PES_CPFCNPJ;
    private String PES_RGIE;
    private String PES_CADASTRO;
    private boolean PES_ATIVO;

    private static final String PATTERN_NUMERO = "^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$";

    public Pessoa(String PES_NOME) {
        this.PES_NOME = PES_NOME;
    }

    public int getPES_ID() {
        return PES_ID;
    }

    public void setPES_ID(int PES_ID) {
        this.PES_ID = PES_ID;
    }

    public String getPES_NOME() {
        return PES_NOME;
    }

    public void setPES_NOME(String PES_NOME) {
        this.PES_NOME = PES_NOME;
    }

    public String getPES_FANTASIA() {
        return PES_FANTASIA;
    }

    public void setPES_FANTASIA(String PES_FANTASIA) {
        this.PES_FANTASIA = PES_FANTASIA;
    }

    public char getPES_FISICA() {
        return PES_FISICA;
    }

    public void setPES_FISICA(char PES_FISICA) {
        this.PES_FISICA = PES_FISICA;
    }

    public String getPES_CPFCNPJ() {
        return PES_CPFCNPJ;
    }

    public void setPES_CPFCNPJ(String PES_CPFCNPJ) {
        this.PES_CPFCNPJ = PES_CPFCNPJ;
    }

    public String getPES_RGIE() {
        return PES_RGIE;
    }

    public void setPES_RGIE(String PES_RGIE) {
        this.PES_RGIE = PES_RGIE;
    }

    public String getPES_CADASTRO() {
        return PES_CADASTRO;
    }

    public void setPES_CADASTRO(String PES_CADASTRO) {
        this.PES_CADASTRO = PES_CADASTRO;
    }

    public boolean isPES_ATIVO() {
        return PES_ATIVO;
    }

    public void setPES_ATIVO(boolean PES_ATIVO) {
        this.PES_ATIVO = PES_ATIVO;
    }

}
