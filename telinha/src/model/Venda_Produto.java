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
public class Venda_Produto {

    private int VEP_CODIGO;
    private int VDA_CODIGO;
    private int PRO_CODIGO;
    private int VEP_QTDE;
    private float VEP_PRECO;
    private float VEP_DESCONTO;
    private float VEP_TOTAL;

    public Venda_Produto() {

    }

    public Venda_Produto(int VEP_CODIGO, int VDA_CODIGO, int PRO_CODIGO, int VEP_QTDE, float VEP_PRECO, float VEP_DESCONTO, float VEP_TOTAL) {
        this.VEP_CODIGO = VEP_CODIGO;
        this.VDA_CODIGO = VDA_CODIGO;
        this.PRO_CODIGO = PRO_CODIGO;
        this.VEP_QTDE = VEP_QTDE;
        this.VEP_PRECO = VEP_PRECO;
        this.VEP_DESCONTO = VEP_DESCONTO;
        this.VEP_TOTAL = VEP_TOTAL;
    }

    public int getVEP_CODIGO() {
        return VEP_CODIGO;
    }

    public void setVEP_CODIGO(int VEP_CODIGO) {
        this.VEP_CODIGO = VEP_CODIGO;
    }

    public int getVDA_CODIGO() {
        return VDA_CODIGO;
    }

    public void setVDA_CODIGO(int VDA_CODIGO) {
        this.VDA_CODIGO = VDA_CODIGO;
    }

    public int getPRO_CODIGO() {
        return PRO_CODIGO;
    }

    public void setPRO_CODIGO(int PRO_CODIGO) {
        this.PRO_CODIGO = PRO_CODIGO;
    }

    public int getVEP_QTDE() {
        return VEP_QTDE;
    }

    public void setVEP_QTDE(int VEP_QTDE) {
        this.VEP_QTDE = VEP_QTDE;
    }

    public float getVEP_PRECO() {
        return VEP_PRECO;
    }

    public void setVEP_PRECO(float VEP_PRECO) {
        this.VEP_PRECO = VEP_PRECO;
    }

    public float getVEP_DESCONTO() {
        return VEP_DESCONTO;
    }

    public void setVEP_DESCONTO(float VEP_DESCONTO) {
        this.VEP_DESCONTO = VEP_DESCONTO;
    }

    public float getVEP_TOTAL() {
        return VEP_TOTAL;
    }

    public void setVEP_TOTAL(float VEP_TOTAL) {
        this.VEP_TOTAL = VEP_TOTAL;
    }

}
