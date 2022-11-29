package com.wk.candidato.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Estado {

    AC(0, "Acre"),
    AL(1, "Alagoas"),
    AP(2,"Amapá"),
    AM(3,"Amazonas"),
    BA(4,"Bahia"),
    CE(5,"Ceará"),
    ES(6,"Espirito Santo"),
    GO(7,"Goias"),
    MA(8,"Maranhão"),
    MT(9,"Mato Grosso"),
    MS(10,"Mato Grosso do Sul"),
    MG(11,"Minas Gerais"),
    PA(12,"Pará"),
    PB(13,"Paraiba"),
    PR(14,"Paraná"),
    PE(15,"Pernambuco"),
    PI(16,"Piauí"),
    RJ(17,"Rio de Janeiro"),
    RN(18,"Rio Grande do Norte"),
    RS(19,"Rio Grande do Sul"),
    RO(20, "Rondônia"),
    RR(21,"Roraima"),
    SC(22,"Santa Catarina"),
    SP(23,"São Paulo"),
    SE(24,"Sergipe"),
    TO(25,"Tocatins"),
    DF(26,"Distrito Federal");

    private Integer key;

    private String value;
}
