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
public class Compra {

    private int CPR_CODIGO;
    private int USU_CODIGO;
    private int FOR_CODIGO;
    private Date CPR_EMISSAO;
    private float CPR_VALOR;
    private float CPR_DESCONTO;
    private float CPR_TOTAL;
    private Date CPR_DTENTRADA;
    private String CPR_OBS;
    
    public Compra(){
        
    }
    
    public Compra(int CPR_CODIGO,int USU_CODIGO,int FOR_CODIGO,Date CPR_EMISSAO, float CPR_VALOR, float CPR_DESCONTO,
                    float CPR_TOTAL,Date CPR_DTENTRADA,String CPR_OBS){
        this.CPR_CODIGO = CPR_CODIGO;
        this.USU_CODIGO = USU_CODIGO;
        this.FOR_CODIGO = FOR_CODIGO;
        this.CPR_EMISSAO = CPR_EMISSAO;
        this.CPR_VALOR = CPR_VALOR;
        this.CPR_DESCONTO = CPR_DESCONTO;
        this.CPR_TOTAL = CPR_TOTAL;
        this.CPR_DTENTRADA = CPR_DTENTRADA;
        this.CPR_OBS = CPR_OBS;
    }

    public int getCPR_CODIGO() {
        return CPR_CODIGO;
    }

    public void setCPR_CODIGO(int CPR_CODIGO) {
        this.CPR_CODIGO = CPR_CODIGO;
    }

    public int getUSU_CODIGO() {
        return USU_CODIGO;
    }

    public void setUSU_CODIGO(int USU_CODIGO) {
        this.USU_CODIGO = USU_CODIGO;
    }

    public int getFOR_CODIGO() {
        return FOR_CODIGO;
    }

    public void setFOR_CODIGO(int FOR_CODIGO) {
        this.FOR_CODIGO = FOR_CODIGO;
    }

    public Date getCPR_EMISSAO() {
        return CPR_EMISSAO;
    }

    public void setCPR_EMISSAO(Date CPR_EMISSAO) {
        this.CPR_EMISSAO = CPR_EMISSAO;
    }

    public float getCPR_VALOR() {
        return CPR_VALOR;
    }

    public void setCPR_VALOR(float CPR_VALOR) {
        this.CPR_VALOR = CPR_VALOR;
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

    public Date getCPR_DTENTRADA() {
        return CPR_DTENTRADA;
    }

    public void setCPR_DTENTRADA(Date CPR_DTENTRADA) {
        this.CPR_DTENTRADA = CPR_DTENTRADA;
    }

    public String getCPR_OBS() {
        return CPR_OBS;
    }

    public void setCPR_OBS(String CPR_OBS) {
        this.CPR_OBS = CPR_OBS;
    }
    
    
}
