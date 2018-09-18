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
    private int FK_USU_CODIGO;
    private int FK_CLI_CODIGO;
    private String VDA_DATA;
    private float VDA_VALOR;
    private float VDA_DESCONTO;
    private float VDA_TOTAL;
    private char VDA_OBS;
    
    public Venda(){
        
    }
    
    public Venda(int VDA_CODIGO,int FK_USU_CODIGO,int FK_CLI_CODIGO, String VDA_DATA,
            float VDA_VALOR,float VDA_DESCONTO,float VDA_TOTAL,char VDA_OBS){
        this.VDA_CODIGO = VDA_CODIGO;
        this.FK_USU_CODIGO = FK_USU_CODIGO;
        this.FK_CLI_CODIGO = FK_CLI_CODIGO;
        this.VDA_DATA = VDA_DATA;
        this.VDA_VALOR = VDA_VALOR;
        this.VDA_DESCONTO = VDA_DESCONTO;
        this.VDA_TOTAL = VDA_TOTAL;
        this.VDA_OBS = VDA_OBS;
    }
    
}
