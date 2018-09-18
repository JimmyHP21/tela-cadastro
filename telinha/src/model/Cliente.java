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
public class Cliente {
    private int CLI_CODIGO;
    private int FK_PES_CODIGO;
    private float CLI_LIMITECRED;  
    
    public Cliente(){
        
    }
    
    public Cliente(int CLI_CODIGO,int FK_PES_CODIGO,float CLI_LIMITECRED){
        this.CLI_CODIGO = CLI_CODIGO;
        this.FK_PES_CODIGO = FK_PES_CODIGO;
        this.CLI_LIMITECRED = CLI_LIMITECRED;
    }

    public int getCLI_CODIGO() {
        return CLI_CODIGO;
    }

    public void setCLI_CODIGO(int CLI_CODIGO) {
        this.CLI_CODIGO = CLI_CODIGO;
    }

    public int getFK_PES_CODIGO() {
        return FK_PES_CODIGO;
    }

    public void setFK_PES_CODIGO(int FK_PES_CODIGO) {
        this.FK_PES_CODIGO = FK_PES_CODIGO;
    }

    public float getCLI_LIMITECRED() {
        return CLI_LIMITECRED;
    }

    public void setCLI_LIMITECRED(float CLI_LIMITECRED) {
        this.CLI_LIMITECRED = CLI_LIMITECRED;
    }
    
    
    
}
