/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.util.stream.Stream;

/**
 *
 * @author renanperes
 */
public enum EnumUF {

    AC(1, "Acre","AC"),
    AL(2, "Alagoas","AL"),
    AP(3, "Amapá","AP"),
    AM(4, "Amazonas","AM"),
    BA(5, "Bahia","BA"),
    CE(6, "Ceará","CE"),
    DF(7, "Distrito Federal","DF"),
    ES(8, "Espírito Santo","ES"),
    GO(9, "Goiás","GO"),
    MA(10, "Maranhão","MA"),
    MT(11, "Mato Grosso","MT"),
    MS(12, "Mato Grosso do Sul","MS"),
    MG(13, "Minas Gerais","MG"),
    PA(14, "Pará","PA"),
    PB(15, "Paraíba","PB"),
    PR(16, "Paraná","PR"),
    PE(17, "Pernambuco","PE"),
    PI(18, "Piauí","PI"),
    RJ(19, "Rio de Janeiro","RJ"),
    RN(20, "Rio Grande do Norte","RN"),
    RS(21, "Rio Grande do Sul","RS"),
    RO(22, "Rondônia","RO"),
    RR(23, "Roraima","RR"),
    SC(24, "Santa Catarina","SC"),
    SP(25, "São Paulo","SP"),
    SE(26, "Sergipe","SE"),
    TO(27, "Tocantins","TO");

    private final int id;
    private final String descricao;
    private final String uf;

    EnumUF(int id, String descricao, String uf) {
        this.id = id;
        this.descricao = descricao;
        this.uf = uf;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUf() {
        return uf;
    }

    public static EnumUF getByDescricao(final String descricao) {
        if (descricao == null) {
            return null;
        }
        return Stream.of(EnumUF.values())
                .filter(enumArea -> enumArea.getDescricao().trim().toUpperCase().equals(descricao.trim().toUpperCase())).findAny()
                .orElseThrow(() -> new EnumConstantNotPresentException(EnumUF.class, descricao));
    }

    @Override
    public String toString() {
        return uf;
    }

//    Arrays.asList(EnumArea.values())
}
