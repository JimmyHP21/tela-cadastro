/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author renanperes
 */
public enum EnumRegiao {
    NORTE(1, Arrays.asList(EnumUF.AC, EnumUF.AM, EnumUF.AP, EnumUF.PA, EnumUF.RO, EnumUF.RR, EnumUF.TO)),
    NORDESTE(2, Arrays.asList(EnumUF.AL, EnumUF.BA, EnumUF.CE, EnumUF.MA, EnumUF.PB, EnumUF.PE, EnumUF.PI, EnumUF.RN, EnumUF.SE)),
    CENTRO_OESTE(3, Arrays.asList(EnumUF.DF, EnumUF.GO, EnumUF.MS, EnumUF.MT)),
    SUDESTE(4, Arrays.asList(EnumUF.ES, EnumUF.MG, EnumUF.RJ, EnumUF.SP)),
    SUL(5, Arrays.asList(EnumUF.PR, EnumUF.RS, EnumUF.SC));

    private final int id;
    private final List<EnumUF> ufs;

    EnumRegiao(int id, List<EnumUF> ufs) {
        this.id = id;
        this.ufs = ufs;
    }

    public static EnumRegiao getById(int id) {
        return Stream.of(EnumRegiao.values())
                .filter(e -> id == e.getId()).findAny()
                .orElseThrow(() -> new EnumConstantNotPresentException(EnumRegiao.class, String.valueOf(id)));
    }

    public int getId() {
        return this.id;
    }

    public List<EnumUF> getUfs() {
        return this.ufs;
    }
}
