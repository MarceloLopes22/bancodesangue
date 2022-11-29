package com.wk.candidato.servico;

import com.wk.candidato.dto.CandidatoDTO;
import com.wk.candidato.enums.Estado;
import com.wk.candidato.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

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
        qtdCandidatosPorEstados(candidatos);
//  • IMC médio em cada faixa de idade de dez em dez anos: 0 a 10; 11 a 20; 21 a 30, etc. (IMC = peso / altura^2)
//  • Qual o percentual de obesos entre os homens e entre as mulheres? (É obeso quem tem IMC >30)
//  • Qual a média de idade para cada tipo sanguíneo?
//  • A quantidade de possíveis doadores para cada tipo sanguíneo receptor.
//    ATENÇÃO: Somente pessoas com idade de 16 a 69 anos e com peso acima de 50 Kg podem doar sangue.

        return null;
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
