/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unip.dao;

/**
 *
 * @author renanperes
 */
public class UF {

    private int UF_ID;
    private String UF_DESC;

    public UF(int UF_ID, String UF_DESC) {
        this.UF_ID = UF_ID;
        this.UF_DESC = UF_DESC;
    }

    public int getUF_ID() {
        return UF_ID;
    }

    public void setUF_ID(int UF_ID) {
        this.UF_ID = UF_ID;
    }

    public String getUF_DESC() {
        return UF_DESC;
    }

    public void setUF_DESC(String UF_DESC) {
        this.UF_DESC = UF_DESC;
    }

}
