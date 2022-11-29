package com.wk.candidato.servico;

import com.wk.candidato.dto.CandidatoDTO;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

public interface CandidatoService {
    EntityResponse saveCandidatos(List<CandidatoDTO> candidatos);
}
