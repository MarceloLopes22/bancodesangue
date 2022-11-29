package com.wk.candidato.controler;

import com.wk.candidato.dto.CandidatoDTO;
import com.wk.candidato.servico.CandidatoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController(value = "/api/v1/candidatos/")
public class CandidatoController {

    private CandidatoService service;

    public CandidatoController(CandidatoService service) {
        this.service = service;
    }

    @PostMapping("candidato")
    public EntityResponse saveCandidatos(@RequestBody List<CandidatoDTO> candidatos) {
        return this.service.saveCandidatos(candidatos);
    }
}
