package com.wk.candidato.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum TipoSanguineo {

    A_POSITIVO(0, "A+"),
    A_NEGATIVO(1, "A-"),
    B_POSITIVO(2, "B+"),
    B_NEGATIVO(3, "B-"),
    AB_POSITIVO(4, "AB+"),
    AB_NEGATIVO(5, "AB-"),
    O_POSITIVO(6,"O+"),
    O_NEGATIVO(7, "O-");

    private Integer key;

    private String value;
}
