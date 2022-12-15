package com.wk.candidato.servico;

import com.wk.candidato.dto.CandidatoDTO;
import com.wk.candidato.enums.Estado;
import com.wk.candidato.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CandidatoServico {

    @Autowired
    private CandidatoRepository repository;

    public EntityResponse saveCandidatos(List<CandidatoDTO> candidatos) {
//  Implemente um sistema web que receba um JSON com os dados e mostre os seguintes resultados:
//  • Quantos candidatos temos nessa lista em cada estado do Brasil?
//  Map<Boolean, List<CandidatoDTO>> collect = candidatos.stream().collect(Collectors.groupingBy(i -> i.getEstado().equals(Estado.values().)));
        Map<Integer, Estado> qtdCandidatosPorEstados = qtdCandidatosPorEstados(candidatos);
//  • IMC médio em cada faixa de idade de dez em dez anos: 0 a 10; 11 a 20; 21 a 30, etc. (IMC = peso / altura^2)
        float imc = 0;
      for (int index = 0; index <= candidatos.size(); index++) {
          int anoNascimento = LocalDate.parse(candidatos.get(index).getData_nasc()).getYear();
          int anoAtual = LocalDate.now().getYear();
          int idade = anoNascimento - anoAtual;
          Map<Integer, Float> calcularIMC = calcularIMC(candidatos, index, idade);

//  • Qual o percentual de obesos entre os homens e entre as mulheres? (É obeso quem tem IMC >30)
          int qtdMasculino = 0, qtdFeminino = 0;
          float percentualMasculino, percentualFeminino;

          for (int a = 0; a <= calcularIMC.values().size(); a++) {
              if (calcularIMC.get(a).floatValue() > 30) {
                  if (candidatos.get(index).getSexo().equals("Feminino")) {
                        qtdFeminino++;
                  }
                  if (candidatos.get(index).getSexo().equals("Masculino")) {
                        qtdMasculino++;
                  }
              }
          }
          percentualFeminino = qtdFeminino / 100;
          percentualMasculino = qtdMasculino / 100;
      }

//  • Qual a média de idade para cada tipo sanguíneo?

//  • A quantidade de possíveis doadores para cada tipo sanguíneo receptor.

//    ATENÇÃO: Somente pessoas com idade de 16 a 69 anos e com peso acima de 50 Kg podem doar sangue.

        return null;
    }

    private static Map<Integer, Float> calcularIMC(List<CandidatoDTO> candidatos, int index, int idade) {
        float imc;
        Map<Integer, Float> imcIdade = new HashMap<>();
        if ( idade > 0 && idade <= 10 ) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if ( idade > 10 && idade <= 20) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if( idade > 20 && idade <= 30) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if( idade > 30 && idade <= 40) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if( idade > 40 && idade <= 50) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if( idade > 50 && idade <= 60) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if( idade > 60 && idade <= 70) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if( idade > 70 && idade <= 80) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if( idade > 80 && idade <= 90) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if( idade > 90 && idade <= 100) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        if( idade > 100 && idade <= 120) {
            imc = formula(candidatos, index);
            imcIdade.put(idade, imc);
        }

        return imcIdade;
    }

    private static float formula(List<CandidatoDTO> candidatos, int index) {
        return candidatos.get(index).getPeso() / (candidatos.get(index).getAltura() * candidatos.get(index).getAltura());
    }

    private Map<Integer, Estado> qtdCandidatosPorEstados(List<CandidatoDTO> candidatos) {
        Map<Integer, Estado> qtdCandidatoEstados = new HashMap<>();
        Integer contador = 0;
        for (int i = 0; i <= candidatos.size(); i++) {
            for (int j = i + 1; j <= Estado.values().length; j++) {
                if (candidatos.get(i).getEstado().equalsIgnoreCase(Estado.values()[j].getValue())) {
                    contador++;
                }
                if (Estado.values().length == Estado.values()[j].ordinal()) {
                    qtdCandidatoEstados.put(contador, Estado.values()[j]);
                }
            }
        }
        return qtdCandidatoEstados;
    }
}
