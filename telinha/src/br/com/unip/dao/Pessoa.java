package br.com.unip.dao;


import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
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

    private String PES_NOME;
    private String PES_TELEFONE;
    private String PES_CIDADE;
    private String PES_CPF;
    private static final String PATTERN_NUMERO = "^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$";

    public Pessoa(String PES_NOME, String PES_TELEFONE, String PES_CIDADE, String PES_CPF) {
        this.PES_NOME = PES_NOME;
        this.PES_TELEFONE = PES_TELEFONE;
        this.PES_CIDADE = PES_CIDADE;
        this.PES_CPF = PES_CPF;
    }

    public String getPES_NOME() {
        return PES_NOME;
    }

    public void setPES_NOME(String PES_NOME) {
        this.PES_NOME = PES_NOME;
    }

    public String getPES_TELEFONE() {
        PES_TELEFONE = PES_TELEFONE.substring(0, 5) + "-" + PES_TELEFONE.substring(5);
        return PES_TELEFONE;
    }

    public void setPES_TELEFONE(String PES_TELEFONE) {
        this.PES_TELEFONE = PES_TELEFONE;
    }

    public String getPES_CIDADE() {
        return PES_CIDADE;
    }

    public void setPES_CIDADE(String PES_CIDADE) {
        this.PES_CIDADE = PES_CIDADE;
    }

    public String getPES_CPF() {

        return PES_CPF;
    }

    public void setPES_CPF(String PES_CPF) {
        this.PES_CPF = PES_CPF;
    }

    
    public void validarTelefone() {
        do {
            setPES_TELEFONE(PES_TELEFONE);
            String val = PES_TELEFONE;
            Pattern pattern = Pattern.compile("\\W");
            Matcher matcher = pattern.matcher(val);
            if (val.length() > 9 || val.length() == 0) {
                PES_TELEFONE = "";
            } else if (matcher.find()) {
                PES_TELEFONE = "";
            } else if (val.matches(PATTERN_NUMERO)) {
                PES_TELEFONE = "";
            } else {
                PES_TELEFONE = val;
            }

        } while (PES_TELEFONE.isEmpty());
    }

    public void validarNome() {
        do {
            setPES_NOME(PES_NOME);
            String nome = getPES_NOME();
            Pattern pattern = Pattern.compile("\\d");
            Pattern pattern1 = Pattern.compile("\\W");
            Matcher matcher = pattern.matcher(nome);
            Matcher matcher1 = pattern1.matcher(nome);
            if (matcher.find()) {
                PES_NOME = "";
            } else if (matcher1.find()) {
                PES_NOME = "";
            } else {
                PES_NOME = nome.toUpperCase();
            }
        } while (PES_NOME.isEmpty());
    }

    public void validarCpf() {
        do {
            setPES_CPF(PES_CPF);
            String cpf = getPES_CPF();
            Pattern pattern = Pattern.compile("\\W");
            Matcher matcher = pattern.matcher(cpf);
            if (cpf.length() != 11) {
                PES_CPF = "";
            } else if (cpf.matches(PATTERN_NUMERO)) {
                PES_CPF = "";
            } else if (matcher.find()) {
                PES_CPF = "";
            } else if (cpf.length() != 11) {
                PES_CPF = "";
            } else {
//                ( XXX.XXX.XXX-XX ) 
                PES_CPF = cpf.substring(0, 3)
                        + "." + cpf.substring(3, 6)
                        + "." + cpf.substring(6, 9)
                        + "-" + cpf.substring(9);
            }

        } while (PES_CPF.isEmpty());
    }
}
