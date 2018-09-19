/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author renanperes
 */
public class Produto {

    private int PRO_CODIGO;
    private String PRO_NOME;
    private int PRO_ESTOQUE;
    private String PRO_UNIDADE;
    private float PRO_PRECO;
    private float PRO_CUSTO;
    private float PRO_ATACADO;
    private int PRO_MIN;
    private int PRO_MAX;
    private float PRO_EMBALAGEM;
    private float PRO_PESO;
    private Date PRO_CADASTRO;
    private String PRO_OBS;
    private String PRO_ATIVO;

    public Produto() {

    }

    public Produto(int PRO_CODIGO, String PRO_NOME, int PRO_ESTOQUE, String PRO_UNIDADE, float PRO_PRECO,
            float PRO_CUSTO, float PRO_ATACADO, int PRO_MIN, int PRO_MAX, float PRO_EMBALAGEM,
            float PRO_PESO, Date PRO_CADASTRO, String PRO_OBS, String PRO_ATIVO) {
        this.PRO_CODIGO = PRO_CODIGO;
        this.PRO_NOME = PRO_NOME;
        this.PRO_ESTOQUE = PRO_ESTOQUE;
        this.PRO_UNIDADE = PRO_UNIDADE;
        this.PRO_PRECO = PRO_PRECO;
        this.PRO_CUSTO = PRO_CUSTO;
        this.PRO_ATACADO = PRO_ATACADO;
        this.PRO_MIN = PRO_MIN;
        this.PRO_MAX = PRO_MAX;
        this.PRO_EMBALAGEM = PRO_EMBALAGEM;
        this.PRO_PESO = PRO_PESO;
        this.PRO_CADASTRO = PRO_CADASTRO;
        this.PRO_OBS = PRO_OBS;
        this.PRO_ATIVO = PRO_ATIVO;
    }

    public int getPRO_CODIGO() {
        return PRO_CODIGO;
    }

    public void setPRO_CODIGO(int PRO_CODIGO) {
        this.PRO_CODIGO = PRO_CODIGO;
    }

    public String getPRO_NOME() {
        return PRO_NOME;
    }

    public void setPRO_NOME(String PRO_NOME) {
        this.PRO_NOME = PRO_NOME;
    }

    public int getPRO_ESTOQUE() {
        return PRO_ESTOQUE;
    }

    public void setPRO_ESTOQUE(int PRO_ESTOQUE) {
        this.PRO_ESTOQUE = PRO_ESTOQUE;
    }

    public String getPRO_UNIDADE() {
        return PRO_UNIDADE;
    }

    public void setPRO_UNIDADE(String PRO_UNIDADE) {
        this.PRO_UNIDADE = PRO_UNIDADE;
    }

    public float getPRO_PRECO() {
        return PRO_PRECO;
    }

    public void setPRO_PRECO(float PRO_PRECO) {
        this.PRO_PRECO = PRO_PRECO;
    }

    public float getPRO_CUSTO() {
        return PRO_CUSTO;
    }

    public void setPRO_CUSTO(float PRO_CUSTO) {
        this.PRO_CUSTO = PRO_CUSTO;
    }

    public float getPRO_ATACADO() {
        return PRO_ATACADO;
    }

    public void setPRO_ATACADO(float PRO_ATACADO) {
        this.PRO_ATACADO = PRO_ATACADO;
    }

    public int getPRO_MIN() {
        return PRO_MIN;
    }

    public void setPRO_MIN(int PRO_MIN) {
        this.PRO_MIN = PRO_MIN;
    }

    public int getPRO_MAX() {
        return PRO_MAX;
    }

    public void setPRO_MAX(int PRO_MAX) {
        this.PRO_MAX = PRO_MAX;
    }

    public float getPRO_EMBALAGEM() {
        return PRO_EMBALAGEM;
    }

    public void setPRO_EMBALAGEM(float PRO_EMBALAGEM) {
        this.PRO_EMBALAGEM = PRO_EMBALAGEM;
    }

    public float getPRO_PESO() {
        return PRO_PESO;
    }

    public void setPRO_PESO(float PRO_PESO) {
        this.PRO_PESO = PRO_PESO;
    }

    public Date getPRO_CADASTRO() {
        return PRO_CADASTRO;
    }

    public void setPRO_CADASTRO(Date PRO_CADASTRO) {
        this.PRO_CADASTRO = PRO_CADASTRO;
    }

    public String getPRO_OBS() {
        return PRO_OBS;
    }

    public void setPRO_OBS(String PRO_OBS) {
        this.PRO_OBS = PRO_OBS;
    }

    public String getPRO_ATIVO() {
        return PRO_ATIVO;
    }

    public void setPRO_ATIVO(String PRO_ATIVO) {
        this.PRO_ATIVO = PRO_ATIVO;
    }

}
