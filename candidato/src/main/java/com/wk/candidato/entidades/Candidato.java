package com.wk.candidato.entidades;

import com.wk.candidato.enums.Sexo;
import com.wk.candidato.enums.TipoSanguineo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidato {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String cpf;

    private String rg;

    private String data_nasc;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    private String mae;

    private String pai;

    private String email;

    @Enumerated(EnumType.STRING)
    private TipoSanguineo tipo_sanguineo;

    private String telefone_fixo;

    private String celular;

    private Double altura;

    private Integer peso;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
}
