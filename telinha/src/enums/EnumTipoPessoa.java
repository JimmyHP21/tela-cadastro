/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author renanperes
 */
public enum EnumTipoPessoa {

    CIVIL(1, "Civil"),
    JURÍDICA(2, "Jurídica");

    private final int id;
    private final String descricao;

    EnumTipoPessoa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
