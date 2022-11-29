package com.wk.candidato.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue
    private Long id;

    private String cep;

    private String endereco;

    private Integer numero;

    private String bairro;

    private String cidade;

    private String estado;

}
