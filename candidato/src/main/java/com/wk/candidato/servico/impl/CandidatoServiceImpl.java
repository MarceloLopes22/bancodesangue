package com.wk.candidato.servico.impl;

import com.wk.candidato.dto.CandidatoDTO;
import com.wk.candidato.repository.CandidatoRepository;
import com.wk.candidato.servico.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@Service
public class CandidatoServiceImpl implements CandidatoService {

    @Autowired
    private CandidatoRepository repository;

    @Override
    public EntityResponse saveCandidatos(List<CandidatoDTO> candidatos) {
//        Implemente um sistema web que receba um JSON com os dados e mostre os seguintes resultados:
//            • Quantos candidatos temos nessa lista em cada estado do Brasil?
//            • IMC médio em cada faixa de idade de dez em dez anos: 0 a 10; 11 a 20; 21 a 30, etc. (IMC = peso /
//                            altura^2)
//            • Qual o percentual de obesos entre os homens e entre as mulheres? (É obeso quem tem IMC >30)
//            • Qual a média de idade para cada tipo sanguíneo?
//            • A quantidade de possíveis doadores para cada tipo sanguíneo receptor.
//        ATENÇÃO: Somente pessoas com idade de 16 a 69 anos e com peso acima de 50 Kg podem doar sangue.

        return null;
    }
}
