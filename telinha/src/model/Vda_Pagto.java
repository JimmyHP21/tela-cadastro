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
public class Vda_Pagto {

    private int VDP_CODIGO;
    private int VDA_CODIGO;
    private int FPG_CODIGO;
    private float VDP_VALOR;

    public Vda_Pagto() {

    }

    public Vda_Pagto(int VDP_CODIGO, int VDA_CODIGO, int FPG_CODIGO, float VDP_VALOR) {
        this.VDP_CODIGO = VDP_CODIGO;
        this.VDA_CODIGO = VDA_CODIGO;
        this.FPG_CODIGO = FPG_CODIGO;
        this.VDP_VALOR = VDP_VALOR;
    }

    public int getVDP_CODIGO() {
        return VDP_CODIGO;
    }

    public void setVDP_CODIGO(int VDP_CODIGO) {
        this.VDP_CODIGO = VDP_CODIGO;
    }

    public int getVDA_CODIGO() {
        return VDA_CODIGO;
    }

    public void setVDA_CODIGO(int VDA_CODIGO) {
        this.VDA_CODIGO = VDA_CODIGO;
    }

    public int getFPG_CODIGO() {
        return FPG_CODIGO;
    }

    public void setFPG_CODIGO(int FPG_CODIGO) {
        this.FPG_CODIGO = FPG_CODIGO;
    }

    public float getVDP_VALOR() {
        return VDP_VALOR;
    }

    public void setVDP_VALOR(float VDP_VALOR) {
        this.VDP_VALOR = VDP_VALOR;
    }
    
    
}
