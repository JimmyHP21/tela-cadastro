/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author renanperes
 */
public class Compra_Produto {

    private int CPP_CODIGO;
    private int CPR_CODIGO;
    private int PRO_CODIGO;
    private int CPR_QTDE;
    private float CPR_PRECO;
    private float CPR_DESCONTO;
    private float CPR_TOTAL;

    public Compra_Produto() {

    }

    public Compra_Produto(int CPP_CODIGO, int CPR_CODIGO, int PRO_CODIGO, int CPR_QTDE,
            float CPR_PRECO, float CPR_DESCONTO, float CPR_TOTAL) {
        this.CPP_CODIGO = CPP_CODIGO;
        this.CPR_CODIGO = CPR_CODIGO;
        this.PRO_CODIGO = PRO_CODIGO;
        this.CPR_QTDE = CPR_QTDE;
        this.CPR_PRECO = CPR_PRECO;
        this.CPR_DESCONTO = CPR_DESCONTO;
        this.CPR_TOTAL = CPR_TOTAL;
    }

    public int getCPP_CODIGO() {
        return CPP_CODIGO;
    }

    public void setCPP_CODIGO(int CPP_CODIGO) {
        this.CPP_CODIGO = CPP_CODIGO;
    }

    public int getCPR_CODIGO() {
        return CPR_CODIGO;
    }

    public void setCPR_CODIGO(int CPR_CODIGO) {
        this.CPR_CODIGO = CPR_CODIGO;
    }

    public int getPRO_CODIGO() {
        return PRO_CODIGO;
    }

    public void setPRO_CODIGO(int PRO_CODIGO) {
        this.PRO_CODIGO = PRO_CODIGO;
    }

    public int getCPR_QTDE() {
        return CPR_QTDE;
    }

    public void setCPR_QTDE(int CPR_QTDE) {
        this.CPR_QTDE = CPR_QTDE;
    }

    public float getCPR_PRECO() {
        return CPR_PRECO;
    }

    public void setCPR_PRECO(float CPR_PRECO) {
        this.CPR_PRECO = CPR_PRECO;
    }

    public float getCPR_DESCONTO() {
        return CPR_DESCONTO;
    }

    public void setCPR_DESCONTO(float CPR_DESCONTO) {
        this.CPR_DESCONTO = CPR_DESCONTO;
    }

    public float getCPR_TOTAL() {
        return CPR_TOTAL;
    }

    public void setCPR_TOTAL(float CPR_TOTAL) {
        this.CPR_TOTAL = CPR_TOTAL;
    }

}
