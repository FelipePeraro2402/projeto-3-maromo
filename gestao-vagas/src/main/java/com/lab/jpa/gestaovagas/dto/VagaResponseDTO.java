package com.lab.jpa.gestaovagas.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record VagaResponseDTO(
        UUID id,
        String titulo,
        String descricao,
        double salario,
        LocalDateTime dataCriacao
) {
}
