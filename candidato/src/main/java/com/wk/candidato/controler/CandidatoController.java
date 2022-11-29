package com.wk.candidato.controler;

import com.wk.candidato.dto.CandidatoDTO;
import com.wk.candidato.servico.CandidatoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController(value = "/api/v1/candidato/")
public class CandidatoController {

    @Autowired
    private CandidatoServico service;

    @PostMapping
    public EntityResponse saveCandidatos(@RequestBody List<CandidatoDTO> candidatos) {
        return this.service.saveCandidatos(candidatos);
    }
}
