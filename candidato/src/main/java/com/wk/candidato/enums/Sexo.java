package com.wk.candidato.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Sexo {

    MASCULINO(0, "Masculino"),
    FEMININO(1, "Feminino");

    private Integer key;

    private String value;

}
