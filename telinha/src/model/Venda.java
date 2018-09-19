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
public class Venda {

    private int VDA_CODIGO;
    private int USU_CODIGO;
    private int CLI_CODIGO;
    private String VDA_DATA;
    private float VDA_VALOR;
    private float VDA_DESCONTO;
    private float VDA_TOTAL;
    private String VDA_OBS;

    public Venda() {

    }

    public Venda(int VDA_CODIGO, int USU_CODIGO, int CLI_CODIGO, String VDA_DATA,
            float VDA_VALOR, float VDA_DESCONTO, float VDA_TOTAL, String VDA_OBS) {
        this.VDA_CODIGO = VDA_CODIGO;
        this.USU_CODIGO = USU_CODIGO;
        this.CLI_CODIGO = CLI_CODIGO;
        this.VDA_DATA = VDA_DATA;
        this.VDA_VALOR = VDA_VALOR;
        this.VDA_DESCONTO = VDA_DESCONTO;
        this.VDA_TOTAL = VDA_TOTAL;
        this.VDA_OBS = VDA_OBS;
    }

    public int getVDA_CODIGO() {
        return VDA_CODIGO;
    }

    public void setVDA_CODIGO(int VDA_CODIGO) {
        this.VDA_CODIGO = VDA_CODIGO;
    }

    public int getUSU_CODIGO() {
        return USU_CODIGO;
    }

    public void setUSU_CODIGO(int USU_CODIGO) {
        this.USU_CODIGO = USU_CODIGO;
    }

    public int getCLI_CODIGO() {
        return CLI_CODIGO;
    }

    public void setCLI_CODIGO(int CLI_CODIGO) {
        this.CLI_CODIGO = CLI_CODIGO;
    }

    public String getVDA_DATA() {
        return VDA_DATA;
    }

    public void setVDA_DATA(String VDA_DATA) {
        this.VDA_DATA = VDA_DATA;
    }

    public float getVDA_VALOR() {
        return VDA_VALOR;
    }

    public void setVDA_VALOR(float VDA_VALOR) {
        this.VDA_VALOR = VDA_VALOR;
    }

    public float getVDA_DESCONTO() {
        return VDA_DESCONTO;
    }

    public void setVDA_DESCONTO(float VDA_DESCONTO) {
        this.VDA_DESCONTO = VDA_DESCONTO;
    }

    public float getVDA_TOTAL() {
        return VDA_TOTAL;
    }

    public void setVDA_TOTAL(float VDA_TOTAL) {
        this.VDA_TOTAL = VDA_TOTAL;
    }

    public String getVDA_OBS() {
        return VDA_OBS;
    }

    public void setVDA_OBS(String VDA_OBS) {
        this.VDA_OBS = VDA_OBS;
    }

}
