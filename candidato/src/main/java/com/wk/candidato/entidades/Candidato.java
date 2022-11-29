package com.wk.candidato.entidades;

import com.wk.candidato.enums.Sexo;
import com.wk.candidato.enums.TipoSanguineo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "candidato")
public class Candidato implements Serializable {

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
